package bai1;

import java.util.Scanner;

public class NhanVien {
    static Scanner sc = new Scanner(System.in);
    private String id;
    private String hoTen;
    private String kieuNV;
    private int soNL;
    private int namL;
    private float luong;
    private float phuC;
    private float tongTien;

    public NhanVien() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setKieuNV(String kieuNV) {
        this.kieuNV = kieuNV;
    }

    public void setNamL(int namL) {
        this.namL = namL;
    }

    public void setSoNL(int soNL) {
        this.soNL = soNL;
    }

    public String getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getKieuNV() {
        return kieuNV;
    }

    public int getSoNL() {
        return soNL;
    }

    public int getNamL() {
        return namL;
    }

    public float getLuong() {
        if("San xuat".equals(getKieuNV())){
            return luong = getSoNL() * 350;
        }else if("Van phong".equals(getKieuNV())){
            return luong = getSoNL()*400;
        }
        return luong;
    }

    public float getPhuC() {
        return phuC = 100 + (2022-getNamL())*200;
    }

    public float getTongTien() {
        return tongTien = getLuong() + getPhuC();
    }
    public void nhap(){
        System.out.println("Nhap vao id cua nhan vien: ");
        setId(sc.nextLine());
        System.out.println("Nhap vao ho ten nhan vien: ");
        setHoTen(sc.nextLine());
        System.out.println("Nhap vao kieu nhan vien: ");
        setKieuNV(sc.nextLine());
        System.out.println("Nhap vao so ngay lam: ");
        setSoNL(sc.nextInt());
        System.out.println("Nhap vao so nam lam: ");
        setNamL(sc.nextInt());
        sc.nextLine();
        
    }
    public void xuat(){
        System.out.printf("%-10s%-10s%-10s%-15d%-15d%-15.2f%-15.2f%-15.2f\n", getId(), getHoTen(), getKieuNV(), getSoNL(), getNamL(), getLuong()/1000, getPhuC(), getTongTien());
    }
    public static void main(String[] args) {
        NhanVien[] dsNV = new NhanVien[2];
        for(int i=0; i<dsNV.length; i++){
            dsNV[i] = new NhanVien();
            dsNV[i].nhap();
        }
        System.out.printf("%-10s%-10s%-10s%-15s%-15s%-15s%-15s%-15s\n","id", "Ho ten", "Kieu NV", "So ngay lam", "Nam vao lam", "Luong", "Phu cap", "Tong tien");
        for(int i=0; i<dsNV.length; i++){
            dsNV[i].xuat();
        }
                
    }
    
}
