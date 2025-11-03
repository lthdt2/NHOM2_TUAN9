import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach ql = new QuanLySach();
        ql.napDuLieuMau();

        while (true) {
            System.out.println("\n======= QUAN LY SACH =======");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach ");
            System.out.println("4. Tim kiem sach theo ten");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            String choice = sc.nextLine().trim(); ///trim(): Dùng để tránh lỗi nhập dư dấu cách

            switch (choice) {
                case "1" -> {
                    System.out.print("Ma sach: "); String ma = sc.nextLine().trim();
                    System.out.print("Ten sach: "); String ten = sc.nextLine().trim();
                    System.out.print("Gia: "); double gia = parseDouble(sc.nextLine().trim(), 0);
                    System.out.print("Mon hoc: "); String mon = sc.nextLine().trim();
                    ql.themSach(new SachGiaoTrinh(ma, ten, gia, mon));
                    System.out.println("Da them sach giao trinh."); 
                }
                case "2" -> {
                    System.out.print("Ma sach: "); String ma = sc.nextLine().trim();
                    System.out.print("Ten sach: "); String ten = sc.nextLine().trim();
                    System.out.print("Gia: "); double gia = parseDouble(sc.nextLine().trim(), 0);
                    System.out.print("Tac gia: "); String tg = sc.nextLine().trim();
                    ql.themSach(new SachTieuThuyet(ma, ten, gia, tg));
                    System.out.println("Da them sach tieu thuyet."); 
                }
                case "3" -> ql.hienThiDanhSach();
                case "4" -> {
                    System.out.print("Nhap tu khoa tim kiem (ten sach): "); String k = sc.nextLine();
                    ql.timKiemTheoTen(k);
                }
                case "0" -> {
                    System.out.println("Thoat chuong trinh. Tam biet!"); sc.close(); return;
                }
                default -> System.out.println("Lua chon khong hop le. Thu lai.");
            }
        }
    }

    private static double parseDouble(String s, double defaultVal) 
    {
        try { return Double.parseDouble(s); } catch (Exception e) { return defaultVal; }
    }
}
