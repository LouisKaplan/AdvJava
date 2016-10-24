package java112.analyzer;
import java.io.*;
import java.util.*;
import java.lang.*;

/**
 * BigWordAnalyzer created a TreeSet containing each unique string with 
 * a length of 18 or greater, created when we broke down the input file.
 * @author Louis Kaplan
 * @version 0.2
 */
public class BigWordAnalyzer implements Analyzer{

    private Set<String> bigWords;
    private Properties properties;
    private int minimumWordLength;

/**
 * BigWordAnalyzer is a constructor class.<p>
 * BigWordAnalyzer is a constructor that creates a new TreeSet, loads a properties file,
 * and sets the minimum word length with information from the properties file.
 * @param properties is the properties file that was passed in.
 */ 
    public BigWordAnalyzer(Properties properties){
        this();
        this.properties = properties;
        minimumWordLength = Integer.parseInt(properties.getProperty("bigwords.minimum.length"));
    }

    public BigWordAnalyzer(){
        bigWords = new TreeSet<String>();
    }

    public Set<String> getBigWords() {
        return bigWords;
    }

    public Set getBigWordsList() {
        return bigWords;
    }

    public void processToken(String token){
        if(token.length() >= minimumWordLength){
            bigWords.add(token);
        }
    }

    public void writeOutputFile(String inputFilePath){

        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output/" + properties.getProperty("output.file.bigwords"))))){
                
                for (String token : bigWords) {
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