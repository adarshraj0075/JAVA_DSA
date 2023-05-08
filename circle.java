import java.util.*;
public class circle {
    public static void main(String[] args){

        //Area of circle
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the radius of circle:");
       double radius = sc.nextDouble();
       double area = Math.PI*(radius*2);
       System.out.printf("Area of circle is:", area);


    }
    
}
