package whileloopproblem;

// Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
public class SumOfNaturalNummber {
    public static void main(String[] args) {

        int n = 5, i = 1, sum = 0;
        //executes until the condition returns true
        while(i <= n)
        {
            //adding the value of i into sum variable
            sum = sum + i;
            //increments the value of i by 1
            i++;
        }
        //prints the sum
        System.out.println("Sum of First 5 Natural Numbers is = " + sum);

    }

}
