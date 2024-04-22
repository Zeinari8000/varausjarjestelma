module oma.grafiikka.varausjarjestelma {
    requires javafx.controls;
    requires javafx.fxml;


    opens oma.grafiikka.varausjarjestelma to javafx.fxml;
    exports oma.grafiikka.varausjarjestelma;
}