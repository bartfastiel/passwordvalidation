public class PasswordValidation {
    public static boolean isAtLeast8CharactersLong(String password) {
        return password.length() >= 8;
    }

    public static boolean containsDigit(String password) {
        return password.matches(".*[0-9].*");
    }

    public static boolean containsLowerAndUppercaseCharacters(String password) {
        char[] chars = password.toCharArray();
        boolean lowerCaseCharacterFound = false;
        boolean upperCaseCharacterFound = false;
        for (char aChar : chars) {
            if (Character.isLowerCase(aChar)){
                lowerCaseCharacterFound = true;
            } else if (Character.isUpperCase(aChar)){
                upperCaseCharacterFound = true;
            }
            if (lowerCaseCharacterFound && upperCaseCharacterFound) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWellKnowPassword(String password) {
        if ("123456".equals(password)) {
            return true;
        }
        if ("passwort".equals(password)) {
            return true;
        }
        if ("Password1".equals(password)) {
            return true;
        }
        return false;
    }

    public static boolean isSafe(String password) {
        return isAtLeast8CharactersLong(password)
                && containsLowerAndUppercaseCharacters(password)
                && containsDigit(password)
                && !isWellKnowPassword(password);
    }
}
