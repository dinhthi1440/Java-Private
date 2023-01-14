
package cau2;

import java.util.ArrayList;

public class Honey extends PerSon{
    private int id;
    private String status;
    ArrayList<Favorite> dsF = new ArrayList<>();
    

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    
    public void setStatus(String status) {
        this.status = status;
    }

    

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Favorite> getDsF() {
        return dsF;
    }

    public void setDsF(ArrayList<Favorite> dsF) {
        this.dsF = dsF;
    }

    
    
}
