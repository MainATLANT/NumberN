package Lab1;

import acm.program.ConsoleProgram;

public class NumbersMaxMin extends ConsoleProgram {
	private static final int CRITIKALPOINT = 0;
	private static final int MAX_SIZE = 50;

	public void run() {
		int[] mid = new int[MAX_SIZE]; //��������� ����� ������������ ��������� �� 20 �����
		int numScores = 0;
		int max = 50;
		int min = 0;
		
		while (true) {
			int score = readInt("������ �����: ");
			if (score == CRITIKALPOINT) //���� ������� �����  = 0, �������� ����.
				break;
			mid[numScores++] = score;
		}
		for (int i = 0; i < mid.length - 1; i++) { //���������� �������� � ����������� �����.

			if (max > mid[i] && mid[i] != 0) {
				max = mid[i];
			}
			if (min < mid[i]) {
				min = mid[i];
			}
		}
		if (mid[0] != 0) { //�������� ����� ������ ������ �� ���� 0
			println("����������� ��������: " + min);
			println("̳������� ���������: " + max);
		} else {
			println("���� ����� ��� ���������");
		}

	}
}
