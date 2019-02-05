package pl.myExercises.seventeen;

public class seventeen {
    public static void main(String[] args) {
someLoop();
    }
    public static void someLoop(){
  int i= 0;
  while(i<=20){
      i++;
      if(i%3==0){
          System.out.println(i +" podzielne przez 3");
      }else {
          System.out.println(i + " niePodzielne przez trzy");
  }
    }
}}

