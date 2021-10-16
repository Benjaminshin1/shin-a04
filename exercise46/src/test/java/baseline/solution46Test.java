package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class solution46Test {

    @Test
    void counter() {
        boolean actual=true;
        solution46 app =new solution46();
        ArrayList<String> test = new ArrayList<>();
        test.add("*");
        test.add("**");
        test.add("*******");
        ArrayList<String> actualarray = new ArrayList<>();

        ArrayList<String> words = new ArrayList<>();

        Scanner inputFile = null;
        try {
            inputFile = new Scanner(new File("data/exercise46_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert inputFile != null;
        app.file_reader(inputFile,words);
        actualarray=app.counter(words);

        //test for the length of special characters in each array
        if(test.equals(actualarray)){
            actual=true;
        }else{
            actual=false;
        }
        Assertions.assertEquals(true,actual);




    }
}