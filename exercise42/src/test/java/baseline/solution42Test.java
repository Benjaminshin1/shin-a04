package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class solution42Test {

    @Test
    void parse_input() {
        solution42 app =new solution42();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> test_names = new ArrayList<>();
        test_names.add("Ling,Mai,55900");
        test_names.add("Johnson,Jim,56500");
        test_names.add("Jones,Aaron,46000");
        test_names.add("Jones,Chris,34500");
        test_names.add("Swift,Geoffrey,14200");
        test_names.add("Xiong,Fong,65000");
        test_names.add("Zarnecki,Sabrina,51500");
        boolean actual=true;


        Scanner inputFile = null;
        try {
            inputFile = new Scanner(new File("data/exercise42_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        names= (ArrayList<String>) app.parse_input(inputFile);
        if(names.equals(test_names)){
            actual=true;
        }else{
            actual=false;
        }
        Assertions.assertEquals(true,actual);

    }
}
