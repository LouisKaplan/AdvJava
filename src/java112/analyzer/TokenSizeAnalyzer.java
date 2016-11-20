package java112.analyzer;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

/**
 * TokenSizeAnalyzer creates a map that contains word lengths
 * and the number of words that fit that length.
 * It also contains a visual representation of this map.
 * @author Louis Kaplan
 * @version 0.2
 */
public class TokenSizeAnalyzer implements Analyzer{

    /**
     * TokenSizeAnalyzer is a constructor class.<p>
     * TokenSizeAnalyzer is a constructor that creates a new TreeMap,
     * which will eventually hold an integer with the number of
     * tokens that match the length present in that key.
     * maximumSize stores the largest map value so that
     * we can eventually make a scale that compares the other
     * values relatively.
     * @param properties is the properties file that was passed in.
     */

    public TokenSizeAnalyzer(Properties properties){
        this();
        this.properties = properties;
    }

    public TokenSizeAnalyzer(){
        tokenSizes = new TreeMap<>();
        int maximumSize = 0;
    }

    private Map<Integer, Integer> tokenSizes;
    private Properties properties;
    private int maximumSize;

    public Map<Integer, Integer> getTokenSizes() {
        return tokenSizes;
    }

    /**
     * getMaximumSize returns the largest value in the tokenSizes map.
     * @return maximumSize is the largest value in the tokenSizes map.
     */
    public int getMaximumSize() {
        return maximumSize;
    }

    public void processToken(String token){
        int tokenSize = token.length();
        if (tokenSizes.containsKey(tokenSize)) {
            Integer tokenTally = tokenSizes.get(tokenSize);
            tokenTally++;
            tokenSizes.put(tokenSize, tokenTally);
        } else tokenSizes.put(tokenSize, 1);
    }

    public void writeOutputFile(String inputFilePath){

        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output/" + properties.getProperty("output.file.token.size"))))){

            Set<Map.Entry<Integer, Integer>> mapTree = tokenSizes.entrySet();

            for (Map.Entry<Integer, Integer> mapEntries : mapTree) {
                Integer key = mapEntries.getKey();
                Integer value = mapEntries.getValue();
                out.write(key + "\t" + value + "\r\n");
            }
            printStars(out, mapTree);

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

    /**
     * printStars takes in the map with integers and converts that data to a visual representation<p>
     * This method calls determineMaximumSize to figure out the largest value in the map.
     * From there it assigns each key's relative value to numberOfStars, and then prints
     * a scaled number of asterisks for each key.
     * @param out is the PrintWriter, allowing it to write to the file
     * @param mapTree is the set of map entries containing our data
     */

    public void printStars(PrintWriter out, Set<Map.Entry<Integer, Integer>> mapTree) {
        out.write("\r\n");
        determineMaximumSize();
        for (Map.Entry<Integer, Integer> mapEntries : mapTree) {
            Integer key = mapEntries.getKey();
            Integer value = mapEntries.getValue();
            Integer numberOfStars = Math.round((value * 80) / maximumSize);
            if (numberOfStars == 0) {
                numberOfStars = 1;
            }
            out.write(key + "\t");
            while(numberOfStars > 0){
                out.write("*");
                numberOfStars--;
            }
            out.write("\r\n");
        }
    }

    /**
     * determineMaximumSize determines the highest value in the map.<p>
     * This method checks creates a collection from the values in the map,
     * then sets maximumSize to the highest value in that map.
     */
    public void determineMaximumSize(){
        Collection<Integer> setOfKeys = tokenSizes.values();
        maximumSize = Collections.max(setOfKeys);
        System.out.println(maximumSize);
    }
}