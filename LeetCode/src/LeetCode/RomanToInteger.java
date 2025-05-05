package LeetCode;

import java.util.*;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character,Integer> romans=new HashMap<>();
        romans.put('I',1);
        romans.put('V',5);
        romans.put('X',10);
        romans.put('L',50);
        romans.put('C',100);
        romans.put('D',500);
        romans.put('M',1000);
        int n=0;
        for(int i=0;i<s.length()-1;i++){
            if(romans.get(s.charAt(i))<romans.get(s.charAt(i+1))){
                n=n-romans.get(s.charAt(i));
            }
            else{
                n=n+romans.get(s.charAt(i));
            }
        }
        n=n+romans.get(s.charAt(s.length()-1));
return n; 
    }
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   String s=sc.nextLine();
	   int res=romanToInt(s);
	   System.out.println(res);
   }
}