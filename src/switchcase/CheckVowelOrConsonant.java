package switchcase;
// Program to Check Vowel or Consonant
import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void main(String[] args) {

        boolean isVowel = false; // Variable Declaration

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enetr The Alphabet For Check Vowel Or Consonant : ");

            char ch  = sc.next().charAt(0);

            switch(ch){
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' :
                case 'A' :
                case 'E' :
                case 'I' :
                case 'O' :
                case 'U' : isVowel = true;

            }
            if(isVowel == true) {

                System.out.println(ch+" is  a Vowel");
            }
            else {

                if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))

                    System.out.println(ch+" is a Consonant");
                else
                    System.out.println("Input is not an alphabet");

            }
        }

    }



}
