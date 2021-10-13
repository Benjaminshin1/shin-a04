/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Benjamin Shin
 */
/*
Sometimes data comes in as a structured format that you have to break down and turn into records so you can
process them. CSV, or comma-separated values, is a common standard for doing this.
no need for a separate class since the program just needs to remove commas and output a certain format
*/
package baseline;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution42 {

    public List<String> parse_input(Scanner inputFile) {
        ArrayList<String> names = new ArrayList<>();
        //will parse the data into separate strings by splitting up the information based on the comma
        while (inputFile.hasNext()) {
            String temp1 = inputFile.nextLine();
            //add name string to array for testing
            names.add(temp1);
            //splits up the data by the comma
            String[] temp = temp1.split(",");
            //will output the data without commas
            System.out.printf("%-10s%-10s%-10s\n",temp[0],temp[1],temp[2]);
        }
        return names;
    }
    public static void main(String[] args) throws IOException {
        solution42 app =new solution42();
        Scanner inputFile = null;
        //accessing the file
        try {
            inputFile = new Scanner(new File("data/exercise42_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.printf("%-10s%-10s%-10s\n","Last","First","Salary");
        System.out.println("-------------------------");
        app.parse_input(inputFile);
    }
}


