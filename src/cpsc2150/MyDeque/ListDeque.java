package cpsc2150.MyDeque;
import java.util.*;
public class ListDeque extends LinkedList<Double> implements IDeque{
    // this time store the deque in a list
    // myQ.get(0) is the front of the deque
    private LinkedList<Double> myQ;
    // complete the class

    /** Simply creates a new linked list of Doubles.
     *
     * @pre myQ == NULL
     * @post myQ == NULL
     */
    ListDeque(){

        myQ = new LinkedList<>();

    }
    /** Adds x to the end of the deque
     *
     * @param x     double to be added to the end of the deque
     * @pre x!= NULL && queue.length() != MAX_LENGTH
     * @post x is at end of deque
     */
    public void enqueue(Double x) {

        myQ.add(x);
    }

    /** removes and returns the double at the front of the deque
     *
     * @return double at front of deque
     * @pre deque != NULL and first value in deque is a double
     * @post enqueue = first double in deque and deque = #deque
     */
    public Double dequeue() {

        return myQ.removeFirst();

    }


    /** Adds x to the front of the deque
     *
     * @param x     double to be added to the front of the deque
     * @pre x != NULL && queue.length() != MAX_LENGTH
     * @post x is at beginning of deque
     */
    public void inject(Double x) {

        myQ.add(1,x);
    }

    /**removes and returns the double at the end of the deque
     *
     * @return double at end of deque
     * @pre deque != NULL and last value in deque is a double
     * @post inject = last double in deque and deque = #deque
     */
    public Double removeLast() {

        return myQ.pollLast();
    }

    /**returns the number of doubles in the deque
     *
     * @return number of doubles in deque
     * @pre deque != null
     * @post length = size of deque and deque = #deque
     */
    public int length() {

        return myQ.size();
    }

    /**clears the entire deque
     *
     * @pre deque != NULL
     * @post deque = NULL
     */
    public void clear() {

        myQ.clear();

    }
}
