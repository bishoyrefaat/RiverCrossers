import java.util.ArrayList;
import java.util.List;



public class Controller implements IRiverCrossingController{
	private List<ICrosser> boatRiders=new ArrayList<ICrosser>();
	private List<ICrosser> rightBankCrossers=new ArrayList<ICrosser>();
	private List<ICrosser> leftBankCrossers=new ArrayList<ICrosser>();
	private boolean isbBoatOnLeft=true;
	private int CrossCount=0;
	
	 private static Controller A;
	 private ICrossingStrategy stra;
	 private Controller  () {}
	 public static Controller  getInstance() {
		 if (A == null)
			 A = new Controller  ();
		 return A; }
	
	
	
	
	
	@Override
	public void newGame(ICrossingStrategy gameStrategy) {
		stra=gameStrategy;
		
	}

	@Override
	public void resetGame() {
		
		CrossCount=0;
	}

	@Override
	public String[] getInstructions() {
		return stra.getInstructions();
	}

	@Override
	public List<ICrosser> getCrossersOnRightBank() {
		
		return rightBankCrossers;
	}

	@Override
	public List<ICrosser> getCrossersOnLeftBank() {
		
		return leftBankCrossers;
	}

	@Override
	public boolean isBoatOnTheLeftBank() {
		return isbBoatOnLeft;
	}

	@Override
	public int getNumberOfSails() {
		return CrossCount;
	}

	
	@Override
	public boolean canMove(List<ICrosser> crossers, boolean fromLeftToRightBank) {
		boolean locala,localb;
		/*if(fromLeftToRightBank)
		locala=stra.isValid(rightBankCrossers, leftBankCrossers , crossers);
		localb=stra.isValid(rightBankCrossers, leftBankCrossers , crossers);*/
	
		return false;
	}

	public void doMove(List<ICrosser> crossers, boolean fromLeftToRightBank) {
		
	}
	@Override
	public boolean canUndo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canRedo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<List<ICrosser>> solveGame() {
		// TODO Auto-generated method stub
		return null;
	}

}
