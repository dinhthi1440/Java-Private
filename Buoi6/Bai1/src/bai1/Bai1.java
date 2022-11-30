package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> Ten = new ArrayList<>();
    static void search(int n){
        
        for(int i =0; i<n; i++){
            System.out.println("Nhap vao ptu " +(i+1)+": ");
            String a = new String();
            a = sc.nextLine();
            Ten.add(a);
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap vao so luong phan tu: ");
        int n=0;
        n = sc.nextInt();
        sc.nextLine();
        search(n);
        System.out.println(Ten);
    }
    
}
