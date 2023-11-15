package Lab02.AimsProject.hust.soict.itep.store;

import Lab02.AimsProject.hust.soict.itep.disc.DigitalVideoDisc;
import Lab02.AimsProject.hust.soict.itep.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        // Create new DVD objects and add them to the store
        DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King","Animation", "Roger Allers", 87, 19.95f);
        store.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc ( "Star Wars", "Science Fiction","George Lucas",  87, 24.95f);
        store.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3= new DigitalVideoDisc ( "Aladin","Animation", 18.994);
        store.addDigitalVideoDisc(dvd3);

        store.print();

        store.removeDigitalVideoDisc(dvd1);

        store.print();

    }
}
