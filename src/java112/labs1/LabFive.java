package java112.labs1;
import java.io.*;

public class LabFive{

    public static void main(String[] args){

        LabFive labFive = new LabFive();
            if (args.length !=2){
                System.out.println("Please enter two arguments on the command line, a file name and a message");    
            } else {
                labFive.run(args[0], args[1]);
                
        }
    }

    public void run(String fileName, String singleWord){

        try (PrintWriter out  = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))){
                out.write(singleWord);
                out.close();
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