package Lab02.AimsProject.hust.soict.itep.aims.media;

public class Disc extends Media {
    private int length;
    private String director;

    // Constructor(s)
    public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    // Getter methods
    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
}