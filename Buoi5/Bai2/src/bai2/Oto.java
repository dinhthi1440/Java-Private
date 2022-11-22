package bai2;

import java.util.Scanner;


public class Oto {
    
    static Scanner sc = new Scanner(System.in);
    private String chuSh;
    private String tenXe;
    private String hang;
    private int namMua;
    private float gia;
    private int namSd;
    private float giaHt;
    

    public void setChuSh(String chuSh) {
        this.chuSh = chuSh;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void setNamMua(int namMua) {
        this.namMua = namMua;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getChuSh() {
        return chuSh;
    }

    public String getTenXe() {
        return tenXe;
    }

    public String getHang() {
        return hang;
    }

    public float getGia() {
        return gia;
    }
    public int getNamSd() {
        return namSd= 2022 - namMua;
    }

    public float getGiaHt() {
        if(getGia() < 1){
            return giaHt = (float)(getGia() - (getGia()*0.07*getNamSd()));
        }else if(getGia() >= 1 && getGia() <=2){
            return giaHt = (float)(getGia() - (getGia()*0.05*getNamSd()));
        }else if(getGia() > 2){
            return giaHt = (float)(getGia() - (getGia()*0.03*getNamSd()));
        }
        return giaHt;
    }
    public void nhap(){
        System.out.println("Nhap ten chu so huu: ");
        setChuSh(sc.nextLine());
        System.out.println("Nhap ten xe: ");
        setTenXe(sc.nextLine());
        System.out.println("Nhap ten Hang: ");
        setHang(sc.nextLine());
        System.out.println("Nhap vao gia mua (ty): ");
        setGia(sc.nextFloat());
        System.out.println("Nhap vao nam mua: ");
        setNamMua(sc.nextInt());
        sc.nextLine();
    }
    public void xuat(){
        System.out.printf("%-10s%-10s%-10s%-10.2f%-15d%-10.3f\n", getChuSh(), getTenXe(), getHang(), getGia(), getNamSd(), getGiaHt());
    }
    static void sapXep(Oto dsoto[]){
        for(int i=0; i<dsoto.length-1; i++){
            for(int j=i+1; j<dsoto.length; j++){
                if(dsoto[i].getGiaHt()<dsoto[j].getGiaHt()){
                    Oto a = new Oto();
                    a = dsoto[i];
                    dsoto[i]=dsoto[j];
                    dsoto[j]= a;
                }
            }
        }
    }
    public static void main(String[] args) {
        Oto[] dsoto = new Oto[2];
        for(int i=0; i<dsoto.length; i++){
            dsoto[i] = new Oto();
            dsoto[i].nhap();
        }
        sapXep(dsoto);
        System.out.printf("%-10s%-10s%-10s%-10s%-15s%-10S\n", "Chu so huu", "Ten xe", "Hang", "Gia(Ty)", "Nam su dung", "Gia HT(Ty)");
        for(int i=0; i<dsoto.length; i++){
            dsoto[i].xuat();
        }
    }
    
}
