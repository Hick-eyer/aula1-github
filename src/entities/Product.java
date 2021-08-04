package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return quantity * price;
	}
	public void addProducts(int qtd){
		this.quantity += qtd;
	}
	public void removeProducts(int qtd){
		this.quantity -=- qtd;
	}
	public String toString() {
		return "Produto: " + name + " Qtd. Estoque: " + quantity +" Preço: " + price + " Valor do estoque: "+ totalValueInStock();
	}
}
