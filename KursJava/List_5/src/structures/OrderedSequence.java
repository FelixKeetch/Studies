package structures;

public interface OrderedSequence <T extends Comparable<T>> {
    public void insert(T t);
    public void remove(T t);
    public T min();
    public T max();
    public T at(int i);
    public boolean search(T t);
    public int index(T t);
}
