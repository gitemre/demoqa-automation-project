import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_Email extends BaseTest {


    @Test
    public void setName(){
        practiceFormPage.setName("Emre");
    }

    @Test
    public void setlastName(){
        practiceFormPage.setlastName(("Öztürk"));

    }

    @Test
    public void setEmail(){
        practiceFormPage.setEmail("emreozturkx33@gmail.com");

    }
}


