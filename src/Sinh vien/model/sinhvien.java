package model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class sinhvien {
    private SimpleStringProperty Hoten;
    private SimpleStringProperty MaSV;
    private SimpleStringProperty ngaysinh;
    private SimpleStringProperty quequan;
    private SimpleStringProperty gioitinh;
    private SimpleDoubleProperty diemtoan;
    private SimpleDoubleProperty diemvan;
    private SimpleDoubleProperty diemanh;

    public sinhvien() {
        this.Hoten = new SimpleStringProperty();
        this.MaSV = new SimpleStringProperty();
        this.ngaysinh = new SimpleStringProperty();
        this.quequan = new SimpleStringProperty();
        this.gioitinh = new SimpleStringProperty();
        this.diemtoan = new SimpleDoubleProperty();
        this.diemvan = new SimpleDoubleProperty();
        this.diemanh = new SimpleDoubleProperty();
    }

    public String getHoten() {
        return Hoten.get();
    }

    public void setHoten(String Hoten) {
        this.Hoten.set(Hoten);
    }

    public SimpleStringProperty HotenProperty() {
        return Hoten;
    }

    public String getMaSV() {
        return MaSV.get();
    }

    public void setMaSV(String MaSV) {
        this.MaSV.set(MaSV);
    }

    public SimpleStringProperty MaSVProperty() {
        return MaSV;
    }

    public String getNgaysinh() {
        return ngaysinh.get();
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh.set(ngaysinh);
    }

    public SimpleStringProperty ngaysinhProperty() {
        return ngaysinh;
    }

    public String getQuequan() {
        return quequan.get();
    }

    public void setQuequan(String quequan) {
        this.quequan.set(quequan);
    }

    public SimpleStringProperty quequanProperty() {
        return quequan;
    }

    public String getGioitinh() {
        return gioitinh.get();
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh.set(gioitinh);
    }

    public SimpleStringProperty gioitinhProperty() {
        return gioitinh;
    }

    // Getter và Setter cho diemtoan
    public double getDiemtoan() {
        return diemtoan.get();
    }

    public void setDiemtoan(double diemtoan) {
        this.diemtoan.set(diemtoan);
    }

    public SimpleDoubleProperty diemtoanProperty() {
        return diemtoan;
    }

    // Getter và Setter cho diemvan
    public double getDiemvan() {
        return diemvan.get();
    }

    public void setDiemvan(double diemvan) {
        this.diemvan.set(diemvan);
    }

    public SimpleDoubleProperty diemvanProperty() {
        return diemvan;
    }

    // Getter và Setter cho diemanh
    public double getDiemanh() {
        return diemanh.get();
    }

    public void setDiemanh(double diemanh) {
        this.diemanh.set(diemanh);
    }

    public SimpleDoubleProperty diemanhProperty() {
        return diemanh;
    }
}
