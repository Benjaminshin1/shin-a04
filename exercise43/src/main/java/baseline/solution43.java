/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Benjamin Shin
 */
/*
Create a program that generates a website skeleton with the following specifications:
Generate an index.html file that contains the name of the site inside the <title> tag and the author in a <meta> tag.
example output


Site name: awesomeco
Author: Max Power
Do you want a folder for JavaScript? y
Do you want a folder for CSS? y
Created ./website/awesomeco
Created ./website/awesomeco/index.html
Created ./website/awesomeco/js/
Created ./website/awesomeco/css/
 */
package baseline;

public class solution43 {
    String siteName;
    String author;
    String path;
    public void createWebsite(){
        //create path
        //create website and directory
    }

    public void createJSFolder(){
        //create path
        //create js folder if yes and directory
    }

    public void createCSSFolder(){
        //create path
        //create css file and put in proper directory
    }

    public void createHTML(){
        //create path
        //
    }

    public static void main(String[] args) {
        String siteName = null;
        String author = null;
        String CSS;
        String JS;
        solution43 generate_website = new solution43();
        generate_website.siteName = siteName;
        generate_website.author = author;
        generate_website.path = "src";


        //Prompt for the name of the site.
        //Prompt for the author of the site.
        //Ask if the user wants a folder for JavaScript files.
        //Ask if the user wants a folder for CSS files.
    }
}
