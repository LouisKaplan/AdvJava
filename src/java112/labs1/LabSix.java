package java112.labs1;
import java.io.*;

public class LabSix{

    public static void main(String[] args){

        LabSix labSix = new LabSix();

        if (args.length !=2){
            System.out.println("Please enter two arguments on the command line, an input file name and an output file name");
        } else { 
            labSix.run(args[0], args[1]);
        }
    }

    public void run(String readFile, String writeFile){
        BufferedReader in = null;
        PrintWriter out = null;
        try{
            in = new BufferedReader(new FileReader(readFile));
            out  = new PrintWriter(new BufferedWriter(new FileWriter(writeFile)));
            while (in.ready()){
                out.write(in.readLine() + "\r\n");
            }
            in.close();
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