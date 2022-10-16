package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.pizza.model.Order;
import org.example.pizza.model.Pizza;


public class Main {

    private static final Logger logger = LogManager.getLogger(PizzaService.class);
    public static void main(String[] args){
        try {
            PizzaService picka = new PizzaService();
            for(Pizza x : picka.getAvailablePizza()) System.out.println("Pizza: " + x.getName() + " Cena: " + x.getPrice());
            Order order1 = picka.makeOrder(new Pizza("capicjoza", 17.0d), 1);
            System.out.println(order1);
        }catch (PizzaNotFoundExeption e){
            logger.error("Wysypało sie.");
        }
    }
}