import java.util.Scanner;

public class FlowersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("  Enter The Name of A Country  ");
		String code = scan.nextLine();
		System.out.println(" Enter the Country's Area  ");
		String purple = scan.nextLine();
		System.out.println("  Enter the Country's population ");
		int novels = scan.nextInt();
	
		
		Flowers color = new Flowers ( code,  purple , novels);
		
		
		
		System.out.println("   Enter the name of the second country ");
		String code2 = scan.nextLine();
		System.out.println(" Enter the the area of the second country  ");
		String purple2 = scan.nextLine();
		System.out.println("  Enter the population of the second country  ");
		int novels2 = scan.nextInt();
		
		
		
		Flowers red = new Flowers ( code2, purple2,novels2);
			
		System.out.println(red.CountryName);
		System.out.println(red.CountryArea);
		System.out.println(red.CountryPopulation);
	    System.out.println(color.CountryName);
	    System.out.println(color.CountryArea);
		System.out.println(color.CountryPopulation);
	
System.out.println(red.ComparePopulation(red.CountryPopulation, color.CountryPopulation));
	}

}
