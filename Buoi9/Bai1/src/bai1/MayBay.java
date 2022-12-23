package bai1;

public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public void catCanh(){
        System.out.println("Cat canh");
    }
    
    public void haCanh(){
        System.out.println("Ha canh");
    }
    
    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public MayBay(String loaiNhienLieu, HangSanXuat hangSanXuat) {
        super("May bay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }
    

    @Override
    public double layVanToc() {
        return 100;
    }

    
    
    
}
