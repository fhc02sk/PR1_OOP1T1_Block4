public class WiederholungDemoApp {

    public static void main(String[] args) {
        printNumbersFor();
        printNumbersWhile();
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

    public static void printNumbersWhile() {
        int sum = 0, counter = 0, i = 1;

        while (i < 1000 && counter <= 10 && sum <= 1000){
            i++;
            if (i % 7 == 0 && i % 3 == 0){
                System.out.print(i + ", ");
                sum = sum + i;
                counter++;
            }
        }

        System.out.println("\nsum = \t" + sum); // \n => Zeilenumbruch \t => Tabulator
        System.out.println("counter = " + counter);
    }
}
