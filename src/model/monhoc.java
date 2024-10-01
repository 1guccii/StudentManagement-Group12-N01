package model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class monhoc {
    private SimpleStringProperty mamonhoc;
    private SimpleStringProperty tenmonhoc;
    private SimpleDoubleProperty sotinchi;
    
    public monhoc(SimpleStringProperty mamonhoc, SimpleStringProperty tenmonhoc, SimpleDoubleProperty sotinchi) {
        this.mamonhoc = mamonhoc;
        this.tenmonhoc = tenmonhoc;
        this.sotinchi = sotinchi;
    }

    public SimpleStringProperty getMamonhoc() {
        return mamonhoc;
    }

    public void setMamonhoc(SimpleStringProperty mamonhoc) {
        this.mamonhoc = mamonhoc;
    }

    public SimpleStringProperty getTenmonhoc() {
        return tenmonhoc;
    }

    public void setTenmonhoc(SimpleStringProperty tenmonhoc) {
        this.tenmonhoc = tenmonhoc;
    }

    public SimpleDoubleProperty getSotinchi() {
        return sotinchi;
    }

    public void setSotinchi(SimpleDoubleProperty sotinchi) {
        this.sotinchi = sotinchi;
    }

    
    
}
