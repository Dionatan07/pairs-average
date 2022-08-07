package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner key = new Scanner(System.in);

        System.out.print("How many elements will the vector have? ");
        int n = key.nextInt();

        int[] vector = new int[n];

        double average = 0.0;
        int sumPairs = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a number: ");
            vector[i] = key.nextInt();

            if (vector[i] % 2 == 0) {
                average += vector[i];
                sumPairs++;
            }
        }
        if (sumPairs > 0) {
            double parsAverage = average / sumPairs;
            System.out.print("Pairs Average: " + String.format("%.1f", parsAverage));
        }else{
            System.out.print("No even number");
        }


    }
}
