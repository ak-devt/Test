package com.mytest.javademo;

import java.util.Iterator;
import java.util.LinkedList;

public class myClass {

    public static void main(String[] args){
        System.out.println("Hello Akshay!!");

        testRemoveLinkedListItem();

    }

    private static void testRemoveLinkedListItem(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Abhishek");
        linkedList.add("Pratyush");
        linkedList.add("Anupam");
        linkedList.add("Avinash");
        linkedList.add("Akshay");

        linkedList.remove(2);

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            iterator.remove();
        }

    }

}
