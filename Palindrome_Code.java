import java.util.*;
public class Palindrome_Code {
    public static boolean ispalindrome(String s){

        //convert into lowercase 
        s = s.toLowerCase();
         String rev = "";
        for(int i = s.length()-1; i>=0 ; i--){

            // convert string into character and store rev 
            rev = rev + s.charAt(i);
        }
        return s.equals(rev);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter the word for checking palinedrome :- ");
       String s = sc.nextLine();
       boolean res = ispalindrome(s);
       
       if (res) {
        System.out.println(" " + s +" "+ "is a palimedrome.");
       }else{
        System.out.println(" "+ s +" "+ "is not palindrome");
       }
    }
}
