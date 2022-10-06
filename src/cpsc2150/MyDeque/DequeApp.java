package cpsc2150.MyDeque;

import java.util.Scanner;

public class DequeApp {
    public static void main(String[] args) {
        IDeque q = null;
        Scanner userInput = new Scanner(System.in);
        int iInput;
        double dInput;
/*
Prompt the user to pick an implementation using the following
message: "Enter 1 for array implementation or 2 for List
implementation"
Your code needs to make sure that they only enter either 1 or 2.
Re-print the message to prompt the user to enter it again. Once
you have gotten an answer, use it to initialize q appropriately.
*/

        //ask for array or list
        do {
            System.out.println("Enter 1 for array implementation or 2 for List implementation");
            iInput = userInput.nextInt();
        } while(iInput != 1 && iInput != 2);

        //if user selected array, initialize array
        if(iInput == 1) {
            q = new ArrayDeque();
        }
        //if user selected list, initialize list
        else { q = new ListDeque(); }

        while (iInput != 12) {
            //ask user to select options
            System.out.println("Select an option: ");
            System.out.println("1. Add to the end of the Deque");
            System.out.println("2. Add to the front of the Deque");
            System.out.println("3. Remove from the front of the Deque");
            System.out.println("4. Remove from the end of the Deque");
            System.out.println("5. Peek from the front of the Deque");
            System.out.println("6. Peek from the end of the Deque");
            System.out.println("7. Insert to a position in the Deque");
            System.out.println("8. Remove from a position in the Deque");
            System.out.println("9. Get a position in the Deque");
            System.out.println("10. Get the length of the Deque");
            System.out.println("11. Clear the Deque");
            System.out.println("12. Quit");
            iInput = userInput.nextInt();

            switch (iInput) {

                case 1: //add to the end
                    if(q.length() < q.MAX_LENGTH) {
                        System.out.println("What double to add to the end of the Deque?");
                        dInput = userInput.nextDouble();

                        q.enqueue(dInput);
                    }
                    else {

                        System.out.println("What double to add to the end of the Deque?");
                        dInput = userInput.nextDouble();

                        q.enqueue(dInput);
                    }
                    break;

                case 2: //add to the front
                    if(q.length() < q.MAX_LENGTH) {
                        System.out.println("What double to inject to the front of the Deque?");
                        dInput = userInput.nextDouble();

                        q.inject(dInput);
                    }
                    else {

                        System.out.println("What double to inject to the front of the Deque?");
                        dInput = userInput.nextDouble();

                        q.inject(dInput);

                    }
                    break;

                case 3: //remove from the front
                    if (q != null) {
                        System.out.println("Double at the front: " + q.dequeue());
                    }
                    break;

                case 4: //remove from the end
                    if (q != null) {
                        System.out.println("Double at the end: " + q.removeLast());
                    }
                    break;

                case 5: //peek from the front
                    if (q != null) {
                        System.out.println("Peek: " + q.Peek());
                    }
                    break;
                case 6: //peek from the end
                    if (q != null) {
                        System.out.println("EndofDeque: " + q.endOfDeque());
                    }
                case 7: //insert to a position
                    if(q.length() < q.MAX_LENGTH) {

                        Double userInsert;
                        int userPos;
                        System.out.println("What are you inserting?: ");

                        userInsert = userInput.nextDouble();

                        System.out.println("Where are you inserting?: ");

                        userPos = userInput.nextInt();

                        q.insert(userInsert,userPos);
                    }
                    else {

                        Double userInsert;
                        int userPos;
                        System.out.println("What are you inserting?: ");

                        userInsert = userInput.nextDouble();

                        System.out.println("Where are you inserting?: ");

                        userPos = userInput.nextInt();

                        q.insert(userInsert,userPos);
                    }
                case 8: //remove from a position
                    if (q != null) {

                    }
                case 9: //get a position
                    int getInput;
                    getInput = userInput.nextInt();
                    System.out.println("The position is: " + q.get(getInput));
                    break;
                case 10: //get the length
                    System.out.println("Length of Deque: " + q.length());
                    break;

                case 11: //clear the deque
                case 12: //quit
                default:
                    System.out.println("Not a valid option!");
                    System.out.println("Deque is:\n" + q.toString() + "\n");
                    iInput = 13;
            }
        }


        /*Double x = 3.0;
        q.enqueue(x);
        x = -1.3;
        q.enqueue(x);
        x = -2.4;
        q.enqueue(x);
        x = 5.3;
        q.enqueue(x);
        x = 16.1;
        q.enqueue(x);*/
//Add the code to print the deque. After the code is finished,
// the deque should still contain all its values in order

        int tempLength = q.length();
        Double[] temp = new Double[tempLength];
        for(int i = 0; i < tempLength; i++) {
            temp[i] = q.dequeue();
        }
        for(int i = 0; i < tempLength; i++) {
            System.out.print(temp[i] + ", ");
            q.enqueue(temp[i]);
        }
    }
}