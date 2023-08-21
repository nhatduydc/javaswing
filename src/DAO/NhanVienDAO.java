/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import POJO.NhanVien;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
//String ma, String ten, String ngaysinhString, String gioitinhString, String diachiString, String sdt, 
//String email, String hinhString, String taikhoanString, String matkhauString, String quyen
public class NhanVienDAO {
    public static ArrayList<NhanVien> getDSNV(){
        ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
        try {
            String sql = "select * from NhanVien";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                NhanVien nv = new NhanVien(rs.getString("MaNV"),rs.getString("TenNV"),
                        rs.getString("NgaySinh"),rs.getString("GioiTinh"),
                        rs.getString("DiaChi"),rs.getString("SDT"),
                        rs.getString("Email"),rs.getString("HinhAnh"),
                        rs.getString("TaiKhoan"),rs.getString("TenNV"),
                        rs.getString("Quyen"));
                dsnv.add(nv);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu");
        }
        return dsnv;
    }

    public static ArrayList<NhanVien> TimDSNV(String tennv){
        ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
        try {
            String sql = "select * from NhanVien where TenNV like N'%"+tennv+"%'";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                NhanVien nv = new NhanVien(rs.getString("MaNV"),rs.getString("TenNV"),
                        rs.getString("NgaySinh"),rs.getString("GioiTinh"),
                        rs.getString("DiaChi"),rs.getString("SDT"),
                        rs.getString("Email"),rs.getString("HinhAnh"),
                        rs.getString("TaiKhoan"),rs.getString("TenNV"),
                        rs.getString("Quyen"));
                dsnv.add(nv);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu");
        }
        return dsnv;
    }
    public static int ThemXoaSua(String sql){
        int i=0;
        try {
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
             i = cn.executeUpdate(sql);
            cn.close();
            System.out.println("Thêm/xóa/sửa thành công");
            
        } catch (Exception e) {
            System.out.println("Thêm/xóa/sửa không thành công");
           
        }
        return i;
    }
    public static String XacNhanTK(String tk, String mk, String quyen){
        String kq = "";
        try {
            String sql = "select TaiKhoan from NhanVien Where TaiKhoan = '"+tk+"' and MatKhau = '"+mk+"' and Quyen = '"+quyen+"'";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                kq = rs.getString(1);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu");
        }
        return kq;
    }
}
