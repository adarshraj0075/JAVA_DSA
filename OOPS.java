public class OOPS {
    public static void main(String args[]){

        Pen p1=new Pen(); //Created a object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(3);
        System.out.println(p1.tip);

        p1.color="red";
        System.out.println(p1.color);

        BankAccount myAccount=new BankAccount();
        myAccount.username="Adarsh2512";

        //myAccount.password="1234"; -->>This will show error because password is private so we have to make a 
        //function for password.
        
        myAccount.setPassword("@A993944d");
       // System.out.println(myAccount.password); --> This will show error: password has private access in BankAccount
    }
    
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password=pwd;
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

    void calcPercentage(int phy, int chem, int math){
        percentage=(phy+chem+math)/3;
    }
}
