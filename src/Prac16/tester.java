package Prac16;

public class tester {
    public static void main(String[] ar) {
        OrderManager orderManager = new OrderManager();
        RestaurantOrder restaurantOrder = new RestaurantOrder();
        InternetOrder internetOrder = new InternetOrder();

        try {
            Drink cap = new Drink("Water", "2", 30);
            Drink wine = new Drink("Limonate", "0.5", 70);
            Drink coffee = new Drink("Juice", "0.5", 50);
            Dish roast = new Dish("Roast", "beef stew with potatoes and vegetables", 180);
            Dish dumplings = new Dish("Caesar salad", "salad with chicken, vegetables and special sauce. Served with crackers", 150);
            Dish smoothie = new Dish("Honey cake", "cake with honey, sponge cake and delicious creamy caramel cream", 95);

            restaurantOrder.add(cap);
            restaurantOrder.add(coffee);

            internetOrder.add(roast);
            internetOrder.add(wine);
            internetOrder.add(smoothie);

            restaurantOrder.add(dumplings);
            restaurantOrder.add(dumplings);
            restaurantOrder.add(roast);

            orderManager.add(1, restaurantOrder);
            orderManager.add(2, restaurantOrder);
            orderManager.add("Moscow", internetOrder);

            System.out.println(restaurantOrder.priceTotal());
            System.out.println(orderManager.RestaurantOrdersCostSummary());
            System.out.println(restaurantOrder.dishQuantity());
            System.out.println(restaurantOrder.dishQuantity("Caesar salad"));
            System.out.println(internetOrder.getCount());
            System.out.println(internetOrder.priceTotal());

            internetOrder.remove("Caesar salad");

            System.out.println(internetOrder.getCount());
            System.out.println(internetOrder.priceTotal());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}