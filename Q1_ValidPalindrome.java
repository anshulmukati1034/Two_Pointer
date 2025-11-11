import java.util.*;

class Q1_ValidPalindrome{

    public static boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;

        while(i<j){
            char left=s.charAt(i);
            char right=s.charAt(j);

            if(!Character.isLetterOrDigit(left)){
                i++;
                continue;
            }

            if(!Character.isLetterOrDigit(right)){
                j--;
                continue;
            }

            if(Character.toLowerCase(left) != Character.toLowerCase(right)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean checkPalindrome = isPalindrome(s);

        if(checkPalindrome){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}