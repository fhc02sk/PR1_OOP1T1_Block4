public class Tamagochi {

    int x; // final write once, read multiple times, but change never
    int y;
    int lunchboxes;

    public void feed(int box){
        lunchboxes += box;
    }

    public void move(String direction, int steps) {
        /* direction = left, right, up, down */

        if (direction.equalsIgnoreCase("left")){
            x = x - steps;
        }
        else if (direction.equalsIgnoreCase("up")) {
            y = y + steps;
        }
        else if (direction.equalsIgnoreCase("down")) {
            y = y - steps;
        }
        else if (direction.equalsIgnoreCase("right")) {
            x = x + steps;
        }
        else {
            System.out.println("ungültige richtung");
        }
        //lunchboxes = lunchboxes - steps;
        lunchboxes -= steps;
    }
}
