package Lab1;

import acm.program.ConsoleProgram;

public class NumbersMaxMin extends ConsoleProgram {
	private static final int CRITIKALPOINT = 0;
	private static final int MAX_SIZE = 50;

	public void run() {
		int[] mid = new int[MAX_SIZE]; //Створюємо масив максимальним значенням до 20 чисел
		int numScores = 0;
		int max = 50;
		int min = 0;
		
		while (true) {
			int score = readInt("Ввведи число: ");
			if (score == CRITIKALPOINT) //Якщо введене число  = 0, виконуємо стоп.
				break;
			mid[numScores++] = score;
		}
		for (int i = 0; i < mid.length - 1; i++) { //Перевіряємо мінімальне і максимальне число.

			if (max > mid[i] && mid[i] != 0) {
				max = mid[i];
			}
			if (min < mid[i]) {
				min = mid[i];
			}
		}
		if (mid[0] != 0) { //Перевіряє першу ячейку масиву на вміст 0
			println("Максимальне значение: " + min);
			println("Мінімальне значенння: " + max);
		} else {
			println("Нема чисел для порівняння");
		}

	}
}
