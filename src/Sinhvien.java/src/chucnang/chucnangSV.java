package chucnang;

import java.util.ArrayList;
import java.util.Scanner;

import model.sinhvien;
public class chucnangSV {
    private ArrayList<sinhvien> danhSachSinhVien;
    private Scanner scanner;

    public chucnangSV() {
        danhSachSinhVien = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Thêm sinh viên từ bàn phím
    public void themSinhVien() {
        nhapThongTinSinhVien();
    }

    // Nhập thông tin sinh viên
    public void nhapThongTinSinhVien() {
        sinhvien sv = new sinhvien();
        
        System.out.print("Nhập họ tên: ");
        sv.setHoten(scanner.nextLine());
        
        System.out.print("Nhập mã sinh viên: ");
        sv.setMaSV(scanner.nextLine());
        
        System.out.print("Nhập ngày sinh: ");
        sv.setngaysinh(scanner.nextLine());
        
        System.out.print("Nhập quê quán: ");
        sv.setquequan(scanner.nextLine());
        
        System.out.print("Nhập giới tính: ");
        sv.setgioitinh(scanner.nextLine());
        
        System.out.print("Nhập điểm toán: ");
        double diemToan = scanner.nextDouble();
        sv.setdiemtoan(new double[]{diemToan});
        
        System.out.print("Nhập điểm văn: ");
        double diemVan = scanner.nextDouble();
        sv.setdiemvan(new double[]{diemVan});
        
        System.out.print("Nhập điểm anh: ");
        double diemAnh = scanner.nextDouble();
        sv.setdiemanh(new double[]{diemAnh});
        
        danhSachSinhVien.add(sv);
        System.out.println("Đã thêm sinh viên thành công!");
        scanner.nextLine(); // Đọc bỏ dòng new line
    }

    // Xóa thông tin sinh viên
    public void xoaThongTinSinhVien() {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        String maSV = scanner.nextLine();
        
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            if (danhSachSinhVien.get(i).getMaSV().equals(maSV)) {
                System.out.print("Xác nhận xóa sinh viên (true/false): ");
                boolean confirm = scanner.nextBoolean();
                scanner.nextLine(); // Đọc ký tự xuống dòng sau khi nhập boolean
                
                if (confirm) {
                    danhSachSinhVien.remove(i);
                    System.out.println("Đã xóa sinh viên thành công!");
                } else {
                    System.out.println("Hủy xóa sinh viên.");
                }
                return; // Dừng phương thức sau khi xóa hoặc hủy
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã " + maSV);
    }
    

    // Menu sửa thông tin sinh viên
    public void suaThongTinSinhVien() {
        System.out.print("Nhập mã sinh viên cần sửa: ");
        String maSV = scanner.nextLine();
        
        for (sinhvien sv : danhSachSinhVien) {
            if (sv.getMaSV().equals(maSV)) {
                boolean tiepTuc = true;
                while (tiepTuc) {
                    System.out.println("\nChọn thông tin cần sửa:");
                    System.out.println("1. Họ tên");
                    System.out.println("2. Ngày sinh");
                    System.out.println("3. Quê quán");
                    System.out.println("4. Giới tính");
                    System.out.println("5. Điểm toán");
                    System.out.println("6. Điểm văn");
                    System.out.println("7. Điểm anh");
                    System.out.println("0. Thoát");
                    System.out.print("Lựa chọn của bạn: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ dòng new line

                    switch (choice) {
                        case 1:
                            System.out.print("Nhập họ tên mới: ");
                            sv.setHoten(scanner.nextLine());
                            break;
                        case 2:
                            System.out.print("Nhập ngày sinh mới: ");
                            sv.setngaysinh(scanner.nextLine());
                            break;
                        case 3:
                            System.out.print("Nhập quê quán mới: ");
                            sv.setquequan(scanner.nextLine());
                            break;
                        case 4:
                            System.out.print("Nhập giới tính mới: ");
                            sv.setgioitinh(scanner.nextLine());
                            break;
                        case 5:
                            System.out.print("Nhập điểm toán mới: ");
                            double diemToan = scanner.nextDouble();
                            sv.setdiemtoan(new double[]{diemToan});
                            break;
                        case 6:
                            System.out.print("Nhập điểm văn mới: ");
                            double diemVan = scanner.nextDouble();
                            sv.setdiemvan(new double[]{diemVan});
                            break;
                        case 7:
                            System.out.print("Nhập điểm anh mới: ");
                            double diemAnh = scanner.nextDouble();
                            sv.setdiemanh(new double[]{diemAnh});
                            break;
                        case 0:
                            tiepTuc = false;
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    }
                }
                System.out.println("Đã sửa thông tin sinh viên thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã " + maSV);
    }

    // Tìm kiếm sinh viên theo mã sinh viên
    public void timKiemSinhVien() {
        System.out.print("Nhập mã sinh viên cần tìm: ");
        String maSV = scanner.nextLine();
        
        for (sinhvien sv : danhSachSinhVien) {
            if (sv.getMaSV().equals(maSV)) {
                // Hiển thị thông tin sinh viên
                System.out.println("Thông tin sinh viên:");
                System.out.println("Họ tên: " + sv.getHoten());
                System.out.println("Mã sinh viên: " + sv.getMaSV());
                System.out.println("Ngày sinh: " + sv.getngaysinh());
                System.out.println("Quê quán: " + sv.getquequan());
                System.out.println("Giới tính: " + sv.getgioitinh());
                System.out.println("Điểm Toán: " + sv.getdiemtoan()[0]);
                System.out.println("Điểm Văn: " + sv.getdiemvan()[0]);
                System.out.println("Điểm Anh: " + sv.getdiemanh()[0]);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã " + maSV);
    }
}
