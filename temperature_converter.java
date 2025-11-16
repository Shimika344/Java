import java.util.*;
public class temperature_converter {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    // Celsius to Fahrenheit Conversion
        System.out.println("Enter the celsius  :- ");
        int celsius_temp = sc.nextInt();

        float Fahrenheit_temp = (celsius_temp * 9/5) + 32 ;
        System.out.println("Fahrenheit Temperature:- " +Fahrenheit_temp);

     // Fahrenheit to Celsius conversion
     
        System.out.println("Enter the Fahrenheit:-  ");
        int Fahrenheit = sc.nextInt();

        float Celsius = (Fahrenheit-32)*5/9;
        System.out.println("Celcius Temperature :- " +Celsius);

    } 
}
