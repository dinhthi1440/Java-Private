package bai4;

import java.util.Scanner;

public class NhanVien {
    static Scanner sc = new Scanner(System.in);
    private String hoTen;
    private int tuoi;
    private String gioiTinh ;
    private String diaChi ;
    private int soGiol;
    private float soTien1h;
    private float salary;
    private float thue;

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    

    public void setSoGiol(int soGiol) {
        this.soGiol = soGiol;
    }

    public void setSoTien1h(float soTien1h) {
        this.soTien1h = soTien1h;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }
    

    public int getSoGiol() {
        return soGiol;
    }

    public float getSoTien1h() {
        return soTien1h;
    }

    public float getSalary() {
        if(getSoGiol() >= 45){
            return salary = (45 + (float)((getSoGiol()-45)*3)/2)*getSoTien1h();
        }
        return salary = getSoGiol() * getSoTien1h();
    }

    public float getThue() {
        if(getSalary()>= 300.0){
            return thue = getSalary()*((float)20/100);
        }
        return thue =0;
        
    }

    public NhanVien() {
    }
    public void nhap(){
        System.out.println("Nhap vao Ho ten: ");
        setHoTen(sc.nextLine());
        System.out.println("Nhap vao tuoi: ");
        setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap vao gioi tinh: ");
        setGioiTinh(sc.nextLine());
        System.out.println("Nhap vao dia chi: ");
        setDiaChi(sc.nextLine());
        System.out.println("Nhap so gio lam: ");
        setSoGiol(sc.nextInt());
        System.out.println("Nhap so tien tra 1h: ");
        setSoTien1h(sc.nextFloat());
        sc.nextLine();
    }
    public void xuat(){
        System.out.printf("%-10s%-10d%-10s%-10s%-10d%-10.2f%-10.2f%-10.2f\n", getHoTen(), getTuoi(), getGioiTinh(), getDiaChi(), getSoGiol(), getSoTien1h(), getSalary(), getThue());
    }
}
