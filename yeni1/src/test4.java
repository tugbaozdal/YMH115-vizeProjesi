import java.util.Scanner;
public class test4 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int hava;
        System.out.println("bulunduğunuz şehrin sıcaklığını giriniz");
        hava=giris.nextInt();
        if (hava<5)
            System.out.println("kayak yapılacak havadasınız");
        else if (hava>=5&&hava<15)
            System.out.println("sinemaya gidilecek havadasınız");
         if (hava>10&&hava<25)
            System.out.println("pikniğe gidilecek havadasınız");
        else if (hava>=25)
            System.out.println("yüzmeye gidilecek havadasınız");

    }
}
