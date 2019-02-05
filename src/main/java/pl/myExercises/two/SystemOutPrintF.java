package pl.myExercises.two;

public class SystemOutPrintF {
    public static void main(String[] args) {
systemOutPrintF();
    }
    public static void systemOutPrintF(){
        int x = 100;
        double pi = Math.PI;
        float n = 5.2f;
        n = 2324435.25f;
        System.out.printf("%.4f\n", pi);
        System.out.printf("%.4d\n",x);
        System.out.printf("%.5f", n);
    }
}
