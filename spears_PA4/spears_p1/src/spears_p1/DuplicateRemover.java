package spears_p1;

/* Create a class called DuplicateCounter. Create an instance method called count 
 * that takes a single parameter called dataFile (representing the path to a text 
 * file) and uses a Map of Strings to count how many times each word occurs in 
 * dataFile. The counts should be stored in an instance variable called wordCounter. 
 * Create an instance method called write that takes a single parameter called 
 * outputFile (representing the path to a text file) and writes the contents of 
 * wordCounter to the file pointed to by outputFile. The output file should be 
 * overwritten if it already exists, and created if it does not exist.
 */

import java.io.*;
import java.util.*;

public class DuplicateRemover {
    private Set < String > uniqueWords;
    
    public void remove(String dataFile) throws FileNotFoundException {
        String word;
        uniqueWords = new HashSet < String > ();
        Scanner sc = new Scanner(new File(dataFile));
        while (sc.hasNext()) {
            word = sc.next();
            uniqueWords.add(word);
        }
        sc.close();
    }

    public void Write(String outputFile) throws IOException {
        File f;
        FileWriter fw = null;
        f = new File(outputFile);

        if (f.exists()) {
            fw = new FileWriter(f, true);
            Iterator itr = uniqueWords.iterator();
            while (itr.hasNext()) {
                String str = (String) itr.next();
                fw.write(str + "\n");
            }
            fw.close();
            System.out.println("Data Written to File");
        } 
        else {
            f.createNewFile();
            fw = new FileWriter(f);
            Iterator itr = uniqueWords.iterator();
            while (itr.hasNext()) {
                String str = (String) itr.next();
                fw.write(str + "\n");
            }
            fw.close();
            System.out.println("Data Written to File");
        }

    }

}