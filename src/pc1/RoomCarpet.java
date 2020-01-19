package pc1;

public class RoomCarpet {
	private RoomDimension roomDimension;
	private double costOfTheCarpet;
	
	public RoomCarpet(RoomDimension roomDimension, double costOfTheCarpet) {
		super();
		this.roomDimension = roomDimension;
		this.costOfTheCarpet = costOfTheCarpet;
	}
	
	public double getTotalCostOfTheCarpet() {
		return costOfTheCarpet * roomDimension.getArea();
	}
	
	public String toString(){
	      String output = (roomDimension.toString() + "\n" + "Cost of carpet per square foot: $" + costOfTheCarpet + "\n" + "Total cost of carpet: $" + getTotalCostOfTheCarpet());
	      return output;
	    }
}
