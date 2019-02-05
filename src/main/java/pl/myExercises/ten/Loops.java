package pl.myExercises.ten;

import pl.myExercises.two.SystemOutPrintF;

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Loops {
    public static void main(String[] args) {

        int[] myArray = createArray();
        System.out.println(Arrays.toString(myArray));
        System.out.println("Suma " + sum(myArray));
        System.out.println("Suma " + sumStream(myArray));
        System.out.println("średnia = " + avg(myArray));
        minMax(myArray);


    }

    public static int[] createArray() {
        int size = Integer.parseInt(showInputDialog("Podaj wielkość tablicy"));
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Integer.parseInt(showInputDialog("Podaj wartość " + (i + 1) + " elementu"));

        }
        return myArray;

    }

    public static int sum(int[] myArray) {

        int sum = 0;

        for (int i : myArray)
            sum = sum + i;
        return sum;
    }

    public static int sumStream(int[] myArray) {
        int sum = IntStream.of(myArray).sum();
        return sum;

    }

    public static double avg(int[] myArray) {
        int avg;
        int sum = 0;
        int size = 0;
        for (int i : myArray)
            sum = sum + i;
        avg = sum / myArray.length;
        return avg;
    }

    public static void minMax(int[] myArray) {
        int max = Arrays.stream(myArray).max().getAsInt();
        int min = Arrays.stream(myArray).min().getAsInt();
        System.out.println("Max: " + max + "Min: " + min);
    }
}