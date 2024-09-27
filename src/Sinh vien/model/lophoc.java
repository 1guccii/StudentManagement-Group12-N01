package model;

import javafx.beans.property.SimpleStringProperty;

public class lophoc {
    private SimpleStringProperty tenlop;
    private SimpleStringProperty malop;

    public lophoc() {
        this.tenlop = new SimpleStringProperty();
        this.malop = new SimpleStringProperty();
    }

    // Constructor với tham số
    public lophoc(String tenlop, String malop) {
        this.tenlop = new SimpleStringProperty(tenlop);
        this.malop = new SimpleStringProperty(malop);
    }

    // Getter và Setter cho tenlop
    public String getTenlop() {
        return tenlop.get();
    }

    public void setTenlop(String tenlop) {
        this.tenlop.set(tenlop);
    }

    public SimpleStringProperty tenlopProperty() {
        return tenlop;
    }

    // Getter và Setter cho malop
    public String getMalop() {
        return malop.get();
    }

    public void setMalop(String malop) {
        this.malop.set(malop);
    }

    public SimpleStringProperty malopProperty() {
        return malop;
    }
}
