package application;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Category {
	Scene scene1;
	Stage currentStage;
	Stage s;
	Scene sc;

	Button back;
	Button lan_button;
	Button math_button;
	Button math_in_button;
	Button lg_button;
	Button lg_in_button;
	Button iq_button;
	Button iq_in_button;
	Button ach_button;
	Button ach_in_button;

	Text Myanmar;
	Text English;
	Text Lan;
	Text Math;
	Text Logic;
	Text IQ;
	Text Ach;

	Image Lang = new Image("lang.png");
	Image Arrow = new Image("arrow.png");
	Image Boy = new Image("boy.png");
	Image Girl = new Image("girl.png");
	Image Flat = new Image("flat.png");
	Image G_board = new Image("greenBoard.png");
	Image CatText = new Image("catText.png");

	ImageView langText = new ImageView(Lang);
	ImageView backArrow = new ImageView(Arrow);
	ImageView boyStand = new ImageView(Boy);
	ImageView girlStand = new ImageView(Girl);
	ImageView flat = new ImageView(Flat);
	ImageView gBoard = new ImageView(G_board);
	ImageView catText = new ImageView(CatText);

	StackPane root;

	boolean languageChange;
	boolean nonesense = false;

	public void switchToScene1(ActionEvent event, int SelectValue, boolean lanSwap) {
		languageChange = lanSwap;

		root = new StackPane();
		root.setStyle("-fx-background-color: #F79630");

		elements();
		mathematics();
		logic();
		iq_test();
		achievement();
		lan_change();
		// Retrieve the stage from the event source
		currentStage = (Stage) ((Button) event.getSource()).getScene().getWindow();

		scene1 = new Scene(root, currentStage.getWidth(), currentStage.getHeight());
		scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		currentStage.setScene(scene1);
		currentStage.show();
	}

	private void back() {
		s = currentStage;
		currentStage.setScene(Main.scene);
		currentStage.setHeight(s.getHeight());
		currentStage.setWidth(s.getWidth());
		currentStage.show();
	}

	private void elements() {
		back = new Button();
		back.getStyleClass().add("lets_start");
		back.setPrefSize(60, 60);
		back.setOnAction(a -> back());
		backArrow.setFitWidth(40);
		backArrow.setFitHeight(30);

		back.setGraphic(backArrow);
		StackPane.setAlignment(back, Pos.TOP_LEFT);
		StackPane.setMargin(back, new Insets(30, 0, 0, 30));// top right bottom left

		lan_button = new Button();
		lan_button.setPrefSize(78, 39);
		lan_button.getStyleClass().add("lets_start");
		lan_button.setOnAction(e -> lan_click());
		StackPane.setAlignment(lan_button, Pos.TOP_LEFT);
		StackPane.setMargin(lan_button, new Insets(100, 0, 0, 210));

		flat.setFitWidth(128);
		flat.setFitHeight(30);
		StackPane.setAlignment(flat, Pos.BOTTOM_LEFT);
		StackPane.setMargin(flat, new Insets(0, 0, 125, 25));

		boyStand.setFitWidth(102);
		boyStand.setFitHeight(211);
		StackPane.setAlignment(boyStand, Pos.BOTTOM_LEFT);
		StackPane.setMargin(boyStand, new Insets(0, 0, 140, 35));

		girlStand.setFitWidth(111);
		girlStand.setFitHeight(211);
		StackPane.setAlignment(girlStand, Pos.CENTER_RIGHT);
		StackPane.setMargin(girlStand, new Insets(0, 25, 0, 0));

		gBoard.setFitWidth(490);
		gBoard.setFitHeight(370);
		StackPane.setAlignment(gBoard, Pos.CENTER);
		StackPane.setMargin(gBoard, new Insets(0, 450, 0, 0));

		root.getChildren().addAll(lan_button, back, flat, boyStand, girlStand, gBoard);
	}

	void lan_click() {
		languageChange = !languageChange;
		lan_change();
	}

	private void mathematics() {
		math_in_button = new Button();
		math_in_button.setPrefSize(410, 65);
		math_in_button.getStyleClass().add("category_in_button");

		math_button = new Button();
		math_button.setPrefSize(470, 105);
		math_button.getStyleClass().add("category_button");
		math_button.setGraphic(math_in_button);
		math_button.setOnMouseEntered(e -> {
			math_in_button.setStyle("-fx-background-color: WHITE;");
			Math.setFill(Color.BLACK);
		});
		math_button.setOnMouseExited(e -> {
			math_in_button.setStyle("-fx-background-color: BLACK;");
			Math.setFill(Color.WHITE);
		});
		StackPane.setAlignment(math_button, Pos.CENTER_RIGHT);
		StackPane.setMargin(math_button, new Insets(0, 150, 300, 0));

		root.getChildren().addAll(math_button);
	}

	private void logic() {
		lg_in_button = new Button();
		lg_in_button.setPrefSize(410, 65);
		lg_in_button.getStyleClass().add("category_in_button");

		lg_button = new Button();
		lg_button.setPrefSize(470, 105);
		lg_button.getStyleClass().add("category_button");
		lg_button.setGraphic(lg_in_button);
		lg_button.setOnMouseEntered(e -> {
			lg_in_button.setStyle("-fx-background-color: WHITE;");
			Logic.setFill(Color.BLACK);
		});
		lg_button.setOnMouseExited(e -> {
			lg_in_button.setStyle("-fx-background-color: BLACK;");
			Logic.setFill(Color.WHITE);
		});
		StackPane.setAlignment(lg_button, Pos.CENTER_RIGHT);
		StackPane.setMargin(lg_button, new Insets(0, 150, 25, 0));

		root.getChildren().addAll(lg_button);
	}

	private void iq_test() {
		iq_in_button = new Button();
		iq_in_button.setPrefSize(410, 65);
		iq_in_button.getStyleClass().add("category_in_button");

		iq_button = new Button();
		iq_button.setPrefSize(470, 105);
		iq_button.getStyleClass().add("category_button");
		iq_button.setGraphic(iq_in_button);
		iq_button.setOnMouseEntered(e -> {
			iq_in_button.setStyle("-fx-background-color: WHITE;");
			IQ.setFill(Color.BLACK);
		});
		iq_button.setOnMouseExited(e -> {
			iq_in_button.setStyle("-fx-background-color: BLACK;");
			IQ.setFill(Color.WHITE);
		});
		StackPane.setAlignment(iq_button, Pos.CENTER_RIGHT);
		StackPane.setMargin(iq_button, new Insets(0, 150, -250, 0));

		root.getChildren().addAll(iq_button);
	}

	private void achievement() {
		ach_in_button = new Button();
		ach_in_button.setPrefSize(410, 65);
		ach_in_button.getStyleClass().add("category_in_button");

		ach_button = new Button();
		ach_button.setPrefSize(470, 105);
		ach_button.getStyleClass().add("category_button");
		ach_button.setGraphic(ach_in_button);
		ach_button.setOnMouseEntered(e -> {
			ach_in_button.setStyle("-fx-background-color: WHITE;");
			Ach.setFill(Color.BLACK);
		});
		ach_button.setOnMouseExited(e -> {
			ach_in_button.setStyle("-fx-background-color: BLACK;");
			Ach.setFill(Color.WHITE);
		});
		StackPane.setAlignment(ach_button, Pos.CENTER_RIGHT);
		StackPane.setMargin(ach_button, new Insets(0, 150, -525, 0));

		root.getChildren().addAll(ach_button);
	}

	private void lan_change() {
		if (languageChange) {
			langText.setVisible(false);

			Lan = new Text("Language");
			Font lan_font = Font.loadFont(getClass().getResourceAsStream("/PoppinB.ttf"), 20);
			Lan.setFont(lan_font);
			Lan.setFill(Color.WHITE);
			StackPane.setAlignment(Lan, Pos.TOP_LEFT);
			StackPane.setMargin(Lan, new Insets(105, 0, 0, 90));

			English = new Text("ENG");
			Font English_font = Font.loadFont(getClass().getResourceAsStream("/PoppinB.ttf"), 20);
			English.setFont(English_font);
			English.setFill(Color.WHITE);
			lan_button.setGraphic(English);

			Math = new Text("MATHEMATICS");
			Font Mathematics_font = Font.loadFont(getClass().getResourceAsStream("/Poppin.ttf"), 23);
			Math.setFont(Mathematics_font);
			Math.setFill(Color.WHITE);
			math_in_button.setGraphic(Math);

			Logic = new Text("LOGIC");
			Logic.setFont(Mathematics_font);
			Logic.setFill(Color.WHITE);
			lg_in_button.setGraphic(Logic);

			IQ = new Text("IQ");
			IQ.setFont(Mathematics_font);
			IQ.setFill(Color.WHITE);
			iq_in_button.setGraphic(IQ);

			Ach = new Text("ACHIEVEMENT");
			Ach.setFont(Mathematics_font);
			Ach.setFill(Color.WHITE);
			ach_in_button.setGraphic(Ach);

			catText = new ImageView(CatText);
			catText.setFitWidth(366);
			catText.setFitHeight(271);
			StackPane.setAlignment(catText, Pos.CENTER);
			StackPane.setMargin(catText, new Insets(0, 450, 0, 0));

			root.getChildren().addAll(Lan, catText);
			nonesense = true;
		} else {
			if (nonesense == true) {
				Lan.setVisible(false);
				Math.setVisible(false);
				Logic.setVisible(false);
				IQ.setVisible(false);
				Ach.setVisible(false);
				catText.setVisible(false);
			}
			langText = new ImageView(Lang);
			langText.setFitWidth(130);
			langText.setFitHeight(20);
			StackPane.setAlignment(langText, Pos.TOP_LEFT);
			StackPane.setMargin(langText, new Insets(110, 0, 0, 70));

			Myanmar = new Text("Myan");
			Font English_font = Font.loadFont(getClass().getResourceAsStream("/PoppinB.ttf"), 20);
			Myanmar.setFont(English_font);
			Myanmar.setFill(Color.WHITE);
			lan_button.setGraphic(Myanmar);

			root.getChildren().addAll(langText);
		}
	}
}
