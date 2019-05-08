package TestMain;

import java.rmi.RemoteException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import model.ServPremium;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TestClientPremium extends Application {

	@Override
	public void start(Stage primaryStage) {
		GridPane root = new GridPane();
		root.setPadding(new Insets(15, 15, 15, 15));
		root.setVgap(10);
		root.setHgap(10);

		Text title = new Text("Convertesseur !");
		Label labelMontant = new Label("le montant ");
		Label labelResult = new Label("Result : ");
		TextField textMontant = new TextField();
		Button send = new Button("Send");

		root.add(title, 0, 0, 2, 1);
		root.add(labelMontant, 0, 2);
		root.add(labelResult, 0, 3);
		root.add(textMontant, 0, 2);
		root.add(send, 1, 2);

		send.setOnAction((ActionEvent e) -> {
			Double montant = Double.parseDouble(textMontant.getText().toString());
			try {
				Context ctx = new InitialContext();
				ServPremium sc = (ServPremium) ctx.lookup("rmi://localhost:1099/ClientImpObject");
				System.out.println("Client start");
//				System.out.println(sc.echangeDhEr(montant));
				System.out.println("Client finish");
				labelResult.setText("Result : "+ montant +" Dh = "+ sc.echangeDolEr(montant)+" Er ");
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (NamingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		Scene scene = new Scene(root);
		primaryStage.setTitle("Converteseur 1.01 ");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);
	}

	public static void main(String[] args) {
		launch(args);
	}
}