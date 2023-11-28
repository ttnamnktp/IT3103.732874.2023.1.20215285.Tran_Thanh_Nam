package Lab02.AimsProject.hust.soict.itep.aims.media;

import java.util.ArrayList;
import java.util.List;

// --------------- EX 3 CODE ----------------
//-------------------------------------------
//public class Book {
//    private int id;
//    private String title;
//    private String category;
//    private float cost;
//    private List<String> authors = new ArrayList<String>();
//
//}

// ------------------ EX 4 CODE ----------------------
public class Book extends Media {
    // Other fields and methods specific to Book can be added here
    private List<String> authors = new ArrayList<String>();

    public Book(int id, String title, String category, float cost, List<String> authors) {
        super(id, title, category, cost);
        this.authors = authors;
    }
    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    // ------------------- toString ----------------------------
    @Override
    public String toString() {
        return String.format("Book [ID: %d, Title: %s, Category: %s, Cost: %.2f, Authors: %s]",
                getId(), getTitle(), getCategory(), getCost(), authorsToString());
    }

    private String authorsToString() {
        if (authors.isEmpty()) {
            return "N/A";
        } else {
            return String.join(", ", authors);
        }
    }
}
