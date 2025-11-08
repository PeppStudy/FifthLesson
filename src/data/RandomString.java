package data;

public class RandomString {

    private String[] stringArray = {"первая строка", "вторая строка", "третья строка"};

    public String[] getStringArray() {
        return stringArray;
    }

    private int randomGenerate() {
        return (int) Math.floor(Math.random() * 3);
    }

    public void printString() {
        System.out.println(getStringArray()[randomGenerate()]);
    }


}
