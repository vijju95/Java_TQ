package Assignment;

public class SC_project {
													//Books of the perticular yr
	public static void main(String[] args) {
		
		int year = 3;
		char branch = 'm';
		
		switch(year) {
		case 1:
			switch (branch) {

			case 'm':
			System.out.println("mechanical books name 1yr");
			break;
				
			case 'c':
			System.out.println("civil books name 1yr");
			break;
			
			case 's':
			System.out.println("comp science  books name 1yr");
			break;
					
			case 'e':
			System.out.println("electrical books name 1yr");
			break;
			}
			
		case 2:
			switch (branch) {

			case 'm':
			System.out.println("mechanical books name 2 yr");
			break;
				
			case 'c':
			System.out.println("civil books name 2 yr");
			break;
			
			case 's':
			System.out.println("comp science books name 2 yr");
			break;
					
			case 'e':
			System.out.println("electrical books name 2 yr");
			break;
			}
			
		case 3:
			switch (branch) {

			case 'm':
			System.out.println("mechanical books name 3 yr");
			break;
				
			case 'c':
			System.out.println("civil books name 3 yr");
			break;
			
			case 's':
			System.out.println("comp science books name 3 yr");
			break;
					
			case 'e':
			System.out.println("electrical books name 3 yr");
			break;
			}
		}
	}

}
