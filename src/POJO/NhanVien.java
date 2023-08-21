/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author Administrator
 */
public class NhanVien {
    private String ma, ten, ngaysinhString, gioitinhString, diachiString, sdt, email, hinhString, taikhoanString, matkhauString, quyen;

    public NhanVien(String ma, String ten, String ngaysinhString, String gioitinhString, String diachiString, String sdt, String email, String hinhString, String taikhoanString, String matkhauString, String quyen) {
        this.ma = ma;
        this.ten = ten;
        this.ngaysinhString = ngaysinhString;
        this.gioitinhString = gioitinhString;
        this.diachiString = diachiString;
        this.sdt = sdt;
        this.email = email;
        this.hinhString = hinhString;
        this.taikhoanString = taikhoanString;
        this.matkhauString = matkhauString;
        this.quyen = quyen;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinhString() {
        return ngaysinhString;
    }

    public void setNgaysinhString(String ngaysinhString) {
        this.ngaysinhString = ngaysinhString;
    }

    public String getGioitinhString() {
        return gioitinhString;
    }

    public void setGioitinhString(String gioitinhString) {
        this.gioitinhString = gioitinhString;
    }

    public String getDiachiString() {
        return diachiString;
    }

    public void setDiachiString(String diachiString) {
        this.diachiString = diachiString;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHinhString() {
        return hinhString;
    }

    public void setHinhString(String hinhString) {
        this.hinhString = hinhString;
    }

    public String getTaikhoanString() {
        return taikhoanString;
    }

    public void setTaikhoanString(String taikhoanString) {
        this.taikhoanString = taikhoanString;
    }

    public String getMatkhauString() {
        return matkhauString;
    }

    public void setMatkhauString(String matkhauString) {
        this.matkhauString = matkhauString;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }
    
}
