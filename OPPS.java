import java.util.*;
public class OPPS {
    public static void main(String[] args){
        Pen p1=new Pen(); //Created a pen object called p1
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);

        Student s1=new Student();
        s1.storeName("Adarsh Raj");
        s1.calcPercentage(40,20,10);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.percentage);

    }
    
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void storeName(String newName){
        name=newName;
    }

    void calcPercentage(int phy, int chem, int math){
        percentage=(phy+chem+math)/3;

    }

}