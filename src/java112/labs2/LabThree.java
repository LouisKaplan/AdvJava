package java112.labs2;

import java.io.*;
import java.util.*;

public class LabThree{

        Properties properties;
        String propertiesFilePath;

    public static void main(String[] args){

        LabThree labThree = new LabThree();
        labThree.run(args[0]);

    }

    public void loadProperties(String propertiesFilePath)  {
        properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream(propertiesFilePath));
        }
        catch(IOException ioe) {
            System.out.println("Can't load the properties file");
            ioe.printStackTrace();
        }
        catch(Exception e) {
            System.out.println("Problem: " + e);
            e.printStackTrace();
        }
    }
//Look up sorted sets!!!
    public void run(String input){
        propertiesFilePath = input;
        loadProperties(propertiesFilePath);

        Set<String> propertySet = new TreeSet<String>();
        propertySet = properties.stringPropertyNames();

        for (String outputString : propertySet) {
                System.out.println(outputString + "--->" + properties.getProperty(outputString));
        }
    }
}