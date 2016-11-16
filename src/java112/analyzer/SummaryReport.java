package java112.analyzer;
import java.io.*;
import java.util.*;
import java.lang.*;

/**
 * SummaryReport creates a txt file with some general information about the
 * project, including information from the properties file, a derived date, 
 * and some calculated information about the number of tokens processed.
 * @author Louis Kaplan
 * @version 0.2
 */
public class SummaryReport implements Analyzer{

    /**
     * SummaryReport is a constructor class.<p>
     * SummaryReport is a constructor that sets the initial value of the
     * totalTokensCount to 0 and loads the properties file.
     * @param properties is the properties file that was passed in.
     */
    public SummaryReport(Properties properties) {
        this();
        this.properties = properties;
    }

    public SummaryReport(){
        totalTokensCount = 0;
    }

    private int totalTokensCount = 0;
    private Properties properties;




/**
 * getTotalTokensCount returns the final count of tokens. 
 * @return totalTokensCount is a count of all the tokens. 
 */ 
    public int getTotalTokensCount() {
        return totalTokensCount;
    }

    public void processToken(String token){
        totalTokensCount++;
    }

    public void writeOutputFile(String inputFilePath){

         try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output/" + properties.getProperty("output.file.summary"))))){
                String appName = properties.getProperty("application.name");
                String myName = properties.getProperty("author");
                String emailAddress = properties.getProperty("author.email.address");
                Date date = new Date();
                String formattedDate = date.toString();
                File fileFilePath = new File(inputFilePath);

                out.write("Application: " + appName + "\r\n");
                out.write("Author: " + myName + "\r\n");
                out.write("email: " + emailAddress + "\r\n");
                out.write("Input file: " + fileFilePath.getAbsolutePath() + "\r\n");
                out.write("Analyzed on: " + formattedDate + "\r\n");
                out.write("Total token count: " + totalTokensCount + "\r\n");
                
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("There was a problem opening the TC output file");
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException){
            System.out.println("There was a problem writing to the TC output file");
            ioException.printStackTrace();
        } catch (Exception exception){
            System.out.println("There was a problem that is undefined");
            exception.printStackTrace();
        }
    }
}