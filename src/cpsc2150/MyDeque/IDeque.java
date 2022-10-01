package cpsc2150.MyDeque;
import java.util.*;
/**
 * A deque containing floating-point numbers.
 * A deque is a data structure a double-ended queue that allows you
 * to insert and remove from both ends.
 * This deque is bounded by MAX_LENGTH
 */
public interface IDeque {
    public static final int MAX_LENGTH = 100;
    public ArrayDeque[] myQ = new ArrayDeque[MAX_LENGTH];
    public ListDeque my_Q = new ListDeque(); // New way of implementation here.

    /** Adds x to the end of the deque
     *
     * @param x     double to be added to the end of the deque
     * @pre x!= NULL && queue.length() != MAX_LENGTH
     * @post x is at end of deque
     */
    public void enqueue(Double x);

    /** removes and returns the double at the front of the deque
     *
     * @return double at front of deque
     * @pre deque != NULL and first value in deque is a double
     * @post enqueue = first double in deque and deque = #deque
     */
    public Double dequeue();


    /** Adds x to the front of the deque
     *
     * @param x     double to be added to the front of the deque
     * @pre x != NULL && queue.length() != MAX_LENGTH
     * @post x is at beginning of deque
     */
    public void inject(Double x);

    /**removes and returns the double at the end of the deque
     *
     * @return double at end of deque
     * @pre deque != NULL and last value in deque is a double
     * @post inject = last double in deque and deque = #deque
     */
    public Double removeLast();

    /**returns the number of doubles in the deque
     *
     * @return number of doubles in deque
     * @pre deque != null
     * @post length = size of deque and deque = #deque
     */
    public int length();

    /**clears the entire deque
     *
     * @pre deque != NULL
     * @post deque = NULL
     */
    public void clear();

    /**
     * Should return a floating-point number in front of the deque
     * but it won't be removed from the deque.
     *
     * @return the floating-point number to the front of the deque.
     * @pre deque != NULL
     * @post floating-point number = front of the deque
     */
    default Double Peek() {
        // First example of checking if myQ is an array or not.
        if(myQ.getClass().isArray() == myQ.getClass().isArray()) {

            return myQ[0];
        }
        else {
            return my_Q.peekFirst();
        }

    }

    /** Should return the floating-point number at the end of the deque
     *  but it won't remove it from the deque.
     *
     * @return floating-point number at the end of the deque
     * @pre deque != NULL
     * @post Peek = the floating-point number from the end of deque.
     */
    default Double endOfDeque() {

        if(myQ.getClass().isArray() == myQ.getClass().isArray()) {

            return myQ[MAX_LENGTH];
        }
        else {

            return my_Q.peekLast();
        }

    }

    /** Will insert 'x' at position 'pos' in the deque.
     *
     * @param x the double that will be inserted into 'pos'
     * @param pos the integer that will take in 'x' as a position.
     *
     * @pre deque != NULL AND 'x' is a double AND 'pos' is an int
     * @post pos = x
     */
    default void insert(Double x, int pos){

        if(myQ.getClass().isArray() == myQ.getClass().isArray()) {

            Double[] tempArr = new Double[myQ.length + 1];
            Double tempPos = myQ[pos];
            for(int i = 0, j = 0; i < tempArr.length; i++) {

                // Hopefully catching the position of where we want to insert and inserting 'pos'
                if(i == pos) {
                    tempArr[pos] = x;
                }
                // Creates the new array.
                tempArr[j++] = myQ[i];
            }


        }

    }

    /** Will remove whatever floating-point number that was in the 'pos'
     *  position of the deque and it should return it.
     *
     * @param pos holds the floating-point number that will be removed from the deque
     * @return the value of 'pos' after removing it from the deque
     *
     * @pre deque != NULL AND pos is an int
     * @post pos = floating-point number AND pos is removed from deque
     *
     */
    default Double remove(int pos) {

        if(myQ.getClass().isArray() == myQ.getClass().isArray()) {
            Double[] tempArr = new Double[myQ.length - 1];
            Double tempPos = myQ[pos];
            for(int i = 0, j = 0; i < tempArr.length; i++) {

                // Skipping past the position we want to remove.
                if(i == pos) {
                    continue;
                }
                // Creates the new array.
                tempArr[j++] = myQ[i];
            }
            return tempPos;
        }
        else {
            // Holds the value at the current position.
            Double temp2 = my_Q.get(pos);
            my_Q.remove(pos);

            return temp2;
        }
    }

    /** Should return whatever floating-point number that was in the position 'pos'
     *  but does not remove it.
     *
     * @param pos holds the floating-point number that was in the position of the deque
     * @return 'pos', the floating-point number of the position of the deque.
     *
     * @pre  deque != NULL AND pos is an int
     * @post pos = floating-point number
     */
    default Double get(int pos) {
        // Simply returning what's at the positions asked for.
        if(myQ.getClass().isArray() == myQ.getClass().isArray()) {

            return  myQ[pos];
        }
        else {

            return my_Q.get(pos);
        }

    }
}
