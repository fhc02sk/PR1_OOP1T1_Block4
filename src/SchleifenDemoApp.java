public class SchleifenDemoApp {

    public static void main(String[] args) {
        exampleS5Alternative();
    }

    public static void exampleS2(){

        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void exampleS5() {

        for (int zeile = 0; zeile <= 9; zeile++) {
            System.out.print("Zeile: " + zeile + " > ");
            for (int i = 0; i <= zeile; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void exampleS5Alternative(){
        String zeile = "Zeile: ";
        for (int i = 0; i <= 9; i++) {
            zeile = zeile + i + " ";
            System.out.println(zeile);
        }

        /*
        * 1. Durchlauf (i = 0)
        * zeile = "Zeile: " + 0 => "Zeile: 0 "
        *
        * 2. Durchlauf (i = 1)
        * zeile = "Zeile: 0 "
        * zeile = "Zeile: 0 " + 1 + " " => "Zeile: 0 1 "
        * 3. Durchlauf (i = 2)
        * zeile = "Zeile: 0 "
        * zeile = "Zeile: 0 1 " + 2 + " " => "Zeile: 0 1 2 "
        * */
    }
}
