
public class RSA {

	public static void main(String[] args) {
		gcd_equals(59, 10200, 1);
		gcd_equals(500, 21, 1);
//		System.out.println(gcd(73546,19712));
//		System.out.println(gcd(73546,19509));
//		System.out.println(gcd(100, 9));
//		System.out.println(gcd(0, 5));
//		System.out.println(gcd(-2, 8));
	}

	public static int gcd (int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		if (b > a) {
			int temp = a;
			a = b;
			b = temp;
		} // a is always the bigger number
		if (a == 1 || b == 0)
			return a;
		if (a == 0)
			return 1;
		return gcd(b, a % b);
	}

	public static boolean gcd_equals(int a, int b, int equals) {
		a = Math.abs(a);
		b = Math.abs(b);
		if (b > a) {
			int temp = a;
			a = b;
			b = temp;
		} // a is always the bigger number
		if (gcd_equals(a, b, equals, 1, 0, 0, 1, a, b) == 0) {
			return false;
		}
		return true;
	}

	public static int gcd_equals(int a, int b, int equals, int aa, int ab, int ba, int bb, int initial_a, int initial_b) {
		if (a == 1 || b == 0)
			return a;
		if (b == equals)
			System.out.println(equals + " = (" + ba + ") * " + initial_a + " + (" + bb + ") * " + initial_b);
		int multiplier = a / b * -1;
		int current = a + b * multiplier;
		if (current < equals)
			return 0;
		return gcd_equals(b, current, equals, ba, bb, aa + ba * multiplier, ab + bb * multiplier, initial_a, initial_b);
	}
}
