package Array_practice;

public class CountElements {

	public static void main(String[] args) {
		
		int ch []= {2,3,2,3,3,4,4,5,5,5,5,5,6,4,4,2,3};
		
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]=0;
				}
			}
			if(count!=0 && ch[i]!=0 ) {
				System.out.println(ch[i]+" "+count);
			}
		}

	}
}
