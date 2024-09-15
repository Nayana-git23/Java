package com.nayana.inheritence.runner;

import com.nayana.intreface.AirtelInternetProvider;
import com.nayana.intreface.BookingMyShowMovieBookingProvider;
import com.nayana.intreface.BookingProvider;
import com.nayana.intreface.DellProvider;
import com.nayana.intreface.ExtremeAitelInternetProvider;
import com.nayana.intreface.Fast5GExtreme;
import com.nayana.intreface.InternetProvider;
import com.nayana.intreface.JioInternetProvider;
import com.nayana.intreface.LenevoProviderProfit;
import com.nayana.intreface.Provider;
import com.nayana.intreface.SatJioInternetProvider;

public class ProviderRunner {
	
	public static void main(String[] args) {
		
		Provider provider=new BookingProvider("Ankith","Ankith");
		boolean ref=provider.equals(provider);
		System.out.println(ref);
		System.out.println("-----------------------------------------------------");
		
		BookingProvider bookingProvider=new BookingProvider("Ankith","ankith");
		bookingProvider.service();
		System.out.println("-----------------------------------------------------");
		
		BookingMyShowMovieBookingProvider bookingMyShowMovieBookingProvider=
				new BookingMyShowMovieBookingProvider("Manoj","Manoj v",100);
		bookingMyShowMovieBookingProvider.service();
		System.out.println("-------------------------------------------");
		
		
		
		
		
		DellProvider dellProvider=new DellProvider("sunil barthi mittal","sunil barthi mittal");
		dellProvider.service();
		System.out.println("------------------------------------------------");
		
		LenevoProviderProfit lenevoProviderProfit=new LenevoProviderProfit("mukesh ambani","mukesh ambani",2.5);
		lenevoProviderProfit.service();
		System.out.println("----------------------------------------------");
		
		
		
		InternetProvider internetProvider=new InternetProvider("anil ambani","anil ambani");
		internetProvider.service();
		System.out.println("----------------------------------------------------------------");
		
		
		AirtelInternetProvider airtelInternetProvider=new AirtelInternetProvider("amar prasad","amar prasad");
		airtelInternetProvider.service();
		System.out.println("-----------------------------------------------------------------");
		
		ExtremeAitelInternetProvider extremeAitelInternetProvider=
				new ExtremeAitelInternetProvider("sanjith","abaya");
		extremeAitelInternetProvider.service();
		System.out.println("-----------------------------------------------------------------");
		
		Fast5GExtreme fast5GExtreme=new Fast5GExtreme("Abisheik","Guru Prasad");
		fast5GExtreme.service();
		System.out.println("-----------------------------------------------------------------");
		

		JioInternetProvider jioInternetProvider=new JioInternetProvider("Mukesh ambani","Akash ambani");
		jioInternetProvider.service();
		System.out.println("-----------------------------------------------------------------");

		
		SatJioInternetProvider satJioInternetProvider=new SatJioInternetProvider("yash","Rakshith shetty","12-12-2024");
		satJioInternetProvider.service();
		System.out.println("------------------------------------------------------------");
		
		
		
		
		System.out.println("========================================");
		System.out.println("For checking equals in end of child class");
		Provider provider1=new  BookingMyShowMovieBookingProvider("Manoj","Manoj v",100);
		boolean ref1=provider.equals(provider);
		System.out.println(ref1);
		System.out.println("checking whether the name and ceo of BookingMyShowMovieBookingProvider are same");
		System.out.println("------------------------------------------------");
		
		
		Provider provider2=new  DellProvider("sunil barthi mittal","sunil barthi mittal");
		boolean ref2=provider.equals(provider);
		System.out.println(ref2);
		System.out.println("Running to check whether name and ceo of DellProvider");
		System.out.println("------------------------------------------------");
		
		Provider provider3=new LenevoProviderProfit("mukesh ambani","mukesh ambani",2.5);
		boolean ref3=provider.equals(provider);
		System.out.println(ref3);
		System.out.println("Running to check whether name and ceo of LenevoProviderProfit");
		System.out.println("------------------------------------------------");
		
		Provider provider4=new Fast5GExtreme("Abisheik","Guru Prasad");
		boolean ref4=provider.equals(provider);
		System.out.println(ref4);
		System.out.println(" checking wheater name and ceo of Fast5GExtreme same");
		System.out.println("--------------------------------------------------------");
		
		Provider provider5=new SatJioInternetProvider("Ankith","Ankith","12-11-2026");
		boolean ref5=provider.equals(provider);
		System.out.println(ref5);
	}

}
