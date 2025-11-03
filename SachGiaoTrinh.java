public class SachGiaoTrinh extends Sach {
    private String monHoc;

    public SachGiaoTrinh(String maSach, String tenSach, double gia, String monHoc) {
        super(maSach, tenSach, gia);
        this.monHoc = monHoc;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    @Override
    public String toString() {
        return super.toString() + " | Giao Trinh | Mon: " + monHoc;
    }

    @Override
    public String getLoai() {
        return "SachGiaoTrinh";
    }
}
