package Lab02.AimsProject.hust.soict.itep.store;

import Lab02.AimsProject.hust.soict.itep.aims.media.DigitalVideoDisc;
import Lab02.AimsProject.hust.soict.itep.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    private static final int MAX_ITEM = 1000;

    // ----------------------- SETTER & GETTER ------------------------
    public void setItemsInStore(ArrayList<Media> itemsInStore) {
        this.itemsInStore = itemsInStore;
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
    //------------------------------------------------------------------


    // -------------------------- Adding method -------------------------
    public void addMedia (Media media) {
        // If cart is full
        if (itemsInStore.size() >= MAX_ITEM) {
            System.out.println("The store is almost full");
            return;
        }
        // Else
        itemsInStore.add(media);
        System.out.println("The media has been added");
    }

    public void removeMedia (Media media) {
        // if can remove
        if (itemsInStore.remove(media)) {
            System.out.println("The media has been removed");
        } else {
            System.out.println("The media is not found");
        }
    }

    public void print() {
        System.out.println("***********************STORE***********************");
        System.out.println("Items in store:");
        for (Media media : itemsInStore) {
            System.out.println(media.toString());
        }
        System.out.println("****************************************************");
    }

    // ---------------------- SEARCH BY TITLE ---------------------
    public Media findMediaByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null; // Not found
    }

    public Media findMediaById(int id) {
        for (Media media : itemsInStore) {
            if (media.getId() == id) {
                return media;
            }
        }
        return null; // Not found
    }

}
