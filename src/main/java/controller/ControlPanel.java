package controller;

import java.util.ArrayList;

public class ControlPanel {
	
	private int numPizzas;
	public enum Style{TOGO, DINEIN, PICKUP};
	private float orderTotal;
	private String reciept;
	
	public ControlPanel(Style style){
		reciept = "Welcome to PizzaTown\n";
		switch(style){
		case TOGO:
			reciept += "TO-GO Order:\n";
			break;
		case PICKUP:
			reciept += "PICK-UP Order:\n";
			break;
		case DINEIN:
			reciept += "DINE-IN Order:\n";
			break;
		}
	}

	public void setNumPizzas(int numPizzas) {
		this.numPizzas = numPizzas;
	}

	public float setOrderTotal(ArrayList<Pizza> pizzas) {
		for(int i = 0; i < numPizzas; i++){
			orderTotal = pizzas.get(i).getPizzaTotal();
			reciept += pizzas.get(i).toString();
		}
		orderTotal += orderTotal*0.1;
		return orderTotal;
	}
	
	public float getOrderTotal(){
		return orderTotal;
	}

	public String getReciept() {
		reciept += "Order Total" + orderTotal;
		reciept += "\n Enjoy your meal!!\nThank you!";
		return reciept;
	}
}
