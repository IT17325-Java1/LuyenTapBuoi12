/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai01;

/**
 *
 * @author NgocTV
 */
public class BanGhe {

    private String maBG;
    private String tenBanGhe;
    private String loaiBanGhe;
    private String chatLieu;
    private int chieuCao;
    private int chieuRong;

    public BanGhe() {
    }

    public BanGhe(String maBG, String tenBanGhe, String loaiBanGhe, String chatLieu, int chieuCao, int chieuRong) {
        this.maBG = maBG;
        this.tenBanGhe = tenBanGhe;
        this.loaiBanGhe = loaiBanGhe;
        this.chatLieu = chatLieu;
        this.chieuCao = chieuCao;
        this.chieuRong = chieuRong;
    }

    public String getMaBG() {
        return maBG;
    }

    public void setMaBG(String maBG) {
        this.maBG = maBG;
    }

    public String getTenBanGhe() {
        return tenBanGhe;
    }

    public void setTenBanGhe(String tenBanGhe) {
        this.tenBanGhe = tenBanGhe;
    }

    public String getLoaiBanGhe() {
        return loaiBanGhe;
    }

    public void setLoaiBanGhe(String loaiBanGhe) {
        this.loaiBanGhe = loaiBanGhe;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void display() {
        System.out.println("BanGhe{" + "maBG=" + maBG + ", tenBanGhe=" + tenBanGhe + ", loaiBanGhe=" + loaiBanGhe + ", chatLieu=" + chatLieu + ", chieuCao=" + chieuCao + ", chieuRong=" + chieuRong + '}');
    }
}
