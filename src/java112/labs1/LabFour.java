package java112.labs1;
import java.io.*;

public class LabFour{

    public static void main(String[] args){
        LabFour labFour = new LabFour();

        if (args.length !=1){
            System.out.println("Please enter one argument on the command line");    
        } else {
            labFour.run(args[0]);
        }
    }

    public void run(String inputString){

        try (BufferedReader in = new BufferedReader(new FileReader(inputString))){
                while (in.ready()) {
                System.out.println(in.readLine());
            }
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