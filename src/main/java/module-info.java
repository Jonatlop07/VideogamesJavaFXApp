module com.jonathan.videogame {
    requires javafx.controls;
    requires javafx.fxml;
    
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    
    opens com.jonathan.videogame to javafx.fxml;
    exports com.jonathan.videogame;
    exports com.jonathan.videogame.abstractions;
    opens com.jonathan.videogame.abstractions to javafx.fxml;
}