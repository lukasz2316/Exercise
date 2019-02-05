package pl.myExercises.eleven;

public class twelve {
    public static void main(String[] args) {
        int[]myArray = {1,2,3,4,5};
        System.out.println(sumArray(myArray, 2, 4));
    }
    public static int sumArray (int[] myArray,int a,int b){
       int sum = 0;
       int i = 0;
       myArray[i] = 0;
       for(i= a;i<= b;i++){
           sum = sum + myArray[i];
       }return sum;
    }
}
