//Nihar Junagade

import java.util.Scanner;
import org.apache.poi.ss.formula.functions.FinanceLib;

public class Calculator {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Years to work? ");
		double yrsW = scan.nextDouble();
		System.out.println("Annual Return for investment? ");
		double annReturnI = scan.nextDouble();
		System.out.println("Years retired? ");
		double yrsR = scan.nextDouble();
		System.out.println("Annual Return for payback? ");
		double annReturnP = scan.nextDouble();
		System.out.println("Required income? ");
		double income = scan.nextDouble();

		double r;
		double n;
		double y;
		double p;
		double f;
		boolean t;

		double PV;
		r = (annReturnP / 12);
		n = yrsR * 12;
		y = income - 2642;
		f = 0;
		t = false;

		PV = FinanceLib.pv(r, n, y, f, t);

		System.out.println(PV);

		double PMT;
		r = (annReturnI / 12);
		n = yrsW * 12;
		p = 0;
		f = PV;
		t = false;

		PMT = FinanceLib.pmt(r, n, p, f, t);
		System.out.println(PMT);

	}
}
