import java.util.*;
public class OOPS_Hierarchial_inheritance {
    public static void main(String[] args){
        Fish shark=new Fish();
        shark.eat();
        shark.swim();

    }
}

class Animal{
    void eat(){
        System.out.println("Animal Eats");
    }

    void breath(){
        System.out.println("Animal Breaths");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Birds fly");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("fish swims");
    }
}
