import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Config {
    private final WebDriver driver;
    private final WebDriverWait wait;

    //Локаторы

    @FindBy(xpath = "//*[@id='cookie-agree']")
    private WebElement acceptCookiesButton;

    @FindBy(xpath = "//h2[contains(text(), 'Онлайн пополнение')]")
    private WebElement blockTitle;

    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul")
    private WebElement paymentLogos;

    @FindBy(xpath = "//div[@id='pay-section']//a[text()='Подробнее о сервисе']")
    private WebElement detailsLink;

    @FindBy(xpath = "//*[@id='connection-phone']")
    private WebElement phoneField;

    @FindBy(xpath = "//*[@id='connection-sum']")
    private WebElement amountField;

    @FindBy(xpath = "//*[@id='connection-email']")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id='pay-connection']/button")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]")
    private WebElement serviceDropdown;

    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button/span[1]")
    private WebElement enterBlockTitle;

    @FindBy(xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[1]")
    private WebElement paymentLogosFrame;

    //Конструкторы

    public void acceptCookies() {
        if (acceptCookiesButton.isDisplayed()) {
            acceptCookiesButton.click();
        }
    }

    public Config(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);                                // Инициализация элементов
    }

    public String getBlockTitleText() {
        return blockTitle.getText();
    }

    public boolean paymentLogosDisplayed() {
        return paymentLogos.isDisplayed();
    }

    public void clickDetailsLink() {
        detailsLink.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public void enterPhone(String phoneNumber) {
        phoneField.sendKeys(phoneNumber);
    }

    public void enterAmount(String amount) {
        amountField.sendKeys(amount);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public boolean areFieldsPresent() {
        return phoneField.isDisplayed() && amountField.isDisplayed() && emailField.isDisplayed();
    }

    public void selectServiceType() {
        serviceDropdown.click();
    }

    public void selectBlockTitle() {
        enterBlockTitle.click();
    }

    public String checksum() {
        WebElement sumElement = waitForElementVisibility(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/span[1]"));
        return sumElement.getText();
    }

    public String checkphone() {
        WebElement phoneElement = waitForElementVisibility(By.xpath("//span[contains(text(), 'Оплата: Услуги связи')]"));
        return phoneElement.getText();
    }

    public WebElement waitForElementVisibility(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void switchToBepaidIframe() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bepaid-iframe")));
        driver.switchTo().frame(driver.findElement(By.className("bepaid-iframe")));
    }

    public String cardFieldsPresent() {
        WebElement cardElement = waitForElementVisibility(By.xpath("//label[contains(text(), 'Номер карты')]"));
        return cardElement.getText();
    }

    public boolean paymentLogosDisplayedFrame() {
       return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div"))).isDisplayed();
    }
}

