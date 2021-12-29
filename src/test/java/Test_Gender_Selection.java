import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Gender_Selection extends BaseTest {


    @Test
    public void check_male_radio_button() {
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.MALE);
        Assertions.assertTrue(practiceFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.MALE),"MALE radio button is not checked!");
    }

    @Test
    public void check_female_radio_button() {
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.FEMALE);
        Assertions.assertTrue(practiceFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.FEMALE),"FEMALE radio button is not checked!");
    }

    @Test
    public void check_other_radio_button() {
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.OTHER);
        Assertions.assertTrue(practiceFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.OTHER),"OTHER radio button is not checked!");
    }

}
