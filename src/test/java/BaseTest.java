import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver;

    @BeforeAll
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        System.out.println("Test Başlatılıyor");
    }

    @BeforeEach
    public void beforeMethod(){
        driver= new ChromeDriver();
    }

//    @AfterEach
//    public void afterMethod(){
//        driver.quit();
//    }


    @AfterAll
    public void tearDown(){
        System.out.println("Test Tamamlandı");
    }


}
