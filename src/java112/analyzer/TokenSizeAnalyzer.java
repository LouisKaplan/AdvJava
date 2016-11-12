package java112.analyzer;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

/**
 * Created by student on 11/10/16.
 */
public class TokenSizeAnalyzer implements Analyzer{

    private Map<Integer, Integer> tokenSizes;
    private Properties properties;
    private int maximumSize;

    public TokenSizeAnalyzer(Properties properties){
        this();
        this.properties = properties;
    }

    public TokenSizeAnalyzer(){
        tokenSizes = new TreeMap<>();
        int maximumSize = 0;
    }


    public Map<Integer, Integer> getTokenSizes() {
        return tokenSizes;
    }

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
        determineMaximumSize();
    }

    public void determineMaximumSize(){
        for(Integer highNumber : tokenSizes.values()){
            if(highNumber > maximumSize){
                maximumSize = highNumber;
            }
        }
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

    public void printStars(PrintWriter out, Set<Map.Entry<Integer, Integer>> mapTree) {
        out.write("\r\n");
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
}