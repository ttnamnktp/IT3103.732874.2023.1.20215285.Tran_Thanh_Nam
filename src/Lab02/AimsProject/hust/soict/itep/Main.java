package Lab02.AimsProject.hust.soict.itep;

import Lab02.AimsProject.hust.soict.itep.aims.media.Book;
import Lab02.AimsProject.hust.soict.itep.aims.media.CompactDisc;
import Lab02.AimsProject.hust.soict.itep.aims.media.DigitalVideoDisc;
import Lab02.AimsProject.hust.soict.itep.aims.media.Media;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Media> mediaList = new ArrayList<Media>();

        CompactDisc cd = new CompactDisc(1,"CD Title 1", "Pop", 15.99f, 120,"N/A","N/A");
        DigitalVideoDisc dvd = new DigitalVideoDisc(1,"DVD Title 1", "Action", 19.99f, 120, "Director 1");
        Book b = new Book(1,"Book Title 1", "",29.99f);

        // Add some media objects to the list
        mediaList.add(cd);
        mediaList.add(dvd);
        mediaList.add(b);

        // Iterate through the list and print out the information
//        for (Media media : mediaList) {
//            System.out.println(media.toString());
//
//        }

        mediaList.sort(Media.COMPARE_BY_TITLE_COST);
        mediaList.sort(Media.COMPARE_BY_COST_TITLE);

        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
    }
}