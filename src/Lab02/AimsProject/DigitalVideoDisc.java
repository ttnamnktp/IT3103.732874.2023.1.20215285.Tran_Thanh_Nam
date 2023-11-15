package Lab02.AimsProject;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;  // Class attribute
    private int id;  // Instance attribute
    private String title;
    private String category;
    private String director;
    private int lenght;
    private double cost;

    // Constructor
    public DigitalVideoDisc(String title) {
        this.title = title;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, double cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int lenght, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.lenght = lenght;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    // GETTER

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLenght() {
        return lenght;
    }

    public double getCost() {
        return cost;
    }
    public int getId() {
        return id;
    }

    // SETTER

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    // toString() method
    @Override
    public String toString(){
        return "DVD - "
            + getTitle() + " - "
            + getCategory() + " - "
            + getDirector() + " - "
            + getLenght() + " : "
            + getCost() + "$";
    }
}
