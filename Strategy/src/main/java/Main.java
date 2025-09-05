import Algorithms.BubbleSort;
import Algorithms.CountingSort;
import Algorithms.QuickSort;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double startTime;
        double endTime;
        int numberAmount = 1000;
        int maxNumber = 1000;
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        // Random numbers
        for (int i = 0; i < numberAmount; i++) {
            list.add(rand.nextInt(maxNumber));
        }

        SortingContext context = new SortingContext();

        System.out.println("Integers amount: " + numberAmount);
        System.out.println("Max integer: " + maxNumber);


        context.setAlgorithm(new BubbleSort());
        System.out.println("\nBubble Sort results");
        startTime = System.currentTimeMillis();
        context.sort(list);
        endTime = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (endTime - startTime) + " milliseconds");

        context.setAlgorithm(new CountingSort());
        System.out.println("\nCount Sort results");
        startTime = System.currentTimeMillis();
        context.sort(list);
        endTime = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (endTime - startTime) + " milliseconds");

        context.setAlgorithm(new QuickSort());
        System.out.println("\nQuick Sort results");
        startTime = System.currentTimeMillis();
        //context.sort(list);
        endTime = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (endTime - startTime) + " milliseconds");

        System.out.println("\nJava.Collections sort results");
        startTime = System.currentTimeMillis();
        list.sort(null);
        endTime = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (endTime - startTime) + " milliseconds");

    }
}
