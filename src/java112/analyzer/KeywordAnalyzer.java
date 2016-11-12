package java112.analyzer;

import java.io.*;
import java.util.*;
import java.lang.*;

/**
 * Created by student on 11/11/16.
 */
public class KeywordAnalyzer implements Analyzer{

    private Map<String, List<Integer>> keywordMap;
    private Properties properties;
    private Integer tokenOccurence;

    public KeywordAnalyzer(Properties properties){
        this();
        this.properties = properties;
    }

    public KeywordAnalyzer(){
        keywordMap = new TreeMap<>();
        tokenOccurence = 0;
        establishMap();
    }

    public Map<String, List<Integer>> getKeywordMap() {
        return keywordMap;
    }

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
        tokenOccurence++;
        for(String key : keywordMap.keySet()){
            if(key == token){
                List<Integer> currentList = keywordMap.get(token);
                currentList.add(tokenOccurence);
                keywordMap.put(token, currentList);
            }
        }
    }

    public void writeOutputFile(String inputFilePath){

        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output/" + properties.getProperty("output.file.keyword"))))){

            for(String entry : keywordMap.keySet()){
                out.write(entry + "\t" + keywordMap.get(entry) + "\r\n");
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