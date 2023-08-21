/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author tandat
 */
import POJO.Ban;
import java.sql.ResultSet;
import java.util.ArrayList;
public class BanDAO {
    public static ArrayList<Ban> getDSB(){
        ArrayList<Ban> dsb = new ArrayList<Ban>();
        try {
            String sql = "select * from Ban";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                Ban b = new Ban(rs.getString("MaBan"),rs.getString("TenBan"),
                        rs.getString("TrangThai"));
                dsb.add(b);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu");
        }
        return dsb;
    }

    public static ArrayList<Ban> TimDSB(String tenban){
        ArrayList<Ban> dsb = new ArrayList<Ban>();
        try {
            String sql = "select * from Ban where TenBan like N'%"+tenban+"%'";
            ConnectionDB cn = new ConnectionDB();
            cn.getCn();
            ResultSet rs = cn.executeQuery(sql);
            while(rs.next()){
                Ban b = new Ban(rs.getString("MaBan"),rs.getString("TenBan"),
                        rs.getString("TrangThai"));
                dsb.add(b);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Lỗi không thể lấy dữ liệu");
        }
        return dsb;
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
