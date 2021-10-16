package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

class solution45Test {

    @Test
    void rewrite() throws IOException {
        boolean actual=true;
        solution45 app =new solution45();
        String file= app.read_file();
        file=app.rewrite(file);

        //cannot get the files and string to match using this method
        String test="One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                    "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                    "uses an IDE to write her Java programs\".";

        if(file.equalsIgnoreCase(test)){
            actual=true;
        }else{
            actual=false;
        }

        Assertions.assertEquals(true,actual);

    }

    @Test
    void read_file() throws IOException {
        boolean actual=true;
        solution45 app =new solution45();
       String file= app.read_file();
       String test= app.read_file();
       if(file.equals(test)){
           actual=true;
       }else{
           actual=false;
       }

        Assertions.assertEquals(true,actual);
    }

    @Test
    void write_file() throws IOException {
        String teststring="One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                    "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                    "uses an IDE to write her Java programs\".";
        boolean actual;
        solution45 app =new solution45();
        Path test= Paths.get("data/thing.txt");
        Path file = Paths.get(String.valueOf(app.write_file("thing.txt",teststring)));
        if(test.equals(file)){
             actual=true;
        }else{
             actual=false;
        }
        Assertions.assertEquals(true,actual);

    }
}