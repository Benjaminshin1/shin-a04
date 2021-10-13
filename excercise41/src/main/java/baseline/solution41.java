/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Benjamin Shin
 */
package baseline;
/*
Create a program that reads in the following list of names from a file called `exercise41_input.txt`
and sorts the list alphabetically:
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution41 {

    public void read_names(Scanner inputFile, List<String> names) {
        //will read in names from the file
        while (inputFile.hasNextLine()) {
            // adding the read line to the list of names
            names.add(inputFile.nextLine());
        }
    }

    public List<String> sort_names (List <String> names) {
        //use collections sort to sort names and return
        names.sort(String.CASE_INSENSITIVE_ORDER);
        //returns the names sorted alphabetically
        return names;
    }


    public static void main (String[]args) throws IOException {
        solution41 app =new solution41();

        Scanner inputFile = null;
        try {
            inputFile = new Scanner(new File("data/exercise41_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //array list for the names
        ArrayList<String> names = new ArrayList<>();
        assert inputFile != null;
        app.read_names(inputFile,names);

        System.out.println("Total of "+names.size()+" names");
        System.out.println("-----------------");
        app.sort_names(names);
        for (String i : names) {

            System.out.println(i);

        }
        //file writer to create and write to ouput file
        FileWriter output = new FileWriter("data/exercise41_output.txt");
        for(String i: names)
        {
            output.write(i+"\n");
        }
        output.close();

    }
}


