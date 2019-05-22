import java.util.Scanner;
public class AliceAndBob {
    public static void main(String[]args) {
        Scanner stdin = new Scanner(System.in);
        
        String greeting = "Computer says: \"I'm greeting %s\"";
        String usersName;
        String upperCaseName;
        
        System.out.println("Are you Bob or Alice, or a stranger?");
        usersName = stdin.nextLine();        
        upperCaseName = usersName.toUpperCase();
        
        if (upperCaseName.equals("BOB") || upperCaseName.equals("ALICE")) {
            System.out.printf(greeting,upperCaseName);
        } else {
            System.out.printf("\"Stranger\", you aren't Bob or Alice, you're %s.",usersName);
        }
    }
}