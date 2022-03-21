package arraylist;

import java.util.Iterator;

public class Myarraylist implements List {
    private int[] array;
    private int index;
    private int size;


    public Myarraylist() {
        this.array = new int[10];

    }


    @Override
    public int size() {
        int size = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] != 0) {
                size++;
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(int num) {
        for(int i=0;i<array.length;i++){
            if( num==array[i]){
                return true;
            }
        }
        return false;
    }

    @Override
    public int[] toArray() {
        int[] arraycopy =new  int[array.length];
        for (int i=0; i<array.length; i++) {
            arraycopy[i] = array[i];
        }
        return arraycopy;
    }

    private void grow() {
        int[] newArray = new int[(array.length+1) * 2 ];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;


    }

    @Override
    public void add(int num) {
        if (index == array.length) {
            grow();
        }

        array[size] = num;
        size++;
        index++;

    }

    @Override
    public void add(int index, int num) {
        for (int i=array.length-1; i>index; i--) {
            array[i] = array[i-1];
        }
        array[index] = num;
        size++;


    }

    @Override
    public int remove(int index) {
        int arr = array[index];
        for (int i=index; i<array.length-1; i++) {
            array[i] = array[i+1];
        }
        return arr;
    }

    @Override
    public int get(int index) {
        if (index < size) {
            return array[index];
        } else
            throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public int set(int index, int num) {
       int value = array[index];
        array[index] = num;
        return value;
    }



    @Override
    public Iterator iterator() {
        return null;
    }
    private class ArrayListIterator implements Iterator<Integer>{
        private int index;

        @Override
        public boolean hasNext() {
            return index<size;
        }

        @Override
        public Integer next() {
            int value=array[index];
            index++;
            return value;
        }
    }
}
