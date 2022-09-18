module senac.senacfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens senac.senacfx.application to javafx.fxml;
    exports senac.senacfx.application;

    opens senac.senacfx.controller to javafx.fxml;
    exports senac.senacfx.controller;

    opens senac.senacfx.model.entities to javafx.fxml;
    exports senac.senacfx.model.entities;

    opens senac.senacfx.model.services to javafx.fxml;
    exports senac.senacfx.model.services;

}