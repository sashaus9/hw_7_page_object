package tests;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class FillFormTests extends BaseTest{

    private final Map<String, String> resultValues = new HashMap<>() {{
        put("Student Name", "Test Testov");
        put("Student Email", "test@test.com");
        put("Gender", "Other");
        put("Mobile", "7999999999");
        put("Date of Birth", "22 November,2000");
        put("Subjects", "Computer Science");
        put("Hobbies", "Reading");
        put("Picture", "photo.jpeg");
        put("Address", "Aliquam id auctor risus.");
        put("State and City", "NCR Delhi");
    }};

    @Test
    void fillFormTest() {
        automationPracticeFormPage.openPage()
                .setFirstName("Test")
                .setLastName("Testov")
                .setUserEmail("test@test.com")
                .setGender("Other")
                .setUserNumber("7999999999")
                .setBirthDate("22", "November", "2000")
                .setSubjects("Computer Science")
                .setHobbies("Reading")
                .uploadPicture("images/photo.jpeg")
                .setCurrentAddress("Aliquam id auctor risus.")
                .setState("NCR")
                .setCity("Delhi")
                .clickSubmitButton();

        automationPracticeFormPage.checkThatRegistrationResultsBlockAppears()
                .checkResultValues(resultValues)
                .closeResultModalWindow();
    }
}
