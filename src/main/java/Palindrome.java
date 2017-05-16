import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Tomas Bartnykas on 2017.05.16.
 */
public class Palindrome {

    public static void main(String[] args)  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        try {
            String s = br.readLine();
            s = s.replaceAll("[^a-zA-Z0-9]", "");
            if (new StringBuilder(s).reverse().toString().equalsIgnoreCase(s)) {
                System.out.println("It's palindrome!");
            } else {
                System.out.println("It's not palindrome!");
            }
        } catch(IOException ioe){
            System.err.println("Invalid string!");
        }
    }
}
