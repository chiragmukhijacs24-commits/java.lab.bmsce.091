import java.util.*;
public class quadraticEquation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a , b , c ;
        System.out.println("Enter the coefficient of x^2");
        a = sc.nextInt();
        if(a ==0){
            System.out.println("Invalid equation leading coefficient is Zero");
            return ;
        }
        System.out.println("Enter the coefficient of x");
        b = sc.nextInt();
        System.out.println("Enter the constant term");
        c = sc.nextInt();
        int d = (b*b - 4*a*c);
        if(d>0){
            System.out.println("real and distinct roots");
            float r1 =(float) (-b + Math.sqrt(d))/(2*a);
            float r2 =(float) (-b - Math.sqrt(d))/(2*a);
            System.out.println(r1 + " " + r2);
        }
        else if(d ==0){
            System.out.println("real and equal roots");
            float r1 = -b/(2*a);
            System.out.println(r1);
        }
        else{
            System.out.println("Imagenary roots !");
            d = -d ;
            float real = -b/(2*a);
            float img = (float) Math.sqrt(d) / (2*a) ;
            System.out.print(real + "+" + img + "i" + " " + real + "-" + img + "i");

        }
        
    }
}
