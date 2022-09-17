module senac.senacfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens senac.senacfx to javafx.fxml;
    exports senac.senacfx;
}