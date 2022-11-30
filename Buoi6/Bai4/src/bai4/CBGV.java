
package bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class CBGV {
    static Scanner sc = new Scanner(System.in);
    private int lCung;
    private int lThuong;
    private int lPhat;
    private int luong;
    private Nguoi hm = new Nguoi();
    static ArrayList<CBGV> dsCB = new ArrayList<>();

    public int getlCung() {
        return lCung;
    }

    public int getlThuong() {
        return lThuong;
    }

    public int getlPhat() {
        return lPhat;
    }

    public int getLuong() {
        return luong =getlCung()+getlThuong()-getlPhat();
    }

    public Nguoi getHm() {
        return hm;
    }
    
    public void setlCung(int lCung) {
        this.lCung = lCung;
    }

    public void setlThuong(int lThuong) {
        this.lThuong = lThuong;
    }

    public void setlPhat(int lPhat) {
        this.lPhat = lPhat;
    }

    public void setHm(Nguoi hm) {
        this.hm = hm;
    }
    
    static void input(){
        System.out.println("Nhap so luong SB can them: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            CBGV a = new CBGV();
            a.getHm().inPTT();
            System.out.println("Nhap luong cung: ");
            a.setlCung(sc.nextInt());
            System.out.println("Nhap luong thuong: ");
            a.setlThuong(sc.nextInt());
            System.out.println("Nhap luong phat: ");
            a.setlPhat(sc.nextInt());
            sc.nextLine();
            dsCB.add(a);
        }
    }
    static void outPut(){
        
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s \n", "Hoten", "Tuoi", "QueQuan", "MaGV", "L.Cung", "L.Thuong", "L.Phat", "L.Thuc");
        for(int i=0; i<dsCB.size(); i++){
            dsCB.get(i).getHm().outPTT();
            System.out.printf("%-10d %-10d %-10d %-10d \n", dsCB.get(i).getlCung(), dsCB.get(i).getlThuong(), dsCB.get(i).getlPhat(), dsCB.get(i).getLuong());
        }
    }
    
    static void xoa(){
        System.out.println("Nhap ma so gv can xoa: ");
        int so = sc.nextInt();
        for(int i=0; i<dsCB.size(); i++){
            if(dsCB.get(i).getHm().getMaGV()==so){
                dsCB.remove(i);
            }
        }
        
    }
    public static void main(String[] args) {
        int chon = 0;
        do {
            System.out.println("\t\t1, Them gv");
            System.out.println("\t\t2, Xuat danh sach gv");
            System.out.println("\t\t3, Xoa gv");
            System.out.println("\t\t4, Ket thuc chuong trinh");
            
            System.out.println("Nhap chuong trinh can chon: ");
            chon = sc.nextInt();
            switch(chon){
                case 1:{
                    input();
                    break;
                }
                case 2:{
                    System.out.println("\tDanh sach CB: ");
                    outPut();
                    break;
                }
                case 3:{
                    System.out.println("\tDanh sach sau khi xoa: ");
                    xoa();
                    outPut();
                    break;
                }
            }
        } while (chon!=4);
    }
    
}
