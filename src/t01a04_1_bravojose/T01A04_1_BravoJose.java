
package t01a04_1_bravojose;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class T01A04_1_BravoJose extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Establecemos el titulo de la ventana (frame) o escenario
        primaryStage.setTitle("Controls Layout ");
        // Creamos el nodo raiz que sera un grupo donde introduciremos los componentes
        Group root = new Group();
        // Creamos la escena siendo el grupo root el nodo raiz, unas dimensiones de 380W, 118H, y un color blanco
        Scene scene = new Scene(root, 380, 118, Color.WHITE);

        // Declaramos un GridPane para organizar los campos de texto, las etiquetas y el boton
        GridPane gridpane = new GridPane();
        // Establecemos un paddin al layout donde se ubicaran los componentes
        gridpane.setPadding(new Insets(5));
        // Establecemos la separacion entre columnas (Horizontal gap = Hgap) y entre filas (Vertical gap = Vgap)
        gridpane.setHgap(5);
        gridpane.setVgap(5);

        // Creamos la etiqueta para pedir el nombre
        Label fNameLbl = new Label("First Name");
        // Creamos el campo de texto que recogera el nombre
        TextField fNameFld = new TextField();
        // Creamos la etiqueta para pedir el apellido
        Label lNameLbl = new Label("Last Name");
        // Creamos el campo de texto para introducir los apellidos
        TextField lNameFld = new TextField();
        // Creamos el boton para guardar nombre y apellidos
        Button saveButt = new Button("Save");
        
        // Posicionamos la First name label hacia la derecha de la celda del GridPane (HPos = Horizontal Position, la posicion en la linea horizontal, puede ser CENTER, RIGTH o LEFT)
        // es la alineacion con respecto la celda (el espacio que tiene el componente en la pantalla)
        GridPane.setHalignment(fNameLbl, HPos.RIGHT);
        // Añadimos la etiqueta al contenedor, en la coljmna 0, fila 0
        gridpane.add(fNameLbl, 0, 0);
        
        // Posicionamos la Last name label hacia la derecha de la celda del GridPane
        GridPane.setHalignment(lNameLbl, HPos.RIGHT);
        // Añadimos la etiqueta al GridPane, en la columna 0, fila 1
        gridpane.add(lNameLbl, 0, 1);
        
        // Posicionamos el First name field hacia la izquierda de la celda
        GridPane.setHalignment(fNameFld, HPos.LEFT); 
        // Añadimos el campo de texto en la columna 1 fila 0
        gridpane.add(fNameFld, 1, 0);
        
        // Posicionamos el Last name field hacia la izquierda de la celda
        GridPane.setHalignment(lNameFld, HPos.LEFT);
        // Añadimos el campo de texto al GridPane en la columna 1, fila 1
        gridpane.add(lNameFld, 1, 1);

        // Posicionamos el Save button hacia la derecha de la celda (Es lo que hace que aparezca alineado con los campos de texto a la derecha)
        GridPane.setHalignment(saveButt, HPos.RIGHT);
        // Añadimos el boton al GridPane en la columna 1, fila 2
        gridpane.add(saveButt, 1, 2);
        
        // Añadimos el GridPane al grupo root (nodo raiz)
        root.getChildren().add(gridpane);        
        
        // Establecemos la escena con el nodo raiz conteniendo el GridPane donde se ubican los compoenntes
        primaryStage.setScene(scene);
        
        // Mostramos el escenario con scene como escena activa
        primaryStage.show();
    }
}