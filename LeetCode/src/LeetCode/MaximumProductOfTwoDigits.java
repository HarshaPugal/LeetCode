package LeetCode;
/*
 You are given a positive integer n.
Return the maximum product of any two digits in n.
Note: You may use the same digit twice if it appears more than once in n
Example 1:
Input: n = 31
Output: 3
Explanation:
The digits of n are [3, 1].
The possible products of any two digits are: 3 * 1 = 3.
The maximum product is 3.
Example 2:
Input: n = 22
Output: 4
Explanation:
The digits of n are [2, 2].
The possible products of any two digits are: 2 * 2 = 4.
The maximum product is 4.
Example 3:
Input: n = 124
Output: 8
Explanation:
The digits of n are [1, 2, 4].
The possible products of any two digits are: 1 * 2 = 2, 1 * 4 = 4, 2 * 4 = 8.
The maximum product is 8.
Constraints:
10 <= n <= 109
 */
import java.util.Scanner;

public class MaximumProductOfTwoDigits {
    public static int maxProduct(int n) {
        int[] digits=new int[10];
        int n1=n,k=0;
        int max=0;
        while(n1>0){
            digits[k++]=n1%10;
            n1=n1/10;
        }
        for(int i=0;i<digits.length;i++){
            for(int j=i+1;j<digits.length;j++){
             if((digits[i]*digits[j])>max){
                 max=digits[i]*digits[j];
             }   
            }
        }
        return max;
    }
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	int num=sc.nextInt();
    	System.out.println(maxProduct(num));
    }
}