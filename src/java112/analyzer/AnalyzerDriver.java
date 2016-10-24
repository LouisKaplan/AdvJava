package java112.analyzer;
import java.io.*;
import java.util.*;


/**
 * AnalyzerDriver starts the major processing of the Analyzer Project.
 * @author Louis Kaplan
 * @version 0.1
 */
public class AnalyzerDriver{

/**
 * The Main method takes in the file name from the command line and makes it available
 * to other classes that read and interpret that file.
 * @param args this is the content passed in through the command line. In this case,
 * it is a properties file, which contains the file locations of several other key files.
 */
    public static void main(String[] args){
        AnalyzeFile mainAnalyzer = new AnalyzeFile();

        mainAnalyzer.runAnalysis(args);
    }
}