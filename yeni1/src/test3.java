import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fiz, tur, kim, muz;
        double ort;

        System.out.println("matemattik notu :");
        mat = input.nextInt();
        if (mat>100 || mat<0) {
            mat = 0; }
        System.out.println("fizik notu: ");
        fiz = input.nextInt();
        if(fiz>100||fiz<0)
            fiz=0;
        System.out.println("türkçe notu: ");
        tur = input.nextInt();
        System.out.println("kimya not: ");
        kim = input.nextInt();
        System.out.println("müzik notu: ");
        muz = input.nextInt();
        ort = (mat + fiz + tur + kim + muz) / 5;
        if (ort < 55) {
            System.out.println("kaldınız, ortalamanız: " + ort);
        } else {
            System.out.println("geçtiniz ortalamanuz: " + ort);
        }
    }
}





