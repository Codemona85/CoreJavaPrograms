package learnCoreJava;

public class ArithmaticOperationObject {

    public static void main(String[] args) {
        ArithmaticOperationObject ab= new ArithmaticOperationObject();
        int a=10;
        int b=20;
        ab.Add(10,20);
        ab.Subtract(10,20);
        ab.Multiply(10, 20);
        ab.Divide(10,20);
        ab.Remainder(10,20);
    }
    public void Add(int a,int b){
         int sum = a+b;
        System.out.println("Sum is:" +sum);
    }
    public void Subtract(int a,int b){
        int diff= a-b;
        System.out.println("Diff is:" +diff);
    }
    public  void Multiply(int a,int b){
        int mul= a*b;
        System.out.println("Multiplication is:" +mul);
    }
    public  void Divide(int a,int b){
        int div= a/b;
        System.out.println("Division is:" +div);
    }
    public static void Remainder(int a,int b){
        int rem= b%a;
        System.out.println("Remainder is:" +rem);
    }

}
