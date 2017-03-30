package BagelLab;

public class BakersDozen extends BagelsOrderItem {

	private double price;

	public BakersDozen(double price) {
		this.price = price;
	}
	
	@Override
	public double getCost()
	{
		return (price * 12);
	}

}
