package bai3;

import java.util.Scanner;

public class TestZoo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Zoo newZoo = new Zoo();
        int n;
        do {            
            System.out.println("\t\t\tMenu chuong trinh");
            System.out.println("1. Them chuong\n2. Xoa chuong\n3. Them con vat\n4. Xoa con vat\n5. Xem tat ca cac con vat\n6. Thoat ");
            System.out.println("Chon chuon trinh can thuc hien: ");
            n = sc.nextInt();
            sc.nextLine();
            switch (n){
                case 1:{
                    Chuong newChuong = new Chuong();
                    newZoo.themChuong(newChuong);
                    break;
                }
                case 2:{
                    int maChuong;
                    System.out.println("Nhap ma chuong can xoa: ");
                    maChuong = sc.nextInt();
                    newZoo.xoaChuong(maChuong);
                    break;
                }
                case 3:{
                    System.out.println("Chon vi tri chuong (nhap ma chuong): ");
                    int chon = sc.nextInt();
                    sc.nextLine();
                    for(int i=0; i<newZoo.DanhSachChuong.size(); i++){
                        if(newZoo.DanhSachChuong.get(i).getMachuong()==chon){
                            String loai;
                            System.out.println("Nhap loai dong vat muon them (Tiger, Cat, Dog): ");
                            loai = sc.nextLine();
                            if("Tiger".equals(loai)){
                                Animal Tiger1 = new Tiger();
                                newZoo.DanhSachChuong.get(i).themConVat(Tiger1);
                            }else if("Cat".equals(loai)){
                                Animal Cat1 = new Cat();
                                newZoo.DanhSachChuong.get(i).themConVat(Cat1);
                            }else if("Dog".equals(loai)){
                                Animal Dog1 = new Dog();
                                newZoo.DanhSachChuong.get(i).themConVat(Dog1);
                            }
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.println("Chon vi tri chuong (nhap ma chuong): ");
                    int chon = sc.nextInt();
                    sc.nextLine();
                    for(int i=0; i<newZoo.DanhSachChuong.size(); i++){
                        if(newZoo.DanhSachChuong.get(i).getMachuong()==chon){
                            System.out.println("Nhap ten con vat can xoa: ");
                            String ten = sc.nextLine();
                            newZoo.DanhSachChuong.get(i).xoaConVat(ten);
                        }
                    }
                    
                    break;
                }
                case 5:{
                    System.out.println("\t   Danh sach quan ly vuon thu");
                    for(int i=0; i<newZoo.DanhSachChuong.size(); i++){
                        System.out.println("    Chuong thu "+ i+ " (ma chuong: "+newZoo.DanhSachChuong.get(i).getMachuong()+")");
                        for(int j=0; j<newZoo.DanhSachChuong.get(i).AnimalList.size(); j++){
                            System.out.println("Con vat thu: " + j);
                            newZoo.DanhSachChuong.get(i).AnimalList.get(j).xemThongTin();
                            System.out.println("");
                        }
                        System.out.println("--------");
                    }
                    break;
                }
                case 6:{
                    System.out.println("Ket thuc chuong trinh!");
                    break;
                }
            }
        } while (n!=6 );
    }
    
}
