package Lab02.AimsProject.hust.soict.itep.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    // --------------- toString -------------------
    @Override
    public String toString() {
        return String.format("DigitalVideoDisc [ID: %d, Title: %s, Category: %s, Cost: %.2f, Length: %d, Director: %s]",
                getId(), getTitle(), getCategory(), getCost(), getLength(), getDirector());
    }

    // ----------------------- CODE LAB 3 ------------------------------
    // -----------------------------------------------------------------
//    private static int nbDigitalVideoDiscs = 0;  // Class attribute

//    private int id;  // Instance attribute
//    private String title;
//    private String category;
//    private String director;
//    private int lenght;
//    private double cost;
//
//    // Constructor
//    public DigitalVideoDisc(String title) {
//        this.title = title;
//        this.id = ++nbDigitalVideoDiscs;
//    }
//
//    public DigitalVideoDisc(String title, String category, double cost) {
//        this.title = title;
//        this.category = category;
//        this.cost = cost;
//        this.id = ++nbDigitalVideoDiscs;
//    }
//
//    public DigitalVideoDisc(String title, String category, String director, double cost) {
//        this.title = title;
//        this.category = category;
//        this.director = director;
//        this.cost = cost;
//        this.id = ++nbDigitalVideoDiscs;
//    }
//
//    public DigitalVideoDisc(String title, String category, String director, int lenght, double cost) {
//        this.title = title;
//        this.category = category;
//        this.director = director;
//        this.lenght = lenght;
//        this.cost = cost;
//        this.id = ++nbDigitalVideoDiscs;
//    }
//
//    // GETTER
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public String getDirector() {
//        return director;
//    }
//
//    public int getLenght() {
//        return lenght;
//    }
//
//    public double getCost() {
//        return cost;
//    }
//    public int getId() {
//        return id;
//    }
//
//    // SETTER
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public void setDirector(String director) {
//        this.director = director;
//    }
//
//    public void setLenght(int lenght) {
//        this.lenght = lenght;
//    }
//
//    public void setCost(double cost) {
//        this.cost = cost;
//    }

    // toString() method
//    @Override
//    public String toString(){
//        return "DVD - "
//            + getTitle() + " - "
//            + getCategory() + " - "
//            + getDirector() + " - "
//            + getLenght() + " : "
//            + getCost() + "$";
//    }


}
