package happynumber;
/*Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number
by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay),
or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.*/
public class Solution {
    public boolean isHappy(int n) {
        int sum = n;

        while (sum != 1 && sum != 4) {
            sum = sumDigits(sum);
        }
        if (sum != 1) {
            return false;
        }
        return true;
    }

    private int sumDigits(int sum) {
        int result = 0;
        while (sum != 0) {
            int digit = sum % 10;
            result += digit * digit;
            sum = sum / 10;
        }
        //System.out.println("    Sum of digits: " + result);
        return result;
    }
}
