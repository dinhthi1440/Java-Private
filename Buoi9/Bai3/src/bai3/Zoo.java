package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    static Scanner sc = new Scanner(System.in);
    ArrayList<Chuong> DanhSachChuong = new ArrayList<>();

    public void themChuong(Chuong c){
        System.out.println("Nhap ma chuong can them: ");
        c.setMachuong(sc.nextInt());
        sc.nextLine();
        if(checkMaC(c.getMachuong())==false){
            DanhSachChuong.add(c);
        }else{
            System.out.println("Da ton tai chuong nay, moi them lai chuong khac");
        }
        
    }
    
    public void xoaChuong(int maChuong){
        for(int i=0; i<DanhSachChuong.size(); i++){
            if(checkMaC(maChuong)==true){
                if(DanhSachChuong.get(i).getMachuong()==maChuong){
                    DanhSachChuong.remove(i);
                }
            }else{
                System.out.println("Chua co ma chuong nay nen khong the xoa!");
            }
        }
        
    }
    
    boolean checkMaC(int ma){
        for(int i=0; i<DanhSachChuong.size(); i++){
            if(DanhSachChuong.get(i).getMachuong()==ma){
                return true;
            }
        }
        return false;
    }
}
