import java.util.ArrayList;
import java.util.List;

public class Memento {
private List<ICrosser> boatRiders;
private List<ICrosser> rightBankCrossers;
private List<ICrosser> leftBankCrossers;
public Memento(List<ICrosser> rightBankCrossers, List<ICrosser> leftBankCrossers,
		List<ICrosser> boatRiders) {
	this.boatRiders=boatRiders;
	this.rightBankCrossers=rightBankCrossers;
	this.leftBankCrossers=leftBankCrossers;
	
}
public List<ICrosser> getStateBoat() {
	return boatRiders;
}
public List<ICrosser> getStateLeft() {
	return leftBankCrossers;
}
public List<ICrosser> getStateRight() {
	return rightBankCrossers;
}



}
