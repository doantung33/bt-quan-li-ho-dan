import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String ten;
    private int ngaySinh;
    private int thangSinh;
    private int namSinh;
    private String ngheNgiep;

    public Nguoi() {
    }

    public Nguoi(String ten, int ngaySinh, int thangSinh, int namSinh, String ngheNgiep) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.thangSinh = thangSinh;
        this.namSinh = namSinh;
        this.ngheNgiep = ngheNgiep;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngay) {
        this.ngaySinh = ngay;

    }

    public int getThangSinh() {
        return thangSinh;
    }

    public void setThangSinh(int thangSinh) {
        this.thangSinh = thangSinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getNgheNgiep() {
        return ngheNgiep;
    }

    public void setNgheNgiep(String ngheNgiep) {
        this.ngheNgiep = ngheNgiep;
    }
    public Nguoi add(){
        ArrayList<Nguoi>arrayList= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Nguoi nguoi= new Nguoi();
        System.out.println("Nhap ten thanh vien");
        String ten= scanner.nextLine();
        nguoi.setTen(ten);
        System.out.println("Nhap ngay sinh");
        int ngay= Integer.parseInt(scanner.nextLine());
        nguoi.setNgaySinh(ngay);
        System.out.println("Nhap thang sinh");
        int thang= Integer.parseInt(scanner.nextLine());
        nguoi.setThangSinh(thang);
        System.out.println("Nhap nam sinh");
        int nam= Integer.parseInt(scanner.nextLine());
        nguoi.setNamSinh(nam);
        System.out.println("Nhap nghe nghiep");
        String nghe = scanner.nextLine();
        nguoi.setNgheNgiep(nghe);
        arrayList.add(nguoi);
        return nguoi;
    }

    @Override
    public String toString() {
        return "+ [" +
                "ten= " + ten  +
                ", sinhNgay=" + ngaySinh +"/ "+thangSinh+"/ "+namSinh+
                ", ngheNgiep= " + ngheNgiep  +
                ']';
    }
}
