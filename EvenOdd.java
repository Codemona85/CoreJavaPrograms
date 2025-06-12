package learnCoreJava;

public class EvenOdd {

    public static void main(String[] args) {
        int rem;
        int i;
        for(i=1;i<=100; i++)
        {
            rem=i%2;
            if (rem==0)
            {
                System.out.println("Even Number " + i);
            }
            else
            {
                System.out.println("Odd Number " + i);
            }
        }

    }
}
