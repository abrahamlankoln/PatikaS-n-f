import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int mat, fizik, turkce, kimya, muzik, toplamNot = 0, n = 0;
		Scanner deger = new Scanner(System.in);
		System.out.println("matematik notunu giriniz: ");
		mat = deger.nextInt();
		System.out.println("fizik notunu giriniz: ");
		fizik = deger.nextInt();
		System.out.println("turkce notunu giriniz: ");
		turkce = deger.nextInt();
		System.out.println("kimya notunu giriniz: ");
		kimya = deger.nextInt();
		System.out.println("muzik notunu giriniz: ");
		muzik = deger.nextInt();
		if (mat > 0 || mat < 100) {
			toplamNot = toplamNot + mat;
			n = n + 1;
		}
		if (fizik > 0 || fizik < 100) {
			toplamNot = toplamNot + fizik;
			n = n + 1;
		}
		if (turkce > 0 || turkce < 100) {
			toplamNot = toplamNot + turkce;
			n = n + 1;
		}
		if (kimya > 0 || kimya < 100) {
			toplamNot = toplamNot + kimya;
			n = n + 1;
		}
		if (muzik > 0 || muzik < 100) {
			toplamNot = toplamNot + muzik;
			n = n + 1;
		}
		double ortalama = toplamNot / n;
		if (ortalama > 55) {
			System.out.println("tebrikler sınıfı gectiniz");
			System.out.println("ortalamaniz: "+ortalama);
		} else {
			System.out.println("sinif tekrari");
			System.out.println("ortalamaniz: "+ortalama);
		}

	}

}
