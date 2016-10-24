package java112.demo;
import java.io.*;

public class ReadDemo{

    public static void main(String[] args) {

        ReadDemo demo = new ReadDemo();
        demo.run();

    }

    public void run(){
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("testFile.tst"));
            while (in.ready()) {
                System.out.println(in.readLine());
            }
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("There was a problem opening the file");
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException){
            System.out.println("There was a problem reading the file");
            ioException.printStackTrace();
        } catch (Exception exception){
            System.out.println("There was a problem that is undefined");
            exception.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException ioException){
               System.out.println("There was a problem reading the file");
               ioException.printStackTrace();
            } catch (Exception exception){
                System.out.println("There was a problem that is undefined");
                exception.printStackTrace();
            }
        }
    }
}