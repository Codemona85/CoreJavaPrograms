package learnCoreJava;
public class ArithmaticOperations {
    public static void main(String[] args) {
        int a=10;
        int b=20;
         Add(10,20);
        Subtract(10,20);
        Multiply(10, 20);
        Divide(10,20);
        Remainder(10,20);
    }
    public static void Add(int a,int b){
        int sum = a+b;
        System.out.println("Sum is:" +sum);
    }
    public static void Subtract(int a,int b){
        int diff= a-b;
        System.out.println("Diff is:" +diff);
    }
    public  static void Multiply(int a,int b){
        int mul= a*b;
        System.out.println("Multiplication is:" +mul);
    }
    public static void Divide(int a,int b){
        int div= a/b;
        System.out.println("Division is:" +div);
    }
    public static void Remainder(int a,int b){
        int rem= b%a;
        System.out.println("Remainder is:" +rem);
    }

}
