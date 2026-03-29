package edu.kis.vh.nursery;

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

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total--];
    }

}
