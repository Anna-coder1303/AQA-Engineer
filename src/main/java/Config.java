import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Config {
    private final WebDriver driver;


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
    private WebElement continButton;

    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]")
    private WebElement serviceDropdown;

    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button/span[1]")
    private WebElement enterBlockTitle;

    @FindBy(xpath = "//span[contains(text(), '5.00 BYN')]")
    private WebElement correctAmount;

    //Конструкторы

    public void acceptCookies() {
        if (acceptCookiesButton.isDisplayed()) {
            acceptCookiesButton.click();
        }
    }

    public Config(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Инициализация элементов
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

    public void clickContinButton() {
        continButton.click();
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
}
