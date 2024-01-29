public class OOPS_copyConstructor {
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Adarsh";
        s1.roll=0075;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=80;
        s1.marks[2]=90;

        Student s2=new Student(s1);
        s2.password="xyz";
        s1.marks[2]=100;

        for(int i=0;i<s2.marks.length;i++){
            System.out.println(s2.marks[i]);
        }

  

    }
    
}

class Student{
    int roll;
    String name;
    String password;
    int marks[];

   //Shallow copy constructor
   // Student(Student s1){
   //     this.name=s1.name;
   //     this.roll=s1.roll;
   //     marks=new int[3];
   //     this.marks=s1.marks;
   // }

    //Deep copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }

    
    Student(){
        marks=new int[3];

    }

}
