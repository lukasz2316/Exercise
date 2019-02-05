package pl.myExercises.eighteen;

public class eighteen {
    public static void main(String[] args) {
factorial(12);
    }

    public static void someMethod(int number) {
        int i = 0;
        while (i >= 0) {
            for (;;) {
                int result = number * i;
                System.out.println("Silnia dla liczby result");
            }
        }
    }

    public static void factorial(int count) {
        int i=1;
        int value=1;
        String res = "";
        while (i <= count){
            value = value * i;
            res = value + ((i>1)?",":"") + res;
            i++;
        }
        System.out.print(res);
        }
    }
