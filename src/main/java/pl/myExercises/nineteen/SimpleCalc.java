package pl.myExercises.nineteen;

public class SimpleCalc {
    private double a;
    private double b;

    public SimpleCalc(double x, double y) {
        a = x;
        b = y;
    }

    public double makeOp(char op) {
        double r = 0;
        switch (op) {
            case '+':
                r = a + b;
                break;
            case '-':
                r = a - b;
                break;
            case '*':
                r = a * b;
                break;
            case '/':
                r = a / b;
                break;
            case 'q': System.exit(-1);
            default:
                System.out.println("nieznany kod \nkalkulator zakonczy działąnie po wpisaniu q");

        }return r;
    }
}