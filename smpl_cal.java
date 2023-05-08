 import java.util.*;
 public class smpl_cal {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the 1st value");
//         int a = sc.nextInt();
//         System.out.println("Enter the 2nd value");
//         int b = sc.nextInt();
//         System.out.println("Enter 1 for +, 2 for -, 3 for *, 4 for /, 5 for %");
//         int z = sc.nextInt();
//         if(z==1){
//             int ans=a+b;
//             System.out.print( "a+b="+ans );
//         }

//         else if(z==2){
//             int ans=a-b;
//             System.out.println("a-b="+ans);
//         }

//         else if(z==3){
//             System.out.printf("a*b="+a*b);
//         }
//         else if(z==4){
//             System.out.printf("a/b="+a/b);
//         }
//         else if(z==5){
//             System.out.printf("a%b="+a%b);
//         }
//         else{
//             System.out.println("Enter the value in valid range");
//         }
           System.out.println("enter the value of a");
           double a =sc.nextDouble();
           System.out.println("enter the value of b");
           double b =sc.nextDouble();
           int operator = sc.nextInt();
           switch(operator){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:System.out.println(a*b);
            break;
            case 4:if(b==0){
                System.out.println("invalid division");
            }
            else{
                System.out.println(a/b);
            }
            break;
            case 5:if(b==0){
                System.out.println("invalid division");
            }
            else{
                System.out.println(a%b);
            }
            break;
            default:System.out.println("invalid operator");
           }

              
     }
    
 }
