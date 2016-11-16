package java112.analyzer;
import java.io.*;
import java.util.*;
import java.lang.*;

/**
 * The objective of AnalyzeFile is to open a properties file,
 * use the information within to read an input txt file,
 * break down that txt file into several forms of data,
 * and then put that data into corresponding files.
 * @author Louis Kaplan
 * @version 0.2
 */
public class AnalyzeFile{

    private String inputFilePath;
    private Properties properties;
    private List<Analyzer> analyzerList;
    private int numberOfArgs = 1;

/**
 * runAnalysis checks the number of input files and begins the processing methods.<p>
 * This method confirms the number of input files. If that number is correct,
 * it loads the properties file that was located by the passed-in parameter.
 * Next, it creates a list that contains each class that inherits from Analyzer.
 * Then it reads each line of the input file, splits that line into tokens,
 * turns those tokens into strings, and passes those strings on for processing.
 * Finally, it calls on methods that output the processed strings into the appropriate
 * output files.<p>
 * @param arguments is an argument passed in on the command line, 
 * containing the location of the properties file. 
 */
    public void runAnalysis(String[] arguments){

        if (arguments.length !=numberOfArgs){
            System.out.println("Please enter one argument on the command line");
            return;
        } else {         

            loadProperties(arguments[0]);
            createAnalyzerList();
            prepareReader(inputFilePath);
            writeAllOutputFiles();
        }
    }

/**
 * loadProperties opens the properties file and assigns it to a variable.<p>
 * This class loads the properties file, assigning it to the properties variable.
 * Next, it populates the inputFilePath variable with that information from the
 * properties file.<p>
 * @param propertiesFilePath is an argument passed in on the command line, 
 * containing the location of the properties file. 
 */
    public void loadProperties(String propertiesFilePath)  {
        properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream(propertiesFilePath));
            inputFilePath = properties.getProperty("input.file.path");
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

/**
 * createAnalyzerList builds an ArrayList which holds one of each Analyzer class.<p>
 * This class creates an ArrayList of Analyzer objects, then adds one of each
 * analyzer class, each one taking in the information from the properties file.<p>
 */
    public void createAnalyzerList(){
        analyzerList = new ArrayList<Analyzer>();
        analyzerList.add(new SummaryReport(properties));
        analyzerList.add(new UniqueTokenAnalyzer(properties));
        analyzerList.add(new BigWordAnalyzer(properties));
        analyzerList.add(new TokenCountAnalyzer(properties));
        analyzerList.add(new TokenSizeAnalyzer(properties));
        analyzerList.add(new KeywordAnalyzer(properties));

    }

/**
 * prepareReader reads each line of the input file.<p>
 * This class loads the input file, reading each line and assigning it to
 * a string. From there, it calls on the splitLines method for further processing.<p>
 * @param inputFilePath is an argument from the properties file that relays the
 * location of the txt file that we're processing. 
 */
    public void prepareReader(String inputFilePath){

        try (BufferedReader in = new BufferedReader(new FileReader(inputFilePath))){
 
            while (in.ready()){
                String inputLine = in.readLine();
                splitLines(inputLine);
            }
               
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("There was a problem opening the input file");
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException){
            System.out.println("There was a problem writing to the input file");
            ioException.printStackTrace();
        } catch (Exception exception){
            System.out.println("There was a problem that is undefined");
            exception.printStackTrace();
        }
    }

/**
 * splitLines takes a string and splits it into tokens for further processing.<p>
 * This class loads a line from the input file, then splits it into tokens,
 * which it adds to an array. Then it passes that array along for processing.<p>
 * @param currentLine is the current line being read in the prepareReader method.  
 */ 
    public void splitLines(String currentLine){
                String[] tokenArray = currentLine.split("\\W");
                startTokenProcessing(tokenArray);
    }

/**
 * startTokenProcessing loops through the current array of tokens for further processing.<p>
 * This loops through the current array of tokens and runs each through the 
 * determineEmptyStrings method, where they are checked to make sure they are not empty.<p>
 * @param tokenArray is the array built from the tokens that comprised the current
 * line being read from the input file.   
 */  
    public void startTokenProcessing(String[] tokenArray){
        for (String tokens : tokenArray) {
            determineEmptyStrings(tokens);
        }
    }

/**
 * determineEmptyStrings checks to make sure each token is not an empty string.<p>
 * This checks the current tokens to see if they are empty strings.
 * If they are not, it passes them into the processesToken class of each Analyzer
 * to be processed.<p>
 * @param tokens is the current token being checked 
 */ 
    public void determineEmptyStrings(String tokens){
        if (!"".equals(tokens)){
            for (Analyzer analyzerClass : analyzerList) {
                analyzerClass.processToken(tokens);
            }
        }
    }

/**
 * writeAllOutputFile runs the output methods of each Analyzer.<p>
 * This loops through each Analyzer class and runs the output methods of each.<p>
 */ 
    public void writeAllOutputFiles(){
        for (Analyzer analyzerClass : analyzerList) {
            analyzerClass.writeOutputFile(inputFilePath);
        }
    }    
}