
package BagelLab;

public class BagelsOrderItem implements OrderItem {

	private double price;
	private int quantity;

	public BagelsOrderItem(double price) {
		this.price = price;
	}

	public BagelsOrderItem(double price2, int quantity2) {

		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getCost() {
		return (price * quantity);
	}
}
