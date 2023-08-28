import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidationTest {

    @Test
    void isAtLeast8CharactersLong_whenEmpty_expectFalse() {
        //GIVEN
        String password = "";

        //WHEN
        boolean result = PasswordValidation.isAtLeast8CharactersLong(password);

        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void isAtLeast8CharactersLong_when7Characters_expectFalse() {
        //GIVEN
        String password = "1234567";

        //WHEN
        boolean result = PasswordValidation.isAtLeast8CharactersLong(password);

        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void isAtLeast8CharactersLong_when8Characters_expectTrue() {
        //GIVEN
        String password = "12345678";

        //WHEN
        boolean result = PasswordValidation.isAtLeast8CharactersLong(password);

        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void isAtLeast8CharactersLong_when9Characters_expectTrue() {
        //GIVEN
        String password = "123456789";

        //WHEN
        boolean result = PasswordValidation.isAtLeast8CharactersLong(password);

        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void containsDigit_whenEmpty_expectFalse() {
        //GIVEN
        String password = "";

        //WHEN
        boolean result = PasswordValidation.containsDigit(password);

        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void containsDigit_whenOneDigit_expectTrue() {
        //GIVEN
        String password = "1";

        //WHEN
        boolean result = PasswordValidation.containsDigit(password);

        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void containsDigit_whenMixedText_expectTrue() {
        //GIVEN
        String password = "asldfkbalsdf14asdfasd2324sdfjhavsk";

        //WHEN
        boolean result = PasswordValidation.containsDigit(password);

        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void containsLowerAndUppercaseCharacters_whenEmpty_expectFalse() {
        //GIVEN
        String password = "";

        //WHEN
        boolean result = PasswordValidation.containsLowerAndUppercaseCharacters(password);

        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void containsLowerAndUppercaseCharacters_whenAa_expectTrue() {
        //GIVEN
        String password = "Aa";

        //WHEN
        boolean result = PasswordValidation.containsLowerAndUppercaseCharacters(password);

        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void containsLowerAndUppercaseCharacters_whenA_expectFalse() {
        //GIVEN
        String password = "a";

        //WHEN
        boolean result = PasswordValidation.containsLowerAndUppercaseCharacters(password);

        //THEN
        Assertions.assertFalse(result);
    }
}
