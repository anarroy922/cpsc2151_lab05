package cpsc2150.MyDeque;

import java.util.Scanner;

public class DequeApp <Type> {
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
                    if (q.length() < q.MAX_LENGTH) {
                        System.out.println("What double to add to the end of the Deque?");

                        dInput = Double.parseDouble(String.valueOf(userInput.nextDouble()));

                        q.enqueue(dInput);

                        System.out.println("Deque is:\n" + q + "\n");

                    } else {

                        System.out.println("What double to add to the end of the Deque?");

                        dInput = Double.parseDouble(String.valueOf(userInput.nextDouble()));

                        q.enqueue(dInput);

                        System.out.println("Deque is:\n" + q + "\n");

                    }
                    break;

                case 2: //add to the front
                    if (q.length() < q.MAX_LENGTH) {
                        System.out.println("What double to inject to the front of the Deque?");

                        dInput = Double.parseDouble(String.valueOf(userInput.nextDouble()));

                        q.inject(dInput);

                        System.out.println("Deque is:\n" + q + "\n");

                    } else {

                        System.out.println("What double to inject to the front of the Deque?");

                        dInput = Double.parseDouble(String.valueOf(userInput.nextDouble()));

                        q.inject(dInput);

                        System.out.println("Deque is:\n" + q + "\n");


                    }
                    break;

                case 3: //remove from the front
                    if (q != null) {

                        System.out.println("Double at the front: " + q.dequeue());
                        System.out.println("Deque is:\n" + q + "\n");

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
                        System.out.println("Deque is:\n" + q + "\n");

                    }
                    break;
                case 6: //peek from the end
                    if (q != null) {

                        System.out.println("EndofDeque: " + q.endOfDeque());
                        System.out.println("Deque is:\n" + q + "\n");

                    }
                    break;
                case 7: //insert to a position
                    if (q.length() <= q.MAX_LENGTH) {

                        double userInsert;
                        int userPos;
                        System.out.println("What are you inserting?: ");

                        userInsert = Double.parseDouble(String.valueOf(userInput.nextDouble()));

                        System.out.println("Where are you inserting?: ");

                        userPos = Integer.parseInt(String.valueOf(userInput.nextInt()));

                        q.insert(userInsert, userPos);

                        System.out.println("Deque is:\n" + q + "\n");

                    }
                    else {

                        double userInsert;
                        int userPos;
                        System.out.println("What are you inserting?: ");

                        userInsert = Double.parseDouble(String.valueOf(userInput.nextDouble()));

                        System.out.println("Where are you inserting?: ");

                        userPos = Integer.parseInt(String.valueOf(userInput.nextInt()));

                        q.insert(userInsert, userPos);

                        System.out.println("Deque is:\n" + q + "\n");

                    }
                    break;
                case 8: //remove from a position
                    if (q != null) {

                        int userInsert;

                        System.out.println("What position are you removing from?: ");

                        userInsert = Integer.parseInt(String.valueOf(userInput.nextInt()));

                        q.remove(userInsert);

                        System.out.println("Deque is:\n" + q + "\n");



                    }
                    break;
                case 9: //get a position
                    int getInput;
                    System.out.println("What position were you looking for?: ");

                    getInput = Integer.parseInt(String.valueOf(userInput.nextInt()));


                System.out.println("The position is: " + q.get(getInput));
                    System.out.println("Deque is:\n" + q + "\n");

                    break;
                case 10: //get the length
                    if (q.getClass().isArray()){

                        System.out.println("Length of Deque: " + q.length());
                        System.out.println("Deque is:\n" + q + "\n");

                    }
                    else {

                        System.out.println("Length of Deque: " + q.length());
                        System.out.println("Deque is:\n" + q + "\n");

                    }
                    break;

                case 11: //clear the deque

                    q.clear();

                    System.out.println("Deque is:\n" + q + "\n");


                    break;

                case 12: //quit

                    System.exit(0);
                    break;

                default:
                    System.out.println("Not a valid option!");
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
            temp[i] = (Double) q.dequeue();
        }
        for(int i = 0; i < tempLength; i++) {
            System.out.print(temp[i] + ", ");
            q.enqueue(temp[i]);
        }
    }
}