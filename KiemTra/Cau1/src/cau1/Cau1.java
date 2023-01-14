
package cau1;

import java.util.Scanner;

public class Cau1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int a=0;
        System.out.println("Nhap chuoi: ");
            s = sc.nextLine();
        do {            
            System.out.println("Nhap chuoi: ");
            s = sc.nextLine();
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) !='(' || s.charAt(i)!=')'){
                    a=-1;
                    System.out.println(s.charAt(i));
                }
            }
            System.out.println(a);
        } while(a==-1);
        int demM=0;
        int demD=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                demM++;
            }else if(s.charAt(i)==')'){
                demD++;
            }
        }
        if(demD==demM){
            System.out.println("0");
        }else if(demD>demM){
            System.out.println(demD-demM);
        }else if(demD< demM){
            System.out.println(demM-demD);
        }
    }
    
}
