package lambda;

public class GenericLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//declarative
		CustomComparator<Integer> intCmp = (n1,n2) -> n1.compareTo(n2) > 0 ? n1:n2;
		
		CustomComparator<String> strCmp = (n1,n2) -> n1.compareTo(n2) < 0 ? n1:n2;
		
		System.out.println(" Apple compare to Banana: "+strCmp.Compare("Apple", "Banana"));
		
		
		//imperative
		CustomComparator<Double>  dbCmpt =new  CustomComparator<Double>(){

			@Override
			public Double Compare(Double t1, Double t2) {
				// TODO Auto-generated method stub
				return t1.compareTo(t2) > 0 ? t1:t2;
			}
			
		};
		
		System.out.println("34.11 and 12.33 : " + dbCmpt.Compare(34.11, 12.33));
	}

}
