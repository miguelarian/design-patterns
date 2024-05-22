package com.miguelvela;
public class VegetarianMenu extends Menu {

        private String[] appetizers = {"Bruschetta", "Caprese Salad"};
        private String[] mains = {"Spaghetti Pomodoro", "Eggplant Parmesan", "Fettuccine Alfredo"};
        private String[] desserts = {"Green Tiramisu", "Vegan Gelato"};
        private double price = 12.00d;

        @Override
        protected final String name() {
            return "Vegetarian Menu";
        }

        @Override
        protected final String appetizer() {
            return String.join(", ", appetizers);
        }

        @Override
        protected final String main() {
            return String.join(", ", mains);
        }

        @Override
        protected final String dessert() {
            return String.join(", ", desserts);
        }

        @Override
        protected double price() {
            return price;
        }
}
