import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class MtsTest {
    private static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("chrome.driver", "C:/Users/TUF15/IdeaProjects/MTS/scr/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by");

    }
    @Test
    public void testBlockName() {

        String expectedName = "Онлайн пополнение без комисии";
        String actualName = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/h2")).getText();
        Assert.assertEquals(actualName, expectedName, "Название блока не соответсвует");
    }
    @Test
    public void verifyLogos() {
        List<WebElement> logos = driver.findElements(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul"));
        Assert.assertFalse("Логотипы платежных систем отсутсвуют", logos.isEmpty());
    }

    @Test
    public void verifyLink() {
        WebElement Link = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/a"));
        Link.click();
        String expectedUrl = "";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Ссылка работает некорректно");
    }
    @Test
    public void verifyButton() {
        driver.findElement(By.xpath("//*[@id=/connection-phone/]")).sendKeys("297777777");
        driver.findElement(By.xpath("//*[@id=/pay-connection/]/button")).click();
        driver.quit();
    }
}