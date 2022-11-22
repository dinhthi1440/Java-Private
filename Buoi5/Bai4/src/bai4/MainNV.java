
package bai4;

import java.util.Scanner;

public class MainNV {
    static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong nhan vien: ");
        int s = sc.nextInt();
        NhanVien[] dsNv = new NhanVien[100];
        for(int i=0; i<s; i++){
            dsNv[i] = new NhanVien();
            dsNv[i].nhap();
        }
        
        int n;
        do{
            System.out.println("\t\tMENU CHUONG TRINH");
            System.out.println("1.Them moi Nv\n2.Hien thi danh sach nv \n3.Hien thi top 3 cham chi\n4.Tim kiem theo ho ten\n5.Thoat");
            System.out.println("Nhap chuc nang muon thuc hien: ");
            n = sc.nextInt();
            switch (n){
                case 1: {
                    sc.nextLine();
                    dsNv[s]= new NhanVien();
                    dsNv[s].nhap();
                    s++;
                    break;
                }
                case 2: {
                    xuatD();
                    for(int i=0; i<s; i++){
                        dsNv[i].xuat();
                    }
                    break;
                }
                case 3:{
                    xuatD();
                    if(s<3){
                        for(int i=0; i<s; i++){
                            dsNv[i].xuat();
                        }
                    }else{
                        int[] top = new int[s];
                        for(int i=0; i<s; i++){
                            top[i] = dsNv[i].getSoGiol();

                        }
                        for(int i = 0; i<s-1; i++){
                            for(int j=i+1; j<s; j++){
                                if(top[i]<top[j]){
                                    int temp = top[i];
                                    top[i]=top[j];
                                    top[j]=temp;
                                }
                            }
                        }
                        for(int i=0; i<s; i++){
                            for(int j =0; j<3; j++){
                                if(dsNv[i].getSoGiol()==top[j]){
                                    int count =0;
                                    count++;
                                    if(count==3){
                                        break;
                                    }
                                    dsNv[i].xuat();
                                }
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    timKiem(dsNv, s);
                    break;
                }
            }
        }while(n!=5);
    }
    static void xuatD(){
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Ho ten", "Tuoi", "GT", "Dia chi", "HWorked", "HRate", "Salary", "Tax");
    }
    static void timKiem(NhanVien a[], int s){
        sc.nextLine();
        System.out.println("Moi nhap ho ten can tim: ");
        String tim = sc.nextLine();
        xuatD();
        for(int i=0; i<s; i++){
            if(a[i].getHoTen() == null ? tim == null : a[i].getHoTen().equals(tim)){
                a[i].xuat();
            }
        }
    }
    
    
}
