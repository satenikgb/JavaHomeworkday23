package arraylist;

public interface List extends Iterable {
    public int size();

    public boolean isEmpty();

    public boolean contains(int num);

    public int[] toArray();

    public void add(int num);

    public void add(int index, int num);

    public int remove(int index);

    public int get(int index);

    public int set(int index, int num);


}
