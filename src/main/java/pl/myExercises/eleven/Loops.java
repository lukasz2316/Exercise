package pl.myExercises.eleven;

public class Loops {
    public static void main(String[] args) {
        doWhile();
    }
    public static void oddEvenFor(){
        for(int i = 1; i<=20;i++){
            if(i%2==0){
                System.out.println(i +" Parzysta");
            }else System.out.println(i +" Nieparzysta");
        }
    }
    public static void oddEvenWhile(){
        int i =1;
        while(i<=20){
            if(i%2==0){
                System.out.println(i +" Parzysta");
            }else System.out.println(i +" Nieparzysta");
            i++;
        }
    }
    public static void doWhile(){
        int i=1;
        do{if(i%2==0){
            System.out.println(i +" Parzysta");
        }else System.out.println(i +" Nieparzysta");
            i++;}
        while(i<=20);
    }
}

