package pl.myExercises.nine;

import static javax.swing.JOptionPane.showInputDialog;
import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray()));
        System.out.println(Arrays.toString(reverseArray(createArray())));
    }

    public static int[] createArray() {
        int size = Integer.parseInt(showInputDialog("Podaj wielkość tablicy"));
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Integer.parseInt(showInputDialog("Podaj wartość "+ (i+1)+" elementu"));

        }
        return myArray;

    }

    public static int[] reverseArray(int[] myArray) {

        for(int i = 0; i < myArray.length / 2; i++)
        {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = temp;
        }

return myArray;
    }


}
