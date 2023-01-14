
package cau2;

import java.util.ArrayList;
import java.util.Scanner;

public class Cau2 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Honey> dsHn = new ArrayList<>();
    public static void main(String[] args) {
        int n;
        do {            
            menu();
            System.out.println("Nhap vao chuong trinh muon thuc hien: ");
            n = sc.nextInt();
            sc.nextLine();
            switch (n){
                case 1:{
                    Honey a = new Honey();
                    addHoney(a);
                    dsHn.add(a);
                    break;
                }
                case 2:{
                    show();
                    break;
                }
                case 3:{
                    xoa();
                    break;
                }
                case 4:{
                    sua();
                    break;
                }case 5:{
                    themFavorite();
                    break;
                }
                case 6:{
                    
                    break;
                }
                case 7:{
                    System.out.println("Chuong trinh ket thuc!");
                    break;
                }
                
            }
        } while (n!=7);
    }
    
    static void menu(){
        System.out.println("1,Add Honey");
        System.out.println("2,Show all Honeys ");
        System.out.println("3,Delete Honey by id ");
        System.out.println("4,Edit Honey by id ");
        System.out.println("5,Add Favorite by honey id ");
        System.out.println("6,Sort Honey by name ");
        System.out.println("7,Exit");  
    }
    
    static void addHoney(Honey a){
        int id;
        do {            
            System.out.println("Nhap id Honey: ");
            id = sc.nextInt();
            sc.nextLine();
            for(int i=0; i<dsHn.size(); i++){
                if(dsHn.get(i).getId()==id){
                    id=-1;
                }
            }
        } while (id <0 && id == -1);
        a.setId(id);
        System.out.println("Nhap ten: ");
        a.setName(sc.nextLine());
        System.out.println("Nhap tuoi: ");
        a.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap gender: ");
        a.setGender(sc.nextLine());
        System.out.println("Nhap phone: ");
        a.setPhone(sc.nextLine());
        System.out.println("Nhap status honey: ");
        a.setStatus(sc.nextLine());
    }
    
    static void show(){
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "id", "Name", "age", "gender", "phone", "status");
        for(int i=0 ;i<dsHn.size(); i++){
            System.out.printf("%-10d %-10s %-10d %-10s %-10s %-10s \n", dsHn.get(i).getId(), dsHn.get(i).getName(),dsHn.get(i).getAge(), dsHn.get(i).getGender(),dsHn.get(i).getPhone(),dsHn.get(i).getStatus());
        }
    }
    static void xoa(){
        System.out.println("Nhap id can xoa: ");
        int n;
        n= sc.nextInt();
        sc.nextLine();
        for(int i=0; i<dsHn.size(); i++){
            if(dsHn.get(i).getId()==n){
                dsHn.remove(i);
            }
        }
    }
    static void sua(){
        System.out.println("Nhap id can sua: ");
        int n;
        n= sc.nextInt();
        
        for(int i=0; i<dsHn.size(); i++){
            if(dsHn.get(i).getId()==n){
                int a;
                do {                    
                    System.out.println("Chon thuoc tinh sua: ");
                    System.out.println("1,name\n 2,age\n 3,phone\n 4,status\n 5,thoat sua");
                    a = sc.nextInt();
                    sc.nextLine();
                    switch (a){
                        case 1:{
                            System.out.println("Nhap ten: ");
                            dsHn.get(i).setName(sc.nextLine());
                            break;
                        }
                        case 2:{
                            System.out.println("Nhap age: ");
                            dsHn.get(i).setAge(sc.nextInt());
                            break;
                        }
                        case 3:{
                            System.out.println("Nhap phone: ");
                            dsHn.get(i).setPhone(sc.nextLine());
                            break;
                        }
                        case 4:{
                            System.out.println("Nhap status: ");
                            dsHn.get(i).setStatus(sc.nextLine());
                            break;
                        }
                        case 5:{
                            System.out.println("Da thoat sua!");
                            break;
                        }
                    }
                } while (a!=5);
            }
        }
    }
    static void themFavorite(){
        System.out.println("Nhap id: " );
        int a;
        a =sc.nextInt();
        sc.nextLine();
        for(int i=0; i<dsHn.size(); i++){
            if(dsHn.get(i).getId()==a){
                Favorite s = new Favorite();
                dsHn.get(i).getDsF().add(s);
            }
        }
    }
    static void sapXep(){
        for(int i=0; i<dsHn.size()-1; i++){
//            if(dsHn.get(i).getName() < dsHn.get(i).getName(i+1)){
//                
//            }
        }
    }
    
}
