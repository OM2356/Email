import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailDetector {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter text with email(s)");
        String input=scanner.nextLine();
        String emailRegex="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,6}";
        Pattern pattern= Pattern.compile(emailRegex);
        Matcher matcher=pattern.matcher(input);
        boolean found=false;
        System.out.println("Detected email(s):");
        while (matcher.find()){
            System.out.println(matcher.group());
            found=true;
        }
        if (!found){
            System.out.println("No valid email found.");

            
        }
            
        }
    }

