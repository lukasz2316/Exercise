package pl.myExercises.one;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class TalkingBot {
    public static void main(String[] args) {
        howareyou();
        weight();
        height();
        howareyou();

    }
    public static void howareyou(){
        String mood = showInputDialog("Jak się masz");
        showMessageDialog(null,"Widzę,że czujesz się "+ mood);
    }
    public static void weight() {
        String mood = showInputDialog("Ile ważysz");
        showMessageDialog(null, "Widzę,że ważysz " + mood);


    }
    public static void height(){
        String mood = showInputDialog("Ile  cm wzrostu");
        showMessageDialog(null,"Masz "+ mood+" cm");
    }

}