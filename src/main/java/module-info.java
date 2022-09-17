module senac.senacfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens senac.senacfx.application to javafx.fxml;
    exports senac.senacfx.application;

    exports senac.senacfx.controller;
    opens senac.senacfx.controller to javafx.fxml;
}