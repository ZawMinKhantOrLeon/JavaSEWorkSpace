package data_structures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> countrySet = new TreeSet<String>(); // can be sort only if you implement comparable interface; 
		//Set<String> countrySet = new LinkedHashSet<String>();
		//Set<String> countrySet = new HashSet<String>(); // not order
		countrySet.add("Myanmar");
		countrySet.add("Myanmar");
		countrySet.add("Myanmar");
		countrySet.add("Japan");
		countrySet.add("Phip");
		countrySet.add("India");
		countrySet.add("USA");
		countrySet.add("Korea");
		countrySet.add("France");
		
		System.out.println(countrySet);
		
//		for(final String country:countrySet) {
//			
//			if(country == "Korea") {
//				System.out.println("This is Korea");
//				break;
//				
//			}
//			System.out.println(country);
//		}
	}

}
