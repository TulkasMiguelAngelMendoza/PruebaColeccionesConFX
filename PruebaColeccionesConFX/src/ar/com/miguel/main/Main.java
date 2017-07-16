
package ar.com.miguel.main;



import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
                                        
        Parent root=FXMLLoader.load(getClass().getResource("/ar/com/miguel/view/ABMC_Perros.fxml"));
        
        
        Scene scene=new Scene(root);
        
        primaryStage.setTitle("Aplicacion Perros");
        primaryStage.setResizable(false);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args){
        launch(args);       
    }
}
