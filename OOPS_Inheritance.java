public class OOPS_Inheritance {
    public static void main(String[] args){
        Fish shark=new Fish();
        shark.eat();

    }
    
}

//Base Class Or Parent class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("Breaths");
    }
}

//Derived Class Or Child Class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }

}
