package forloop;
import java.util.Scanner;
//  Program to find Palindrome Number

public class PalindromeNumber {
    public static void main(String[] args) {
        int num,t,s,rem;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter any number ");
            num=sc.nextInt();
        }
        t=num;
        for(s=0;num>0;num/=10){
            rem=num%10;
            s=(s*10)+rem;
        }
        if(s==t)
            System.out.println(t+" is a palindrome number ");
        else
            System.out.println(t+" is not a palindrome number ");


    }
}
