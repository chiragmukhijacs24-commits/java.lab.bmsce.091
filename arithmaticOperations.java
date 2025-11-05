import java.util.*;
public class arithmaticOperations{
    public static int addition(int a , int b){
        int c = a + b ;
        return c;
    }
    public static int subtraction(int a , int b){
        int c = a - b ;
        return c;
    }
    public static int multiplication(int a , int b){
        int c = a * b ;
        return c;
    }
    public static float devision(int a , int b){
        float c = a / b ;
        return c;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number");
        int n1 = sc.nextInt();
        System.out.print("enter second number");
        int n2 = sc.nextInt();
        int n3 = addition(n1,n2);
        int n4 = subtraction(n1,n2);
        int n5 = multiplication(n1,n2);
        float n6 = devision(n1,n2);
        System.out.print("addition" + n3 + "subtraction" + n4 + "multiplication" + n5 + "devision" + n6);
    }
}