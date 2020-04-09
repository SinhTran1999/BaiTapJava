package duongdan;

import java.util.ArrayList;

import giaodien.IQLDS;

public class QLDS implements IQLDS {
  // attributes
  private ArrayList<CaNhan> dsCaNhan = new ArrayList<>();

  // methods
  // them ca nhan
  @Override
  public int them(CaNhan cn) {
    dsCaNhan.add(cn);
    return 1;
  }

  // xoa ca nhan
  @Override
  public int xoa(String ten) {
    if (dsCaNhan.removeIf(cn -> cn.hoTen == ten)) {
      return 1;
    }
    return 0;
  }

  // in ds ca nhan
  @Override
  public void inDS() {
    dsCaNhan.forEach(cn -> cn.hienThiTT());
  }
}