module org.georgiancollege.week03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.georgiancollege.week03 to javafx.fxml;
    exports org.georgiancollege.week03;
}