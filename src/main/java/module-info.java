module com.santana.fooderapp {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.santana.fooderapp to javafx.fxml;
    exports com.santana.fooderapp;
}