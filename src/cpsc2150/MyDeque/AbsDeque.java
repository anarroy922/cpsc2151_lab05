package cpsc2150.MyDeque;

import cpsc2150.MyDeque.IDeque;

public abstract class AbsDeque<Type> implements IDeque <Type>{

    /**
     *  Creates a formatted string from the values in the deque
     *
     * @return str      string containing values in deque
     *
     * @post toString = str AND deque = #deque
     */

    @Override
    public String toString() {
        String str = "<";

        if(length() > 0) {
            str += get(1);
            for (int i = 2; i <=length(); i++) {
                str += ", ";
                str += get(i);
            }
        }
        str += ">";

        return str;
    }
}