public class tesst {
	private static Random randomGenerator = new Random(
			System.currentTimeMillis());

	public static void initRandomSeed() {
		randomGenerator.setSeed(System.currentTimeMillis());
	}

	public static int generateRandomNumber(int from, int to) {
		return from + (randomGenerator.nextInt(to - from) % (to - from));
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int rd = generateRandomNumber(100, 99999);
			System.out.println(rd + "\n");
		}
	}

}
