package shop;

import java.util.ArrayList;

public class Shop {

    ISell item;

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public void addItemToStock(ISell item){
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        this.stock.remove(item);
    }

    public double calculateProfit(){
        double total = 0.00;
        for(ISell item : this.stock){
          total = item.calculateMarkup() + total;
        }
        return total;
    }
}
