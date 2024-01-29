import java.util.*;
public class Recursion {
    public static void main(String[] args){
        number1(5);
        

    }

    public static void number1(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        number1(n-1);
    }

    // public static void number2(int n){
    //     System.out.println(n);
    //     number3(3);
    // }

    // public static void number3(int n){
    //     System.out.println(n);
    //     number4(4);
    // }

    // public static void number4(int n){
    //     System.out.println(n);
    //     number5(5);
    // }

    // public static void number5(int n){
    //     System.out.println(n);
    // }



    // public static void message1(){
    //     System.out.println("hello world");
    //     message2();
    // }

    // public static void message2(){
    //     System.out.println("hello world");
    //     message3();
    // }

    // public static void message3(){
    //     System.out.println("hello world");
    //     message4();
    // }

    // public static void message4(){
    //     System.out.println("hello world");
    //     message5();
    // }

    // public static void message5(){
    //     System.out.println("hello world");
    // }
    
}
