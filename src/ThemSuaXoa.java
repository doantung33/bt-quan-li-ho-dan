import java.util.ArrayList;
import java.util.Scanner;

public class ThemSuaXoa {
    Scanner scanner = new Scanner(System.in);
    ArrayList<HoDan>arrayList= new ArrayList<>();
    ArrayList<Nguoi>arrayList1= new ArrayList<>();
    Nguoi nguoi = new Nguoi();

    public void add(){
        HoDan hoDan= new HoDan();
        System.out.println("Nhap so nha");
        int soNha= Integer.parseInt(scanner.nextLine());
        hoDan.setSoNha(soNha);
        System.out.println("Nhap so thanh vien");
        int soTV= Integer.parseInt(scanner.nextLine());
        hoDan.setSoThanhVien(soTV);
        for (int i = 0; i < soTV; i++) {
            arrayList1.add(nguoi.add());
        }
        arrayList.add(hoDan);
    }
    public void show(){
        for (HoDan hoDan:arrayList) {
            if (hoDan instanceof HoDan){
                System.out.println(hoDan.toString());
            }
        }
        for (Nguoi nguoi:arrayList1){
            if (nguoi instanceof Nguoi){
                System.out.println(nguoi.toString());
            }
        }
        System.out.println();
        System.out.println();
    }
    public void mungTho(int nam){
        int num;
        int index=1;
        for (int i = 0; i < arrayList1.size(); i++) {
            num=arrayList1.get(i).getNamSinh();
            if (nam-num>80){
                System.out.println("Nguoi mung tho thu "+index++);
                System.out.println(arrayList1.get(i));
            }else {
                System.out.println("Khong co ai mung tho nam nay");
            }
        }
    }

}
