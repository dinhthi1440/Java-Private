package bai3;

import java.util.Scanner;

public class Tiger extends Animal{
    static Scanner sc = new Scanner(System.in);
    private String loai;

    

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getLoai() {
        return loai="Tiger";
    }
    public void input(){
        System.out.println("Nhap ten: ");
        super.setTen(sc.nextLine());
        System.out.println("Nhap mo ta: ");
        super.setMoTa(sc.nextLine());
        System.out.println("Nhap tuoi: ");
        super.setTuoi(sc.nextInt());
        sc.nextLine();
    }
    @Override
    void xemThongTin() {
        System.out.println("Loai dong vat: "+ getLoai() );
        System.out.println("Ten: "+ getTen());
        System.out.println("Mo ta: " + getMoTa());
        System.out.println("Tuoi: "+ getTuoi());
    }

    @Override
    void tiengKeu() {
        System.out.println("Tieng Tiger keu");    
    }
    
}
