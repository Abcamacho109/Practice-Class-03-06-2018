
public class Flowers {
String CountryName;
		String CountryArea;
		int CountryPopulation;
	public Flowers(String CountryName1, String CountryArea1, int CountryPopulation1 ) {
		// TODO Auto-generated constructor stub
		
		CountryName = CountryName1;
		CountryArea = CountryArea1;
		CountryPopulation = CountryPopulation1;
		
		
		
	} public int ComparePopulation (int p1, int p3 ){
		if (p1 < p3){
			return p3;
		}else{
			return p1;
	}
	}
}
