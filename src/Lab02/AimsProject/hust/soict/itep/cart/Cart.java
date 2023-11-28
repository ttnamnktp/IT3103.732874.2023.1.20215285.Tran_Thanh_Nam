package Lab02.AimsProject.hust.soict.itep.cart;

import Lab02.AimsProject.hust.soict.itep.aims.media.DigitalVideoDisc;
import Lab02.AimsProject.hust.soict.itep.aims.media.Media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cart {

    //------------------------ Attribute ---------------------------
    // ------------------------------------------------------------

    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public static final int MAX_NUMBERS_ORDERED = 20;

    // --------------------------- Constructor ----------------------------
    public Cart() {
    }
    // --------------------------------------------------------------------


    // ---------------------------- Setter & Getter --------------------------

    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

    // ------------------------------------------------------------------------


    // ----------------------- Method to add a new Media ----------------------------

    public void addMedia (Media media) {
        // If cart is full
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }
        // Else

        // Add to Cart
        itemsOrdered.add(media);

        // Notify
        System.out.println("The media has been added");
    }
    // overload addDigitalVideoDisc
    public void addMedia (Media[] media) {

        // If cart is full
        int length = media.length;
        if (itemsOrdered.size() + length > 20) {
            System.out.println("The cart is almost full");
            return;
        }
        // Else

        // Add to Cart
        itemsOrdered.addAll(Arrays.asList(media));

        // Notify
        System.out.println("The media have been added");
    }
    public void addMedia (Media media1, Media media2 ) {

        // If cart is full
        if (itemsOrdered.size() + 2 > 20) {
            System.out.println("The cart is almost full");
            return;
        }

        // Add to Cart
        itemsOrdered.add(media1);
        itemsOrdered.add(media2);

        // Notify
        System.out.println("The media have been added");
    }

    // ----------------------------- END ADD ----------------------------

    // ------------------------------ REMOVE ------------------------------
    // Remove a disc
    public void removeMedia (Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The media has been removed");
        } else {
            System.out.println("The media is not found");
        }
    }
    // ---------------------------- END REMOVE -----------------------------

    // --------------------- Method to calculate the total cost -----------------
    public double totalCost() {
        double cost = 0;
        for (Media media : itemsOrdered) {
            if (media != null) {
                cost += media.getCost();
            }
        }
        return Math.round(cost*100.0)/100.0;
    }
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (Media media : itemsOrdered){
            System.out.println(media.toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
    public void searchById() {
        System.out.println("***********************CART***********************");
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Hiển thị thông báo yêu cầu nhập xâu
        System.out.println("Enter the id:");

        // Đọc xâu từ người dùng
        int inputId = scanner.nextInt();

        int checkItemFound = 0;
        for (Media media : itemsOrdered){
            if(media.getId() == inputId) {
                System.out.println(media.toString() + " found!" );
                checkItemFound = 1;
            }
        }
        if (checkItemFound == 0) {
            System.out.println("DVD with ID " + inputId + " not found!");
        }

        System.out.println("***************************************************");
        scanner.close();
    }

    public void searchById(int id) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        int checkItemFound = 0;
        for (Media media : itemsOrdered){
            if(media.getId() == id) {
                System.out.println(media.toString() + " found!" );
                checkItemFound = 1;
            }
        }
        if (checkItemFound == 0) {
            System.out.println("DVD with ID " + id + " not found!");
        }
        System.out.println("***************************************************");
    }

    public void searchByTitle() {
        System.out.println("***********************CART***********************");
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Hiển thị thông báo yêu cầu nhập xâu
        System.out.println("Enter the title:");

        // Đọc xâu từ người dùng
        String inputTitle = scanner.nextLine();

        int checkItemFound = 0;
        for (Media media : itemsOrdered){
            if(media.getTitle().equals(inputTitle)) {
                System.out.println(media.toString() + " found!" );
                checkItemFound = 1;
            }
        }
        if (checkItemFound == 0) {
            System.out.println("Media with title " + inputTitle + " not found!");
        }

        System.out.println("***************************************************");
        scanner.close();
    }
    public void searchByTitle(String inputTitle) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím

        int checkItemFound = 0;
        for (Media media : itemsOrdered){
            if(media.getTitle().equals(inputTitle)) {
                System.out.println(media.toString() + " found!" );
                checkItemFound = 1;
            }
        }
        if (checkItemFound == 0) {
            System.out.println("Media with title " + inputTitle + " not found!");
        }
        System.out.println("***************************************************");
    }
    public void emptyCart() {
        itemsOrdered.clear();
    }
}