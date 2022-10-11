import java.util.ArrayList;

public class GenericsTest {
    public static void main(String[] args) {

        Triple<String, Integer, Integer> boxer0 = new Triple<>("Muhammad Ali", 56, 5);
        Triple<String, Integer, Integer> boxer1 = new Triple<>("Mike Tyson", 50, 6);
        Triple<String, Integer, Integer> boxer2 = new Triple<>("Julio César Chávez", 103, 6);
        Triple<String, Integer, Integer> boxer3 = new Triple<>("Floyd Mayweather Jr.", 50, 0);
        Triple<String, Integer, Integer> boxer4 = new Triple<>("Jack Dempsey", 58, 6);

        ArrayList<Triple<String, Integer, Integer>> aoTriple = new ArrayList<>(); //create array list
        aoTriple.add(boxer0); //add to array list
        aoTriple.add(boxer1);
        aoTriple.add(boxer2);
        aoTriple.add(boxer3);
        aoTriple.add(boxer4);

        Pair<String, Double>[] aoPair = new Pair[5];
        String highestWinPercentage = ""; //java did this automatically, cool
        for (int i = 0; i < aoPair.length; i++) {

            Triple<String, Integer, Integer> currentBoxer = aoTriple.get(i);
            String boxerName = currentBoxer.getFirst();
            double win = (double) currentBoxer.getSecond();
            double loss = (double) currentBoxer.getThird();
            double winPercentage;
            winPercentage = win / (loss + win) * 100;

            //put into pair instance array
            Pair<String, Double> aoPair1 = new Pair<>(boxerName, winPercentage);
            aoPair[i] = aoPair1;

        }

        // Prints out Boxer's name and win percentage

        for (Pair<String, Double> stringDoublePair : aoPair) {

            System.out.print(stringDoublePair.getFirst() + " ");
            System.out.printf("%.2f", stringDoublePair.getSecond());
            System.out.println(" ");

        }

        //The following code checks to see which win percentage is higher.

        if (aoPair[0].getSecond() > aoPair[1].getSecond() && (aoPair[0].getSecond() > aoPair[2].getSecond())
                && (aoPair[0].getSecond() > aoPair[3].getSecond()) && aoPair[0].getSecond() > aoPair[4].getSecond()) {
            System.out.println("Boxer with highest win percentage " + aoPair[0].getFirst());
        }
        if (aoPair[1].getSecond() > aoPair[0].getSecond() && (aoPair[1].getSecond() > aoPair[2].getSecond())
                && (aoPair[1].getSecond() > aoPair[3].getSecond()) && aoPair[1].getSecond() > aoPair[4].getSecond()) {
            System.out.println("Boxer with highest win percentage " + aoPair[1].getFirst());
        }
        if (aoPair[2].getSecond() > aoPair[0].getSecond() && (aoPair[2].getSecond() > aoPair[1].getSecond())
                && (aoPair[2].getSecond() > aoPair[3].getSecond()) && aoPair[2].getSecond() > aoPair[4].getSecond()) {
            System.out.println("Boxer with highest win percentage " + aoPair[2].getFirst());
        }
        if (aoPair[3].getSecond() > aoPair[0].getSecond() && (aoPair[3].getSecond() > aoPair[1].getSecond())
                && (aoPair[3].getSecond() > aoPair[2].getSecond()) && aoPair[3].getSecond() > aoPair[4].getSecond()) {
            System.out.println("Boxer with highest win percentage " + aoPair[3].getFirst());
        }
        if (aoPair[4].getSecond() > aoPair[0].getSecond() && (aoPair[4].getSecond() > aoPair[1].getSecond())
                && (aoPair[4].getSecond() > aoPair[2].getSecond()) && aoPair[4].getSecond() > aoPair[3].getSecond()) {
            System.out.println("Boxer with highest win percentage: " + aoPair[4].getFirst());

        }
    }
}
