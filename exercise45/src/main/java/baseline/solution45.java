/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Benjamin Shin
 */
package baseline;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

//Given an input file named `exercise45_input.txt`,
// read the file and look for all occurrences of the word utilize.
// Replace each occurrence with use. Write the modified file to a new file.
public class solution45 {
    private String original_file = null;
    private String new_file = null;


    public String rewrite(String old){
        //rewrite the string and return it
        String newstring=null;
        //word to be replaced
        String replace_word="utilize";
        String new_word="use";
        newstring = old.replace(replace_word, new_word);


        return newstring;
    }


    public String read_file() throws IOException {
        //read in file and return as a string
        Path file = Paths.get("data/exercise45_input.txt");
        original_file = new String(Files.readAllBytes(file));
        if (original_file.isEmpty()){
            throw new IllegalArgumentException();
        }
        return original_file;
    }

    public Path write_file(String path, String old) throws IOException {
        //write the answer to an output file
        //create path
        FileWriter output = new FileWriter("data/"+path);
        output.write(old);
        //close it or else it will be empty
        output.close();
        return Paths.get("data/"+path);
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        solution45 app =new solution45();
        //convert file to string
        String old=app.read_file();

        //pass through and replace all occurrences of a specific word
        old= app.rewrite(old);


        //prompt user for the name of the output file
        System.out.println("what is the name of the output file");
        String fileName = input.nextLine();
        //create file name for the file
        fileName = fileName + ".txt";
        app.write_file(fileName,old);
    }
}
