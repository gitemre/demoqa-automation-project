import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_Email extends BaseTest {


    @Test
    public void setName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setName("Emre");
        Assertions.assertEquals("Emre",practiceFormPage.getName(),"Name value is not correct!");
    }

    @Test
    public void setlastName(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setlastName(("Öztürk"));
        Assertions.assertEquals("Öztürk",practiceFormPage.getLastname(),"Lastname value is not correct!");

    }

    @Test
    public void setEmail(){
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.setEmail("emreozturkx33@gmail.com");
        Assertions.assertEquals("emreozturkx33@gmail.com",practiceFormPage.getEmail(),"Email value is not correct!");

    }
}


