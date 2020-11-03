package calculadroa;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.layout.VBox;


public class calculo implements Initializable {
	
	
	@FXML
	private VBox view1;

	@FXML
	private TextField nombreText;
	
	
	@FXML
	private Button cero;
	@FXML
	private Button siete;
	@FXML
	private Button ocho;
	@FXML
	private Button cuatro;
	@FXML
	private Button cinco;

	@FXML
	private Button uno;
	@FXML
	private Button dos;
		
	@FXML
	private Button tres;
	@FXML
	private Button seis;
	@FXML
	private Button nueve;
	@FXML
	private Button punto;
	@FXML
	private Button ce;
	@FXML
	private Button por;

	@FXML
	private Button mas;
	@FXML
	private Button menos;
	
	@FXML
	private Button dividido;
	@FXML
	private Button igual;
	@FXML
	private Button c;

	private Calculadora modelo = new Calculadora ();
	
	
	
	
	public calculo() throws IOException {
	FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista.fxml"));
   loader.setController(this);
	
	loader.load();
	
	}
	
	public VBox getView() {
		return view1;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		uno.setOnAction(e -> Funo(e));
		dos.setOnAction(e -> Fdos(e));
		tres.setOnAction(e -> Ftres(e));
		cuatro.setOnAction(e -> Fcuatro(e));
		cinco.setOnAction(e -> Fcinco(e));
		seis.setOnAction(e -> Fseis(e));
		siete.setOnAction(e -> Fsiete(e));
		ocho.setOnAction(e -> Focho(e));
		nueve.setOnAction(e -> Fnueve(e));
		cero.setOnAction(e -> Fcero(e));
		
		c.setOnAction(e -> Fc(e));
		ce.setOnAction(e -> Fce(e));
		mas.setOnAction(e -> Fmas(e));
		menos.setOnAction(e -> Fmenos(e));
		por.setOnAction(e -> Fpor(e));
		dividido.setOnAction(e -> Fdividido(e));
		igual.setOnAction(e -> Figual(e));
		punto.setOnAction(e -> Fpunto(e));
		//nombreText.appendText(modelo.getPantalla());
	}

	private void Fpunto(ActionEvent e) {
		modelo.insertar(punto.getText().charAt(0));
		nombreText.setText(modelo.getPantalla());
	}

	private void Fce(ActionEvent e) {
		modelo.borrarTodo();
		nombreText.setText(modelo.getPantalla());
	}
	
	private void Fc(ActionEvent e) {
		modelo.borrar();
		nombreText.setText(modelo.getPantalla());
	}

	private void Figual(ActionEvent e) {
		modelo.operar(igual.getText().charAt(0));
		//nombreText.appendText(uno.getText() ) ;
		nombreText.setText(modelo.getPantalla());
	}

	private void Fmas (ActionEvent e) {
		modelo.operar(mas.getText().charAt(0));
	
		nombreText.setText(modelo.getPantalla());
	}
	private void Fmenos (ActionEvent e) {
		modelo.operar(menos.getText().charAt(0));
	
		nombreText.setText(modelo.getPantalla());
	}
	private void Fpor (ActionEvent e) {
		modelo.operar(por.getText().charAt(0));
	
		nombreText.setText(modelo.getPantalla());
	}
	private void Fdividido (ActionEvent e) {
		modelo.operar(dividido.getText().charAt(0));
	
		nombreText.setText(modelo.getPantalla());
	}

	private void Funo(ActionEvent e) {
		modelo.insertar(uno.getText().charAt(0));
		
		nombreText.setText(modelo.getPantalla());		
	}

	private void Fdos(ActionEvent e) {
		modelo.insertar(dos.getText().charAt(0));
		
		nombreText.setText(modelo.getPantalla());		
	}
	private void Ftres (ActionEvent e) {
		modelo.insertar(tres.getText().charAt(0));
		
		nombreText.setText(modelo.getPantalla());		
	}
		
	private void Fcuatro(ActionEvent e) {
		modelo.insertar(cuatro.getText().charAt(0));
		
		nombreText.setText(modelo.getPantalla());		
	}
	
	private void Fcinco(ActionEvent e) {
		modelo.insertar(cinco.getText().charAt(0));
		
		nombreText.setText(modelo.getPantalla());		
	}
	
	private void Fseis (ActionEvent e) {
		modelo.insertar(seis.getText().charAt(0));
		
		nombreText.setText(modelo.getPantalla());		
	}
		
	private void Fsiete(ActionEvent e) {
		modelo.insertar(siete.getText().charAt(0));
		
		nombreText.setText(modelo.getPantalla());		
	}
	
	private void Focho(ActionEvent e) {
		modelo.insertar(ocho.getText().charAt(0));
		
		nombreText.setText(modelo.getPantalla());		
	}
	
	private void Fnueve(ActionEvent e) {
		modelo.insertar(nueve.getText().charAt(0));
		
		nombreText.setText(modelo.getPantalla());		
	}
	
	private void Fcero(ActionEvent e) {
		modelo.insertar(cero.getText().charAt(0));
		
		nombreText.setText(modelo.getPantalla());		
	}
	
}
