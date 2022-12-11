module com.georgiancollege.assignment3_jenil {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.georgiancollege.assignment3_jenil to javafx.fxml;
    exports com.georgiancollege.assignment3_jenil;
}