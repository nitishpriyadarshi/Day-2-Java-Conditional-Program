package forloop;
// Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

public class NaturalNumber {
    // Returns sum of first n natural
    // numbers
    static int findSum(int n)
    {
        int sum = 0;
        for (int x = 1; x <= n; x++)
            sum = sum + x;
        return sum;
    }

    // Driver code
    public static void main(String args[])
    {
        int n = 5;
        System.out.println(findSum(n));
    }

}
