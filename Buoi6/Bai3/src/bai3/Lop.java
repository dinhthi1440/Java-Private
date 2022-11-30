
package bai3;

import java.util.Scanner;

public class Lop {
    static Scanner sc = new Scanner(System.in);
    
    private int maLop;
    private String tenLop;
    private HocSinh a = new HocSinh();

    public static Scanner getSc() {
        return sc;
    }

    public int getMaLop() {
        return maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public HocSinh getA() {
        return a;
    }

    public static void setSc(Scanner sc) {
        Lop.sc = sc;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void setA(HocSinh a) {
        this.a = a;
    }
    
    public void inPutL(){
        a.inputHS();
        System.out.println("Nhap ma lop: ");
        maLop = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten lop: ");
        tenLop = sc.nextLine();
    }
    public void outPL(){
        a.outPutHS();
        System.out.printf("%-10s %-10s \n", getMaLop(), getTenLop());
    }
}
