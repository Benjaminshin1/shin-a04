/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Benjamin Shin
 */
/*
Create a program that reads in a file named `exercise46_input.txt` and counts the
frequency of words in the file.
Then construct a histogram displaying the words and the frequency, and display the histogram to the screen.
 */
package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class solution46 {
    public void file_reader(Scanner inputFile, ArrayList<String> words){
        //read in file and return as an array
        //will read in words from the file
        while (inputFile.hasNextLine()) {
            // adding the read line to the list of words
            words.add(inputFile.next());
        }
    }

    public ArrayList<String> counter(ArrayList<String> words){
        int i=0;
        ArrayList<String> hasharray = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        Set<String> counter = new HashSet<>(words);

        StringBuilder hash = new StringBuilder();

        //create the array of asterisks
        for(String s: counter){
            for(i=0;i<Collections.frequency(words,s);i++){
                hash.append("*");
            }
            hasharray.add(String.valueOf(hash));
            temp.add(s);
            //reset the length
            hash.setLength(0);

        }

        for(i=temp.size()-1;i>=0;i--){
            System.out.println(temp.get(i)+ ":      "+hasharray.get(i));
        }
        return hasharray;
    }

    public static void main(String[] args) {
        solution46 app =new solution46();
    //output the answer in the format requested

        //array list for the words
        ArrayList<String> words = new ArrayList<>();

        Scanner inputFile = null;
        try {
            inputFile = new Scanner(new File("data/exercise46_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert inputFile != null;
        app.file_reader(inputFile,words);
        app.counter(words);

    }
}
