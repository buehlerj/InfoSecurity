
public class RSA {

	public static void main(String[] args) {
		System.out.println(gcd(73546,19712));
		System.out.println(gcd(73546,19509));
		System.out.println(gcd(100, 9));
		System.out.println(gcd(0, 5));
		System.out.println(gcd(-2, 8));
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
		int multiplier = a / b;
		int remainder = a - (b * multiplier);
		return gcd(b, remainder);
	}
}
