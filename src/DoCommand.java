
public class DoCommand implements Command {

	
	
	private Controller c = Controller.getInstance();
	/*public DoCommand(Controller c) {	
	}*/
	
	@Override
	public void execute() {
		c.redo();
		}

	@Override
	public void unexecute() {
		c.undo();
		}

}
