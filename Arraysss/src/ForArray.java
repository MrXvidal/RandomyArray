import java.util.Random;


public class ForArray {
	public static void main(String[] args) {

		int[] numbers = generateNumbers();
		// imprime los números sorteados
		print2Console("Números sorteados: ", numbers);
		// muestra la media 
		System.out.println("Promedio:" + average(numbers));
		// muestra el máximo
		System.out.println("Máximo:" + max(numbers));
		// muestra el mínimo
		System.out.println("Mínimo:" + min(numbers));
	}

	/**
	 * Genera aleatoriamente diez números
	 * @return Los números generados
	 */
	private static int[] generateNumbers() {
		Random random = new Random(); // genera numeros random
		int[] numbers = new int[10]; // rellena el Array con la cantidad marcada [10]
		// sortea 10 números del 0 al 99
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100); // marcamos hasta el maximo del random
		}
		return numbers;
	}

	/**
	 * Imprime por la consola el texto message seguido de los números del array
	 * numbers separados por espacios
	 * @param message
	 * El mensaje a ser mostrado
	 * @param numbers
	 * Los números a ser impresos
	 */
	private static void print2Console(String message, int[] numbers) {
		System.out.print(message);
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	/**
	 * retorna el máximo de los números
	 * @param numbers
	 * Los números donde buscar el máximo
	 * @return El número máximo
	 */
	private static int max(int[] numbers) {
		int max = 0;
		for (int number : numbers) {
			if (max < number) {
				max = number;
			}
		}
		return max;
	}

	/**
	 * retorna el mínimo de los números
	 * @param numbers
	 * Los números dónde buscar el mínimo
	 * @return El número mínimo
	 */
	private static int min(int[] numbers) {
		int min = Integer.MAX_VALUE;
		for (int number : numbers) {
			if (min > number) {
				min = number;
			}
		}
		return min;
	}

	/**
	 * calcula la media de los números
	 * @param numbers
     * Los números a promediar
	 * @return El promedio
	 */
	private static int average(int[] numbers) {
		int accumulator = 0;
		for (int number : numbers) {
			accumulator = accumulator + number;
		}
		int average = accumulator / 10;
		return average;
	}
}