package com.example.justjava;

/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/


import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import androidx.appcompat.app.AppCompatActivity;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    int quantity=0;


    public void submitOrder(View view) {

       //make this as methode int price=quantity*5;
        String priceMessage=createOrderSummary();
        displayMessage(priceMessage);
    }

    public String createOrderSummary(){
        return"Name: SARI Soumia\nQuantity: " +quantity + "\nTotal: " +calculatePrice() + "\nThank You!";
    }
    public int calculatePrice(){
        return quantity*5;

    }
    public void increaseNum(View view) {
        quantity=quantity+1;
        display(quantity);
    }
    public void decreaseNum(View view) {
       // TextView num = (TextView) findViewById(R.id.quantity_text_view);
        //int tt=Integer.parseInt(String.valueOf(num));
       quantity=quantity-1;
        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

}