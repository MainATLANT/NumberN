package Lab1;

import acm.graphics.*;
import acm.program.ConsoleProgram;

public class TheSquareRoot extends ConsoleProgram { 
	public void run(){
		println("� = ������ ���������� �� ( a(�2) + b(x2) )");
	int a = readInt("����� ����� a: ");
	int b = readInt("����� ����� b: ");
	a=a*a;
	b=b*b;
	int c=a+b;
	double y = Math.sqrt(c);
		println("�= "+y);

}
}