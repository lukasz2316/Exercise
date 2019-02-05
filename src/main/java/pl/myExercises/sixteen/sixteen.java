package pl.myExercises.sixteen;

public class sixteen {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
        System.out.println(fibonacciWhile(9));
    }
    public static int fibonacci(int n){

        int t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        int sum =0;
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            ;
        }return sum;
    }
    public static int fibonacciWhile(int n){
        int i = 1;

        int t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        int sum =0;
        while( i <= n)
        {
            System.out.print(t1 + " + ");

            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            i++;
        }return sum;
    }
}


