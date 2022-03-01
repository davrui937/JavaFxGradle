package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

public class Ventana1Controller {

	String efecto;
	ArrayList <Pokemon> listapokemon = new ArrayList<>();
	Pokemon pokemon1 = new Pokemon(65,"Reshiram",200,200, new Image(new FileInputStream(".\\src\\main\\resources\\reshiram.png")), new Image(new FileInputStream(".\\src\\main\\resources\\reshiramespalda.gif")),calcularestado(),efecto);
	Pokemon pokemon2 = new Pokemon(47,"Banano",200,200,new Image(new FileInputStream(".\\src\\main\\resources\\banano.png")),new Image(new FileInputStream(".\\src\\main\\resources\\bananoespalda.gif")),calcularestado(),efecto);
	Pokemon pokemon3 = new Pokemon(32,"Macaco",200,200,new Image(new FileInputStream(".\\src\\main\\resources\\primeape.png")),new Image(new FileInputStream(".\\src\\main\\resources\\primeapeespalda.gif")),calcularestado(),efecto);
	Pokemon pokemon4 = new Pokemon(84,"Infernape",200,200,new Image(new FileInputStream(".\\src\\main\\resources\\infernape.png")),new Image(new FileInputStream(".\\src\\main\\resources\\infernapeespalda.gif")),calcularestado(),efecto);
	Pokemon pokemon5 = new Pokemon(14,"Rillaboom",200,200,new Image(new FileInputStream(".\\src\\main\\resources\\rillaboom.png")),new Image(new FileInputStream(".\\src\\main\\resources\\rillaboomespalda.gif")),calcularestado(),efecto);
	Pokemon pokemon6 = new Pokemon(45,"Slaking",200,200,new Image(new FileInputStream(".\\src\\main\\resources\\slaking.png")),new Image(new FileInputStream(".\\src\\main\\resources\\slakingespalda.gif")),calcularestado(),efecto);


