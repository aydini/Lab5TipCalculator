module aydin.lab5tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens aydin.lab5tipcalculator to javafx.fxml;
    exports aydin.lab5tipcalculator;
}