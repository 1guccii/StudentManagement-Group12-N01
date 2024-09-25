import java.util.ArrayList;
import java.util.List;

public class chucnangSV {
    private List<sinhvien> danhSachSinhVien;

    public chucnangSV() {
        this.danhSachSinhVien = new ArrayList<>();
    }

    public void themSinhVien(sinhvien sv) {
        danhSachSinhVien.add(sv);
    }

    public void suaSinhVien(String maSV, sinhvien svMoi) {
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            if (danhSachSinhVien.get(i).getMaSV().equals(maSV)) {
                danhSachSinhVien.set(i, svMoi);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã " + maSV);
    }

    public void xoaSinhVien(String maSV) {
        danhSachSinhVien.removeIf(sv -> sv.getMaSV().equals(maSV));
    }

    public void hienThiDanhSach() {
        for (sinhvien sv : danhSachSinhVien) {
            System.out.println("Mã SV: " + sv.getMaSV() + ", Họ tên: " + sv.getHoten());
        }
    }

    public static void main(String[] args) {
        chucnangSV qlsv = new chucnangSV();

        // Thêm sinh viên
        sinhvien sv1 = new sinhvien();
        sv1.setMaSV("SV001");
        sv1.setHoten("Nguyễn Văn A");
        qlsv.themSinhVien(sv1);

        // Hiển thị danh sách
        qlsv.hienThiDanhSach();

    }
}

