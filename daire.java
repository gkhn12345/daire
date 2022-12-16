import java.util.Scanner ;
public class daire {
    public static void main(String[] args) {

        //Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        //Alan Formülü : π * r * r;

        //Çevre Formülü : 2 * π * r;

        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        //𝜋 sayısını = 3.14 alınız.

        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        //Değerleri giriyoruz.

        double pi = 3.14 , r, alan , cevre ,a, dAlan ;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri alıyoruz.

        System.out.print("Yarıçap Giriniz : ");

        r=input.nextDouble();

        System.out.print("Merkez açı giriniz : ");

        a=input.nextDouble();

        //Formülleri giriyoruz.

        dAlan = (pi * (r*r) * a ) / 360;

        alan = pi * r * r ;

        cevre = 2 * pi * r ;

        System.out.println("Alan : " + alan);



        System.out.println("Çevre : " + cevre );

        System.out.println("Daire diliminin alanı : " + dAlan );









    }
}
