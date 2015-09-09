package controller;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import controller.ControlPanel.Style;
import controller.Pizza.Size;

public class ControlPanelTest {

	@Test
	public void testGetOrderTotalNoPizzas() {
		ControlPanel cp = new ControlPanel(Style.TOGO);
		assertEquals("0.0", "" + cp.getOrderTotal());
	}
	
	@Test
	public void testGetOrderTotalWithPizzas() {
		ControlPanel cp = new ControlPanel(Style.TOGO);
		int numPizzas = 1;
		cp.setNumPizzas(numPizzas);
		ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
		for(int i = 0; i < numPizzas; i++){
			Pizza pizza = new Pizza(Size.M);
			pizza.setSpecialRequests("NONE");
			pizza.setToppings(1);
			pizza.setDrink("Coke", Size.M);
			pizzas.add(pizza);
		}
		cp.setOrderTotal(pizzas);
		assertEquals("11.846999", "" + cp.getOrderTotal());
	}
}
