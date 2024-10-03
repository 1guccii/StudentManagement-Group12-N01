package model;

//import javafx.beans.property.SimpleDoubleProperty;
//import javafx.beans.property.SimpleStringProperty;

public class monhoc {
    private String mamonhoc;
    private String tenmonhoc;
    private double  sotinchi;

    public monhoc(String mamonhoc, double sotinchi, String tenmonhoc) {
        this.mamonhoc = mamonhoc;
        this.sotinchi = sotinchi;
        this.tenmonhoc = tenmonhoc;
    }

    public String getMamonhoc() {
        return mamonhoc;
    }

    public void setMamonhoc(String mamonhoc) {
        this.mamonhoc = mamonhoc;
    }

    public String getTenmonhoc() {
        return tenmonhoc;
    }

    public void setTenmonhoc(String tenmonhoc) {
        this.tenmonhoc = tenmonhoc;
    }

    public double getSotinchi() {
        return sotinchi;
    }

    public void setSotinchi(double sotinchi) {
        this.sotinchi = sotinchi;
    }
    
    

    
    
}
