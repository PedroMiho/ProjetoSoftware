package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.Usuario;

public class UsuarioController {

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtNome;

    @FXML
    private PasswordField txtSenha;
    
    private Usuario usuarioAtual;
    
    public void recebeUsuario(Usuario usuario) {
    	this.usuarioAtual = usuario;
    }
    
    @FXML
    void onClickAtualizar(ActionEvent event) {

    }

    @FXML
    void onClickExcluir(ActionEvent event) {

    }

    @FXML
    void onClickVoltar(ActionEvent event) {

    }


}
