//Assignment PigLatin
import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println("Welcome to ROMECESAR, the Pig Latin to English Translator!");
        System.out.print("Please lowercase your first letter.");
        System.out.print("What word do you want translated from English to PigLatin: ");
        
        //Instantiating scanner object
        Scanner detect=new Scanner(System.in);
        String input=detect.nextLine();
        String output="";
        
        //Conditional to check for vowel first letter
        if(input.charAt(0)=='a' || input.charAt(0)=='e' || input.charAt(0)=='i' || input.charAt(0)=='o' || input.charAt(0)=='u') {
            //Just add 'ay' no first letter movement
            output+=input+"ay";
        } else {
            //reconstruction with input first index through getting copied to output
            for(int i=1; i<input.length(); ++i) {
                output+=input.charAt(i);
            }
            //pasting first character on the end + 'ay'
            output+=input.charAt(0)+"ay";
        }
        //Printing the final output
        System.out.println("The Pig Latin Translation: "+output); 
        System.out.print("yebay!");
    } 
}