package Lab02.AimsProject;

import Lab02.AimsProject.hust.soict.itep.aims.media.*;
import Lab02.AimsProject.hust.soict.itep.cart.Cart;
import Lab02.AimsProject.hust.soict.itep.store.Store;

import java.util.Iterator;
import java.util.Scanner;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CompactDisc cd1 = new CompactDisc(1, "CD Title 1", "Pop", 15.99f, 120, "N/A", "Artist 1");
        CompactDisc cd2 = new CompactDisc(2, "CD Title 2", "Rock", 12.99f, 90, "N/A", "Artist 2");
        CompactDisc cd3 = new CompactDisc(3, "CD Title 3", "Classical", 20.99f, 150, "N/A", "Artist 3");
        CompactDisc cd4 = new CompactDisc(4, "CD Title 4", "Jazz", 18.99f, 110, "N/A", "Artist 4");
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(5, "DVD Title 1", "Action", 19.99f, 120, "Director 1");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(6, "DVD Title 2", "Comedy", 16.99f, 95, "Director 2");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(7, "DVD Title 3", "Drama", 22.99f, 130, "Director 3");
        DigitalVideoDisc dvd4 = new DigitalVideoDisc(8, "DVD Title 4", "Sci-Fi", 17.99f, 105, "Director 4");
        Book book1 = new Book(9, "Book Title 1", "Fiction", 29.99f);
        Book book2 = new Book(10, "Book Title 2", "Non-fiction", 24.99f);
        Book book3 = new Book(11, "Book Title 3", "Mystery", 19.99f);
        Book book4 = new Book(12, "Book Title 4", "Science", 32.99f);

        store.addMedia(cd1);
        store.addMedia(cd2);
        store.addMedia(cd3);
        store.addMedia(cd4);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);
        store.addMedia(book4);

        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            showMenu();
            System.out.print("Enter option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (option) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    viewCart();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);
    }
    // --------------- MAIN MENU FUNCTION ------------------
    private static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    // --------------- VIEW STORE FUNCTION -------------------
    private static void viewStore() {
        store.print(); // Implement a print method in the Store class to display items
        storeMenu();
    }
    private static void storeMenu() {
        int option;
        do {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media’s details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
            System.out.print("Enter option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (option) {
                case 1:
                    seeMediaDetails();
                    break;
                case 2:
                    addMediaToCart();
                    break;
                case 3:
                    playMedia();
                    break;
                case 4:
                    viewCart();
                    break;
                case 0:
                    System.out.println("Going back to the main menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);
    }
    private static void seeMediaDetails() {

        // Implement logic to see media details and provide media details menu
        System.out.print("Enter the ID of the media: ");
        int id = scanner.nextInt();

        Media media = store.findMediaById(id);
        if (media != null) {
            System.out.println(media.toString()); // Assuming you have implemented toString() in Media class
            mediaDetailsMenu(media);
        } else {
            System.out.println("Media with ID '" + id + "' not found.");
        }
    }
    private static void mediaDetailsMenu(Media media) {
        // Implement logic for media details menu
        int option;
        do {
            System.out.println("Options:");
            System.out.println("--------------------------------");
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.print("Please choose a number: 0-1-2: ");
            option = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (option) {
                case 1:
                    cart.addMedia(media);
                    break;
                case 2:
                    if (media instanceof CompactDisc ) {
                        ((CompactDisc) media).play();
                    }
                    else if (media instanceof DigitalVideoDisc ){
                        ((DigitalVideoDisc) media).play();
                    }
                    else {
                        System.out.println("The media is not playable.");
                    }
                    break;
                case 0:
                    System.out.println("Going back to the store menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);
    }
    private static void addMediaToCart() {
        System.out.print("Enter the ID of the media: ");
        int id = scanner.nextInt();

        Media media = store.findMediaById(id);
        if (media != null) {
            cart.addMedia(media);
        } else {
            System.out.println("Media with ID '" + id + "' not found.");
        }
    }
    private static void playMedia() {
        System.out.print("Enter the ID of the media: ");
        int id = scanner.nextInt();

        Media media = store.findMediaById(id);
        if (media instanceof CompactDisc ) {
            ((CompactDisc) media).play();
        }
        else if (media instanceof DigitalVideoDisc ){
            ((DigitalVideoDisc) media).play();
        }
        else if (media instanceof Book ){
            System.out.println("The media is not playable.");
        }
        else {
            System.out.println("The media is not found.");
        }

    }
    // --------------- UPDATE STORE FUNCTION ----------------
    private static void updateStore() {
        // Implement logic to add or remove media from the store
        int option;
        do {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add a media to the store");
            System.out.println("2. Remove a media from the store");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            System.out.print("Enter option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (option) {
                case 1:
                    addMediaToStore();
                    break;
                case 2:
                    removeMediaFromStore();
                    break;
                case 0:
                    System.out.println("Going back to the main menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);
    }
    private static void removeMediaFromStore() {
        System.out.println("--------------------------------------");
        System.out.println("Enter media ID: ");
        int id = scanner.nextInt();

        Media media = store.findMediaById(id);
        store.removeMedia(media);
    }
    private static void addMediaToStore() {
        System.out.println("--------------------------------------");
        System.out.println("Enter media type (CD/DVD/Book): ");
        String mediaType = scanner.nextLine();

        System.out.println("Enter media ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.println("Enter media title: ");
        String title = scanner.nextLine();

        System.out.println("Enter media category: ");
        String category = scanner.nextLine();

        System.out.println("Enter media cost: ");
        float cost = scanner.nextFloat();
        scanner.nextLine();  // Consume the newline character

        Media media = null;

        switch (mediaType.toUpperCase()) {
            case "CD":
                System.out.println("Enter media director: ");
                String directorCD = scanner.nextLine();

                System.out.println("Enter media length: ");
                int lengthCD = scanner.nextInt();

                System.out.println("Enter media artist: ");
                String artist = scanner.nextLine();

                CompactDisc cd = new CompactDisc(id,title,category,cost,lengthCD,directorCD,artist);
                store.addMedia(cd);
                break;

            case "DVD":
                System.out.println("Enter media director: ");
                String directorDVD = scanner.nextLine();

                System.out.println("Enter media length: ");
                int lengthDVD = scanner.nextInt();

                DigitalVideoDisc dvd = new DigitalVideoDisc(id,title,category,cost,lengthDVD,directorDVD);
                store.addMedia(dvd);
                break;

            case "BOOK":
                Book book = new Book(id,title,category,cost);
                store.addMedia(book);
                break;
            default:
                System.out.println("Invalid media type.");
        }
    }

    // --------------- VIEW CART FUNCTION -------------------
    private static void viewCart() {
        // Implement logic to display cart and provide cart menu
        cartMenu();
    }
    private static void cartMenu() {
        int option;
        do {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4-5");
            option = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (option) {
                case 1:
                    filterMediaInCart();
                    break;
                case 2:
                    sortMediaInCart();
                    break;
                case 3:
                    removeMediaInCart();
                    break;
                case 4:
                    playMedia();
                    break;
                case 5:
                    placeOrder();
                    break;
                case 0:
                    System.out.println("Going back to the main menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);
    }
    private static void placeOrder() {
        cart.emptyCart();
        System.out.println("Order created!");

    }
    private static void sortMediaInCart() {
        int option;
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Sort medias in cart by title");
        System.out.println("2. Sort medias in cart by cost");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 1-2");
        option = scanner.nextInt();
        scanner.nextLine();
        if (option == 1){
            System.out.println("------------------------------");
            System.out.println("Sort medias in cart by title");
            cart.getItemsOrdered().sort(Media.COMPARE_BY_TITLE_COST);
            for (Media media : cart.getItemsOrdered()) {
                System.out.println(media.toString());
            }
            System.out.println("------------------------------");
        } else if (option == 2) {
            System.out.println("------------------------------");
            System.out.println("Sort medias in cart by cost");
            cart.getItemsOrdered().sort(Media.COMPARE_BY_COST_TITLE);
            for (Media media : cart.getItemsOrdered()) {
                System.out.println(media.toString());
            }
            System.out.println("------------------------------");
        } else {
            System.out.println("Invalid choice, back to Cart menu");
        }
    }
    private static void filterMediaInCart() {
        int option;
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart by id");
        System.out.println("2. Filter medias in cart by title");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 1-2");
        option = scanner.nextInt();
        scanner.nextLine();
        if (option == 1){
            System.out.println("Enter the id:");
            int inputId = scanner.nextInt();
            cart.searchById(inputId);
        } else if (option == 2) {
            System.out.println("Enter the title:");
            String inputTitle = scanner.nextLine();
            cart.searchByTitle(inputTitle);
        } else {
            System.out.println("Invalid choice, back to Cart menu");
        }
    }
    public static void removeMediaInCart() {
        System.out.println("--------------------------------");
        System.out.println("Enter the Id of the media: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        // SEARCH and REMOVE
        int checkItemFound = 0;
        Iterator<Media> iterator = cart.getItemsOrdered().iterator();
        while (iterator.hasNext()) {
            Media media = iterator.next();
            // Condition for removing an element
            if (id == media.getId()) {
                iterator.remove();  // Safe removal using iterator
                checkItemFound = 1;
                break;
            }
        }
        // if not found
        if (checkItemFound == 0) {
            System.out.println("DVD with ID " + id + " not found!");
        }
    }
}
