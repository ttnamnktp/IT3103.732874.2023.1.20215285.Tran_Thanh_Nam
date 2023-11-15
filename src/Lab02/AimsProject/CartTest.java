package Lab02.AimsProject;

public class CartTest {
    public static void main(String[] args) {
        // Create new cart
        Cart cart = new Cart();

        // Create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King","Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc (dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc ( "Star Wars", "Science Fiction","George Lucas",  87, 24.95f);
        cart.addDigitalVideoDisc (dvd2);
        DigitalVideoDisc dvd3= new DigitalVideoDisc ( "Aladin","Animation", 18.994);
        cart.addDigitalVideoDisc (dvd3);

        // Test printing method
        cart.print();

        // Test searching method
        cart.searchById();
    }
}
