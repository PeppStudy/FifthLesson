package data;

public class Piano extends Instrument implements Playable {

    public Piano(String instrumentName) {
        super(instrumentName);
    }

    @Override
    public void play() {
        int quantity = Strings.PIANO.getStringsQuantity();
        System.out.printf("А сейчас играет %s. У него %d струн.%n",
                super.getInstrumentName(),
                quantity);
    }


}
