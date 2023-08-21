/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author tandat
 */
public class SanPham {
    private String masp,tensp,dvtS,malsp;
    private int gia;

    public SanPham(String masp, String tensp, String dvtS, String malsp, int gia) {
        this.masp = masp;
        this.tensp = tensp;
        this.dvtS = dvtS;
        this.malsp = malsp;
        this.gia = gia;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getDvtS() {
        return dvtS;
    }

    public void setDvtS(String dvtS) {
        this.dvtS = dvtS;
    }

    public String getMalsp() {
        return malsp;
    }

    public void setMalsp(String malsp) {
        this.malsp = malsp;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
}
