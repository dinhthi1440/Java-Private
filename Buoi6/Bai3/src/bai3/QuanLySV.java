package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySV {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Lop> dsLop = new ArrayList<>();
    
    static void input(){
        System.out.println("Nhap so luong hoc sinh can them: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            Lop b = new Lop();
            b.inPutL();
            dsLop.add(b);
        }
    }
    static void outPut(){
        System.out.println("\t\tDanh sach hoc sinh: ");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", "HoTen", "Tuoi", "QueQuan", "MaLop", "TenLop");
        for(int i=0; i<dsLop.size(); i++){
            dsLop.get(i).outPL();
        }
    }
    
    static void tuoi20(){
        System.out.println("\tDanh sach hoc sinh 20 tuoi");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", "HoTen", "Tuoi", "QueQuan", "MaLop", "TenLop");
        for(int i=0; i<dsLop.size(); i++){
            if(dsLop.get(i).getA().getTuoi()==20){
                dsLop.get(i).outPL();
            }
        }
    }
    static void tuoiVque(){
        System.out.println("\tDanh sach hoc sinh 23 tuoi va que o DN");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", "HoTen", "Tuoi", "QueQuan", "MaLop", "TenLop");
        for(int i=0; i<dsLop.size(); i++){
            if(dsLop.get(i).getA().getTuoi()==23 && "DN".equals(dsLop.get(i).getA().getQueQuan())){
                dsLop.get(i).outPL();
            }
        }
    }
    static void sapXep(){
        for(int i=0; i<dsLop.size()-1; i++){
            for(int j=i+1; j<dsLop.size(); j++){
                if(dsLop.get(i).getA().getQueQuan().compareTo(dsLop.get(j).getA().getQueQuan())>0){
                    Lop c = new  Lop();
                    c = dsLop.get(i);
                    dsLop.set(i, dsLop.get(j));
                    dsLop.set(j, c);
                }
            }
        }
    }
    public static void main(String[] args) {
        int chon=0;
        do {            
            
            System.out.println("\t\t1, Them hoc sinh moi");
            System.out.println("\t\t2, Xuat thong tin cac hoc sinh");
            System.out.println("\t\t3, Hien thi cac hoc sinh 20 tuoi");
            System.out.println("\t\t4, Cho biet so luong hs co tuoi 23 va que o DN");
            System.out.println("\t\t5, Sap xep sinh vien tang dan theo que quan");
            System.out.println("\t\t6, Ket thuc chuong trinh");
            System.out.println("\t\t\tNhap vao chuong trinh ban muon thuc hien: ");
            chon = sc.nextInt();
            switch (chon){
                case 1:{
                    input();
                    break;
                }
                case 2:{
                    outPut();
                    break;
                }
                case 3:{
                    tuoi20();
                    break;
                }
                case 4:{
                    tuoiVque();
                    break;
                }
                case 5:{
                    sapXep();
                    outPut();
                    break;
                }
            }
        } while (chon!=6);
    }
    
}
