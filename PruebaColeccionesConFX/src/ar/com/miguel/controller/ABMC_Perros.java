
package ar.com.miguel.controller;

import ar.com.miguel.entity.Perro;
import ar.com.miguel.model.PerroDAO;
import ar.com.miguel.model.PerroListDAO;
import ar.com.miguel.model.PerroMapDAO;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class ABMC_Perros implements Initializable{
    
    Perro perro;
    PerroDAO perros=new PerroMapDAO();

    @FXML
    private TextField txtRazaAlta;
    @FXML
    private TextField txtColorPeloAlta;
    @FXML
    private TextField txtPaisAlta;
    @FXML
    private Button btnAlta;
    @FXML
    private TextField txtRazaBaja;
    @FXML
    private TextField txtColorPeloBaja;
    @FXML
    private TextField txtPaisBaja;
    @FXML
    private Button btnBaja;
    @FXML
    private TextField txtRazaModificar;
    @FXML
    private TextField txtColorPeloModificar;
    @FXML
    private TextField txtPaisModificar;
    @FXML
    private Button btnModificar;
    @FXML
    private Button btnListar;
    @FXML
    private TextArea txtAreaListado;    
    @FXML
    private Button btnBuscarModificar;
    @FXML
    private Button btnBuscarBaja;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      
    }
    
    private void limpiarControles(){
        txtRazaAlta.clear();
        txtColorPeloAlta.clear();
        txtPaisAlta.clear();
        
        txtRazaBaja.clear();
        txtColorPeloBaja.clear();
        txtPaisBaja.clear();
        
        txtRazaModificar.clear();
        txtColorPeloModificar.clear();
        txtPaisModificar.clear();
        
        txtAreaListado.clear();
    }
    

    @FXML
    private void btnAlta(ActionEvent event) {
        perro=new Perro();
              
        perro.setPatas(4);
        perro.setRaza(txtRazaAlta.getText());
        perro.setColor_pelo(txtColorPeloAlta.getText());
        perro.setPais(txtPaisAlta.getText());
        
        perros.guardar(perro);
        
        limpiarControles();
    }

    @FXML
    private void btnBaja(ActionEvent event) {
        perro=new Perro();
        perro.setRaza(txtRazaBaja.getText());
        
        perros.eliminar(perro);
        limpiarControles();
    }

    @FXML
    private void btnModificar(ActionEvent event) {
        perro=new Perro(txtRazaModificar.getText(), txtColorPeloModificar.getText()
                        , 4, txtPaisModificar.getText());
        
        perros.modificar(perro);
        limpiarControles();
    }

    @FXML
    private void btnListar(ActionEvent event) {
        limpiarControles();
        List<Perro> listaPerros=perros.recuperarTodos();
        
        listaPerros.forEach(perro->txtAreaListado.appendText(perro.toString()+"\n"));
    }

    @FXML
    private void btnBuscarModificar(ActionEvent event) {
        perro=perros.recuperar(txtRazaModificar.getText());
        
        txtColorPeloModificar.setText(perro.getColor_pelo());
        txtPaisModificar.setText(perro.getPais());
    }
    

    @FXML
    private void btnBuscarBaja(ActionEvent event) {
        perro=perros.recuperar(txtRazaBaja.getText());
        
        txtColorPeloBaja.setText(perro.getColor_pelo());
        txtPaisBaja.setText(perro.getPais());
    }
    
}
