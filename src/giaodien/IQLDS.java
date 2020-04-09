package giaodien;

import duongdan.CaNhan;

public interface IQLDS {
  // them ca nhan
  public abstract int them(CaNhan cn);
  // xoa xa nhan
  public abstract int xoa(String ten);
  // in ds ca nhan
  public abstract void inDS();
}