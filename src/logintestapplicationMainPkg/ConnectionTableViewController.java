package logintestapplicationMainPkg;

import java.time.LocalDate;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ConnectionTableViewController {

    @FXML
    private TableView<Connection> connectionTableview;
    @FXML
    private TableColumn<Connection, Integer> showPlantIdColumn;
    @FXML
    private TableColumn<Connection, String> showNameColumn;
    @FXML
    private TableColumn<Connection, String> showLocationcolumn;
    @FXML
    private TableColumn<Connection, LocalDate> showDatecolumn;
    @FXML
    private Label connectionTableViewLabel;

    public void initialize() {
        setupTableColumns();
        populateTableView();
    }

    private void setupTableColumns() {
        showPlantIdColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getPlantID()));
        showNameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getConnectionplantName()));
        showLocationcolumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getConnectionLocation()));
        showDatecolumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getConnectionDate()));
    }

    private void populateTableView() {
        ObservableList<Connection> connections = FXCollections.observableArrayList(ConnectionFileHandling.loadConnections());
        connectionTableview.setItems(connections);
    }
}
