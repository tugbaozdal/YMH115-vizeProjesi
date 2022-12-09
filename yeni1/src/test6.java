import java.util.Scanner;
public class test6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dogumay,dogumtarih;
        System.out.println("doğum ayınızı giriniz(1den 12ye şeklinde)");
        dogumay=input.nextInt();
        System.out.println("doğum tarihinizi giriniz");
        dogumtarih=input.nextInt();
        if(dogumay==1){
            if (dogumtarih<=21 )
                System.out.println("oğlak burcusunuz");
            else
                System.out.println("kova burcusunuz");
        }
        if (dogumay==2){
            if (dogumtarih<=19 )
                System.out.println("kova burcusunuz");
            else
                System.out.println("balık buurcusunuz");
        }
        if (dogumay==3){
            if (dogumtarih<=20)
                System.out.println("balık burcusunuz");
            else
                System.out.println("koç burcusunuz");
        }
        if (dogumay==4){
            if (dogumtarih<=20)
                System.out.println("koç burcusunuz");
            else
                System.out.println("boğa burcusunuz");
        }
        if (dogumay==5){
            if (dogumtarih<=21)
                System.out.println("boğa burcusunuz");
            else
                System.out.println("ikizler burcusunuz");
        }
        if (dogumay==6){
            if (dogumtarih<=22)
                System.out.println("ikizler burcusunuz");
            else
                System.out.println("yengeç burcusunuz");
        }
        if (dogumay==7){
            if (dogumtarih<=23)
                System.out.println("yengeç burcusunuz");
            else
                System.out.println("Aslan burcusunuz");
        }
        if (dogumay==8){
            if (dogumtarih<=22)
                System.out.println("aslan burcusunuz");
            else
                System.out.println("başak burcusunuz");
        }
        if (dogumay==9){
            if (dogumtarih<=22)
                System.out.println("başak burcusunuz");
            else
                System.out.println("Terazi burcusunuz");
        }
        if (dogumay==10){
            if (dogumtarih<=22)
                System.out.println("Terazi burcusunuz");
            else
                System.out.println("Akrep burcusunuz");
        }
        if (dogumay==11){
            if (dogumtarih<=22)
                System.out.println("akrep burcusun");
            else
                System.out.println("Yay burcusun");
        }
        if (dogumay==12){
            if (dogumtarih<=21)
                System.out.println("yay burcusun");
            else
                System.out.println("oğlak burcusun");
        }




    }
}
