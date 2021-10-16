/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Benjamin Shin
 */
/*
Create a program that takes a product name as input and retrieves the current price and quantity for that product.
The product data is in a data file in the JSON format  and looks like this (you will create this file as `exercise44_input.json`):
Print out the product name, price, and quantity if the product is found. If no product matches the search,
state that no product was found and start over.
 */

package baseline;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.*;
import java.util.Iterator;

public class solution44 {

    public boolean searchproduct(){
        boolean status = false;
        JsonParser parser = new JsonParser();
        try {
            //Read json file using parser and store it in obj
            Object obj = parser.parse(new FileReader("data/exercise44_input.json"));

            //Create object
            JsonObject jsonObject = (JsonObject)obj;
            //Reading products array from  the file
            JsonArray totalproducts = (JsonArray)jsonObject.get("products");

            //take in user input
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String input;
            //user input is saved to input
            input = bufferedReader.readLine();

            //name is same to avoid confusion to convert to iterator
            Iterator iterator = totalproducts.iterator();
            //Loop through
            while (iterator.hasNext()) {
                JsonObject json = (JsonObject) iterator.next();

                //get rid of quotations
                String name = json.get("name").toString();
                name=name.replaceAll("^\"+|\"+$", "");

                //Compare
                if(input.contains(name)){
                    System.out.println("Name: "+name);
                    System.out.println("Price: "+json.get("price"));
                    System.out.println("Quantity: "+json.get("quantity"));
                    status = true;
                }
            }
            //If false, then value is not found
            if(!status){
                System.out.println("Sorry, that product was not found in our inventory");
                status = false;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    public static void main(String[] args) {
        boolean status = false;
        solution44 app = new solution44();
        System.out.println("What is the product name? ");
        while(!status) {
            status=app.searchproduct();
        }
    }
}
