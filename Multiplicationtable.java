package learnCoreJava;

public class Multiplicationtable {

    public static void main(String[] args) {
        int i;
        int mul;
        int num=5;
        for(i=1; i<=10; i++)
        {
           mul=num*i;
           System.out.println(num +"*" +i +"="+ mul);
        }

    }
   }