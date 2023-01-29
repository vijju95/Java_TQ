package Array_practice;

//Create an array of Theatre to maintain data in sorted order of Movie Rating
//Theatre (Theatreid, Theatrename, location, Movie)
//Movie (Movieid, Moviename, Rating).

class Details {
	int Theatreid;
	String Theatrename;
	String location;
	
	Details(int Theatreid, String Theatrename, String location){
		this.Theatreid=Theatreid;
		this.Theatrename=Theatrename;
		this.location=location;
	}
	
	public String toString() {
		System.out.println("Theater details are ~  "+"\n");
		return "Theater id is : "+Theatreid+"\n"+"Theater name is : "+Theatrename+"\n"+
				"Theater location is : "+location;
	}
}

class Movie {
	int Movieid;
	String Moviename;
	float Rating;

	Movie(int Movieid, String Moviename,float Rating){
		this.Movieid=Movieid;
		this.Moviename=Moviename;
		this.Rating=Rating;
	}
	
	public String toString() {
	return "Id of movie is : "+Movieid+"\n"+"Movie name is : "+Moviename+"\n"+
			"Rating of movie is : "+Rating+"\n"+"\n";
	
		}
	}

public class Theater {
	
	public static void main(String[] args) {
		
	Details d[]=new Details[2];
	Movie m[]=new Movie[2];
	
	d[0]=new Details(101,"KH Multiplex","Katraj");
	d[1]=new Details(102,"Spine RIG","SpineCity");
		
	m[0]=new Movie(1212,"Varisu",4.3f);
	m[1]=new Movie(1414,"Avatar",4.8f);
	
	System.out.println(d[0].toString());
	System.out.println(m[0].toString());
	
	System.out.println(d[1].toString());
	System.out.println(m[1].toString());
	}
}
