/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau_1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Cau_1 {

    /**
     * @param args the command line arguments
     * 
     */
    void ucln(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.println(a);
    }
    void fibonaci(int n)
    {
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        int a;
        a=arr[n];
        System.out.println(a);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a,b,n;
        a=sc.nextInt();
        b=sc.nextInt();
        Cau_1 c;
        c=new Cau_1();
        c.ucln(a, b);
        n=sc.nextInt();
        c.fibonaci(n);
    }
    
}
