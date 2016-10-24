package java112.labs2;

import java.io.*;
import java.util.*;

public class LabTwoFour{

    Map map;
    Map secondMap;

    public static void main(String[] args){

       LabTwoFour labTwoFour = new LabTwoFour();
       labTwoFour.run();

    }

    public void run(){
        map = new HashMap<String, Integer>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        map.put("Six", 6);

        Set<Map.Entry<String, Integer>> mapSet = map.entrySet();

        for (Map.Entry<String, Integer> mappy : mapSet) {
                System.out.println(mappy);
        }

        System.out.println(map);
        
        if (map.containsKey("Three")){
            System.out.println("The key Three has a value of:" + map.get("Three"));
        } else {
            System.out.println("Requested key could not be found");
        }


        secondMap = new TreeMap<String, Integer>();
        secondMap.put("One", 1);
        secondMap.put("Two", 2);
        secondMap.put("Three", 3);
        secondMap.put("Four", 4);
        secondMap.put("Five", 5);
        secondMap.put("Six", 6);

        Set<Map.Entry<String, Integer>> mapTree = secondMap.entrySet();

        for (Map.Entry<String, Integer> mappy : mapTree) {
                String key = mappy.getKey();
                Integer value = mappy.getValue();            
    
            System.out.println(key + "==>" + value);
        }

        System.out.println(secondMap);
        
        if (secondMap.containsKey("Three")){
            System.out.println("The key Three has a value of:" + secondMap.get("Three"));
        } else {
            System.out.println("Requested key could not be found");
        }
    }






}