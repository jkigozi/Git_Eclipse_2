import java.io.*;

# THHHISSSS ISS A TEEESST
# THHHISSSS ISS A TEEESST
# THHHISSSS ISS A TEEESST
public class buc {

	
	public static void main(String[] args) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		
		System.out.println("Enter your name");
		String nam = br.readLine();
		
		System.out.println("Enter your year of birth");
		String yob = br.readLine();
		
		int yob_int = Integer.parseInt(yob);
		
		System.out.println("Welcome "+nam);
		System.out.println("Yo were born in "+yob);
		System.out.println("goodbye "+nam);
		 

	}

}
