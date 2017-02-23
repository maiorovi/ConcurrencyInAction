package philosophy_of_java;

public class PairManipulator implements Runnable {
	private PairManager pm;

	public PairManipulator(PairManager pm) {
		this.pm = pm;
	}

	public void run() {
		while (true) {
			pm.increment();
		}
	}

	@Override
	public String toString() {
		return "PairManipulator{" +
				"pm=" + pm.checkCounter.get() +
				'}';
	}
}
