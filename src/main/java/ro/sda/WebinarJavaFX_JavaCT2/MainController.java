package ro.sda.WebinarJavaFX_JavaCT2;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

public class MainController {
    public void onButtonAction(ActionEvent actionEvent) {
        System.out.println("Au, ai apasat prea tare!");
    }

    public void onMouseClicked(MouseEvent mouseEvent) {
        System.out.println("Nu mai da! Nu stii sa injuri?");
    }

    public void onMouseEntered(MouseEvent mouseEvent) {
        System.out.println("Bine ai venit!");
    }

    public void onMouseExit(MouseEvent mouseEvent) {
        System.out.println("Pa si drum bun!");
    }
}
