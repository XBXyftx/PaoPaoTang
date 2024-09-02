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
 * �����Ǵ����࣬������ʾ���������С����������ǵ���¼��붯��
 * 
 * 
 * @author Frank.Chen
 * @version 1.5
 */
public class MainForm extends Application {
	
	/** �ӷ���˻�ȡ������10*10�������б�  **/
	private StarList mCurretStars = null;
	
	/** ��������ʾ�����ǵ����� **/
	private AnchorPane mStarForm = null;

	public static void show(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass()
					.getResource("/res/layout/main_layout.fxml"));

			// �������ּ��뵽��ͼ������
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);

			// ҳ�����ʱ�����¿�ʼ�µ����������ʱ���ʼ��������
			initGameStars(root);

			primaryStage.setTitle("����������-Popstar3");
			primaryStage.setResizable(false);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * ҳ�����ʱ�����¿�ʼ�µ����������ʱ���ʼ��������
	 * 
	 * @param root
	 *            �����ܲ���
	 * 
	 */
	private void initGameStars(AnchorPane root) {

		// ���ش�������ʾ�����ǵ�����
		/** ������: �ṩ **/
		mStarForm = (AnchorPane) root.lookup("#game_pane");

		// ��������������ҵ����
		/** ������: ���ṩ��ָ���ֲ�Ҫ��ѧԱ��� **/
		StarService starService =  new StarServiceImpl();
		//����03������´���

		// �������ô��������Ǵ���
		/** ������: ���ṩ��ָ���ֲ�Ҫ��ѧԱ��� **/
		mCurretStars = starService.createStars();

		// ѭ���������������ǣ��������Ƕ���Starת��Ϊ������ʾ�ؼ�Label
		if(mCurretStars != null)
			/** ������: ���ṩ��ָ���ֲ�Ҫ��ѧԱ��� **/
			for (int i = 0; i < mCurretStars.size(); i++) {
				// �������Ǽ�����ȡ��һ��������
				/** ������: ���ṩ��ָ���ֲ�Ҫ��ѧԱ��� **/
				Star star = mCurretStars.get(i);
	
				// ����������������ʾ�ؼ�Label
				/** ������: ���ṩ��ָ���ֲ��ṩԴ���벢������뺬�� **/
				Label starFrame = new Label();
				starFrame.setPrefWidth(48);
				starFrame.setPrefHeight(48);
	
				// ��ȡ�����Ƕ���Star��������
				/** ������: ���ṩ��ָ���ֲ�Ҫ��ѧԱ��� **/
				int row = star.getPosition().getRow();
				int col = star.getPosition().getColumn();
	
				// Ϊ��������ʾ�ؼ�Label����Ψһ��ʶID��ID����Ϊs+�к�+�кţ����磺s00,s01��
				/** ������: ���ṩ��ָ���ֲ��ṩԴ���벢������뺬�� **/
				starFrame.setId("s" + row + col);
				// �������ǵ�����λ�ñ�����������ʶ���������ڽ����е�λ�á�
				/** ������: ���ṩ��ָ���ֲ��ṩԴ���벢������뺬�� **/
				starFrame.setUserData(row + ";" + col);
				// ������������ʾ�ؼ�Label�ڽ���ĳ�������
				/** ������: ���ṩ��ָ���ֲ��ṩԴ���벢������뺬�� **/
				starFrame.setLayoutX(col * 48);
				starFrame.setLayoutY(row * 48);
	
				// ������������ʾ�ؼ�Label��ʾ���
				/** ������: ���ṩ��ָ���ֲ��ṩԴ���벢������뺬�� **/
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
	
				// �������Ǽ��뵽��������ʾ�����ǵ�����
				/** ������: ���ṩ��ָ���ֲ��ṩԴ���벢������뺬�� **/
				mStarForm.getChildren().add(starFrame);
			}

	}
}
