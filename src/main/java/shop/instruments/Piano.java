package shop.instruments;

public class Piano extends Instrument{

    private Boolean grandPiano;

    public Piano(String description, double boughtPrice, double sellPrice, String material, String colour, String type, Boolean grandPiano ) {
        super(description, boughtPrice, sellPrice, material, colour, type);
        this.grandPiano = grandPiano;
    }

    public Boolean getGrandPiano() {
        return grandPiano;
    }

    public String play() {
        return "La de da...";
    }
}
