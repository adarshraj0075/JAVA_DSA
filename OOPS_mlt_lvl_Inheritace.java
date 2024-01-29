public class OOPS_mlt_lvl_Inheritace {
    public static void main(String[] args){
        Dog pidbul=new Dog();
        pidbul.skin="Brown";
        System.out.println(pidbul.skin);

        pidbul.eat();
        pidbul.blood();

    }
    
}

class Animal{
    String skin;
    void eat(){
        System.out.println("Eats....");
    } 
}

class Mamal extends Animal{
    void blood(){
        System.out.println("Warm blood");
    }
}

class Dog extends Mamal{
    void leg(){
        System.out.println("four legs");
    }
}
