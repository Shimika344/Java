import java.util.*;
public class Random_Password_Genrator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Ask user for how many want and length of th e password....
        System.out.println("How many random password do ypu want generate ? :-");
        int num = sc.nextInt();

        System.out.println("How many character do you want in passwaord ?:- ");
        int length = sc.nextInt();

        //create an array for store random array..........
        String[] randompasswords = new String[num];

        //loop through total number of passwords
        for(int i = 0 ; i < num ; i++){
            //Generate one random passwords
             String randompass = " ";
            for(int j= 0 ; j < length ; j++){
                randompass = randompass + randomCahracter();
            }
            randompasswords[i] = randompass;   
        }

        //print random password in array 
        printpasswords(randompasswords);

    }
    public static void printpasswords(String[] arr){
      for(int i = 0 ; i<arr.length ; i++){
        System.out.println(arr[i]);
      }  
    }

    //'0'-'9' => 48-57 in ASCII 
    //'A'-'Z' => 65-90 in ASCII
    //'a'-'z' => 91-122 in ASCII

    
    /**
     * @return
     */
    public static char randomCahracter(){
        //generate a random number that represents all possible charcters in our password
        //10 digit + 26 uppercase + 26 lowercase = 62 possible characters
        int rand = (int) (Math.random()*62);
    
        //break up rand into interval to repressent numbers, uppercase and lowercase letters
        //rand is b/w 0-61 => inclusive
        //if rand is b/w 0-9 => number
        //if rand is b/w 10-35 => Uppercase 
        //if rand is b/w 36-61 => lowercase

        if (rand <= 9) {
            //number : rand is between 0-9 => 48 - 57 in ascii
            int ascii =  rand + 48; // 48 - 0 = 48
            return (char)(ascii);
        }else if(rand <=35){
            //Uppercase : rand is between 10-35 => 65 - 90 in ascii
            int ascii = rand + 55; // 65 - 10 = 55
           return (char)(ascii); 
        }else{
            //lowercase letter : rand is between 36-61 => 97 - 122 in ascii
          int ascii = rand + 61 ; // 97 - 36 = 61 
          return (char)(ascii); 
        }
    }
}
