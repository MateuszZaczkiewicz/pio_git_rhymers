package edu.kis.vh.nursery;

/**
 * The DefaultCountingOutRhymer class represents a simple integer stack.
 * It provides basic stack operations like push, pop, and peek with a fixed size.
 */

public class DefaultCountingOutRhymer {
    public static final int MAX_SIZE = 12;
    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public static final int DEFAULT_RETURN_VALUE = -1;
    public static final int MAX_INDEX = MAX_SIZE -1;
    private final int[] numbers = new int[MAX_SIZE];
    private int total = EMPTY_RHYMER_INDICATOR;

    public int getTotal() {
        return total;
    }

    /**
     * Adds a new integer to the rhymer if it is not full.
     * @param in the integer value to be added
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Checks if the rhymer is empty.
     * @return true if the rhymer contains no elements, false otherwise
     */

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    /**
     * Checks if the rhymer has reached its maximum capacity.
     * @return true if the rhymer is full, false otherwise
     */

    public boolean isFull() {
        return total == MAX_INDEX;
    }

    /**
     * Returns the last added value without removing it.
     * @return the top element of the rhymer, or {@value #DEFAULT_RETURN_VALUE} if empty
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total];
    }

    /**
     * Removes and returns the last added value from the rhymer.
     * @return the top element removed from the rhymer, or {@value #DEFAULT_RETURN_VALUE} if empty
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total--];
    }

}
