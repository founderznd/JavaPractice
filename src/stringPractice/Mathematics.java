/**
 * 
 */
package stringPractice;

/**
 * x�Ǽ������Ұ�PI�ȷ�17�������ֵ�ļ��ϣ���������ǵ�sin����ֵ�����Ҫ���� 
 * 
 * @author nandi
 * 2015��12��8��
 * Mathematics.java
 */
public class Mathematics {
	
	/**
	 * basic op
	 */
	public static void sin() {
		
		int N = 16;
		double x, y;
		
		for (int i = 0; i <= N; i++) {
			x = i * Math.PI / N;
			y = Math.sin(x);
			System.out.println(x + "\t\t" + y);
		}
	}
	
	public static int fac(int n) {
		
		if (n == 0) { return 1; }
		
		int prod = 1;
		while (n > 1) {
			prod = prod * n;
			n--;
		}
		return prod;
	}
	
	public static double pow(double x, int n) {
		
		double res = 1.0;
		
		if (0 == n) { return 1; }
		
		if (0 > n) {
			n = 0 - n;
			for (int i = 0; i < n; i++) {
				res = res * x;
			}
			return 1 / res;
		}
		
		if (0 < n) {
			for (int i = 0; i < n; i++) {
				res = res * x;
			}
			return res;
		}
		return 0;
	}
	
	/**
	 * further op
	 */
	public static void addTest() {
		
		int N = (int) (Math.random() * 100 + 1);
		System.out.println("generate a random number 1~100: " + N);
		double sum = 0;
		double testNum = Math.PI * Math.PI / 6;
		for (int i = 1; i <= N; i++) {
			sum = sum + 1 / (double) (i * i);
		}
		System.out.println("sum = " + sum + "\t pi^2/6 = " + testNum);
	}
	
	/**
	 * pascal����
	 * @param N
	 */
	public static void pascalTriangle(int N) {
		
		for (int n = 0; n <= N; n++) {
			for (int k = 0; k <= n; k++) {
				System.out.printf("%d\t", fac(n) / (fac(k) * fac(n - k)));
			}
			System.out.println();
		}
	}
	
	public static void pascalTriangle() {
		
		for (int n = 0; n <= 8; n++) {
			for (int k = 0; k <= n; k++) {
				System.out.printf("%d\t", fac(n) / (fac(k) * fac(n - k)));
			}
			System.out.println();
		}
	}
	
	/**
	 * ���Լ��
	 * @param m
	 * @param n
	 * @return
	 */
	public static long gcd(long m, long n) {
		
		if (m == n) { return m; }
		
		if (m > n) {
			return gcd(m - n, n);
		}
		else {
			return gcd(m, n - m);
		}
	}
	
	/**
	 * ��С������
	 * @param m
	 * @param n
	 * @return
	 */
	public static long lcm(long m, long n) {
		
		long prod = m * n;
		return prod / gcd(m, n);
	}
	
	/**
	 * ����С��x�����short��������
	 * @param x
	 * @return
	 */
	public static short floor(float x) {
		
		if (0 <= x) {
			return (short) x;
		}
		else {
			return (short) (x - 1);
		}
	}
	
	/**
	 * �����������ĵ�kλ��
	 * @param n
	 * @param k
	 * @return
	 */
	public static int digit(long n, int k) {
		
		int res = 0;
		
		for (int i = 0; i < k; i++) {
			res = (int) n % 10;
			n = (n - res) / 10;
		}
		return res;
	}
	
	/**
	 * ����n������һ��쳲�������
	 * @param n
	 * @return
	 */
	public static long fib(int n) {
		
		if (2 > n) { return n; }
		return fib(n - 1) + fib(n - 2);
	}
	
	/**
	 * ���ص�n����������
	 * @param n
	 * @return
	 */
	public static long t(int n) {
		
		if (1 > n) { return n; }
		
		return t(n - 1) + n;
	}
	
	/**
	 * ���ص�n��ƽ����
	 * @param n
	 * @return
	 */
	public static long s(int n) {
		
		if (1 > n) { return n; }
		
		return s(n - 1) + 2 * n - 1;
	}
	
	/**
	 * ��̩��������
	 * @param n
	 * @return
	 */
	public static long c(int n) {
		
		if (2 > n) { return 1; }
		
		long sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum = sum + c(i) * c(n - i - 1);
		}
		
		return sum;
	}
	
	/**
	 * �ж��Ƿ���ƽ����
	 * @param n
	 * @return
	 */
	public static boolean isSquare(long n) {
		
		for (int i = 1; i < n; i++) {
			if (i * i == n) { return true; }
		}
		return false;
	}
}
