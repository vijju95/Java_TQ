package WrapperClasses;

public class WrapperClass {

	// character class
	public void characterClass() {

		Character c1 = 'A';
		Character ch = 'A'; // here we have taken char into obj form by using wrapper class Character
		char c = ch.charValue(); // here again we have converted character class object value into primitive char
									// value
		System.out.println("converted object into char : " + c);

		int x = c1.compareTo(ch); // comparing two character class objects (ANS : 0, 1, -1)
		System.out.println("Comparing to " + x);

		String s = ch.toString(); // here we have converted character object class into String
		System.out.println(s);
	}

	// Byte Class
	public void byteClass() {

		Byte b = 122;// The Byte class wraps a value of primitive type byte in an object.
		Byte b1 = 125;

		int x = b.compareTo(b1);// Compares two Byte objects numerically
		System.out.println(x);

		String s = b.toString();// Returns a String object representing this Byte's value.
		System.out.println(s);

		int j = Byte.valueOf(s);// Returns a Byte object holding the valuegiven by the specified String.
		System.out.println(j);

		byte i = Byte.parseByte(s);// Parses the string argument as a signed decimal byte
		System.out.println(i);
	}

	// Short class
	void shortClass() {

		Short s = 1400;
		Short s1 = 1500;

		int x = s.compareTo(s1);// Returns a String object representing this Short's value.
		System.out.println(x);

		String str = s.toString();// Returns a String object representing this Short's value.
		System.out.println(str);
	}

	// Integer class
	void integerClass() {

		Integer i = 152654451;// Boxing
		Integer j = 56165;

		int iint = i.intValue();// UNBOXING = Returns the value of this Integer as an int.
		System.out.println(iint);

		int x = i.compareTo(j);// Compares two Integer objects numerically.
		System.out.println(x);

		String s = i.toString();// Returns a String object representing this Integer's value
		System.out.println(s);

		boolean b = i.equals(j);// Compares this object to the specified object. result in boolean form
		System.out.println(b);

		int s1 = Integer.parseInt(s);// Parses the string argument as a signed decimal integer.
		System.out.println(s1);
	}

	// Long Class
	void longClass() {

		String l = "1661165161";
		String l1 = "1661165161";

		Long ll = Long.parseLong(l);// Parses the string argument as a signed decimal long
		System.out.println(ll);

		int x = l.compareTo(l1);// Compares two strings lexicographically
		System.out.println(x);

		boolean b = l.equals(l1);// Compares this string to the specified object
		System.out.println(b);
	}

	// Float Class
	void floatClass() {

		Float f = 12.55f;
		Float f1 = 12.33f;

		int x = f.compareTo(f1);
		System.out.println(x);

		String s = f.toString();// Returns a string representation of this Float object
		System.out.println(s);

		Float ff = Float.parseFloat(s);// Returns a new float initialized to the valuerepresented by the specified
										// String
		System.out.println(ff);

		boolean b = s.equals(f1);// Compares this string to the specified object.
		System.out.println(b);
	}

	// Double class
	void DoubleClass() {

		double d = 156651;
		double d1 = 1121651618;
		Double dd = d;
		Double dd1 = d1;

		String s = dd.toString();
		System.out.println(s);

		boolean b = dd.equals(dd1);
		System.out.println(b);

		Double d11 = Double.parseDouble(s);
		System.out.println(d11);

		int x = dd.compareTo(dd1);
		System.out.println(x);
	}

	// Boolean Class
	void booleanClass() {
		Boolean b = true;
		Boolean b1 = false;

		int i = b.compareTo(b1);// Compares this Boolean instance with another
		System.out.println(i);

		Boolean bb = b.equals(b1);// Returns true if and only if the argument is not null
		System.out.println(bb);

		String s = b.toString();// Returns a String object representing this Boolean'svalue
		System.out.println(s);

		Boolean parse = Boolean.parseBoolean(s);// Parses the string argument as a boolean.
		System.out.println(parse);
	}

	public static void main(String[] args) {
		WrapperClass c = new WrapperClass();

		c.booleanClass();
		c.characterClass();
		c.byteClass();
		c.shortClass();
		c.integerClass();
		c.longClass();
		c.floatClass();
		c.DoubleClass();
	}
}
