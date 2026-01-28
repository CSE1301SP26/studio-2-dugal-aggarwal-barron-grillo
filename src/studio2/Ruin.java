import java.util.Scanner;

public class Ruin {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("How much money would you like to start with? ");
        double startAmount = in.nextDouble();
        System.out.println("What win chance do you want? ");
        double winChance = in.nextDouble();
        System.out.println("What would you like your win limit to be? ");
        double winLimit = in.nextDouble();
        System.out.println("How many days are you going for? ");
        int totalSim = in.nextInt();
        int playRound = 0;
        double currentAmount = startAmount;
        for (int i = 1; i <= totalSim; i++) {
            while (currentAmount > 0 && currentAmount < winLimit) {
                if (Math.random() < winChance) {
                    currentAmount++;
                    System.out.println("Win Round: Current Amount is: " + currentAmount);
                } else {
                    currentAmount--;
                    System.out.println("Lose Round: Current Amount is: " + currentAmount);
                }
                playRound++;
                if (currentAmount >= winLimit) {
                    System.out.println("Win " + playRound);
                } else if (currentAmount <= 0) {
                    System.out.println("Lose " + playRound);
                }
            }

        }
    }

}
