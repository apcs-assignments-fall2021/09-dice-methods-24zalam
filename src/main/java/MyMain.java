import java.util.Random;

public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        return (int)(Math.random() * ((6 - 1) + 1)) + 1; //had to google the formula Math.random uses

    }
    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        // REPLACE WITH YOUR CODE HERE
        double counter=0.0;
        for (int i = 0; i < 10000; i++) {

            for (int j = 0; j < 6; j++) {
                   if ((int) (Math.random() * 6) + 1 == 6) {
                    counter += 1.0;
                    break; }


            }

        }
        return (counter / 10000) * 100;
        }


    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        double counter = 0.0;
        double numofsix = 0;
        for (int i = 0; i < 10000; i++) {
            numofsix = 0.0;
            for (int j = 0; j < 12; j++) {
                if ((int) (Math.random() * 6) + 1 == 6) {
                    numofsix += 1.0;}
            }
            if (numofsix>= 2){
                counter += 1.0;
            }
        }
        return (counter/10000)*100;
    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        double counter = 0.0;
        double numofsix = 0;
        for (int i = 0; i < 10000; i++) {
            numofsix = 0.0;
            for (int j = 0; j < 18; j++) {
                if ((int) (Math.random() * 6) + 1 == 6) {
                    numofsix += 1.0;}
            }
            if (numofsix>= 3){
                counter += 1.0;
            }
        }
        return (counter/10000)*100;
    }


    public static void main(String[] args) {

    }
}
