package baii2;

import java.util.Scanner;

public class TTSINHVIEN {
    static Scanner sc = new Scanner(System.in);
    
    private int sbd;
    private String hoTen;
    private String diaChi ;
    private int mucUt;

    public int getSbd() {
        return sbd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getMucUt() {
        return mucUt;
    }

    public void setSbd(int sbd) {
        this.sbd = sbd;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setMucUt(int mucUt) {
        this.mucUt = mucUt;
    }
    
    public void nhapTT(){
        System.out.println("Nhap sbd sinh vien: ");
        sbd = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao ho ten sinh vien: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap vao dia chi: ");
        diaChi = sc.nextLine();
        System.out.println("Nhap vao muc uu tien: ");
        mucUt = sc.nextInt();
    }
    public void xuatTT(){
        System.out.printf("%-10d %-10s %-10s %-10d \n", getSbd(), getHoTen(), getDiaChi(), getMucUt());
    }
}
