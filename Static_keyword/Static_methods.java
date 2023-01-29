package Static_keyword;

public class Static_methods {

static String shop_name="XYZ";
	
	static void bake(String flavour)
	{
		System.out.println("cake flavour is..."+flavour);
	}
	static void bake(String flavour,String flavour2)
	{
		System.out.println("cake flavour is..."+flavour);
		System.out.println("ice cream flavour is..."+flavour2);
	}
	static void bake(String flavour,String flavour2,String chk_roll)
	{
		System.out.println("cake flavour is..."+flavour);
		System.out.println("ice cream flavour is..."+flavour2);
		System.out.println("roll flavour is..."+chk_roll);
	}
	
	

	public static void main(String[] args) {
		System.out.println("welcome to..."+shop_name);
		bake("strawberry");
		//bake("chocolate","vanilla");
		bake("red velvet","vanilla","chicken roll");

	}
}
