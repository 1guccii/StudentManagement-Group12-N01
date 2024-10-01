package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class lophoc {
    private SimpleStringProperty tenlop;
    private SimpleStringProperty malop;
    private ObservableList<sinhvien> danhsachSV ;

    public lophoc() {
        this.tenlop = new SimpleStringProperty();
        this.malop = new SimpleStringProperty();
        this.danhsachSV = FXCollections.observableArrayList();
    }

    public lophoc(String tenlop, String malop) {
        this.tenlop = new SimpleStringProperty(tenlop);
        this.malop = new SimpleStringProperty(malop);
    }

    public ObservableList<sinhvien> getDanhsachSV() {
        return danhsachSV;
    }

    public void setDanhsachSV(ObservableList<sinhvien> danhsachSV) {
        this.danhsachSV = danhsachSV;
    }

    public String getTenlop() {
        return tenlop.get();
    }

    public void setTenlop(String tenlop) {
        this.tenlop.set(tenlop);
    }

    public SimpleStringProperty tenlopProperty() {
        return tenlop;
    }

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
