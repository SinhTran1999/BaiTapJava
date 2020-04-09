package duongdan;

/**
 * CaNhan
 */
public abstract class CaNhan {

  // attributes
  protected String hoTen;
  protected int tuoi;
  protected String diaChi;
  protected String sdt;

  // contructor
  public CaNhan() {
    this.hoTen = "";
    this.tuoi = 0;
    this.diaChi = "";
    this.sdt = "";
  }
  public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
    this.hoTen = hoTen;
    this.tuoi = tuoi;
    this.diaChi = diaChi;
    this.sdt = sdt;
  }

  // getter, setter
  public void setHoTen(String hoTen) { this.hoTen = hoTen; }
  public void setTuoi(int tuoi) { this.tuoi = tuoi; }
  public void setDiaChi(String diaChi) { this.diaChi = diaChi; }
  public void setSdt(String sdt) { this.sdt = sdt; }
  public String getHoTen() { return this.hoTen; }
  public int getTuoi() { return this.tuoi; }
  public String getDiaChi() { return this.diaChi; }
  public String getSdt() { return this.sdt; }

  // methods
  public abstract String hienThiTT();
}