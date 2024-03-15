module com.example.projet_freelance {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;

    opens com.example.projet_freelance to javafx.fxml;
    exports com.example.projet_freelance;
}