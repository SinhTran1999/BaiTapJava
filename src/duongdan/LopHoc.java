package duongdan;

import giaodien.IQLDS;

public class LopHoc {
  // attributes
  CaNhan giaoVienCN = new GiaoVien();
  IQLDS qlDsGVGD = new QLDS();
  IQLDS qlDsHS = new QLDS();

  // conrtructor
  // contructor LopHoc voi giao vien chu nhiem truyen vao
  public LopHoc(GiaoVien gvChuNhiem) {
    this.giaoVienCN = gvChuNhiem;
  }

  // methods
  // them hoc sinh
  public int themHocSinh(HocSinh hs) {
    if (qlDsHS.them(hs) == 1) {
      return 1;
    }
    return 0;
  }
  // them giao vien giang day
  public int themGVGD(GiaoVien gv) {
    if (qlDsGVGD.them(gv) == 1) {
      return 1;
    }
    return 0;
  }
  // in danh sach hoc sinh
  public int inDSHS() {
    qlDsHS.inDS();
    return 1;
  }
  // in danh sach giao vien giang day
  public int inDSGVGD() {
    qlDsGVGD.inDS();
    return 1;
  }
}