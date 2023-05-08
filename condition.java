import java.util.*;
public class condition {
    //System.out.println("Enter a button:");
    public static void main(String[] args){
        System.out.println("Enter a button:");
    Scanner sc = new Scanner(System.in);
    int button=sc.nextInt();
    switch (button) {
        case 1:System.out.println("Hello");
            
            break;
        case 2:System.out.println("Namste");
            break;

        case 3:System.out.println("Bonjour");
            break;
        default:System.out.println("Invalid Button");
            break;
    }

    }
}
