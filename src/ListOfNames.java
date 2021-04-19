import java.util.Scanner;

public class ListOfNames {
    public static void main(String[] args) {
        //declarations
        Scanner namObj = new Scanner(System.in);
        Scanner userInputObj = new Scanner(System.in);
        Nodes nodeListOfName = new Nodes();
        String userInput;
        String names;

        //get user input
        System.out.print("Enter the number of full names, for each individual, that will be entered: ");
        userInput = userInputObj.nextLine();

        //loops based on user's input for the number of full names
        for (int i = 0; i < Integer.parseInt(userInput); i++) {
            System.out.print((i+1) + ": ");
            //User enters the individual's full of name
            names = namObj.nextLine();
            nodeListOfName = nodeListOfName.addNode(nodeListOfName, names);
        }

        //output
        //displays the list of full names
        System.out.println("\nTraversing the link list: ");
        nodeListOfName.displayListOfNames(nodeListOfName);
    }
}