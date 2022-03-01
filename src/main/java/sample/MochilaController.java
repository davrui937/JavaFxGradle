package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Optional;


public class MochilaController {
    Pokemon pokemon=null;
    Ventana2Controller controlador2;

    @FXML
    ImageView fuego;

    @FXML
    ImageView veneno;

    @FXML
    ImageView frio;


    @FXML
    private void clickfuego() throws FileNotFoundException {
        if (Objects.equals(pokemon.getEfecto(), "fuego")){
            pokemon.setEfecto("nada");
            pokemon.setEstado(null);
            alertaPocionCorrecta(fuego);
            controlador2.controlador1.actualizarpokemon();
            controlador2.actualizarpelea();
        }else {
            alertaPocion(fuego);
        }
    }
    @FXML
    private void clickveneno() throws FileNotFoundException {
        if (Objects.equals(pokemon.getEfecto(), "veneno")){
            pokemon.setEfecto("nada");
            pokemon.setEstado(null);
            alertaPocionCorrecta(veneno);
            controlador2.controlador1.actualizarpokemon();
            controlador2.actualizarpelea();
        }else {
            alertaPocion(veneno);
    }
    }
    @FXML
    private void clickfrio() throws FileNotFoundException {
        if (Objects.equals(pokemon.getEfecto(), "frio")){
            pokemon.setEfecto("nada");
            pokemon.setEstado(null);
            alertaPocionCorrecta(frio);
            controlador2.controlador1.actualizarpokemon();
            controlador2.actualizarpelea();
        }else {
            alertaPocion(frio);
        }
    }

    public void recibirpokemon(Pokemon pokemon){
        this.pokemon=pokemon;
    }
    public void recibircontrolador(Ventana2Controller controlador2){
        this.controlador2=controlador2;
    }

    private void showAlert(Alert alert) throws FileNotFoundException {
        Optional<ButtonType> resultado = alert.showAndWait();
        if(!resultado.isPresent()) {
            System.out.println("Dialogo cerrado con la X");
        } else if(resultado.get() == ButtonType.PREVIOUS) {

        } else if (resultado.get() == ButtonType.CLOSE) {
            controlador2.stage2.close();
        } else {
            System.out.println("Resultado = OTROS: " + resultado.get().getText());
        }
    }


    private void alertaPocion(ImageView imagen) throws FileNotFoundException {
        Alert customAlert = new Alert(Alert.AlertType.NONE);
        customAlert.setTitle("Pocion inutil");
        customAlert.setContentText("La pocion seleccionada no cura ningun estado actual.");
        customAlert.setGraphic((imagen));
        customAlert.getDialogPane().getButtonTypes().addAll(ButtonType.PREVIOUS, ButtonType.CLOSE);
        showAlert(customAlert);
    }

    private void alertaPocionCorrecta(ImageView imagen) throws FileNotFoundException {
        Alert customAlert = new Alert(Alert.AlertType.NONE);
        customAlert.setTitle("Pocion util");
        customAlert.setContentText("El pokemon ha sido curado de su estado.");
        customAlert.setGraphic((imagen));
        customAlert.getDialogPane().getButtonTypes().addAll(ButtonType.PREVIOUS, ButtonType.CLOSE);
        showAlert(customAlert);
    }

}
