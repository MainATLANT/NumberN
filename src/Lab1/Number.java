package Lab1;

import acm.program.ConsoleProgram;

public class Number extends ConsoleProgram{
	
	public void run(){
		this.setSize(400, 400);
		
println("���� n �����, ������� ���� �� 2");	
println("���� n �� �����, ���������� ���� �� 3 � ������ 1");	
		int n = readInt("������ ����� n: ");

	boolean number = true;
	while(number){
		if(n%2!=0&&n!=1){
		n=n*3+1;
		}
	else {
		
		if(n!=1){
		n=n/2;
		}
		else {
			number = false;
			}
		}
		
		println(n);
	}
	}
}


