import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //hesap makinesi
        int n1,n2,islem;
        System.out.println("İlk sayıyı giriniz");
        n1=input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        n2=input.nextInt();
        System.out.println("hangi işlemi yapmak istersiniz \n 1-toplama \n 2-çıkarma \n 3-çarpma \n 4-bölme");
        islem= input.nextInt();
        switch (islem) {
            case 1:
                int sonuc =n1+n2;
                System.out.println("sonuç= "+ sonuc);
                break;
            case 2:
                int sonuc2=n1-n2;
                System.out.println("sonuç= "+sonuc2);
                break;
            case 3:
                int sonuc3=n1*n2;
                System.out.println("sonuç= "+sonuc3);
                break;
            case 4:
                int sonuc4= n1/n2;
                System.out.println("sonuç= "+sonuc4);
                break;
            default:
                System.out.println("lütfen 1-2-3-4 işlemlerinden birini seçiniz");

        }




    }



}




