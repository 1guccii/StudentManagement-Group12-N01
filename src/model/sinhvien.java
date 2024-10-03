package model;

import java.io.FileWriter;
import java.io.IOException;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class sinhvien {
    private SimpleStringProperty Hoten;
    private SimpleStringProperty MaSV;
    private SimpleStringProperty ngaysinh;
    private SimpleStringProperty quequan;
    private SimpleBooleanProperty gioitinh;
    private SimpleDoubleProperty diemtoan;
    private SimpleDoubleProperty diemvan;
    private SimpleDoubleProperty diemanh;


    public sinhvien() {
        this.Hoten = new SimpleStringProperty();
        this.MaSV = new SimpleStringProperty();
        this.ngaysinh = new SimpleStringProperty();
        this.quequan = new SimpleStringProperty();
        this.gioitinh = new SimpleBooleanProperty();
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

    public Boolean getGioitinh() {
        return gioitinh.get();
    }

    public void setGioitinh(Boolean gioitinh) {
        this.gioitinh.set(gioitinh);
    }

    public SimpleBooleanProperty gioitinhProperty() {
        return gioitinh;
    }

    public double getDiemtoan() {
        return diemtoan.get();
    }

    public void setDiemtoan(double diemtoan) {
        this.diemtoan.set(diemtoan);
    }

    public SimpleDoubleProperty diemtoanProperty() {
        return diemtoan;
    }

    public double getDiemvan() {
        return diemvan.get();
    }

    public void setDiemvan(double diemvan) {
        this.diemvan.set(diemvan);
    }

    public SimpleDoubleProperty diemvanProperty() {
        return diemvan;
    }

    public double getDiemanh() {
        return diemanh.get();
    }

    public void setDiemanh(double diemanh) {
        this.diemanh.set(diemanh);
    }

    public SimpleDoubleProperty diemanhProperty() {
        return diemanh;
    }

    @Override
    public String toString() {
        return "sinhvien [Hoten=" + Hoten + ", MaSV=" + MaSV + ", ngaysinh=" + ngaysinh + ", quequan=" + quequan
                + ", gioitinh=" + gioitinh + ", diemtoan=" + diemtoan + ", diemvan=" + diemvan + ", diemanh=" + diemanh
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Hoten == null) ? 0 : Hoten.hashCode());
        result = prime * result + ((MaSV == null) ? 0 : MaSV.hashCode());
        result = prime * result + ((ngaysinh == null) ? 0 : ngaysinh.hashCode());
        result = prime * result + ((quequan == null) ? 0 : quequan.hashCode());
        result = prime * result + ((gioitinh == null) ? 0 : gioitinh.hashCode());
        result = prime * result + ((diemtoan == null) ? 0 : diemtoan.hashCode());
        result = prime * result + ((diemvan == null) ? 0 : diemvan.hashCode());
        result = prime * result + ((diemanh == null) ? 0 : diemanh.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        sinhvien other = (sinhvien) obj;
        if (Hoten == null) {
            if (other.Hoten != null)
                return false;
        } else if (!Hoten.equals(other.Hoten))
            return false;
        if (MaSV == null) {
            if (other.MaSV != null)
                return false;
        } else if (!MaSV.equals(other.MaSV))
            return false;
        if (ngaysinh == null) {
            if (other.ngaysinh != null)
                return false;
        } else if (!ngaysinh.equals(other.ngaysinh))
            return false;
        if (quequan == null) {
            if (other.quequan != null)
                return false;
        } else if (!quequan.equals(other.quequan))
            return false;
        if (gioitinh == null) {
            if (other.gioitinh != null)
                return false;
        } else if (!gioitinh.equals(other.gioitinh))
            return false;
        if (diemtoan == null) {
            if (other.diemtoan != null)
                return false;
        } else if (!diemtoan.equals(other.diemtoan))
            return false;
        if (diemvan == null) {
            if (other.diemvan != null)
                return false;
        } else if (!diemvan.equals(other.diemvan))
            return false;
        if (diemanh == null) {
            if (other.diemanh != null)
                return false;
        } else if (!diemanh.equals(other.diemanh))
            return false;
        return true;
    }

    public void saveToFile() {
        try {
            FileWriter writer = new FileWriter("Data/Login.txt", true);
            writer.write(MaSV.get() + "," + Hoten.get() + "," + ngaysinh.get() + "," + quequan.get() + "," + 
                         gioitinh.get() + "," + diemtoan.get() + "," + diemvan.get() + "," + diemanh.get() + "\n");
            writer.close();
            System.out.println("Lưu thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi ! " + e.getMessage());
        }
    }



}
