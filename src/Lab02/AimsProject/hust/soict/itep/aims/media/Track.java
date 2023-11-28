package Lab02.AimsProject.hust.soict.itep.aims.media;

import java.util.Objects;

public class Track implements Playable {
    private String title;
    private int length;

    // Constructor(s) for Track
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getter methods for Track
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    // Playable interface implementation
    @Override
    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

    // ----------------- EQUALS ------------------
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Track track = (Track) obj;
        return getTitle().equals(track.getTitle()) &&
                getLength() == track.getLength();
    }

}