package data;

public class Instrument {

    private String instrumentName;

    public Instrument(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public enum Strings {
        GUITAR(6),
        PIANO(230);

        private final int stringsQuantity;

        Strings(int stringsQuantity) {
            this.stringsQuantity = stringsQuantity;
        }

        public int getStringsQuantity() {
             return stringsQuantity;
        }

    }

}
