package java112.analyzer;
import java.io.*;
import java.util.*;
import java.lang.*;

/**
 * UniqueTokenAnalyzer created a TreeSet containing each unique string created
 * when we broke down the input file.
 * @author Louis Kaplan
 * @version 0.2
 */
public class UniqueTokenAnalyzer implements Analyzer{

    /**
     * UniqueTokenAnalyzer is a constructor class.<p>
     * UniqueTokenAnalyzer is a constructor that creates a new TreeSet to hold
     * an ordered list of entries, each of which holds a token, and also loads a
     * properties file.
     * @param properties is the properties file that was passed in.
     */
    public UniqueTokenAnalyzer(Properties properties){
        this();
        this.properties = properties;
    }

    public UniqueTokenAnalyzer(){
        uniqueTokensList = new TreeSet<String>();
    }

    private Set<String> uniqueTokensList;
    private Properties properties;

/**
 * getUniqueTokensList returns the set of unique tokens generated so far.
 * @return uniqueTokensList is the full list of unique tokens generated 
 */ 
    public Set getUniqueTokensList() {
        return uniqueTokensList;
    }


    public void processToken(String token){
        uniqueTokensList.add(token);
    }


    public void writeOutputFile(String inputFilePath){

        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output/" + properties.getProperty("output.file.unique"))))){
                
                for (String token : uniqueTokensList) {
                out.write(token + "\r\n");
                }
                out.close();
                
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("There was a problem opening the UTL output file");
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException){
            System.out.println("There was a problem writing to the UTL output file");
            ioException.printStackTrace();
        } catch (Exception exception){
            System.out.println("There was a problem that is undefined");
            exception.printStackTrace();
        }
    }
}