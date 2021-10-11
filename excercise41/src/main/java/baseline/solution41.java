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
import java.util.ArrayList;
import java.util.Scanner;

public class solution41 {

    public void read_names(){
        //will read in names from the file
    }

    public void print_names(){
        //print names in the correct format
    }

    public ArrayList<String> sort_names(ArrayList<String> names){
        //use collections sort to sort names and return

        return names;
    }


    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/main/resources/exercise41_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //array list for the names
        ArrayList<String> names = new ArrayList<>();

    }
}

