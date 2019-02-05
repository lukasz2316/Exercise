package pl.myExercises.twenty;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class switchWelcome {
    public static void main(String[] args) {
        switchWelcome();
    }

    public static void switchWelcome() {
        while (true) {
            String lang = showInputDialog("Podaj język.\n Dostępne PL, NL, EN, DE, FR").toUpperCase();
            switch (lang) {
                case "PL":
                    showMessageDialog(null, "Dzień dobry");
                    break;
                case "EN":
                    showMessageDialog(null, "Morning");
                    break;
                case "DE":
                    showMessageDialog(null, "Guten Morgen");
                    break;
                case "FR":
                    showMessageDialog(null, "Bienvenue");
                    break;
                case "NL":
                    showMessageDialog(null, "Goeden Morgen");
                    break;
                case "Q":
                    System.exit(1);break;
                default:
                    showMessageDialog(null, "Not supported - try again");
                    break;
            }
        }
    }
}