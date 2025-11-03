import java.util.ArrayList;
import java.util.List;

public class QuanLySach implements IQuanLySach {
    private List<Sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }

    @Override
    public void themSach(Sach s) {
        if (s != null) danhSach.add(s);
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("(Danh sach rong)"); return;
        }
        for (Sach s : danhSach) {
            System.out.println(s);
        }
    }

    @Override
    public void timKiemTheoTen(String tuKhoa) {
        boolean found = false;
        if (tuKhoa == null || tuKhoa.trim().isEmpty()) {
            System.out.println("Vui long nhap tu khoa hop le."); return;
        }
        String key = tuKhoa.trim().toLowerCase();
        for (Sach s : danhSach) {
            if (s.getTenSach().toLowerCase().contains(key)) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) System.out.println("Khong tim thay sach phu hop voi: " + tuKhoa);
    }

    // helper: thêm dữ liệu mẫu để thử nghiệm
    public void napDuLieuMau() {
        themSach(new SachGiaoTrinh("GT001", "Lap trinh Java Co ban", 120000, "Co so lap trinh"));
        themSach(new SachGiaoTrinh("GT002", "Cau truc du lieu va thuat toan", 150000, "Toan roi rac"));
        themSach(new SachTieuThuyet("TT001", "De Men Phieu Luu Ky", 80000, "To Hoai"));
        themSach(new SachTieuThuyet("TT002", "Harry Potter va Hon Đa Phu Thuy", 200000, "J.K. Rowling"));
    }
}
