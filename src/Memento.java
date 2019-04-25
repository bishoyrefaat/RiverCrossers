import java.util.ArrayList;
import java.util.List;

public class Memento {
//private List<ICrosser> boatRiders;
	private Boolean isBoatOnLeft;
private List<ICrosser> rightBankCrossers;
private List<ICrosser> leftBankCrossers;
public Memento(List<ICrosser> rightBankCrossers, List<ICrosser> leftBankCrossers,
		boolean isBoatOnLeft) {
	this.isBoatOnLeft=isBoatOnLeft;
	this.rightBankCrossers=rightBankCrossers;
	this.leftBankCrossers=leftBankCrossers;
	
}
public boolean getStateBoat() {
	return isBoatOnLeft;
}
public List<ICrosser> getStateLeft() {
	return leftBankCrossers;
}
public List<ICrosser> getStateRight() {
	return rightBankCrossers;
}



}
