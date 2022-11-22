
package bai3;

import java.util.Scanner;

public class SinhVien {
    static Scanner sc = new Scanner(System.in);
    private int maSv;
    private String hoTen;
    private String diaChi;
    private static int count=1;
    private int sdt;
    private float diem;

    public SinhVien() {
        this.maSv = count++;
    }

    
    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSdt(int sdt) {
        
        this.sdt = sdt;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public static Scanner getSc() {
        return sc;
    }

    public int getMaSv() {
        return maSv;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getSdt() {
        return sdt;
    }

    public float getDiem() {
        return diem;
    }
    
    public void nhap(){
        do{
            System.out.println("Nhap vao Ho ten sinh vien: ");
            setHoTen(sc.nextLine());
        }while(getHoTen().contains(" ") == false);
        System.out.println("Nhap vao Dia chi sinh vien: ");
        setDiaChi(sc.nextLine());
        do{
            System.out.println("Nhap vao so dien thoai: ");
            setSdt(sc.nextInt());
        }while(getSdt()<= 999999 && getSdt() >= 10000000);
        do{
           System.out.println("Nhap vao diem: ");
            setDiem(sc.nextFloat()); 
        }while(getDiem() < 1 || getDiem() >10);
        sc.nextLine();
    }

    @Override
    public String toString() {
        return  getMaSv()+"\t" + getHoTen() +"\t"+ getDiaChi() +"\t"+ getSdt() +"\t" + getDiem() +"\n";
    }
    
    
}
