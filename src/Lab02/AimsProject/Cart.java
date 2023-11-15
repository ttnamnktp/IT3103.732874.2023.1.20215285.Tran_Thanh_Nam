package Lab02.AimsProject;

import java.util.Scanner;

public class Cart {

    // Attribute

    private DigitalVideoDisc []itemsOrdered = new DigitalVideoDisc [MAX_NUMBERS_ORDERED];
    private int qtyOrdered;
    public static final int MAX_NUMBERS_ORDERED = 20;

    // Constructor
    public Cart() {
        setQtyOrdered(0);
    }

    // Setter & Getter
    public DigitalVideoDisc[] getItemsOrdered(){
        return itemsOrdered;
    }

    public void setItemsOrdered(DigitalVideoDisc[] itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

    public int getQtyOrdered () {
        return qtyOrdered;
    }

    public void setQtyOrdered (int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    // Method to add a new DVD

    public void addDigitalVideoDisc (DigitalVideoDisc disc) {

    // If cart is full

        if (getQtyOrdered() >= 20) {
            System.out.println("The cart is almost full");
            return;
        }

        // Increase the qtyOrdered
        setQtyOrdered(getQtyOrdered() + 1);

        // Add to Cart
        DigitalVideoDisc[] newItemsOrdered = getItemsOrdered();
        newItemsOrdered[getQtyOrdered() - 1] = disc;
        setItemsOrdered(newItemsOrdered);

        // Notify
        System.out.println("The disc has been added");
    }

    // overload addDigitalVideoDisc
    public void addDigitalVideoDisc (DigitalVideoDisc[] disc) {

        // If cart is full
        int length = disc.length;
        if (getQtyOrdered() + length > 20) {
            System.out.println("The cart is almost full");
            return;
        }

        // Increase the qtyOrdered
        setQtyOrdered(getQtyOrdered() + length);

        // Add to Cart
        DigitalVideoDisc[] newItemsOrdered = getItemsOrdered();
        for (int i = 0; i < length; i++ ){
            newItemsOrdered[getQtyOrdered()-1-i] = disc[i];
        }
        setItemsOrdered(newItemsOrdered);

        // Notify
        System.out.println("The discs have been added");
    }
    public void addDigitalVideoDisc (DigitalVideoDisc disc1, DigitalVideoDisc disc2 ) {

        // If cart is full
        if (getQtyOrdered() + 2 > 20) {
            System.out.println("The cart is almost full");
            return;
        }

        // Increase the qtyOrdered
        setQtyOrdered(getQtyOrdered() + 2);

        // Add to Cart
        DigitalVideoDisc[] newItemsOrdered = getItemsOrdered();
        newItemsOrdered[getQtyOrdered()-1] = disc1;
        newItemsOrdered[getQtyOrdered()-2] = disc2;
        setItemsOrdered(newItemsOrdered);

        // Notify
        System.out.println("The discs have been added");
    }
    // Remove a disc
    public void removeDigitalVideoDisc (DigitalVideoDisc disc) {

        // Search for disc
        int indexOfRemoved = -1;
        DigitalVideoDisc []newItemsOrdered = getItemsOrdered();
        for (int i = 0; i < getQtyOrdered(); i++) {
            if (newItemsOrdered[i].equals(disc)) {
                indexOfRemoved = i;
                break;
            }
        }
        // If not found
        if (indexOfRemoved == -1) {
            System.out.println("The disc is not found");
            return;
        }

        // Remove
        for (int i=indexOfRemoved; i < getQtyOrdered() - 1; i++) {
            newItemsOrdered[i] = newItemsOrdered[i + 1];
        }
        setQtyOrdered(getQtyOrdered() - 1);
        newItemsOrdered[getQtyOrdered () - 1] = null;
        setItemsOrdered(newItemsOrdered);

        // Notify
        System.out.println("The disc has been removed");
    }

    // Method to calculate the total cost
    public double totalCost() {
        double cost = 0;
        DigitalVideoDisc []itemsOrdered = getItemsOrdered();
        for (DigitalVideoDisc disc: itemsOrdered) {
            if (disc != null) {
                cost += disc.getCost();
            }
        }
        return Math.round(cost*100.0)/100.0;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++){
            System.out.println( i + 1 + ". " + itemsOrdered[i].toString());
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
        for (int i = 0; i < qtyOrdered; i++){
            if(itemsOrdered[i].getId() == inputId) {
                System.out.println(itemsOrdered[i].toString() + " found!" );
                checkItemFound = 1;
            }
        }
        if (checkItemFound == 0) {
            System.out.println("DVD with ID " + inputId + " not found!");
        }

        System.out.println("***************************************************");
        scanner.close();
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
        for (int i = 0; i < qtyOrdered; i++){
            if(itemsOrdered[i].getTitle().equals(inputTitle)) {
                System.out.println(itemsOrdered[i].toString() + " found!" );
                checkItemFound = 1;
            }
        }
        if (checkItemFound == 0) {
            System.out.println("DVD with title " + inputTitle + " not found!");
        }

        System.out.println("***************************************************");
        scanner.close();
    }
}