/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import POJO.SanPham;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author tandat
 */
public class SanPhamDAO {
    public static ArrayList<SanPham> getDSSP(){
        ArrayList<SanPham> dssp = new ArrayList<SanPham>();
        try {
            String sql = "select * from SanPham";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                SanPham sp = new SanPham(rs.getString("MaSP"),rs.getString("TenSP"),
                        rs.getString("DVT"),rs.getString("MaLSP"),
                        rs.getInt("GiaTien"));
                dssp.add(sp);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu");
        }
        return dssp;
    }

    public static ArrayList<SanPham> TimDSSP(String tensp){
        ArrayList<SanPham> dssp = new ArrayList<SanPham>();
        try {
            String sql = "select * from SanPham where TenSP like N'%"+tensp+"%'";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                SanPham sp = new SanPham(rs.getString("MaSP"),rs.getString("TenSP"),
                        rs.getString("DVT"),rs.getString("MaLSP"),
                        rs.getInt("GiaTien"));
                dssp.add(sp);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu");
        }
        return dssp;
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
}
