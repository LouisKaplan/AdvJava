package java112.analyzer;

/**
 * The Analyzer interface is implemented by two classes -
 * SummaryReport and UniqueTokenAnalyzer. Each of these classes
 * interprets the information from a file and presents output
 * in a unique way.
 * @author Louis Kaplan
 * @version 0.2
 */

public interface Analyzer{

/**
 * processToken takes the input of a single token and turns it into useful information. <p>
 * In SummaryReport, processToken simply increments a counter by one. Since the 
 * only information that class cares about is a raw count, the token is only good for
 * this incrementation and no other info is needed. <p>
 * In UniqueTokenAnalyzer, the token is added to a TreeSet. Because TreeSets only see
 * unique tokens, much of the work is done for us. <p>
 * BigWordAnalyzer is identical to UniqueTokenAnalyzer, except that it looks to see if
 * each token is 18 characters or more before adding them.<p>
 * TokenCountAnalyzer checks to see if a token is already present on a map.
 * If it is, it increments a value associated with that key. If it is not,
 * it adds it, and sets the value to 1.
 * @param token is the token featuring at least one character. 
 */
    void processToken(String token);


/**
 * writeOutputFile does the actual work of writing content to a text file. <p>
 * In SummaryReport, we take data from a properties file and derived dates and print them
 * to a text file, along with the calculated count of strings that the 
 * AnalyzeFile class worked to break down.<p>
 * In UniqueTokenAnalyzer, this just prints out each unique string from the TreeSet
 * we assembled in processToken().<p>
 * In TokenCountAnalyzer, this prints each entry from a treeMap, which contains a key and value.<p>
 * In BigWordAnalyzer, this just prints out each unique string from the TreeSet
 * we assembled in processToken(), but only those longer than 18 characters.<p>
 * @param inputFilePath this is the location of the input file. It is only used,
 * at this stage, to be written to the page. It is not actually processed for anything
 * impactful.
 * @see processToken();
 */
    void writeOutputFile(String inputFilePath);
}