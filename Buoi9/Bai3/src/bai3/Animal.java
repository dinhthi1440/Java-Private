package bai3;

public abstract class Animal {
    private String ten, moTa;
    private int tuoi;
    
    abstract void xemThongTin();
    abstract void tiengKeu();

    public String getTen() {
        return ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    
    
}
