module com.nap.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    
    opens com.nap.quizapp to javafx.fxml;
    exports com.nap.quizapp;
}
