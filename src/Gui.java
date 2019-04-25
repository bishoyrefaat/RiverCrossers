import java.net.Authenticator;
import static javafx.application.Application.launch;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Queue;
import java.util.LinkedList;


public class Gui extends Application{

	public static void main(String[] args) {
		launch(args);

	}
	
	Stage window=new Stage();

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.window=primaryStage;
		primaryStage.setTitle("River Crossing IQ Puzzel");
		Pane layout = new Pane();
		//StackPane layout = new StackPane();
		
		Image WelcomeImage = new Image("file:Welcome.jpg");
        ImageView wi = new ImageView();
        wi.setImage(WelcomeImage);
        wi.setFitHeight(500);
		wi.setFitWidth(800);
        layout.getChildren().add(wi);
		        
        
		Button menu = new Button ("Main Menu");
        layout.getChildren().add(menu);
        menu.setLayoutX(374);
        menu.setLayoutY(238);
		
        menu.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	window.setScene(mainMenu());
            	}
            });
        
        /*Label welcomeQuote= new Label("Welcome to River Crossing IQ Puzzel");
        layout.getChildren().add(welcomeQuote);*/

        Scene welcome=new Scene(layout,800,500);
        window.setScene(welcome);
        window.setResizable(false);
        window.show();
		
	}
	
public Scene mainMenu(){
	
        Button Start = new Button("Start Game");
        Button Continue= new Button("Continue Game");
        Button stories= new Button("Choose a Story");
        Image WelcomeImage = new Image("file:mainmenue.jpg");
        ImageView wi = new ImageView();
        wi.setImage(WelcomeImage);
        wi.setFitHeight(500);
		wi.setFitWidth(800);
        
        
        Pane mainMenu=new Pane();
        mainMenu.getChildren().add(wi);
        mainMenu.getChildren().add(Start);
        Start.setLayoutX(385);
        Start.setLayoutY(200);
        mainMenu.getChildren().add(Continue);
        Continue.setLayoutX(374);
        Continue.setLayoutY(238);
        mainMenu.getChildren().add(stories);
        stories.setLayoutX(376);
        stories.setLayoutY(276);
        
        
        
        Start.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
            	window.setScene(game());
            	}
            });
        
        
        Scene home=new Scene(mainMenu,800,500);
        window.setScene(home);
        window.show();
        return home;
    }

public Scene game(){
	
	Button sail= new Button("Sail");
	sail.setLayoutX(374);
	sail.setLayoutY(14);
	
	Label press= new Label("Press Sail to cross the river->");
	press.setLayoutX(220);
	press.setLayoutY(18);
	
	
    Image WelcomeImage = new Image("file:RiverBank.jpg");
    ImageView wi = new ImageView();
    wi.setImage(WelcomeImage);
    wi.setFitHeight(500);
	wi.setFitWidth(800);
	
	Image Raft = new Image("file:Raft.png");
    ImageView raft = new ImageView();
    raft.setImage(Raft);
    raft.setFitHeight(142);
    raft.setFitWidth(277);
    raft.setLayoutX(274);
    raft.setLayoutY(364);
    
    Image Farmer = new Image("file:Farmer.gif");
    ImageView farmer = new ImageView();
    farmer.setImage(Farmer);
    farmer.setFitHeight(200);
    farmer.setFitWidth(114);
    farmer.setLayoutX(89);
    farmer.setLayoutY(191);
    
    TranslateTransition trans = new TranslateTransition() ;
	trans.setNode(farmer);
    farmer.setOnMouseClicked((MouseEvent e) -> {
		
		
		trans.setDuration(Duration.seconds(1));
		trans.setByX(228);
		trans.setByY(28);
		trans.play();
		
    });
    
    Image Sheep = new Image("file:Sheep.gif");
    ImageView sheep = new ImageView();
    sheep.setImage(Sheep);
    sheep.setFitHeight(188);
    sheep.setFitWidth(144);
    sheep.setLayoutX(0);
    sheep.setLayoutY(312);
    
    TranslateTransition trans2 = new TranslateTransition() ;
	trans2.setNode(sheep);
	sheep.setOnMouseClicked((MouseEvent e) -> {
		
		
		trans2.setDuration(Duration.seconds(1));
		trans2.setByX(400);
		trans2.setByY(-15);
		trans2.play();
		
    });
	
    Image Plant = new Image("file:Plant.gif");
    ImageView plant = new ImageView();
    plant.setImage(Plant);
    plant.setFitHeight(81);
    plant.setFitWidth(144);
    plant.setLayoutX(131);
    plant.setLayoutY(419);
    
    TranslateTransition trans3 = new TranslateTransition() ;
	trans3.setNode(plant);
	plant.setOnMouseClicked((MouseEvent e) -> {
		
		
		trans3.setDuration(Duration.seconds(1));
		trans3.setByX(269);
		trans3.setByY(-24);
		trans3.play();
		
    });
    
	Pane game=new Pane();
	
	game.getChildren().add(wi);
	game.getChildren().add(press);
	game.getChildren().add(sail);
	game.getChildren().add(raft);
	game.getChildren().add(farmer);
	game.getChildren().add(sheep);
	game.getChildren().add(plant);
	
	
	Scene gameveiw=new Scene(game,800,500);
    window.setScene(gameveiw);
    window.show();
    return gameveiw;
}

}

/*
- Levels menu at the beginning of the game, enables the user to choose which
	story to play
- Label showing score for the current game, the score is the number of boat
	crosses
- Two river banks with characters on them, addition to the boat
- User can select any character to ride the boat
- Undo & Redo for all user sails (i.e. complete sail from one bank to another)
- User can save the game, and load it any time later
- New game, reset, and exit game options
- Show instructions of the current level
- Showing alert when the user move is invalid*/




















