import java.util.ArrayList;
import java.util.List;

public class Originator {
	private Boolean isBoatOnLeft;
	private List<ICrosser> rightBankCrossers=new ArrayList<ICrosser>();
	private List<ICrosser> leftBankCrossers=new ArrayList<ICrosser>();

   public void setState(List<ICrosser> rightBankCrossers, List<ICrosser> leftBankCrossers,
			boolean isBoatOnLeft){
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


   public Memento saveStateToMemento(){
      return new Memento(rightBankCrossers,leftBankCrossers,isBoatOnLeft);
   }

   public void getStateFromMemento(Memento memento){
	   isBoatOnLeft=memento.getStateBoat();
		rightBankCrossers=memento.getStateRight();
		leftBankCrossers=memento.getStateLeft();
   }
}
