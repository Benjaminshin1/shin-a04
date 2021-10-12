package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class solution41Test {

    @Test
    void read_names() {
        solution41 app =new solution41();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> file_names = new ArrayList<>();
        names.add("Ling, Mai");
        names.add("Johnson, Jim");
        names.add("Zarnecki, Sabrina");
        names.add("Jones, Chris");
        names.add("Jones, Aaron");
        names.add("Swift, Geoffrey");
        names.add("Xiong, Fong");
        boolean actual=true;

        Scanner inputFile = null;
        try {
            inputFile = new Scanner(new File("data/exercise41_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        app.read_names(inputFile,file_names);

        if(names.equals(file_names)){
            actual=true;
        }else{
            actual=false;
        }

        Assertions.assertEquals(true,actual);


    }

    @Test
    void sort_names() {
        boolean actual=true;
        solution41 app =new solution41();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> file_names = new ArrayList<>();
        names.add("Johnson, Jim");
        names.add("Jones, Aaron");
        names.add("Jones, Chris");
        names.add("Ling, Mai");
        names.add("Swift, Geoffrey");
        names.add("Xiong, Fong");
        names.add("Zarnecki, Sabrina");

        Scanner inputFile = null;
        try {
            inputFile = new Scanner(new File("data/exercise41_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        app.read_names(inputFile,file_names);
        app.sort_names(file_names);

        if(names.equals(file_names)){
            actual=true;
        }else{
            actual=false;
        }

        Assertions.assertEquals(true,actual);


    }
}