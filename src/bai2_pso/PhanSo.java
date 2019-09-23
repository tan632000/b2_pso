/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_pso;

/**
 *
 * @author Admin
 */
public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    
    public int Tim_USCLN (int a, int b){
        while(a!=b){
            if(a>b){
                a-=b;
            }else{
                b-=a; 
            }
        }
        return a;
    }
    
    public void toiGianPhanSo(){
        int i = Tim_USCLN(this.getTu(),this.getMau());
        this.setTu(this.getTu()/i);
        this.setMau(this.getMau()/i);
    }
    
    public void congPhanSo(PhanSo ps){
        int tuso = this.getTu()*ps.getMau() + this.getMau()*ps.getTu();
        int mauso = this.getMau()*ps.getMau();
        PhanSo tongPhanSo = new PhanSo(tuso,mauso);
        tongPhanSo.toiGianPhanSo();
        System.out.println("Tong 2 phan so = " + tongPhanSo.tu + "/" + tongPhanSo.mau);
    }
    
    public void truPhanSo(PhanSo ps){
        int tuso = this.getTu()*ps.getMau() - this.getMau()*ps.getTu();
        int mauso = this.getMau()*ps.getMau();
        PhanSo hieuPhanSo = new PhanSo(tuso,mauso);
        hieuPhanSo.toiGianPhanSo();
        System.out.println("Hieu 2 phan so = " + hieuPhanSo.tu + "/" + hieuPhanSo.mau);
    }
    
    public void nhanPhanSo(PhanSo ps){
        int tuso = this.getTu()*ps.getTu();
        int mauso = this.getMau()*ps.getMau();
        PhanSo tichPhanSo = new PhanSo(tuso,mauso);
        tichPhanSo.toiGianPhanSo();
        System.out.println("Tich 2 phan so = " + tichPhanSo.tu + "/" + tichPhanSo.mau);
    }
    public void chiaPhanSo(PhanSo ps){
        int tuso = this.getTu()*ps.getMau();
        int mauso = this.getMau()*ps.getTu();
        PhanSo thuongPhanSo = new PhanSo(tuso,mauso);
        thuongPhanSo.toiGianPhanSo();
        System.out.println("Thuong 2 phan so = " + thuongPhanSo.tu + "/" + thuongPhanSo.mau);
    }
    public void sosanhPhanSo(PhanSo ps){
        int tuso = this.getTu()*ps.getMau() - this.getMau()*ps.getTu();
        int mauso = this.getMau()*ps.getMau();
        if(tuso>mauso){
            System.out.println("Phan so thu 1 lon hon phan so thu 2");
        }else if(tuso - mauso == 0){
            System.out.println("Phan so thu 1 bang phan so thu 2");
        }else{
            System.out.println("Phan so thu 1 nho hon phan so thu 2");
        }
    }
}




















