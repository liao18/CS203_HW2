import java.util.Scanner;



public class Testingground
{
    public static void main(String args[])
    {   
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Give author name");
        String author = "";
        
        author = keyboard.nextLine();
        author = author.substring(0,1).toUpperCase() + author.substring(1, author.indexOf(" ")) + author.substring(author.indexOf(" "), author.indexOf(" ") + 2).toUpperCase() + author.substring(author.indexOf(" ") + 2, author.length());
        
        System.out.println(author);
    }
}
        