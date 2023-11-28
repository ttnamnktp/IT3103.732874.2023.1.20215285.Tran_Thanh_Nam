package Lab02.AimsProject.hust.soict.itep.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks;

    // Constructor(s) for CompactDisc
    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    // Getter method for artist
    public String getArtist() {
        return artist;
    }

    // Method to add a track
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("Track already exists in the CD.");
        }
    }

    // Method to remove a track
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("Track not found in the CD.");
        }
    }

    // Method to get the total length of the CD
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    // Playable interface implementation
    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD artist: " + this.getArtist());
        System.out.println("CD length: " + this.getLength());
        System.out.println("Tracks:");
        for (Track track : tracks) {
            track.play();
        }
    }

    // --------------------- toString --------------------
    @Override
    public String toString() {
        return String.format("CompactDisc [ID: %d, Title: %s, Category: %s, Cost: %.2f, Length: %d, Director: %s, Artist: %s]",
                getId(), getTitle(), getCategory(), getCost(), getLength(), getDirector(), artist);
    }
}