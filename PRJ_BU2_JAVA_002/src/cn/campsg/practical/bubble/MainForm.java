package cn.campsg.practical.bubble;


import cn.campsg.practical.bubble.entity.Star;
import cn.campsg.practical.bubble.entity.StarList;
import cn.campsg.practical.bubble.service.StarService;
import cn.campsg.practical.bubble.service.StarServiceImpl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 锟斤拷锟斤拷锟角达拷锟斤拷锟洁，锟斤拷锟斤拷锟斤拷示锟斤拷锟斤拷锟斤拷锟斤拷锟叫★拷锟斤拷锟斤拷锟斤拷锟斤拷锟角碉拷锟斤拷录锟斤拷攵拷锟�
 * 
 * 
 * @author Frank.Chen
 * @version 1.5
 */
public class MainForm extends Application {
	
	/** 锟接凤拷锟斤拷嘶锟饺★拷锟斤拷锟斤拷锟�10*10锟斤拷锟斤拷锟斤拷锟叫憋拷  **/
	private StarList mCurretStars = null;
	
	/** 锟斤拷锟斤拷锟斤拷锟斤拷示锟斤拷锟斤拷锟角碉拷锟斤拷锟斤拷 **/
	private AnchorPane mStarForm = null;

	public static void show(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass()
					.getResource("/res/layout/main_layout.fxml"));

