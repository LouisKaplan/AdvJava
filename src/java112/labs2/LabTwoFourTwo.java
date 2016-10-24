package java112.labs2;

import java.io.*;
import java.util.*;
import java.lang.*;

public class LabTwoFourTwo{

    Map map;
    Map secondMap;
    Student myStudent;

    public static void main(String[] args){

       LabTwoFourTwo labTwoFourTwo = new LabTwoFourTwo();
       labTwoFourTwo.run();

    }

    public void run(){
        map = new HashMap<Integer, Student>();
        myStudent = new Student();
        map.put(myStudent.getStudentID(), myStudent);
        

        Set<Map.Entry<Integer, Student>> mapSet = map.entrySet();

        for (Map.Entry<Integer, Student> mappy : mapSet) {
                Integer key = mappy.getKey();
                Student value = mappy.getValue();            
    
            System.out.println(key + "==>" + value);
            System.out.println(map);
        }

        myStudent.setLastName("Swinehart");
        
        for (Map.Entry<Integer, Student> mappy : mapSet) {
                Integer key = mappy.getKey();
                Student value = mappy.getValue();            
    
            System.out.println(key + "==>" + value);
            System.out.println(map);
        }
    }
}