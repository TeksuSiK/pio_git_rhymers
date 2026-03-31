package edu.kis.vh.nursery;

/**
 * Implementacja struktury stosu o stałej pojemności dla liczb całkowitych
 */
public class DefaultCountingOutRhymer {
    /**
     * Wartość oznaczająca pusty stos
     */
    private static final int EMPTY_RHYMER_INDICATOR = -1;
    /**
     * Wartość zwracana przy próbie odczytania pustego stosu
     */
    public static final int DEFAULT_EMPTY = -1;
    /**
     * Pojemność stosu
     */
    public static final int CAPACITY = 12;
    /**
     * Indeks ostatniego możliwego elementu do zapisania w stosie
     */
    private static final int FULL = CAPACITY - 1;

    /**
     * Tablica przechowująca elementy stosu
     */
    private final int[] numbers = new int[CAPACITY];

    /**
     * Wartość indeksu aktualnego szczytu stosu
     */
    private int total = EMPTY_RHYMER_INDICATOR;

    /**
     * Dodaje element na szczyt stosu.
     * Jeśli stos jest pełen element nie zostanie dodany
     *
     * @param in liczba do dodania na stos
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza czy stos jest pusty
     *
     * @return true jeśli stos jest pusty, false w przeciwnym razie
     */
    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    /**
     * Sprawdza czy stos jest pełen
     *
     * @return true jeśli stos jest pełen, false w przeciwnym razie
     */
    public boolean isFull() {
        return total == FULL;
    }

    /**
     * Zwraca element ze szczytu stosu bez jego usuwania
     *
     * @return wartość pobranego elementu ze szczytu stosu
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_EMPTY;
        return numbers[total];
    }

    /**
     * Zwraca i usuwa element ze szczytu stosu
     *
     * @return wartość pobranego elementu ze szczytu stosu
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_EMPTY;
        return numbers[total--];
    }

    /**
     * Zwraca indeks aktualnego szczytu stosu
     *
     * @return indeks aktualnego szczytu stosu
     */
    public int getTotal() {
        return total;
    }

}
