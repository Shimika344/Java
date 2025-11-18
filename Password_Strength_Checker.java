import java.util.*;
public class Password_Strength_Checker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter YOur passward for checking Strength : ");
        String password = sc.nextLine();
        sc.close();
        checkpasswordstrength(password);
    }

    public static void checkpasswordstrength(String password){
        int min_length = 8 ;
        boolean hasuppercase = false ;
        boolean haslowercase = false ;
        boolean hasdigit = false ;
        boolean hasspecialcase = false ;

        if(password.length() < min_length){
            System.out.println("Password Strength is weak ! Must be at least" + min_length + "character value.");
            return ; 
        }
  
        for(char ch : password.toCharArray()){
            if (Character.isLowerCase(ch)) {
                haslowercase = true;
            }else if(Character.isUpperCase(ch)){
                hasuppercase  = true ;
            }else if(Character.isDigit(ch)){
                hasdigit = true ;
            }else{
                hasspecialcase = true ;   
            }
        }

                // Evaluate strength based in criteria met.
                if (haslowercase && hasdigit && hasspecialcase && hasuppercase) {
                    System.out.println("Password Stringth :- 'Strong' rating ");
                }else if ( haslowercase && hasuppercase) {
                    System.out.println("Password Strength :- 'Medium' rating ");
                }else{
                    System.out.println("Password Strength :- 'Weak' rating ");
          }
    }
    
}
