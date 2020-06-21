
/**
 * Write a description of class Haiku here.
 * 
 * @author Jonathan Liao 
 * @ 1.24.2015
 */

import java.util.Scanner; //needed for Scanner class
import java.lang.Object; 

public class Haiku 
{
    static String title = "";
    static String author = "";
    static String line1 = "";
    static String line2 = "";
    static String line3 = "";
    static String important = "";
    static String input = "";
    
    public static void main(String args[])
    {
        while(true) //infinite loop allows for infinite use of program without closing; "exit" command at end permits user to leave
        {
            Scanner keyboard = new Scanner(System.in); //Scanner creation object
            
            System.out.println("Welcome. I will help you format your haiku.");
            System.out.println("Please enter the title of your poem:");
            title = keyboard.nextLine(); // reads user input for title
            
            System.out.println("Please enter the author\'s first and last name");
            author = keyboard.nextLine().trim(); // reads user input for author name
            
            System.out.println("Please enter first line of the poem");
            line1 = keyboard.nextLine().trim(); // reads user input for first line
            
            System.out.println("Please enter second line of the poem");
            line2 = keyboard.nextLine().trim(); // reads user input for second line
            
            System.out.println("Please enter third line of the poem");
            line3 = keyboard.nextLine().trim(); // reads user input for third line
        
            System.out.println("What is the most important word in the last line of the poem?");
            important = keyboard.next().trim(); // reads user input for important word
            
            title = "<h3>" + title + "</h3>" + "</br>";
            author = "by <i> " + toTitleCase(author) + "</i>" + "</br>" + "\n</br>";
            line1 = line1.length() + " <em> " + line1 + " </em>" + " </br>";
            line2 = line2.length() + " " + line2 + " </br>";
            line3 = line3.length() + " " + line3.substring(0,line3.indexOf(important)) + "<b>" + important + "</b>" + line3.substring( line3.indexOf(important) + important.length(), line3.length()) + "</br>";
            
            System.out.println("");
            System.out.println("Here is your formatted poem:\n");
            
            System.out.println(title);
            System.out.println(author);
            System.out.println(line1);
            System.out.println(line2);
            System.out.println(line3);
            System.out.println("");
            System.out.println("Thanks for using the Haiku formatter. Would you like to use it again?".toUpperCase());
            System.out.println("Enter any key to continue, or type EXIT to leave the program.");
            
            input = keyboard.next(); //user input for exit
            
            if(input.equalsIgnoreCase("EXIT")) //gives user opportunity to leave the program
            {    
                break; // allows for program to leave infinite loop and exit system
            }

        }
        
        System.exit(0); //reachable only if infinite forloop is broken out of
        
    }
    
    public static String toTitleCase(String givenString) //static method that capitalizes first and last author name
    {
        String[] arr = givenString.split(" "); //using an array to index each letter in the author name
        StringBuffer sb = new StringBuffer(); // a string that is compatible with change and modification
    
        for (int i = 0; i < arr.length; i++) { // a forloop that goes through the author's name to find the first letters of first and last name
            sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
            //.append method adds rest of substring to author's name, while replacing first letter with a capitalized letter
        }          
        return sb.toString().trim(); //convert StringBuffer object type to string type and trims the result. Static method then returns trimmed Author's name
    }  
}
    