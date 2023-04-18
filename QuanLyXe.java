package TheoDoiXeMay;

import java.util.Scanner;

public class Vehicle {
    Scanner sc = new Scanner(System.in);
    private String TenChuXe, LoaiXe;
    private int DungTich;
    private double TriGia;
    public Vehicle(String TenChuXe, String LoaiXe, int DungTich, double TriGia){
        this.TenChuXe = TenChuXe;
        this.LoaiXe = LoaiXe;
        this.DungTich = DungTich;
        this.TriGia = TriGia;

    }

    private Vehicle() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getTenChuXe() {
        return TenChuXe;
    }

    public void setTenChuXe(String TenChuXe) {
        this.TenChuXe = TenChuXe;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String LoaiXe) {
        this.LoaiXe = LoaiXe;
    }

    public int getDungTich() {
        return DungTich;
    }

    public void setDungTich(int DungTich) {
        this.DungTich = DungTich;
    }

    public double getTriGia() {
        return TriGia;
    }

    public void setTriGia(double TriGia) {
        this.TriGia = TriGia;
    }

    public double ThuePhaiNop(){
        double ThuePhaiNop = 0;
        if (DungTich<100){
            ThuePhaiNop=(0.01*TriGia);
            
        }
        if (DungTich>100&&DungTich<200){
            ThuePhaiNop=(0.03*TriGia);
    }
        if (DungTich>200){
            ThuePhaiNop=(0.05*TriGia);
        }
    return ThuePhaiNop;


    }
    public void nhap(){
        System.out.printf ("Nhap Ten Chu Xe");
        TenChuXe = sc.nextLine();
        System.out.printf ("Nhap Loai Xe");
        LoaiXe = sc.nextLine();
        System.out.printf ("Nhap Dung Tich");
        DungTich = sc.nextInt();
        System.out.printf ("Nhap DungTich");
        TriGia = sc .nextDouble();
        System.out.printf ("Nhap Tri Gia");

    }
    
    public void xuat(){
        System.out.printf("\nTen Chu Xe la:"+getTenChuXe());
        System.out.printf("\nLoai Xe la:"+getLoaiXe());
        System.out.printf("\nDung Tich Xe la:"+getDungTich());
        System.out.printf("\nTri Gia cua xe la:"+getTriGia());
        System.out.printf("\nThue Phai Nop la:"+ThuePhaiNop());

}
    public class main {
        public static void main (String[] args){
            Vehicle xe1 = new Vehicle();
            Vehicle xe2 = new Vehicle();
            Vehicle xe3 = new Vehicle();
            xe1.nhap();
            xe2.nhap();
            xe3.nhap();
            xe1.xuat();
            xe2.xuat();
            xe3.xuat();
            
    } 
}
}
