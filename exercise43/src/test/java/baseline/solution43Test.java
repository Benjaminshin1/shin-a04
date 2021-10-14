package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution43Test {

    @Test
    void createWebsite() {
        solution43 generate_website = new solution43();
        //set test website and files
        generate_website.path = "data/website/";
        generate_website.siteName = "awesomeco";
        generate_website.author = "Benjamin Shin";
        String expected = "data/website/awesomeco";
        String actual = generate_website.createWebsite();

        //compare
        assertEquals(expected, actual);
    }

    @Test
    void createJS() {
        solution43 generate_website = new solution43();
        generate_website.path = "data/website/";
        generate_website.siteName = "awesomeco";
        generate_website.author = "Benjamin Shin";

        //directory of test js
        String expected = "data/website/awesomeco/js";
        String actual = generate_website.createJS();

        //compare
        assertEquals(expected, actual);
    }

    @Test
    void createCSS() {
        solution43 generate_website = new solution43();
        generate_website.path = "data/website/";
        generate_website.siteName = "awesomeco";
        generate_website.author = "Benjamin Shin";

        //directory of test css
        String expected = "data/website/awesomeco/css";
        String actual = generate_website.createCSS();

        //compare
        assertEquals(expected, actual);
    }

    @Test
    void createHTML() {
        solution43 generate_website = new solution43();
        generate_website.path = "data/website/";
        generate_website.siteName = "awesomeco";
        generate_website.author = "Benjamin Shin";

        //directory of test html
        String expected = "data/website/awesomeco/index.html";
        String actual = generate_website.createHTML();

        //compare
        assertEquals(expected, actual);
    }
}