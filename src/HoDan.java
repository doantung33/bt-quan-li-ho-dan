import java.util.Date;

public class HoDan extends Nguoi {
    private int soThanhVien;
    private int soNha;
    private Nguoi nguoi;

    public HoDan() {
    }

    public HoDan(int soThanhVien, int soNha, Nguoi nguoi) {
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
        this.nguoi = nguoi;
    }

    public HoDan(String ten, int ngaySinh, int thangSinh, int namSinh, String ngheNgiep, int soThanhVien, int soNha, Nguoi nguoi) {
        super(ten, ngaySinh, thangSinh, namSinh, ngheNgiep);
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
        this.nguoi = nguoi;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public Nguoi getNguoi() {
        return nguoi;
    }

    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }

    @Override
    public String toString() {
        return "HoDan ["  +
                " soNha=" + soNha +
                ", soThanhVien=" + soThanhVien +
//                ", nguoi=" + nguoi +
                ']';
    }
}
