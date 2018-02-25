/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Food UP");
    }
    public void submitOrder(View view) {
        // Get user's name
        EditText nameField = (EditText) findViewById(R.id.name_field);
        Editable nameEditable = nameField.getText();

        String price = nameEditable.toString();

        double calcPrice = Double.parseDouble(price);
        int protein;
        int carb;
        int fat;

        // Figure out if the user wants whipped cream topping
        RadioButton proteinHigh = (RadioButton) findViewById(R.id.protein_high_field);
        boolean hasHighProtein = proteinHigh.isChecked();

        RadioButton proteinLow = (RadioButton) findViewById(R.id.protein_low_field);
        boolean hasLowProtein = proteinLow.isChecked();

        // Figure out if the user wants choclate topping
        RadioButton carbsHigh = (RadioButton) findViewById(R.id.carbs_high_field);
        boolean hasHighCarbs = carbsHigh.isChecked();

        RadioButton carbsLow = (RadioButton) findViewById(R.id.carbs_low_field);
        boolean hasLowCarbs = carbsLow.isChecked();

        RadioButton fatHigh = (RadioButton) findViewById(R.id.fat_high_field);
        boolean hasHighFat = fatHigh.isChecked();

        RadioButton fatLow = (RadioButton) findViewById(R.id.fat_low_field);
        boolean hasLowFat = fatLow.isChecked();
        FoodItem food1 = new FoodItem("Burger",calcPrice,20,10,400,15,17) ;
        FoodItem food2 = new FoodItem("Burrito",calcPrice,17,30,500,30,21) ;
        FoodItem food3 = new FoodItem("Noodles",calcPrice,22,42,350,45,8) ;
        String message = "";

        message += " Your optimal foods for $"+food1.getCost();
        message += "\n Food Name: " +food1.getName();
        message += "\n Calories: " +food1.getCalories() +"g";
        message += "\n Protein: " +food1.getProtein() +"g";
        message += "\n Carb: " +food1.getCarbs() +"g";
        message += "\n Fat: " + food1.getFat()+"g";
        message += "\n From: Five Guys\n";

        message += "\n Food Name: " +food2.getName();
        message += "\n Calories: " +food2.getCalories() +"g";
        message += "\n Protein: " +food2.getProtein() +"g";
        message += "\n Carb: " +food2.getCarbs() +"g";
        message += "\n Fat: " + food2.getFat()+"g";
        message += "\n From: Chipotle\n";

        message += "\n Food Name: " +food3.getName();
        message += "\n Calories: " +food3.getCalories() +"g";
        message += "\n Protein: " +food3.getProtein() +"g";
        message += "\n Carb: " +food3.getCarbs() +"g";
        message += "\n Fat: " + food3.getFat()+"g";
        message += "\n From: Sichuan Gourmet";

        displayFood(message);

    }



    public void increment(View view) {
        if (quantity == 100) {
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }
    public void decrement(View view) {
        if (quantity == 0) {
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);
    }
    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }
    private void displayFood(String message)
    {
        TextView displayReccommendedFood = (TextView) findViewById(
                R.id.myOrder_text_view);
       displayReccommendedFood.setText(message);
    }
}


