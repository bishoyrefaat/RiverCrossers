import java.util.ArrayList;
import java.util.List;

public class Originator {
	private List<ICrosser> boatRiders=new ArrayList<ICrosser>();
	private List<ICrosser> rightBankCrossers=new ArrayList<ICrosser>();
	private List<ICrosser> leftBankCrossers=new ArrayList<ICrosser>();

   public void setState(List<ICrosser> rightBankCrossers, List<ICrosser> leftBankCrossers,
			List<ICrosser> boatRiders){
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


   public Memento saveStateToMemento(){
      return new Memento(rightBankCrossers,leftBankCrossers,boatRiders);
   }

   public void getStateFromMemento(Memento memento){
       boatRiders=memento.getStateBoat();
		rightBankCrossers=memento.getStateRight();
		leftBankCrossers=memento.getStateLeft();
   }
}
