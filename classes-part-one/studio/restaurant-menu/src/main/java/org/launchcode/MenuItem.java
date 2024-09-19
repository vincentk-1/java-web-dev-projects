package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {

    private String name;
    private String description;
    private double price;
    private String category;
    private final LocalDate dateAdded;

    public MenuItem(String name, String description, double price, String category) {
        this.category = category;
        this.price = price;
        this.description = description;
        this.name = name;
        this.dateAdded = LocalDate.now();
        // Test isNew() to be false
       // this.dateAdded = LocalDate.parse("2018-07-23");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    // Custom toString() method
    // Format name, description, price and conditional "NEW"
    @Override
    public String toString() {
        String newText = isNew() ? " - NEW!" : "";
        return name + newText + "\n" + description + " | $" + price;
    }

    // Custom equals to method
    public boolean equals(Object toBeCompared){
         if (this == toBeCompared) {
             return true;
         }
         if(toBeCompared ==null) {
             return false;
         }
         if(getClass() != toBeCompared.getClass()){
             return false;
         }
         MenuItem otherItem = (MenuItem) toBeCompared;

         return this.name.equals(otherItem.getName());
    }

    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today,ChronoUnit.DAYS);
        return daysBetween < 90;
    }

}