	ArrayList <Pokemon> listaenemigos = new ArrayList<>();
	Pokemon enemigo1 = new Pokemon(65,"Abomasnow",100,100, new Image(new FileInputStream(".\\src\\main\\resources\\abomasnow.gif")), new Image(new FileInputStream(".\\src\\main\\resources\\reshiramespalda.gif")),null,null);
	Pokemon enemigo2 = new Pokemon(47,"Avalugg",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\avalugg.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\bananoespalda.gif")),null,null);
	Pokemon enemigo3 = new Pokemon(32,"Glaceon",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\glaceon.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\primeapeespalda.gif")),null,null);
	Pokemon enemigo4 = new Pokemon(84,"Weavile",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\weavile.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\infernapeespalda.gif")),null,null);
	Pokemon enemigo5 = new Pokemon(14,"Cloyster",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\cloyster.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\rillaboomespalda.gif")),null,null);

	String estado;
	Pokemon seleccion=null;
	@FXML
	Button botoncontinuar;


	//Primer Pokemon
	@FXML
	AnchorPane pok00;
	@FXML
	Label nombre00;
	@FXML
	Label nivel00;
	@FXML
	ProgressBar barravida00;
	@FXML
	Label vida00;
	@FXML
	ImageView imagen00;
	@FXML
	ImageView estadopok1;

	//Segundo Pokemon
	@FXML
	AnchorPane pok10;
	@FXML
	Label nombre10;
	@FXML
	Label nivel10;
	@FXML
	ProgressBar barravida10;
	@FXML
	Label vida10;
	@FXML
	ImageView imagen10;
	@FXML
	ImageView estadopok2;

	//Tercer Pokemon
	@FXML
	AnchorPane pok20;
	@FXML
	Label nombre20;
	@FXML
	Label nivel20;
	@FXML
	ProgressBar barravida20;
	@FXML
	Label vida20;
	@FXML
	ImageView imagen20;
	@FXML
	ImageView estadopok3;

	//Cuarto Pokemon
	@FXML
	AnchorPane pok01;
	@FXML
	Label nombre01;
	@FXML
	Label nivel01;
	@FXML
	ProgressBar barravida01;
	@FXML
	Label vida01;
	@FXML
	ImageView imagen01;
	@FXML
	ImageView estadopok4;


	//Quinto Pokemon
	@FXML
	AnchorPane pok11;
	@FXML
	Label nombre11;
	@FXML
	Label nivel11;
	@FXML
	ProgressBar barravida11;
	@FXML
	Label vida11;
	@FXML
	ImageView imagen11;
	@FXML
	ImageView estadopok5;

	//Sexto Pokemon
	@FXML
	AnchorPane pok21;
	@FXML
	Label nombre21;
	@FXML
	Label nivel21;
	@FXML
	ProgressBar barravida21;
	@FXML
	Label vida21;
	@FXML
	ImageView imagen21;
	@FXML
	ImageView estadopok6;

	public Ventana1Controller() throws FileNotFoundException {
	}

	@FXML
	private void initialize(){
		listapokemon.add(pokemon1);
		listapokemon.add(pokemon2);
		listapokemon.add(pokemon3);
		listapokemon.add(pokemon4);
		listapokemon.add(pokemon5);
		listapokemon.add(pokemon6);

		if(enemigo1.getVidaact()>0){listaenemigos.add(enemigo1);}
		if(enemigo2.getVidaact()>0){listaenemigos.add(enemigo2);}
		if(enemigo3.getVidaact()>0){listaenemigos.add(enemigo3);}
		if(enemigo4.getVidaact()>0){listaenemigos.add(enemigo4);}
		if(enemigo5.getVidaact()>0){listaenemigos.add(enemigo5);}

		actualizarpokemon();

	}


	@FXML
	private void clickpokemon00(){
		botonmostrar();
		pok00.setStyle("-fx-background-color: #A99DB0");
		pok10.setStyle("-fx-background-color: #7D6A87");
		pok20.setStyle("-fx-background-color: #7D6A87");
		pok01.setStyle("-fx-background-color: #7D6A87");
		pok11.setStyle("-fx-background-color: #7D6A87");
		pok21.setStyle("-fx-background-color: #7D6A87");
		seleccion=pokemon1;
		if(pokemon1.getVidaact()==0){showAlert(new Alert(Alert.AlertType.ERROR));quitarclick();}
		}

	@FXML
	private void clickpokemon10(){
		botonmostrar();
		pok10.setStyle("-fx-background-color: #A99DB0");
		pok00.setStyle("-fx-background-color: #7D6A87");
		pok20.setStyle("-fx-background-color: #7D6A87");
		pok01.setStyle("-fx-background-color: #7D6A87");
		pok11.setStyle("-fx-background-color: #7D6A87");
		pok21.setStyle("-fx-background-color: #7D6A87");
		seleccion=pokemon2;
		if(pokemon2.getVidaact()==0){showAlert(new Alert(Alert.AlertType.ERROR));quitarclick();}
	}

	@FXML
	private void clickpokemon20(){
		botonmostrar();
		pok20.setStyle("-fx-background-color: #A99DB0");
		pok10.setStyle("-fx-background-color: #7D6A87");
		pok00.setStyle("-fx-background-color: #7D6A87");
		pok01.setStyle("-fx-background-color: #7D6A87");
		pok11.setStyle("-fx-background-color: #7D6A87");
		pok21.setStyle("-fx-background-color: #7D6A87");
		seleccion=pokemon3;
		if(pokemon3.getVidaact()==0){showAlert(new Alert(Alert.AlertType.ERROR));quitarclick();}
	}

	@FXML
	private void clickpokemon01(){
		botonmostrar();
		pok01.setStyle("-fx-background-color: #A99DB0");
		pok10.setStyle("-fx-background-color: #7D6A87");
		pok20.setStyle("-fx-background-color: #7D6A87");
		pok00.setStyle("-fx-background-color: #7D6A87");
		pok11.setStyle("-fx-background-color: #7D6A87");
		pok21.setStyle("-fx-background-color: #7D6A87");
		seleccion=pokemon4;
		if(pokemon4.getVidaact()==0){showAlert(new Alert(Alert.AlertType.ERROR));quitarclick();}
	}

	@FXML
	private void clickpokemon11(){
		botonmostrar();
		pok11.setStyle("-fx-background-color: #A99DB0");
		pok10.setStyle("-fx-background-color: #7D6A87");
		pok20.setStyle("-fx-background-color: #7D6A87");
		pok01.setStyle("-fx-background-color: #7D6A87");
		pok00.setStyle("-fx-background-color: #7D6A87");
		pok21.setStyle("-fx-background-color: #7D6A87");
		seleccion=pokemon5;
		if(pokemon5.getVidaact()==0){showAlert(new Alert(Alert.AlertType.ERROR));quitarclick();}
	}

	@FXML
	private void clickpokemon21(){
		botonmostrar();
		pok21.setStyle("-fx-background-color: #A99DB0");
		pok10.setStyle("-fx-background-color: #7D6A87");
		pok20.setStyle("-fx-background-color: #7D6A87");
		pok01.setStyle("-fx-background-color: #7D6A87");
		pok11.setStyle("-fx-background-color: #7D6A87");
		pok00.setStyle("-fx-background-color: #7D6A87");
		seleccion=pokemon6;
		if(pokemon6.getVidaact()==0){showAlert(new Alert(Alert.AlertType.ERROR));quitarclick();}
	}

	public void quitarclick(){
		pok21.setStyle("-fx-background-color: #7D6A87");
		pok10.setStyle("-fx-background-color: #7D6A87");
		pok20.setStyle("-fx-background-color: #7D6A87");
		pok01.setStyle("-fx-background-color: #7D6A87");
		pok11.setStyle("-fx-background-color: #7D6A87");
		pok00.setStyle("-fx-background-color: #7D6A87");
		botonocultar();

	}

	private void botonmostrar(){
		botoncontinuar.setVisible(true);
	}
	public Image calcularestado() throws FileNotFoundException {
		int aux= (int) (Math.random()*3)+1;
		if (aux==1){
			efecto="fuego";
			return new Image(new FileInputStream(".\\src\\main\\resources\\fuego.png"));
		}else if(aux==2){
			efecto="veneno";
			return new Image(new FileInputStream(".\\src\\main\\resources\\veneno.png"));
		}else{
			efecto="frio";
			return new Image(new FileInputStream(".\\src\\main\\resources\\frio.png"));
		}
	}

	public void actualizarpokemon(){
		//PRIMER POKEMON
		nombre00.setText(pokemon1.getNombre());
		String NIVELAUX = "Nv ";
		nivel00.setText(NIVELAUX +pokemon1.getNivel());
		barravida00.setProgress(((double) pokemon1.getVidaact()/pokemon1.getVidamax()));
		vida00.setText(pokemon1.getVidaact()+"/"+ pokemon1.getVidamax());
		imagen00.setImage(pokemon1.getImagen());
		estadopok1.setImage(pokemon1.getEstado());

		//SEGUNDO POKEMON
		nombre10.setText(pokemon2.getNombre());
		nivel10.setText(NIVELAUX +pokemon2.getNivel());
		barravida10.setProgress(((double) pokemon2.getVidaact()/pokemon2.getVidamax()));
		vida10.setText(pokemon2.getVidaact()+"/"+ pokemon2.getVidamax());
		imagen10.setImage(pokemon2.getImagen());
		estadopok2.setImage(pokemon2.getEstado());


		//TERCERO POKEMON
		nombre20.setText(pokemon3.getNombre());
		nivel20.setText(NIVELAUX +pokemon3.getNivel());
		barravida20.setProgress(((double) pokemon3.getVidaact()/pokemon3.getVidamax()));
		vida20.setText(pokemon3.getVidaact()+"/"+ pokemon3.getVidamax());
		imagen20.setImage(pokemon3.getImagen());
		estadopok3.setImage(pokemon3.getEstado());

		//CUARTO POKEMON
		nombre01.setText(pokemon4.getNombre());
		nivel01.setText(NIVELAUX +pokemon4.getNivel());
		barravida01.setProgress(((double) pokemon4.getVidaact()/pokemon4.getVidamax()));
		vida01.setText(pokemon4.getVidaact()+"/"+ pokemon4.getVidamax());
		imagen01.setImage(pokemon4.getImagen());
		estadopok4.setImage(pokemon4.getEstado());


		//QUINTO POKEMON
		nombre11.setText(pokemon5.getNombre());
		nivel11.setText(NIVELAUX +pokemon5.getNivel());
		barravida11.setProgress(((double) pokemon5.getVidaact()/pokemon5.getVidamax()));
		vida11.setText(pokemon5.getVidaact()+"/"+ pokemon5.getVidamax());
		imagen11.setImage(pokemon5.getImagen());
		estadopok5.setImage(pokemon5.getEstado());

		//SEXTO POKEMON
		nombre21.setText(pokemon6.getNombre());
		nivel21.setText(NIVELAUX +pokemon6.getNivel());
		barravida21.setProgress(((double) pokemon6.getVidaact()/pokemon6.getVidamax()));
		vida21.setText(pokemon6.getVidaact()+"/"+ pokemon6.getVidamax());
		imagen21.setImage(pokemon6.getImagen());
		estadopok6.setImage(pokemon6.getEstado());
	}


	private void botonocultar(){
		botoncontinuar.setVisible(false);
	}

	private void showAlert(Alert alert) {
		Optional<ButtonType> resultado = alert.showAndWait();
	}

	public void actualizarvida1(Pokemon pokemon){
		seleccion.setVidaact(pokemon.getVidaact());
		initialize();
	}

	private Ventana2Controller v = null;
	public Stage stage = null;

	int aleatorio=0;

	@FXML
	protected void clickContinuar() {
		aleatorio= (int) (Math.random()*listaenemigos.size());
		Pokemon enem= listaenemigos.get(aleatorio);

		if (!enem.estavivo(enem)){listaenemigos.remove(enem);
			 enem= listaenemigos.get(aleatorio);}

		try {
			if (stage == null || !stage.isShowing()) {
				stage = new Stage();
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/Ventana2.fxml"));
				BorderPane root = loader.load();
				Scene scene = new Scene(root, 750,500);
				stage.setResizable(false);
				stage.setScene(scene);
				stage.show();

				v = loader.getController();

				v.pasarPokemon(seleccion,enem);
				v.recibircontrolador(this);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}