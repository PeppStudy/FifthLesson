import data.Guitar;
import data.Piano;

public class Main {

    public static void main(String[] args) {

        Guitar guitar = new Guitar("гитара \"Корт\"");
        Piano piano = new Piano("рояль \"Стенвей\"");
        guitar.play();
        piano.play();

    }

}
