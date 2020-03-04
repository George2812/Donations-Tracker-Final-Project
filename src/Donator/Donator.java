package Donator;

public class Donator {
	
	//Create the Donator's properties 
	private String name,surname,currency;
	private double amount;
	
	//Constructor 
	public Donator(String name, String surname, String currency, double amount) {
		this.name = name;
		this.surname = surname;
		this.currency = currency;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	

}
