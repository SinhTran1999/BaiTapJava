package duongdan;

public class GiaoVien extends CaNhan {
    // attributes
    private String monDay;
    private String toBoMon;
  
    // contructor
    public GiaoVien() {
      super();
      this.monDay = "";
      this.toBoMon = "";
    }
    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon) {
      super(hoTen, tuoi, diaChi, sdt);
      this.monDay = monDay;
      this.toBoMon = toBoMon;
    }
  
    // getter, setter
    public void setMonDay(String monDay) { this.monDay = monDay; }
    public void setToBoMon(String toBoMon) { this.toBoMon = toBoMon; }
    public String getMonDay() { return this.monDay; }
    public String getToBoMon() { return this.toBoMon; }

    // methods
    // hien thi thong tin
    @Override
    public String hienThiTT() {
      String thongTin = "";
      thongTin = "ho ten: " + this.hoTen + ", tuoi: " + this.tuoi + ", dia chi: " + this.diaChi
        + ", sdt: " + this.sdt + ", mon day: " + this.monDay + ", to bo mon: " + this.toBoMon;
  
      System.out.println(thongTin);
      return thongTin;
    }
}