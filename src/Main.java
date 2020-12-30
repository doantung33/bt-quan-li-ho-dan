import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThemSuaXoa themSuaXoa= new ThemSuaXoa();
        int n;
        boolean check= false;
        do {
            try {
                System.out.println("---Menu---");
                System.out.println("1. Them ho dan");
                System.out.println("2. Hien thi ho dan");
                System.out.println("3. DS nguoi mung tho");
                System.out.println("0. Thoat");
                n=Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Nhap lai di ban");
                continue;
            }
            switch (n){
                case 1:
                    themSuaXoa.add();
                    break;
                case 2:
                    themSuaXoa.show();
                    break;
                case 3:
                    themSuaXoa.mungTho(2020);
                    break;
                case 0:
                    check=true;
            }
        }while (!check);
    }
}
