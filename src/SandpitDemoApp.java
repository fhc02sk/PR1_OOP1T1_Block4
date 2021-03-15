public class SandpitDemoApp {

    public static void main(String[] args) {

        double l = 1.4;
        double w = 1.4;
        double h = 0.20; // 20cm
        String name = "Homemade Sandpit";
        double price = 0;

        System.out.println("Für " + name + " benötigen wir " + calcVolume(l, w, h) + " m³ Sand. Kosten: " + price + " EUR");

        // 1. Lösung => Je Dimension ein Array, und je Index ein Produkt
        //

        double lBauhaus = 1.5;
        double wBauhaus = 1.5;
        double hBauhaus = 0.26; // 20cm
        String nameBauhaus = "Sandkasten von Baushaus";
        double priceBauhaus = 59;

        int x = 7;
        Sandpit homeMade = new Sandpit();
        Sandpit bauhaus = new Sandpit();
        Sandpit whikey = new Sandpit();

        homeMade.height = 0.2;
        homeMade.width = 1.4;
        homeMade.length = 1.4;
        homeMade.name = "Selbstgemacht";
        homeMade.price = 0.0;
        System.out.println("homeMade = " + homeMade.calcVolume());
        System.out.println("homeMade.name = " + homeMade.name);
        homeMade.print();

        bauhaus.length = 1.55;
        bauhaus.width = 1.55;
        bauhaus.height = 0.26;
        bauhaus.name = "Sandkasten von Bauhaus";
        bauhaus.price = 59;
        bauhaus.print();

        whikey.length = 1.6;
        whikey.width = 1.6;
        whikey.height = 0.23;
        whikey.name = "Premiumprodukt von Whikey";
        whikey.price = 229;
        whikey.print();

        System.out.println("Für " + nameBauhaus + " benötigen wir " + calcVolume(lBauhaus, wBauhaus, hBauhaus) + " m³ Sand. Kosten: "
                + priceBauhaus + " EUR");
    }

    public static double calcVolume(double length, double width, double height){
        return length * width * height;
    }
}
