/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Benjamin Shin
 */
package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class solution43 {
    public String siteName;
    public String author;
    public String path;

    public String createWebsite(){
        //create path
        //create website and directory
        String directory = path + siteName;
        File newFolder = new File(directory);
        newFolder.mkdirs();
        return directory;
    }

    public String createJS(){
        //create path
        //create js folder if yes and directory
        String directory = path + siteName + "/js";
        File newFolder = new File(directory);
        newFolder.mkdirs();
        return directory;
    }

    public String createCSS(){
        //create path
        //create css file and put in proper directory
        String directory = path + siteName + "/css";
        File newFolder = new File(directory);
        newFolder.mkdirs();
        return directory;
    }

    public String createHTML() {
        //create path and file
        //
        String directory = path + siteName + "/index.html";
        String htmlContent = "<title> " + siteName + " </title>\n<meta> " + author + " </meta>";
        File file = new File(directory);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(htmlContent);
            writer.close();
            return directory;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

        public static void main(String[] args) {
        solution43 generate_website = new solution43();
        String siteName;
        String author;
        String CSS;
        String JS;
        Scanner input = new Scanner(System.in);

        //Prompt for the name of the site.
        System.out.print("Site name: ");
        //Prompt for the author of the site.
        siteName = input.nextLine();
        System.out.print("Author: ");
        author = input.nextLine();

        //Ask if the user wants a folder for JavaScript files.
        //prompt for simple Y or N
        System.out.print("Do you want a folder for JavaScript? ");
        JS = input.nextLine();

        //Ask if the user wants a folder for CSS files.
        //prompt for simple Y or N
        System.out.print("Do you want a folder for CSS? ");
        CSS = input.nextLine();

        generate_website.siteName = siteName;
        generate_website.author = author;
        generate_website.path = "data/website/";

        System.out.println("Created " + generate_website.createWebsite());
        System.out.println("Created " + generate_website.createHTML());

        //If yes for cs or jss
        //will only create files if 'y'
        if(JS.equals("y")) {
            System.out.println("Created " + generate_website.createJS());
        }

        if(CSS.equals("y")) {
            System.out.println("Created " + generate_website.createCSS());
        }

    }
}
