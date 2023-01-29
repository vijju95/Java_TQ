package Assignment;

public class Star_pattern {

	public static void main(String[] args) {
		
		/*for(int n=1; n<=5; n++) {				//     *
			for(int i=5;i>=n;i--) {				//    **
				System.out.print(" ");			//   ***
			}									//  ****
			for(int j=1;j<=n;j++) {				// *****
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*for(int n=1; n<=5; n++) {				//     *
			for(int i=5;i>=n;i--) {				//    ***
				System.out.print(" ");			//   *****
			}									//  *******
			for(int j=1;j<=2*n-1;j++) {			// *********
				System.out.print("*");
			
			System.out.println();
		}*/
		
		/*for(int n=1; n<=4; n++) {				//1
			for(int i=1;i<=n;i++) {				//22
				System.out.print(n);			//333
			}									//4444
			System.out.println();
		}*/
		
		/*for (int n=1; n<=4; n++) {
			for(int i=4; i>n;i--) {
				System.out.print(" ");			//    *
			}									//   **
			for (int i1=1; i1<=n; i1++) {		//  ***
				System.out.print("*");			// ****
			}									//  ***
			System.out.println();				//   **
		}										//    *
		for(int n=3; n>=1; n--) {
			for(int i=3;i>=n;i--) {
				System.out.print(" ");
			}
			for (int i1=1; i1<=n; i1++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*for(int n=1; n<=8; n++) {
			for(int i=8; i>=n; i--) {			// * * * * *
				System.out.print(" *");			// * * * * *
			}									// * * * * *
			for(int j=1; j<=n; j++) {			// * * * * *
				System.out.print(" *");			// * * * * *
			}
			System.out.println();
		}*/
		
		/*for(int n=1; n<=5; n++) {				//     *
		for(int i=5;i>=n;i--) {					//    * **
			System.out.print(" ");				//   ** ***
		}										//  *** ****
		for(int j=1;j<=2*n-1;j++) {				// *********
			if(j==3 && n==3){
				System.out.print(" ");
			}
			if(j==2 && n==2){
				System.out.print(" ");
			}
			if(j==4 && n==4){
				System.out.print(" ");
			}
			System.out.print("*");
		}
		System.out.println();
		}*/
		
		/*for(int n=1;n<=6;n++) {
			
			for(int j=6;j>=n;j--) {
				System.out.print(" *");			// * * * * *
			}									// * * * *
			System.out.println();				// * * *
		}										// * *
		for(int n=1;n<=6;n++) {					// * 
			for(int j=1; j<=n; j++) {			// * *
				System.out.print(" *");			// * * *
			}									// * * * *
			System.out.println();				// * * * * *
		}*/
		
}}