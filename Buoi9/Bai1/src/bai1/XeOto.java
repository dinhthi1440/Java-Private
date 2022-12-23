package bai1;

public class XeOto extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public XeOto(String loaiNhienLieu,HangSanXuat hangSanXuat) {
        super("O to", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    } 

    @Override
    public double layVanToc() {
        return 50;
    }

    
    
    
    
}
