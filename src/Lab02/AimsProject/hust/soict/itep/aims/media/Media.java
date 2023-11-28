package Lab02.AimsProject.hust.soict.itep.aims.media;

import java.util.Comparator;
import java.util.Objects;

public abstract class Media extends Object {
    // --------------------- Attribute ---------------------------
    private int id;
    private String title;
    private String category;
    private float cost;
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();

    // ---------------------- CONSTRUCTOR --------------------------
    public Media(){
    }

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    //-------------------------------------------------------------

    // ------------------ GETTER&SETTER ----------------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // ---------------------------------------------------------

    // -------------------- EQUALS ---------------------
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Media media = (Media) obj;
        return getTitle().equals(media.getTitle());
    }

    // ---------------- toString -------------------
    @Override
    public String toString() {
        return String.format("Media [ID: %d, Title: %s, Category: %s, Cost: %.2f]", getId(), getTitle(), getCategory(), getCost());
    }
}