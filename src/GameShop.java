/**
 * Name:        Mehmet Uryan
 * Student ID:  240446021
 * Date:        06.10.2026
 */
import game.inventory.Item;
import game.inventory.Inventory;

public class GameShop {
    public static void main(String[] args) {

        Inventory shop = new Inventory();

        // create and add items
        Item i1 = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item i2 = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item i3 = new Item("Pixel Legends", "Strategy", 3, "PL-0091");

        shop.addItem(i1);
        shop.addItem(i2);
        shop.addItem(i3);

        shop.displayAll();

        System.out.println();

        // selling tests
        i1.sell(4);
        i2.sell(6); // should trigger warning

        System.out.println();

        shop.displayAll();

        System.out.println();

        shop.auditSerialCodes();

        // System.out.println(i1.getSerialCode()); 
        // WHY does this fail?
        // Because getSerialCode() is package-private in the Item class.
        // GameShop is outside of the 'game.inventory' package, so it doesn't have permission to access it.
    }
}