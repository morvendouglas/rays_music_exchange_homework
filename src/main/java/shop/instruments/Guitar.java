package shop.instruments;

public class Guitar extends Instrument{

    private int noOfStrings;

    public Guitar(String description, double boughtPrice, double sellPrice, String material, String colour, String type, int noOfStrings) {
        super(description, boughtPrice, sellPrice, material, colour, type);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String play() {
        return "Strum strum strum...";
    }
}
