package Lab02.AimsProject;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("Jungle DVD title is: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title is: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle DVD title is: " + jungleDVD.getTitle());

        changeTitle(jungleDVD, "Jungle");
        correctSwap(jungleDVD,cinderellaDVD);
        System.out.println("Reset Jungle DVD name is Jungle, then swap these 2 DVDs");
        System.out.println("Jungle DVD title is: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title is: " + cinderellaDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }

    public static void correctSwap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        String tempTitle = dvd1.getTitle();
        String tempCategory = dvd1.getCategory();
        String tempDirector = dvd1.getDirector();
        int tempLength = dvd1.getLenght();
        double tempCost = dvd1.getCost();

        dvd1.setTitle(dvd2.getTitle());
        dvd1.setCategory(dvd2.getCategory());
        dvd1.setDirector(dvd2.getDirector());
        dvd1.setLenght(dvd2.getLenght());
        dvd1.setCost(dvd2.getCost());

        dvd2.setTitle(tempTitle);
        dvd2.setCategory(tempCategory);
        dvd2.setDirector(tempDirector);
        dvd2.setLenght(tempLength);
        dvd2.setCost(tempCost);
    }
}
