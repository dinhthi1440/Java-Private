
package bai3;

import java.util.Scanner;

public class HocSinh {
    static Scanner sc = new Scanner(System.in);
    private String hoTen;
    private int tuoi;
    private String queQuan;

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public void inputHS(){
        System.out.println("Nhap vao ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi =sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap que quan: ");
        queQuan = sc.nextLine();
    }
    public void outPutHS(){
        System.out.printf("%-10s %-10d %-10s ", getHoTen(), getTuoi(), getQueQuan());
    }
}
