package Lab1;

import acm.graphics.*;
import acm.program.ConsoleProgram;

public class TheSquareRoot extends ConsoleProgram { 
	public void run(){
		println("с = Корень квадратный из ( a(х2) + b(x2) )");
	int a = readInt("Введи число a: ");
	int b = readInt("Введи число b: ");
	a=a*a;
	b=b*b;
	int c=a+b;
	double y = Math.sqrt(c);
		println("с= "+y);

}
}