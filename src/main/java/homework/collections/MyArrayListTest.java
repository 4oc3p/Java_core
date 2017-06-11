package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            myArrayList.add(i);
        }
        myArrayList.add(5222, 6);
        System.out.println(myArrayList.contains(5222));
        myArrayList.removeObject(new Integer(5222));
        System.out.println(myArrayList.contains(5222));
        System.out.println(myArrayList);
        int [] arr = {22, 33, 44, 55, 66, 77, 88};
        myArrayList.addAll(arr);
        System.out.println(myArrayList);
        myArrayList.set(120, 10);
        myArrayList.set(5, 120);
        System.out.println(myArrayList);
//        System.out.println(myArrayList);
//        myArrayList.removeByIndex(18);
//        System.out.println(myArrayList);
//
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 500; i++) {
//            list.add(i);
//        }
//        list.add(0, 1020);
//        list.set(2, 524);
//        list.remove(0);
//        boolean contains = list.contains(5244);
//        System.out.println(contains);
//        list.remove(new Integer(3));
//        System.out.println(list);
    }
}
