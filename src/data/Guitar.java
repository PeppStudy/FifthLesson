package data;

public class Guitar extends Instrument implements Playable {

    private String instrumentName = "гитара";

    public Guitar(String instrumentName) {
        super(instrumentName);
    }

    @Override
    public void play() {
        int quantity = Strings.GUITAR.getStringsQuantity();
        System.out.printf("Инструмент, который сейчас играет, -- это  %s. У нее %d струн.%n",
                getInstrumentName(), quantity);
    }
}
