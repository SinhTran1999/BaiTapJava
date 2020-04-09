package baitap1;

import java.util.Scanner;

import duongdan.GiaoVien;
import duongdan.HocSinh;
import duongdan.LopHoc;

public class MainClass {
  public static void main(String[] args) {
    // tao giao vien chu nhiem
    GiaoVien gvch = new GiaoVien();
    gvch.setHoTen("Vo Quoc Anh");
    gvch.setTuoi(27);
    gvch.setDiaChi("Vinh Tho - Nha Trang");
    gvch.setSdt("09738265452");
    gvch.setMonDay("Lap Trinh Java Nang Cao");
    gvch.setToBoMon("Lap Trinh Huong Doi Tuong");

    // tao lop hoc voi giao vien chu nhiem
    LopHoc lopHoc = new LopHoc(gvch);

    // them danh sach hoc hinh vao lop
    // tao hoc sinh
    HocSinh hs1 = new HocSinh();
    hs1.setHoTen("Tran Nhan Sinh");
    hs1.setTuoi(22);
    hs1.setDiaChi("Nha Trang - Khanh Hoa");
    hs1.setSdt("0337671525");
    hs1.setLop("LTCC");
    hs1.setNangKhieu("Nhay");
    // them hs vao lop
    lopHoc.themHocSinh(hs1);

    // tao them hoc sinh
    HocSinh hs2 = new HocSinh("Võ Tiến Phúc", 17, "Đà Nẵng", "016897854525", "LTCC", "Hat");
    // them hs vao lop
    lopHoc.themHocSinh(hs2);

    Scanner input = new Scanner(System.in);
    // tao them hoc sinh
    HocSinh hs3 = new HocSinh();
    System.out.print("Ten hoc sinh la: ");
    hs3.setHoTen(input.nextLine());
    System.out.print("Tuoi la: ");
    hs3.setTuoi(input.nextInt());
    input.nextLine();
    System.out.print("Dia chi la: ");
    hs3.setDiaChi(input.nextLine());
    System.out.print("So dien thoai la: ");
    hs3.setSdt(input.nextLine());
    System.out.print("Lop la: ");
    hs3.setLop(input.nextLine());
    System.out.print("Nang khieu la: ");
    hs3.setNangKhieu(input.nextLine());
    // them hs vao lop
    lopHoc.themHocSinh(hs3);

    // them giao vien giang day vao lop hoc
    // tao giao vien

    // in danh sach hos sinh trong lop
    lopHoc.inDSHS();

  }
}