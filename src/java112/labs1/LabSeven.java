package java112.labs1;
import java.io.*;
import java.util.*;

public class LabSeven{


    List<String> myList;

    public static void main(String[] args){
        
        LabSeven labSeven = new LabSeven();

        if (args.length !=1){
            System.out.println("Please enter one argument on the command line, an output file name");
        } else { 
            labSeven.run(args[0]);
        }

    }

       public void run(String writeFile){

            myList = new ArrayList<String>();
            myList.add("one");
            myList.add("two");
            myList.add("three");
            myList.add("four");
            myList.add("five");
            myList.add("six");
            myList.add("seven");
            myList.add("eight");
            myList.add("nine");
            myList.add("ten");

            writeListToOutputFile(writeFile);

        }

        public void writeListToOutputFile(String writeFile){
               
        try (PrintWriter out  = new PrintWriter(new BufferedWriter(new FileWriter(writeFile)))){
            for (String myString : myList) {
                out.println(myString);
            }   out.close();

        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("There was a problem opening the file");
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException){
            System.out.println("There was a problem writing to the file");
            ioException.printStackTrace();
        } catch (Exception exception){
            System.out.println("There was a problem that is undefined");
            exception.printStackTrace();
        }

        }

}