package Lab02.AimsProject;

import Lab02.AimsProject.hust.soict.itep.cart.Cart;
import Lab02.AimsProject.hust.soict.itep.disc.DigitalVideoDisc;

public class Aims {

    public static void main(String[] args) {

        //Create a new cart
        // test branch
        Cart anOrder = new Cart();

        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King","Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc (dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc ( "Star Wars", "Science Fiction","George Lucas",  87, 24.95f);
        anOrder.addDigitalVideoDisc (dvd2);
        DigitalVideoDisc dvd3= new DigitalVideoDisc ( "Aladin","Animation", 18.994);
        anOrder.addDigitalVideoDisc (dvd3);

        //print total cost of the items in the cart
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        // Remove the dvd1
        anOrder.removeDigitalVideoDisc(dvd1);

        //print total cost of the items in the cart after remove
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());


    }

}