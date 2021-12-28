import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_Email extends BaseTest {


    @Test
    public void setName(){
        practiceFormPage.setName("Emre");
        Assertions.assertEquals("Emre",practiceFormPage.getName(),"Name value is not correct!");
    }

    @Test
    public void setlastName(){
        practiceFormPage.setlastName(("Öztürk"));
        Assertions.assertEquals("Öztürk",practiceFormPage.getLastname(),"Lastname value is not correct!");

    }

    @Test
    public void setEmail(){
        practiceFormPage.setEmail("emreozturkx33@gmail.com");
        Assertions.assertEquals("emreozturkx33@gmail.com",practiceFormPage.getEmail(),"Email value is not correct!");

    }
}


