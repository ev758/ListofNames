import java.util.*;

public class Nodes {

    Node head; //head of list

    //linked list
    //inner class made public static so main() from ListOfNames can access it
    public static class Node {

        String name; //the item of node
        Node nextNameNode;

        // Constructor
        Node(String namePar)
        {
            name = namePar;
            nextNameNode = null;
        }
    }

    //a method to add a new node to the linked list
    public static Nodes addNode(Nodes listOfNamesPar, String namePar)
    {
        //creates a new node with the given input
        Node newNameNode = new Node(namePar);
        newNameNode.nextNameNode = null;

        //if the linked list is empty, then make the new node as head
        if (listOfNamesPar.head == null) {
            listOfNamesPar.head = newNameNode;
        }
        else {
            //else traverse the linked list until the last node is reached
            //and add a new node at the end of the linked list
            Node lastNode = listOfNamesPar.head;
            while (lastNode.nextNameNode != null) {
                lastNode = lastNode.nextNameNode;
            }

            //the new node is the last node of the linked list
            lastNode.nextNameNode = newNameNode;
        }

        //returns linked list
        return listOfNamesPar;
    }

    public static void displayListOfNames(Nodes listOfNamesPar)
    {
        Node currNameNode = listOfNamesPar.head;
        int i = 1;

        //traverse the linked list and displays each nodes' content
        while (currNameNode != null) {
            //displays the content of the current node
            System.out.println(i + ": " + currNameNode.name);
            i++;

            //goes to the next node
            currNameNode = currNameNode.nextNameNode;
        }
    }

}
