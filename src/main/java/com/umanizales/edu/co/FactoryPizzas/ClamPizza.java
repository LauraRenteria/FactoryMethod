/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umanizales.edu.co.FactoryPizzas;

/**
 *
 * @author laura
 */
public class ClamPizza extends Pizza{
      public ClamPizza() {
        name = "Clam Pizza";
        dough = "Regular Crust";
        sauce = "Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
        toppings.add("clam");
    }

}
