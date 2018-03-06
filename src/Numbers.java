import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);


System.out.println("  Please Enter Three Numbers  ");


int red = scan.nextInt();
int yellow = scan.nextInt();
int brown = scan.nextInt();
if(red > yellow&& yellow <  brown){
	System.out.println("int 1 is larger ");
	System.out.println("int 2 is the smallest");
	
}else if(red< yellow&& red > brown){
	System.out.println("int 2 is larger");
	System.out.println("int 3 is the smallest");
}else if(brown > red&& red > yellow ){
System.out.println("int 2 is the smallest");
System.out.println("int 3 is the largest");
}

	else{
		
		System.out.println("int 1 is largest");
		System.out.println("int 3 is the smallest");
}
}
}