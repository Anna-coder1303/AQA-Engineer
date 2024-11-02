import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MtsTest {
    private WebDriver driver;
    private Config config;

    @BeforeEach
    public void setUp() {
        System.setProperty("chrome.driver", "C:/Users/TUF15/IdeaProjects/MTS/scr/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mts.by");
        config = new Config(driver);
        config.acceptCookies();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testBlockTitle() {
        assertEquals("Онлайн пополнение\nбез комиссии", config.getBlockTitleText(), "Заголовок блока неверен");
    }

    @Test
    public void testPaymentLogosDisplayed() {
        assertTrue(config.paymentLogosDisplayed(), "Логотипы платежных систем не отображаются");
    }

    @Test
    public void testServiceDetailsLink() {
        config.clickDetailsLink();
        assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", driver.getCurrentUrl(), "Ссылка работает некорректно");
    }

    @Test
    public void testContinueButtonFunctionality() {
        config.enterPhone("297777777");
        config.enterAmount("5");
        config.enterEmail("test@test.com");
        config.clickContinueButton();
        config.switchToBepaidIframe();
    }

    @Test
    public void testServiceOptions() { //Аналогично для других вариантов
        config.selectServiceType();
        config.selectBlockTitle();
        assertTrue(config.areFieldsPresent(), "Поля не отображаются для услуги");
    }

    @Test
    public void testCorrectSum() {
        config.enterPhone("297777777");
        config.enterAmount("5");
        config.enterEmail("test@test.com");
        config.clickContinueButton();
        config.switchToBepaidIframe();
        assertEquals("5.00 BYN", config.checksum(), "Суммма неверна");

    }
    @Test
    public void testCorrectPhone() {
        config.enterPhone("297777777");
        config.enterAmount("5");
        config.enterEmail("test@test.com");
        config.clickContinueButton();
        config.switchToBepaidIframe();
        assertEquals("Оплата: Услуги связи Номер:375297777777", config.checkphone(), "Телефон отображается неверно");
    }

    @Test
    public void testCardField() { //Аналогично для других вариантов
        config.enterPhone("297777777");
        config.enterAmount("5");
        config.enterEmail("test@test.com");
        config.clickContinueButton();
        config.switchToBepaidIframe();
        assertEquals("Номер карты", config.cardFieldsPresent(), "Поле с номером карты отображается неверно");
    }

    @Test
    public void testPaymentLogosDisplayedFrame() {
        config.enterPhone("297777777");
        config.enterAmount("5");
        config.enterEmail("test@test.com");
        config.clickContinueButton();
        config.switchToBepaidIframe();
        assertTrue(config.paymentLogosDisplayedFrame(), "Логотипы платежных систем не отображаются");
    }
}
