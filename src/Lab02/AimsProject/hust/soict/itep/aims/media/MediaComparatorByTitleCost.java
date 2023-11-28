package Lab02.AimsProject.hust.soict.itep.aims.media;

import java.util.Comparator;
public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        if (media1.getTitle() == null && media2.getTitle() == null) {
            return 0; // Both are null, consider them equal
        } else if (media1.getTitle() == null) {
            return -1; // str1 is null, consider it less than str2
        } else if (media2.getTitle() == null) {
            return 1; // str2 is null, consider it less than str1
        }
        int titleComparison = media1.getTitle().compareTo(media2.getTitle());

        // If titles are equal, compare by cost in reverse order
        if (titleComparison == 0) {
            return Double.compare(media2.getCost(), media1.getCost());
        }

        return titleComparison;
    }
}
