/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import POJO.LoaiSP;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author tandat
 */
public class LoaiSPDAO {
    public static ArrayList<LoaiSP> getDSLSP(){
        ArrayList<LoaiSP> dslsp = new ArrayList<LoaiSP>();
        try {
            String sql = "select * from LoaiSanPham";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                LoaiSP b = new LoaiSP(rs.getString("MaLSP"),rs.getString("TenLSP"));
                dslsp.add(b);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu");
        }
        return dslsp;
    }

    public static ArrayList<LoaiSP> TimDSLSP(String tenlsp){
        ArrayList<LoaiSP> dslsp = new ArrayList<LoaiSP>();
        try {
            String sql = "select * from LoaiSanPham where TenLSP like N'%"+tenlsp+"%'";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                LoaiSP b = new LoaiSP(rs.getString("MaLSP"),rs.getString("TenLSP"));
                dslsp.add(b);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu");
        }
        return dslsp;
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
