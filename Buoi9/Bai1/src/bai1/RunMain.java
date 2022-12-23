
package bai1;

import java.util.ArrayList;

public class RunMain {

    public static void main(String[] args) {
        
        //tao list danh sach phuong tien
        HangSanXuat hang = new HangSanXuat("ToYoTa", "JaPan");
        ArrayList<PhuongTienDiChuyen> listX = new ArrayList<PhuongTienDiChuyen>(3);
        PhuongTienDiChuyen a = new XeOto("Xang", hang);
        PhuongTienDiChuyen b = new XeDap(hang);
        PhuongTienDiChuyen c = new MayBay("Xang/Dau", hang);
        
        listX.add(a);
        listX.add(b);
        listX.add(c);
        
        //tim va in ra phuong tien co van toc lon nhat
        double max =0;
        for(int i=0; i<listX.size()-1; i++){
            for(int j=i+1; j<listX.size(); j++){
                if(listX.get(i).layVanToc() < listX.get(j).layVanToc() ){
                    max = listX.get(j).layVanToc();
                }
            }
            
        }
        for(int i=0; i<listX.size(); i++){
            if(listX.get(i).layVanToc()== max ){
                System.out.println("Loai xe la: " + listX.get(i).getLoaiPhuongTien());
                System.out.println("Ten hang san xuat la: " + listX.get(i).layTenHangSanXuat());
                System.out.println("Van toc la: " + listX.get(i).layVanToc());
            }
        }
    }
    
}
