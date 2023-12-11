module es.ieslosmontecillos.cellfactories {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.cellfactories to javafx.fxml;
    exports es.ieslosmontecillos.cellfactories;
}