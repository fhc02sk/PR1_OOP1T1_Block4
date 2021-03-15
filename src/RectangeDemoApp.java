public class RectangeDemoApp {

    public static void main(String[] args) {

        Rectangle tisch = new Rectangle();
        tisch.name = "Braune Holzplatte";
        tisch.length = 160;
        tisch.width = 80;

        Rectangle tisch2 = new Rectangle();
        tisch2.name = "Braune Holzplatte";
        tisch2.length = 160;
        tisch2.width = 80;

  /*      if (tisch.name == tisch2.name
                && tisch.length == tisch2.length
                && tisch.width == tisch2.width){*/
    //    if (tisch == tisch2) {
        if (tisch.equals(tisch2)){
            System.out.println("Tisch und Tisch2 sind ident!");
        }
        else
            System.out.println("Tisch und Tisch2 sind NICHT! ident!");

        int t = 5;
        int t2 = 5;
        if (t == t2) {
            System.out.println("t und t2 sind ident!");
        }

        Rectangle fenster = new Rectangle();
        fenster.name = "Weiße Durchsicht";
        fenster.length = 80;
        fenster.width = 80;

        System.out.println("tisch.calcArea() = " + tisch.calcArea());
        System.out.println("tisch.calcDiagonal() = " + tisch.calcDiagonal());
        
        double areaFenster = fenster.calcArea();
        System.out.println("areaFenster = " + areaFenster);
        System.out.println("fenster.calcDiagonal() = " + fenster.calcDiagonal());

    }
}
