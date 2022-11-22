
package bai3;
import java.util.Scanner;

public class DanhSach {
    static Scanner sc = new Scanner(System.in);
    static void sapXep(SinhVien a[]){
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i].getDiem()>a[j].getDiem()){
                    SinhVien temp = new SinhVien();
                    temp = a[i];
                    a[i] = a[j];
                    a[j]=temp;
                }
            }
        }
    }
    static void xuat(SinhVien a[]){
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "MSV", "Ho Ten", "Dia chi", "Sdt", "Diem so");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
    static void timKiem(SinhVien a[]){
        System.out.println("Nhap vao Sinh vien muon tim: ");
        sc.nextLine();
        String ten;
        ten = sc.nextLine();
        for(int i=0; i<a.length; i++){
            if(a[i].getHoTen().endsWith(ten)==true){
                
                System.out.println(a[i]);
            }
        }
    }
    static void sapXepten(SinhVien a[]){
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                int chuSau = a[i].getHoTen().codePointAt(a[i].getHoTen().lastIndexOf(' ')+1);
                int chuTruoc = a[j].getHoTen().codePointAt(a[j].getHoTen().lastIndexOf(' ')+1);
                if(chuSau > chuTruoc ){
                    SinhVien temp = new SinhVien();
                    temp = a[i];
                    a[i] = a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap vao so luong sinh vien: ");
        n = sc.nextInt();
        SinhVien[] dsSv = new SinhVien[n];
        for(int i=0; i<n; i++){
            dsSv[i] = new SinhVien();
            dsSv[i].nhap();
            
        }
        int m;
        do{
            
            System.out.println("Nhap vao chuong trinh ban muon thuc hien: ");
            System.out.println("1. Xuat danh sach va sap xep\n2.Tim kiem theo ten\n3.Sap xep danh sach theo ten\n4.Thoat khoi chuong trinh");
            m = sc.nextInt();
            switch(m){
                case 1:{
                    sapXep(dsSv);
                    xuat(dsSv);
                    break;
                }
                case 2:{
                    timKiem(dsSv);
                    break;
                }
                    
                case 3:{
                    sapXepten(dsSv);
                    xuat(dsSv);
                    break;
                }
                case 4:
                    break;

            }
        }while(m!=4);
    }
    
}
