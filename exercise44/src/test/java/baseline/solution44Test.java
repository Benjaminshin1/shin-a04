package baseline;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class solution44Test {

    @Test
    void searchproduct() {
        solution44 app = new solution44();
        boolean expected=true;
        String input = "Thing";
        //simulate user input
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        boolean actual = app.searchproduct();
        assertEquals(true, actual);

    }
}