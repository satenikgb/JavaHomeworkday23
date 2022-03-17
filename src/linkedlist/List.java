package linkedlist;

public interface List {
    int size();

    boolean isEmpty();

    int getIndex(int index);

    void add(int value);

    int add(int index, int value);

    void delete(int index);
}
