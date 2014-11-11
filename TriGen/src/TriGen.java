public class TriGen {

	public static void main(String[] args) {

		if (genTri(5) == 1) {
			System.out.println("Cannot handle input. Error: too large");
		}
	}

	private static int genTri(int size) {

		if (size > 1000) {
			return 1;
		}

		for (int b = size - 1; b >= 0; b--) {
			for (int dummy = b; dummy >= 1; dummy--) {

				System.out.print(dummy + " ");
			}
		System.out.print("\n");
		}
		
		for (int a = 1; a <= size; a++) {
			for (int dummy = 1; dummy <= a; dummy++) {

				System.out.print(dummy + " ");
			}

			System.out.print("\n");
		}

		return 0;
	}

}
