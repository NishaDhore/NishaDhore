package ass10;

import java.util.Scanner;

public class Demo {
	static boolean flag;

	public static void methodx(String str) {
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x')
				if (str.charAt(i + 1) == 'x') {
					flag = true;
					System.out.println(flag);
					break;
				} else {
					flag = false;
					System.out.println(flag);
				}
			}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();

		methodx(str);
	}

}
