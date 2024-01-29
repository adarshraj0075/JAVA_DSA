import java.util.*;
public class polymorphism_mthd_ovrldng {
    public static void main(String[] args){
        Calculator c1=new Calculator();
        System.out.println(c1.sum(2,4));
        System.out.println(c1.sum((float)2.5,(float)(3.5)));
        System.out.println(c1.sum(2,4,6));
        //Method overloading function name same with different parameters
    }
}

class Calculator{
    int sum (int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}
