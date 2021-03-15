public class WiederholungDemoApp {

    public static void main(String[] args) {
        printNumbersFor();
        int[] result = printNumbersWhile();

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "; ");
        }
    }

    /*
        Eine neue Methode, welche
          -> alle Zahlen zwischen 1 und maximal 1.000 ausgibt (printf), welche durch
                7 und 3 dividierbar sind
          -> alle möglichen Zahlen sollen auch summiert werden (21, 42, 63, ...)
          -> die Schleife soll abgebrochen werden, wenn 10 Zahlen ausgegeben
                wurden oder die Summe von 1000 erreicht wurde
     */
    // ReturnType
    // Name
    // Parameters
    public static void printNumbersFor() {

        int sum = 0;
        int counter = 0;
        // Initialisierung;Abbruchbedingung;Increment
        for(int i = 1;i <= 1000;i++){
            if (i % 7 == 0 && i % 3 == 0) {
                System.out.print(i + ", ");
                sum = sum + i;
                counter++;
            }

            if (counter >= 10 || sum >= 1000){
                break;
            }
        }

        System.out.println("\nsum = " + sum);
        System.out.println("counter = " + counter);
    }

    public static int[] printNumbersWhile() {
        int sum = 0, counter = 0, i = 0;

        int[] gefundenZahlen = new int [10];
        /*
            gefundenZahlen[0] = 1. zahl
            gefundenZahlen[1] = 2. zahl
         */

        while (i < 1000 && counter <= gefundenZahlen.length && sum <= 1000){
            i++;
            if (i % 7 == 0 && i % 3 == 0){

                gefundenZahlen[counter] = i;

                sum = sum + i;
                counter++;
            }
        }

        System.out.println("\nsum = \t" + sum); // \n => Zeilenumbruch \t => Tabulator
        System.out.println("counter = " + counter);

        return gefundenZahlen;
    }
}
