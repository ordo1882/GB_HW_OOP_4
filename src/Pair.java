public class Pair <T, V> {
    private T first;
    private V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
    /*
    * Swaps fields of current object.
    * @param object a current object
    */
    public void swap(Pair<?, ?> object) {
        T temp = (T )object.first;
        this.first = (T) object.second;
        this.second = (V) temp;
    }
}
