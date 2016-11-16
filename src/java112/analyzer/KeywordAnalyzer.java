package java112.analyzer;

import java.io.*;
import java.util.*;
import java.lang.*;

/**
 * KeywordAnalyzer created a TreeMap containing the position of each string
 * that matches a line in our input keywords file.
 * @author Louis Kaplan
 * @version 0.2
 */
public class KeywordAnalyzer implements Analyzer{

/**
 * KeywordAnalyzer is a constructor class.<p>
 * KeywordAnalyzer is a constructor that loads a properties file,
 * creates a new TreeMap to hold entries, sets an iterator counter to 0,
 * and calls the establishMap() method.
 * @param properties is the properties file that was passed in.
 */
    public KeywordAnalyzer(Properties properties){
        this();
        this.properties = properties;
        establishMap();
    }

    public KeywordAnalyzer(){
        keywordMap = new TreeMap<>();
        tokenOccurrence = 0;
    }

    private Map<String, List<Integer>> keywordMap;
    private Properties properties;
    private Integer tokenOccurrence;

    /**
     * getKeywordMap returns the map of tokens that match the keyword file and their occurrences.
     * @return keywordMap is the full map of tokens that match the keyword file and their occurrences
     */
    public Map<String, List<Integer>> getKeywordMap() {
        return keywordMap;
    }

    /**
     * establishMap reads through the keyword file and generates a map with a key for each keyword.<p>
     * This method opens the keyword file, reads each line, and sets the
     * contents of that line to the key of map, which it pairs with
     * an ArrayList that will eventually contain integers that correspond
     * with a location in the input file<p>
     */
    public void establishMap(){
        try (BufferedReader in = new BufferedReader(new FileReader(properties.getProperty("file.path.keywords")))){

            while (in.ready()) {
                String inputLine = in.readLine();
                keywordMap.put(inputLine, new ArrayList<>());
            }

        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("There was a problem opening the input file");
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException){
            System.out.println("There was a problem writing to the input file");
            ioException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("There was a problem that is undefined");
            exception.printStackTrace();
        }
    }

    public void processToken(String token){
        tokenOccurrence++;
        if(keywordMap.containsKey(token)){
            List<Integer> currentList = keywordMap.get(token);
            currentList.add(tokenOccurrence);
            keywordMap.put(token, currentList);
        }
    }


    public void writeOutputFile(String inputFilePath){

        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output/" + properties.getProperty("output.file.keyword"))))){

            for(String entry : keywordMap.keySet()){
                List<Integer> printList = keywordMap.get(entry);
                out.write(entry + " = \r\n");
                out.write("[");
                int linesInCurrentRow = 0;
                for(Integer integerPosition : printList){
                    linesInCurrentRow++;
                    if (linesInCurrentRow == printList.size()){
                        out.write(integerPosition.toString());
                    } else if(linesInCurrentRow % 8 == 0){
                        out.write(integerPosition.toString() + ",\r\n");
                    } else out.write(integerPosition.toString() + ", ");
                }
                out.write("]");
                out.write("\r\n \r\n");
            }

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