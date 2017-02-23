package philosophy_of_java;

public class Pair {
	private int x;
	private int y;

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Pair() {
		this(0,0);
	}

	public void incrementX() { x++; }
	public void incrementY() { y++; }

	@Override
	public String toString() {
		return "Pair{" +
				"x=" + x +
				", y=" + y +
				'}';
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public class PairValuesNotEqualException extends RuntimeException {
		public PairValuesNotEqualException() {
			super("Pair values not equal : " + Pair.this);
		}
	}

	public void checkState() {
		if (x != y ) {
			throw new PairValuesNotEqualException();
		}
	}
}
