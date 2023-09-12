module ru.coderun.touristsender {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens ru.coderun.touristsender to javafx.fxml;
    exports ru.coderun.touristsender;
    exports ru.coderun.touristsender.Controller;
    opens ru.coderun.touristsender.Controller to javafx.fxml;
}