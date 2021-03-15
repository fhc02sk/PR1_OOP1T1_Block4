public class TamagochiDemoApp {

    public static void main(String[] args) {

        Tamagochi maxi = new Tamagochi();
        maxi.x = 5;
        maxi.y = 4;
        maxi.lunchboxes = 6;

        Tamagochi susi = new Tamagochi(); //null; /* immer klein geschrieben*/
        susi.y = 1;
        susi.x = 1;
        susi.lunchboxes = 20;

        String demo = new String("hallo");
        String demo1 = "hallo";

        System.out.println("x: " + maxi.x + "; y: " + maxi.y + "; Futterstatus: " + maxi.lunchboxes);
        maxi.feed(5);

        System.out.println("x: " + maxi.x + "; y: " + maxi.y + "; Futterstatus: " + maxi.lunchboxes);

        maxi.move("right", 3);
        System.out.println("x: " + maxi.x + "; y: " + maxi.y + "; Futterstatus: " + maxi.lunchboxes);

        maxi.move("up", 2);
        System.out.println("x: " + maxi.x + "; y: " + maxi.y + "; Futterstatus: " + maxi.lunchboxes);

        maxi.move("left", 7);
        System.out.println("x: " + maxi.x + "; y: " + maxi.y + "; Futterstatus: " + maxi.lunchboxes);

        maxi.feed(17);
        System.out.println("x: " + maxi.x + "; y: " + maxi.y + "; Futterstatus: " + maxi.lunchboxes);
    }
}
