/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PS {

    /**
     * @param args the command line arguments
     */
    private int tu;
    private int mau;

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    void PS(int tu, int mau)
    {
        this.tu=tu;
        this.mau=mau;
    }
    public void cong(PS ps1, PS ps2)
    {
       PS sum=new PS();
       sum.tu=ps1.tu*ps2.mau+ps2.tu*ps1.mau;
       sum.mau=ps1.mau*ps2.mau;
       if(sum.tu==0)
            System.out.println("0");
        else
        System.out.println(sum.tu+"/"+sum.mau);
    }
    public void tru(PS ps1,PS ps2)
    {
        PS hieu=new PS();
        hieu.tu=ps1.tu*ps2.mau-ps2.tu*ps1.mau;
        hieu.mau=ps1.mau*ps2.mau;
        if(hieu.tu==0)
            System.out.println("0");
        else
        System.out.println(hieu.tu+"/"+hieu.mau);
    }
    public void nhan(PS ps1,PS ps2)
    {
        PS nhan=new PS();
        nhan.tu=ps1.tu*ps2.tu;
        nhan.mau=ps1.mau*ps2.mau;
        System.out.println(nhan.tu+"/"+nhan.mau);
    }
    public boolean equals(PS ps1,PS ps2)
    {
      int a,b;
      a=ps1.tu/ps2.mau;
      b=ps2.tu/ps2.mau;
      if(a==b)
          return true;
      else
          return false;
     }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int tu1,mau1,tu2,mau2;
        tu1=sc.nextInt();
        mau1=sc.nextInt();
        PS ps1=new PS();
        ps1.setTu(tu1);
        ps1.setMau(mau1);
        tu2=sc.nextInt();
        mau2=sc.nextInt();
        PS ps2=new PS();
        ps2.setTu(tu2);
        ps2.setMau(mau2);
        PS tinh=new PS();
        tinh.cong(ps1, ps2);
        tinh.tru(ps1, ps2);
        tinh.nhan(ps1, ps2);
        System.out.println(tinh.equals(ps1, ps2));
        
    }
    
}
