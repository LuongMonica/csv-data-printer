// CSV Data Printer
// created by: Monica Luong, April 2021
    // summary:
    // accepts csv file as input,
    // processes it,
    // and outputs each field on a newline

import java.io.*;

public class CSVDataPrinter {
    // inputted data (csv file) is shared b/t functions
    BufferedReader in;
    public static void main(String args[]) throws IOException {
        CSVDataPrinter file = new CSVDataPrinter();
        String s = args[0]; 
        // open the file	
        file.openFile(s);
        // close the file
        file.closeFile();
    }
    
    // opens file
    // reads and processes it
    public void openFile(String filename) throws IOException {
        String line;
        // open given file
        in = new BufferedReader(new FileReader(filename));
        // read first line
        line = in.readLine();
        // keep reading file until the end is reached
        while (line != null) {
            // separate each field on a newline
            line = line.replace(',', '\n');
            // output it
            System.out.println(line);
            // read the next line
            line = in.readLine();
        }
    }

    public void closeFile() throws IOException {
        in.close();
    }
}