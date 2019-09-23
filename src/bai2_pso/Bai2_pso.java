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
public class Bai2_pso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PhanSo ps1 = new PhanSo(14,6);
        PhanSo ps2 = new PhanSo(8,4);
        
        ps1.congPhanSo(ps2);
        ps1.truPhanSo(ps2);
        ps1.chiaPhanSo(ps2);
        ps1.nhanPhanSo(ps2);
        ps1.sosanhPhanSo(ps2);
    }
}
