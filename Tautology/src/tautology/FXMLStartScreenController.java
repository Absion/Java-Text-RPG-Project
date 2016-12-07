
package tautology;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Absion
 */
public class FXMLStartScreenController implements Initializable {
    
    @FXML
    private Label label;
    
    //WILL LOAD UP CHARACTER CREATION SCREEN PUSHING TO FXMLCHARACTERCREATIONCONTROLLER
    @FXML
    private void handleNewGameButtonAction(ActionEvent event) throws IOException {
        
        Parent characterCreationParent = FXMLLoader.load(getClass().getResource("FXMLCharacterCreation.fxml"));
        Scene characterCreationScene = new Scene (characterCreationParent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(characterCreationScene);
        stage.show();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
