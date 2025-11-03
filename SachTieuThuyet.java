public class SachTieuThuyet extends Sach {
    private String tacGia;

    public SachTieuThuyet(String maSach, String tenSach, double gia, String tacGia) {
        super(maSach, tenSach, gia);
        this.tacGia = tacGia;
    }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    @Override
    public String toString() {
        return super.toString() + " | Tieu Thuyet | Tac gia: " + tacGia;
    }

    @Override
    public String getLoai() {
        return "SachTieuThuyet";
    }
}
