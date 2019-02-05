package pl.myExercises.thirteen;

public class powers {
    public static void main(String[] args) {
        powerTill(5, 3);

    }

    public static void powerTill(int base, int lastExpo) {
        for (int i = 1; i <= lastExpo; i++) {
            System.out.println(Math.pow(base, i));

        }

    }

   /* public static void powerTo(int base, int exponant) {
        double sum = Math.pow(base, exponant);
        for (int i = 1; i <= ; i++) {
            System.out.println("Base: " + base + "Wykładnik" + i + " = " + sum);



        }
    }*/
}