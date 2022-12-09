import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        String kullaniciAdi,sifre,tercih,yeniSifre;
        Scanner input=new Scanner(System.in);

        System.out.println("kullanıcı adınızı giriniz: ");
        kullaniciAdi=input.nextLine();

        System.out.println("şifrenizi giriniz: ");
        sifre=input.nextLine();

        if(kullaniciAdi.equals("tugba")&& sifre.equals("tugba1"))
            System.out.println("giriş başarılı");

        else if(sifre!= "tugba1"&& kullaniciAdi.equals("tugba")) {
            System.out.println("yanlış şifre girdiniz");
            System.out.println("şifrenizi sıfırlamak istiyor musunuz EVET veya HAYIR yazınız");
            tercih=input.nextLine();
            if(tercih.equals("evet"))
                System.out.println("yeni şifre giriniz");
            yeniSifre=input.nextLine();
            if(yeniSifre.equals("tugba1"))
                System.out.println("yeni şifre eskisiyle aynı olamaz ");
            else{
                System.out.println("şifreniz başarılı bir şekilde oluşturuldu");
            }



                }

            }

        }





