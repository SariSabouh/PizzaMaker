package controller;

public class Pizza {
	public enum Size{S, M, L, XL};
	private float pizzaTotal;
	private int toppings;
	private String drink, specialRequests;
	
	public Pizza(Size size){
		switch(size){
		case S:
			pizzaTotal += 5.99;
			break;
		case M:
			pizzaTotal += 7.99;
			break;
		case L:
			pizzaTotal += 9.99;
			break;
		case XL:
			pizzaTotal += 12.99;
			break;
		}
	}
	
	public void setSpecialRequests(String specialRequest){
		this.specialRequests = specialRequest;
	}

	public int getToppings() {
		return toppings;
	}

	public void setToppings(int toppings) {
		this.toppings = toppings;
		switch(toppings){
		case 0:
			pizzaTotal += 0.00;
			break;
		case 1:
			pizzaTotal += 0.99;
			break;
		case 2:
			pizzaTotal += 1.99;
			break;
		case 3:
			pizzaTotal += 2.99;
			break;
		default:
			pizzaTotal += 4.99;
			break;
		}
	}

	public float getPizzaTotal() {
		if(specialRequests.contains("gluten") || specialRequests.contains("Gluten")){
			pizzaTotal += 2.99;
		}
		return pizzaTotal;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink, Size size) {
		this.drink = drink;
		switch(size){
		case M:
			pizzaTotal += 1.79;
			break;
		case L:
			pizzaTotal += 2.50;
			break;
		default: break;
		}
	}

	@Override
	public String toString() {
		return "Pizza:\n"
				+ "\tNumber of Toppings = " + toppings
				+ "\t\nDrink = " + drink
				+ "\t\nSpecial Requests = " + specialRequests
				+ "\t\nPizza Total = " + pizzaTotal + "\n\n";
	}
	
}
