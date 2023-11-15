package Lab02.AimsProject.hust.soict.itep.store;

import Lab02.AimsProject.hust.soict.itep.disc.DigitalVideoDisc;

public class Store {
    DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_ITEM];
    private int qtyDisc;
    public static final int MAX_ITEM = 1000;

    // SETTER

    public void setItemsInStore(DigitalVideoDisc[] itemsInStore) {
        this.itemsInStore = itemsInStore;
    }

    public void setQtyDisc(int qtyDisc) {
        this.qtyDisc = qtyDisc;
    }

    // GETTER

    public DigitalVideoDisc[] getItemsInStore() {
        return itemsInStore;
    }

    public int getQtyDisc() {
        return qtyDisc;
    }

    // Adding method
    public void addDigitalVideoDisc (DigitalVideoDisc disc) {

        // If cart is full

        if (getQtyDisc() >= MAX_ITEM) {
            System.out.println("The store is almost full");
            return;
        }

        // Increase the qtyOrdered
        setQtyDisc(getQtyDisc() + 1);

        // Add to Cart
        DigitalVideoDisc[] newItems = getItemsInStore();
        newItems[getQtyDisc() - 1] = disc;
        setItemsInStore(newItems);

        // Notify
        System.out.println("The disc has been added");
    }

    public void removeDigitalVideoDisc (DigitalVideoDisc disc) {

        // Search for disc
        int indexOfRemoved = -1;
        DigitalVideoDisc []newItems = getItemsInStore();
        for (int i = 0; i < getQtyDisc(); i++) {
            if (newItems[i].equals(disc)) {
                indexOfRemoved = i;
                break;
            }
        }
        // If not found
        if (indexOfRemoved == -1) {
            System.out.println("The disc is not found");
            return;
        }

        // Remove
        for (int i=indexOfRemoved; i < getQtyDisc() - 1; i++) {
            newItems[i] = newItems[i + 1];
        }
        newItems[getQtyDisc () - 1] = null;
        setQtyDisc(getQtyDisc() - 1);
        setItemsInStore(newItems);

        // Notify
        System.out.println("The disc has been removed");
    }

    public void print() {
        System.out.println("***********************STORE***********************");
        System.out.println("Items in store:");
        for (int i = 0; i < getQtyDisc(); i++){
            System.out.println( i + 1 + ". " + getItemsInStore()[i].toString());
        }
        System.out.println("****************************************************");
    }
}
