import data.StringTransformator;

public class Main {

    public static void main(String[] args) {

        String[] stringArray = {"привет", "ПОКА", "гипербола"};

        StringTransformator newString = new StringTransformator();

        System.out.println(newString.stringToUpperCase(stringArray[0]));

        System.out.println(newString.stringToLowerCase(stringArray[1]));

        System.out.println(newString.stringReplaceLetterAndAddSpaceStringBuilder(
                stringArray[2], "О", " "
        ));

        System.out.println(newString.stringReplaceLetterAndAddSpaceStringMethod(
                stringArray[2], "О", " "
        ));

    }

}
