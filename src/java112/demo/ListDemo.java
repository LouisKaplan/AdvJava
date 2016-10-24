package java112.demo;
import java.util.*;

public class ListDemo {

    public static void main(String[] args){

        List<String> myList = new ArrayList<String>();

        myList.add("one");
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("five");

        System.out.println(myList);
        
        if (myList.contains("one")){
            System.out.println("One is on the list");
        }

        for (String myString : myList) {
            System.out.println(myString);
        }

        System.out.println("");         

        Set<String> mySet = new TreeSet<String>();

        mySet.add("one");
        mySet.add("one");
        mySet.add("two");
        mySet.add("three");
        mySet.add("five");

        System.out.println(mySet);
        
        if (mySet.contains("one")){
            System.out.println("One is on the list");
        }

        for (String myString : mySet) {
            System.out.println(myString);
        }

        System.out.println(""); 

    }
}