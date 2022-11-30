
package bai4;

import java.util.Scanner;

public class Nguoi {
    static Scanner sc = new Scanner(System.in);
    private String hoTen;
    private int tuoi;
    private String queQuan;
    private int maGV;

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public int getMaGV() {
        return maGV;
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

    public void setMaGV(int maGV) {
        this.maGV = maGV;
    }
    
    public void inPTT(){
        System.out.println("Nhap vao ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi =sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap que quan: ");
        queQuan = sc.nextLine();
        System.out.println("Nhap ma so GV: ");
        maGV = sc.nextInt();
        sc.nextLine();
    }
    public void outPTT(){
        System.out.printf("%-10s %-10d %-10s %-10d ", getHoTen(), getTuoi(), getQueQuan(), getMaGV());
    }
}
