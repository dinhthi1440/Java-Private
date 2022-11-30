package baii2;

import java.util.ArrayList;
import java.util.Scanner;

public class Baii2 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<TTSINHVIEN> khoiA = new ArrayList<>();
    static ArrayList<TTSINHVIEN> khoiB = new ArrayList<>();
    static ArrayList<TTSINHVIEN> khoiC = new ArrayList<>();
    static ArrayList<TTSINHVIEN> ca3khoi = new ArrayList<>();
    
    static void input(){
        int soL=0;
        System.out.println("Nhap so luong sinh vien can them moi: ");
        soL = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<soL; i++){
            System.out.println("Sinh vien nhap thuoc khoi thi nao: ");
            String khoiThi = sc.nextLine();
            if(null != khoiThi)switch (khoiThi) {
                case "A":
                    TTSINHVIEN a = new TTSINHVIEN();
                    a.nhapTT();
                    khoiA.add(a);
                    ca3khoi.add(a);
                    break;
                case "B":
                    TTSINHVIEN b = new TTSINHVIEN();
                    b.nhapTT();
                    khoiA.add(b);
                    ca3khoi.add(b);
                    break;
                case "C":
                    TTSINHVIEN c = new TTSINHVIEN();
                    c.nhapTT();
                    khoiA.add(c);
                    ca3khoi.add(c);
                    break;
                default:
                    break;
            }
        }
    }
    static void outPut(){
        System.out.println("\t\tDanh sach sinh vien: ");
        System.out.println("\tKhoi A");
        System.out.printf("%-10s %-10s %-10s %-10s \n", "Sbd", "HoTen", "DiaChi", "MucUT");
        for(int i=0; i<khoiA.size(); i++){
            khoiA.get(i).xuatTT();
        }
        System.out.println("\n\tKhoi B");
        System.out.printf("%-10s %-10s %-10s %-10s \n", "Sbd", "HoTen", "DiaChi", "MucUT");
        for(int i=0; i<khoiB.size(); i++){
            
            khoiB.get(i).xuatTT();
        }
        System.out.println("\n\tKhoi C");
        System.out.printf("%-10s %-10s %-10s %-10s \n", "Sbd", "HoTen", "DiaChi", "MucUT");
        for(int i=0; i<khoiC.size(); i++){
            
            khoiC.get(i).xuatTT();
        }
    }
    static void timKiem(){
        System.out.println("Nhap ten sbd sinh vien can tim: ");
        int a = sc.nextInt();
        for(int i=0; i<ca3khoi.size(); i++){
            if(ca3khoi.get(i).getSbd()==a){
                System.out.println("\tThong tin sinh vien: ");
                System.out.printf("%-10s %-10s %-10s %-10s \n", "Sbd", "HoTen", "DiaChi", "MucUT");
                ca3khoi.get(i).xuatTT();
            }
        }
        
    }
    public static void main(String[] args) {
        
        
        int chon=0;
        do {            
            System.out.println("\t\t\tNhap vao chuc nang muon thuc hien: ");
            System.out.println("\t\t1,Them sinh vien\n\t\t2, Xuat thong tin sinh vien\n\t\tTim kiem sinh vien\n\t\t4,Ket thuc chuong trinh");
            chon = sc.nextInt();
            switch(chon){
                case 1: {
                    input();
                    break;
                }
                case 2: {
                    outPut();
                    break;
                }
                case 3: {
                    timKiem();
                    break;
                }
            }
            
        } while (chon!=4);
    }
    
}