			// 锟斤拷锟斤拷锟斤拷锟街硷拷锟诫到锟斤拷图锟斤拷锟斤拷锟斤拷
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);

			// 页锟斤拷锟斤拷锟绞憋拷锟斤拷锟斤拷驴锟绞硷拷碌锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷时锟斤拷锟绞硷拷锟斤拷锟斤拷锟斤拷锟�
			initGameStars(root);

			primaryStage.setTitle("锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷-Popstar3");
			primaryStage.setResizable(false);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 页锟斤拷锟斤拷锟绞憋拷锟斤拷锟斤拷驴锟绞硷拷碌锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷时锟斤拷锟绞硷拷锟斤拷锟斤拷锟斤拷锟�
	 * 
	 * @param root
	 *            锟斤拷锟斤拷锟杰诧拷锟斤拷
	 * 
	 */
	private void initGameStars(AnchorPane root) {

		// 锟斤拷锟截达拷锟斤拷锟斤拷锟斤拷示锟斤拷锟斤拷锟角碉拷锟斤拷锟斤拷
		/** 锟斤拷锟斤拷锟斤拷: 锟结供 **/
		mStarForm = (AnchorPane) root.lookup("#game_pane");

		// 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷业锟斤拷锟斤拷
		/** 锟斤拷锟斤拷锟斤拷: 锟斤拷锟结供锟斤拷指锟斤拷锟街诧拷要锟斤拷学员锟斤拷锟� **/
		StarService starService =  new StarServiceImpl();
		//锟斤拷锟斤拷03锟斤拷锟斤拷锟斤拷麓锟斤拷锟�

		// 锟斤拷锟斤拷锟斤拷锟矫达拷锟斤拷锟斤拷锟斤拷锟角达拷锟斤拷
		/** 锟斤拷锟斤拷锟斤拷: 锟斤拷锟结供锟斤拷指锟斤拷锟街诧拷要锟斤拷学员锟斤拷锟� **/
		mCurretStars = starService.createStars();

		// 循锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟角ｏ拷锟斤拷锟斤拷锟斤拷锟角讹拷锟斤拷Star转锟斤拷为锟斤拷锟斤拷锟斤拷示锟截硷拷Label
		if(mCurretStars != null)
			/** 锟斤拷锟斤拷锟斤拷: 锟斤拷锟结供锟斤拷指锟斤拷锟街诧拷要锟斤拷学员锟斤拷锟� **/
			for (int i = 0; i < mCurretStars.size(); i++) {
				// 锟斤拷锟斤拷锟斤拷锟角硷拷锟斤拷锟斤拷取锟斤拷一锟斤拷锟斤拷锟斤拷锟斤拷
				/** 锟斤拷锟斤拷锟斤拷: 锟斤拷锟结供锟斤拷指锟斤拷锟街诧拷要锟斤拷学员锟斤拷锟� **/
				Star star = mCurretStars.get(i);
	
				// 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷示锟截硷拷Label
				/** 锟斤拷锟斤拷锟斤拷: 锟斤拷锟结供锟斤拷指锟斤拷锟街诧拷锟结供源锟斤拷锟诫并锟斤拷锟斤拷锟斤拷牒拷锟� **/
				Label starFrame = new Label();
				starFrame.setPrefWidth(48);
				starFrame.setPrefHeight(48);
	
				// 锟斤拷取锟斤拷锟斤拷锟角讹拷锟斤拷Star锟斤拷锟斤拷锟斤拷锟斤拷
				/** 锟斤拷锟斤拷锟斤拷: 锟斤拷锟结供锟斤拷指锟斤拷锟街诧拷要锟斤拷学员锟斤拷锟� **/
				int row = star.getPosition().getRow();
				int col = star.getPosition().getColumn();
	
				// 为锟斤拷锟斤拷锟斤拷锟斤拷示锟截硷拷Label锟斤拷锟斤拷唯一锟斤拷识ID锟斤拷ID锟斤拷锟斤拷为s+锟叫猴拷+锟叫号ｏ拷锟斤拷锟界：s00,s01锟斤拷
				/** 锟斤拷锟斤拷锟斤拷: 锟斤拷锟结供锟斤拷指锟斤拷锟街诧拷锟结供源锟斤拷锟诫并锟斤拷锟斤拷锟斤拷牒拷锟� **/
				starFrame.setId("s" + row + col);
				// 锟斤拷锟斤拷锟斤拷锟角碉拷锟斤拷锟斤拷位锟矫憋拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷识锟斤拷锟斤拷锟斤拷锟斤拷锟节斤拷锟斤拷锟叫碉拷位锟矫★拷
				/** 锟斤拷锟斤拷锟斤拷: 锟斤拷锟结供锟斤拷指锟斤拷锟街诧拷锟结供源锟斤拷锟诫并锟斤拷锟斤拷锟斤拷牒拷锟� **/
				starFrame.setUserData(row + ";" + col);
				// 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷示锟截硷拷Label锟节斤拷锟斤拷某锟斤拷锟斤拷锟斤拷锟�
				/** 锟斤拷锟斤拷锟斤拷: 锟斤拷锟结供锟斤拷指锟斤拷锟街诧拷锟结供源锟斤拷锟诫并锟斤拷锟斤拷锟斤拷牒拷锟� **/
				starFrame.setLayoutX(col * 48);
				starFrame.setLayoutY(row * 48);
	
				// 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷示锟截硷拷Label锟斤拷示锟斤拷锟�
				/** 锟斤拷锟斤拷锟斤拷: 锟斤拷锟结供锟斤拷指锟斤拷锟街诧拷锟结供源锟斤拷锟诫并锟斤拷锟斤拷锟斤拷牒拷锟� **/
				switch (star.getType().value()) {
				case 0:
					starFrame.getStyleClass().add("blue_star");
					break;
				case 1:
					starFrame.getStyleClass().add("green_star");
					break;
				case 2:
					starFrame.getStyleClass().add("yellow_star");
					break;
				case 3:
					starFrame.getStyleClass().add("red_star");
					break;
				case 4:
					starFrame.getStyleClass().add("purple_star");
					break;
				}
	
				// 锟斤拷锟斤拷锟斤拷锟角硷拷锟诫到锟斤拷锟斤拷锟斤拷锟斤拷示锟斤拷锟斤拷锟角碉拷锟斤拷锟斤拷
				/** 锟斤拷锟斤拷锟斤拷: 锟斤拷锟结供锟斤拷指锟斤拷锟街诧拷锟结供源锟斤拷锟诫并锟斤拷锟斤拷锟斤拷牒拷锟� **/
				mStarForm.getChildren().add(starFrame);
			}

	}
}
