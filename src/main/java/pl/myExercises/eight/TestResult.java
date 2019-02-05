package pl.myExercises.eight;

import static javax.swing.JOptionPane.*;

public class TestResult {
    public static void main(String[] args) {
testResult();
    }

    public static void testResult()

    {
        int score = Integer.parseInt(showInputDialog("Podaj swój wynik"));
        showMessageDialog(null, "Zdobyłeś " + score + " punktów");
        if (score <= 50) {
            showMessageDialog(null, "Niezdałeś");
        } else if (score <= 60) {
            showMessageDialog(null, "Dostałeś 2");
        } else if (score <= 70) {
            showMessageDialog(null, "Dostałeś 3");
        } else if (score <= 80) {
            showMessageDialog(null, "Dostałeś 4");
        } else if (score <= 90) {
            showMessageDialog(null, "Dostałeś 5");
        } else if (score <=100) {
            showMessageDialog(null, "6");}
            else {showMessageDialog(null,"chyba cie pojebao");

        }
    }}
