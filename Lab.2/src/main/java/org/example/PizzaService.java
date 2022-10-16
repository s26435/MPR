package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.pizza.model.Order;
import org.example.pizza.model.Pizza;
import org.example.PizzaNotFoundExeption;
import java.util.*;

public class PizzaService {
    private static final Logger logger = LogManager.getLogger(PizzaService.class);
    public Order makeOrder(Pizza pizza, int orderNumer) throws PizzaNotFoundExeption {
            if(getAvailablePizza().stream().filter(c->c.getName().equals(pizza.getName())).findFirst().isEmpty()) throw new PizzaNotFoundExeption("Picki nie znaleziono");
            logger.info("OK");
            return new Order(orderNumer,pizza);
    }
    public List<Pizza> getAvailablePizza(){
        List<Pizza> picki = new ArrayList<Pizza>();
        picki.add(new Pizza("capicjoza",17));
        picki.add(new Pizza("cztery",20));
        return picki;
    }
}
