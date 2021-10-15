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

import com.google.gson.JsonParser;

public class solution44 {

    //pass through name to search for a product
    public String search_product(String name){
        JsonParser input = new JsonParser();
        boolean search=true;
        //get info from json file and compare to the input name


        if(search==false){
            //output "Sorry, that product was not found in our inventory" if the product is not in the database
        }
        return null;
    }

    public static void main(String[] args) {
        solution44 app = new solution44();
    }
}
