public class OOPS_constructor {
    public static void main(String[] args){
        Student s1=new Student("Adarsh",0075);
        System.out.println(s1.name);
        System.out.println(s1.roll);

        Student s2=new Student();

    }
    
}

class Student{
    String name;
    int roll;

    //Parameterised Constructor
    Student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }

    //Non Parameterised Constructor
    Student(){
        System.out.println("Constructur is called......");
    }
}
