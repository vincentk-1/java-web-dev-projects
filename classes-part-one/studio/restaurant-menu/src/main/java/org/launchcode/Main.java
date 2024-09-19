package org.launchcode;

public class Main {

    public static void main(String[] args) {

      MenuItem item1 = new MenuItem("Chicken Tikka Masala", "Chicken in spiced tomato sauce", 14.39, "main course");
      MenuItem item2 = new MenuItem("Samosa", "Our popular deep fried pastry", 3.51, "appetizer");
      MenuItem item3 = new MenuItem("Chapati", "Fluffy flat bread", 5.25, "dessert");
      MenuItem item4 = new MenuItem("Lamb Vindaloo", "Tender chunks of lamb cooked in spices", 17.26, "main course");
      MenuItem item5 = new MenuItem("Mandazi", "Deep fried bread", 2.78, "appetizer");

      System.out.println(item1.isNew());

      System.out.println(item1);

      Menu menu = new Menu();

      menu.addItem(item1);
      menu.addItem(item2);
      menu.addItem(item3);
      menu.addItem(item4);
      menu.addItem(item5);

      System.out.println(menu);

      menu.removeItem(item4);
      System.out.println(menu);

      // Test equals method
      System.out.println(item1.equals(item2));

      MenuItem item6 = new MenuItem("Mandazi", "Deep fried bread", 2.78, "appetizer");

      System.out.println(item5.equals(item6));

      // Attempt to Duplicate an Item
      menu.addItem(item6);
        System.out.println(menu);
    }
}
