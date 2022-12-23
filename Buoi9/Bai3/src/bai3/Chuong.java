package bai3;

import java.util.ArrayList;
import java.util.Scanner;


public class Chuong {
    static Scanner sc = new Scanner(System.in);
    private int machuong;
    ArrayList<Animal> AnimalList = new ArrayList<>();
    
    public void themConVat(Animal a){
        if(a instanceof Cat){
            ((Cat) a).input();
        }else if(a instanceof Dog){
            ((Dog) a).input();
        }else if(a instanceof Tiger){
            ((Tiger) a).input();
        }
        AnimalList.add(a);
        
    }
    
    public void xoaConVat(String ten){
        for(int i=0; i<AnimalList.size(); i++){
            if(AnimalList.get(i).getTen().equals(ten)){
                AnimalList.remove(i);
            }
        }
    }

    public int getMachuong() {
        return machuong;
    }

    public void setMachuong(int machuong) {
        this.machuong = machuong;
    }

    
    
    
    
}
