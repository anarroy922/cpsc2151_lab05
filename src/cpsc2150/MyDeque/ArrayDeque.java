package cpsc2150.MyDeque;


public class ArrayDeque<Type> extends AbsDeque<Type> implements IDeque<Type>{
    // where the data is stored. myQ[0] is the front of the deque
    private Type[] myQ;
    // tracks how many items are in the deque
    // also used to find the end of the deque
    private int myLength;

    /** Creates a new ArrayDeque
     *
     * @pre myQ is an array
     * @post Double[MAX_LENGTH] myQ = NULL
     */
    public ArrayDeque() {
        myQ = (Type[]) new Double[MAX_LENGTH];
        myLength = 0;
    }

    /** Adds x to the end of the deque
     *
     * @param x double to be added to the end of the deque
     * @pre x!= NULL && queue.length() != MAX_LENGTH
     * @post x is at end of deque
     */
    public void enqueue(Type x) {
        if(myLength != myQ.length) {
            myQ[myLength] = x;
            myLength++;
        }
    }

    /**
     * removes and returns the double at the front of the deque
     *
     * @return double at front of deque
     * @pre deque != NULL and first value in deque is a double
     * @post enqueue = first double in deque and deque = #deque
     */
    public Type dequeue() {
        if(myLength != 0) {
            Type temp = myQ[0];
            for (int i = 1; i < myLength; i++) {
                myQ[i - 1] = myQ[i];
            }
            myLength--;
            return temp;
        }
       else return null;
   }


    /** Adds x to the front of the deque
     *
     * @param x     double to be added to the front of the deque
     * @pre x != NULL && queue.length() != MAX_LENGTH
     * @post x is at beginning of deque
     */
    public void inject(Type x) {

        if(myLength != myQ.length) {
        }
            for (int i = 0; i < myLength; i++) {
                myQ[i + 1] = myQ[i];
            }
            myQ[0] = x;
            myLength++;
        }


    /**
     * removes and returns the double at the end of the deque
     *
     * @return double at end of deque
     * @pre deque != NULL and last value in deque is a double
     * @post inject = last double in deque and deque = #deque
     */
    public Type removeLast() {
        if(myLength != 0) {
            Type temp = myQ[myLength];
            myQ[myLength] = null;
            return temp;
        }
        Type holder = null;
        return holder;
    }

    /**returns the number of doubles in the deque
     *
     * @return number of doubles in deque
     * @pre deque != null
     * @post length = size of deque and deque = #deque
     */
    public int length(){
        return myLength;
    }

    /**clears the entire deque
     *
     * @pre deque != NULL
     * @post deque = NULL
     */
    public void clear(){
        for(int i = 0; i < myLength; i++) {
            removeLast();
        }
        myLength = 0;
    }
    public String toString() {

        return super.toString();
    }
}