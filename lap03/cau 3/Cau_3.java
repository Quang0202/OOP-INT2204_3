/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau_3;

/**
 *
 * @author Admin
 */
class conmeo
{
    private String maulong;
    private String gioitinh;
    private String ten;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public String getMaulong() {
        return maulong;
    }

    public void setMaulong(String maulong) {
        this.maulong = maulong;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    
}
class giangvien
{
    private String hoten;
    private int tuoi;
    private String lop;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
}
class loptruong
{
    private String hoten;
    private String sdt;
    private String email;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
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
    
}
class laptrinhvien
{
    private String hoten;
    private String gioitinh;
    private String ngonngu;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgonngu() {
        return ngonngu;
    }

    public void setNgonngu(String ngonngu) {
        this.ngonngu = ngonngu;
    }
    
}
class tongthong
{
    private String hoten;
    private int tuoi;
    private String gioitinh;
    private String nuoc;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNuoc() {
        return nuoc;
    }

    public void setNuoc(String nuoc) {
        this.nuoc = nuoc;
    }   
}
public class Cau_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        conmeo cm=new conmeo();
        cm.setTen("tom");
        cm.setGioitinh("duc");
        cm.setMaulong("mau den trang");
        System.out.println("chu meo ten: "+cm.getTen());
        System.out.println("gioi tinh:"+cm.getGioitinh());
        System.out.println("mau:"+cm.getMaulong());
    }
    
}
