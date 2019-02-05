package pl.myExercises.seven;

public class Loops {
    public static void main(String[] args) {
      //  countdown(314);
        printCubesOfNumber(5,125);
    }

    public static void countdown(int start) {

        for (int i = start; i >= 0; i--) {
            System.out.print(i + " ");
        }


    }
    public static void multiply(int end){
        for (int i= 1; i<= end; i++){
            System.out.println(i+"*"+end+"= "+end*i);
        }
    }
    public static void printCubesOfNumber(int start,int end){
        for (int i = start; i<=end;i++){
            int result = i*i*i;
            System.out.println(i+" do szescianuto :"+result);
        }
    }
}
