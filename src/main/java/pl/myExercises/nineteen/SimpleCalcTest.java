package pl.myExercises.nineteen;

import java.util.Scanner;

public class SimpleCalcTest {
    public static void main(String[] args) {
        System.out.println("Prosty kalkulator" );
        System.out.println("Wpisz 'q' aby zakończyć");
        Scanner s = new Scanner(System.in);
        System.out.println("Wprowadź liczbę");
        double first = s.nextDouble();
        if(first == 'q')System.exit(-1);
        System.out.println("Wprowadź znak działania");
        char sign = s.next(".").charAt(0);
        if(sign == 'q')System.exit(-1);

        System.out.println("Wprowadź liczbę");
                double second = s.nextDouble();
        if(second == 'q')System.exit(-1);

        SimpleCalc myCalc = new SimpleCalc(first, second);
        System.out.println("Wynik to :"+myCalc.makeOp(sign));

}}