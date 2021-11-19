package shop.instruments;

import shop.IPlay;
import shop.Item;

public abstract class Instrument extends Item implements IPlay {

    private String material;
    private String colour;
    private String type;

    public Instrument(String description, double boughtPrice, double sellPrice, String material, String colour, String type) {
        super(description, boughtPrice, sellPrice);
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

}
