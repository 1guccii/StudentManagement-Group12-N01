package model;

import java.util.ArrayList;

public class quanlySV {
    private ArrayList<sinhvien> danhsachSV ;
    
    public quanlySV() {
        danhsachSV = new ArrayList<>();
    } 

    //Thêm sinh viên 
    public void themSV(sinhvien sv){
        danhsachSV.add(sv);
    }
    
    //Sửa hồ sơ sinh viên
    public boolean suaSV(String MaSV, sinhvien SV ) {
        for (sinhvien sv : danhsachSV) {
            if (sv.getMaSV().equals(MaSV)) {
                sv.setHoten(SV.getHoten());
                sv.setNgaysinh(SV.getNgaysinh());
                sv.setGioitinh(SV.getGioitinh());
                sv.setQuequan(SV.getQuequan());
                sv.setDiemanh(SV.getDiemanh());
                sv.setDiemtoan(SV.getDiemtoan());
                sv.setDiemvan(SV.getDiemvan());
                return true;
            }
        }
        return false ;

    }

    //Xóa hồ sơ sinh viên
    public boolean xoaSV(String MaSV) {
        for(sinhvien sv : danhsachSV) {
            if(sv.getMaSV().equals(MaSV)) {
                danhsachSV.remove(MaSV);
                return true;
            }
        }
        return false ;
    }

}
