/**
 * Name:        Mehmet Uryan
 * Student ID:  240446021
 * Date:        06.10.2026
 */
package game.inventory;

public class Item {

    // private fields so they can't be changed outside
    private String name;
    private String genre;
    private int stockCount;
    private String serialCode;

    public Item(String name, String genre, int stockCount, String serialCode) {
        this.name = name;
        this.genre = genre;
        this.stockCount = stockCount;
        this.serialCode = serialCode;
    }

    // public getters
    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getStockCount() {
        return stockCount;
    }

    // package-private (no modifier). Only classes in game.inventory can see this
    String getSerialCode() {
        return serialCode;
    }

    // internal check, no one else needs to see this
    private boolean isAvailable(int quantity) {
        return stockCount >= quantity;
    }

    public void sell(int quantity) {
        if (isAvailable(quantity)) {
            stockCount -= quantity;
            System.out.println("Sold " + quantity + " copy/copies of " + name + ". Remaining stock: " + stockCount);
        } else {
            System.out.println("WARNING: Not enough stock for " + name + ". Requested: " + quantity + ", Available: " + stockCount);
        }
    }
}