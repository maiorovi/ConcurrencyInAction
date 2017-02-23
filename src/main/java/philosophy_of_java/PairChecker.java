package philosophy_of_java;

public class PairChecker implements Runnable {
	private PairManager pairManager;

	public PairChecker(PairManager pairManager) {
		this.pairManager = pairManager;
	}

	public void run() {
		while(true) {
			pairManager.checkCounter.incrementAndGet();
			pairManager.getPair().checkState();
		}
	}
}
