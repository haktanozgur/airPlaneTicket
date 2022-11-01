package com.haktanozgur.airPlaneTicket;

import java.util.Scanner;

public class airPlaneTicket {
	
/*Yazılan total metodu, kullanıcıdan input olarak alınan km , yaş ve yolculuk 
 * tipi değerlerini,metod içerisinde, verilen isterlere göre hesaplıyor */
	public static double calculate(int km , int age , int travelType) {
		
		float ticketPay = (float) (km * 0.10); 
		
		if (age < 12) {
			ticketPay -= ticketPay * 50/100;
		}
		else if(age > 12 && age < 24) {
			ticketPay -= ticketPay * 10/100;
		}
		else if(age > 65) {
			ticketPay -= ticketPay * 30/100;
		}
		
		
		if (travelType == 2) {
			ticketPay -= ticketPay * 20/100;
		}
		
		return ticketPay;

	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char tl = '\u20BA';
		
		System.out.println("Mesafeyi km türünden giriniz : ");
		int km = scanner.nextInt();
		System.out.println("Yaşınızı giriniz : ");
		int age = scanner.nextInt();
		System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
		int travelType = scanner.nextInt();
		
		/* Bu kısımda kullandığım if bloğunu, calculate metodu içerisinde kullanmadım
		 * İstenilen koşulu main içerisinde yazarak, calculate metodunu sadece bilet 
		 * fiyatı hesaplaması için kısıtladım. */
		if (km < 0 || age < 0 || travelType != 1 && travelType != 2) {
			System.out.println("Hatalı veri girdiniz !");
		}
		
		System.out.println("Toplam Tutar : " + calculate(km, age, travelType) + tl);
	}
	
}
