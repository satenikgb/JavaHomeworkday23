package arraylist;


import linkedlist.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Myarraylist arrayList = new Myarraylist();
        arrayList.add(25);
        arrayList.add(45);
        arrayList.add(74);
        arrayList.add(12);
        arrayList.remove(0);
        arrayList.add(2,61);
        System.out.println(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        Iterator it= arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}

