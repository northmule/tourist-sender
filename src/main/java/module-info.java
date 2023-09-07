module ru.coderun.coderuntouristsender {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens ru.coderun.coderuntouristsender to javafx.fxml;
    exports ru.coderun.coderuntouristsender;
    exports ru.coderun.coderuntouristsender.Controller;
    opens ru.coderun.coderuntouristsender.Controller to javafx.fxml;
}