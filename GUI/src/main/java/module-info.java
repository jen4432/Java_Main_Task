module application.gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive base;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens application.gui to javafx.fxml;
    exports application.gui;
}