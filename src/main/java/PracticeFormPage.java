import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage {

    private WebDriver driver;
    private final By name = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By email = By.id("userEmail");

    public PracticeFormPage(WebDriver driver){
        this.driver = driver;
    }
    public void setName(String nameAsString){
        WebElement nameSpace = driver.findElement(name);
        nameSpace.click();
        nameSpace.sendKeys(nameAsString);
    }
    public void setlastName(String lastNameAsString){
        WebElement nameSpace = driver.findElement(lastName);
        nameSpace.click();
        nameSpace.sendKeys(lastNameAsString);

    }
    public void setEmail(String emailAsString){
        WebElement nameSpace = driver.findElement(email);
        nameSpace.click();
        nameSpace.sendKeys(emailAsString);
    }

}
