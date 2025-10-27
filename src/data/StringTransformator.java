package data;

public class StringTransformator {

    public String stringToUpperCase(String text) {
        return text.toUpperCase();
    }

    public String stringToLowerCase(String text) {
        return text.toLowerCase();
    }

    public String stringReplaceLetterAndAddSpaceStringBuilder(String text, String firstReplace, String secondReplace) {
        StringBuilder textBuilder = new StringBuilder(text);
        return textBuilder.replace(1, 2, firstReplace)
                .insert(3, secondReplace)
                .toString();
    }

    public String stringReplaceLetterAndAddSpaceStringMethod(String text, String firstReplace, String secondReplace) {

        String substr = String.valueOf(text.charAt(2));
        char letter = firstReplace.charAt(0);

        return text.replace(text.charAt(1), letter)
                .replace(substr, substr + secondReplace);
    }
}

