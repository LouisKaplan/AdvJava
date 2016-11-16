package java112.analyzer;
import java.io.*;
import java.util.*;
import java.lang.*;

/**
 * TokenCountAnalyzer created a TreeSet containing each unique string created
 * when we broke down the input file, along with a count of how many times that token appeared.
 * @author Louis Kaplan
 * @version 0.2
 */
public class TokenCountAnalyzer implements Analyzer{

    /**
     * TokenCountAnalyzer is a constructor class.<p>
     * TokenCountAnalyzer is a constructor that creates a new TreeMap to hold
     * an ordered list of map entries, each of which holds a key and a value.
     * @param properties is the properties file that was passed in.
     */
    public TokenCountAnalyzer(Properties properties){
        this();
        this.properties = properties;
    }

    public TokenCountAnalyzer(){
        tokenCounts = new TreeMap<String, Integer>();
    }


    private Properties properties;
    private Map<String, Integer> tokenCounts;


/**
 * getUniqueTokensList returns the set of unique tokens generated so far.
 * @return uniqueTokensList is the full list of unique tokens generated 
 */ 
        public Map getTokenCounts() {
        return tokenCounts;
    }

    public void processToken(String token){
        if (tokenCounts.containsKey(token)) {
            Integer tokenTally = tokenCounts.get(token);
            tokenTally++;
            tokenCounts.put(token, tokenTally);
        } else tokenCounts.put(token, 1);
    }

    public void writeOutputFile(String inputFilePath){

        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output/" + properties.getProperty("output.file.token.count"))))){
                
            Set<Map.Entry<String, Integer>> mapTree = tokenCounts.entrySet();

            for (Map.Entry<String, Integer> mapEntries : mapTree) {
                    String key = mapEntries.getKey();
                    Integer value = mapEntries.getValue();     
                    out.write(key + "\t" + value + "\r\n");
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