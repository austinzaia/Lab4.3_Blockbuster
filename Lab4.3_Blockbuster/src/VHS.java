public class VHS extends Movie {
	private int currentTime = 0;

	public VHS() {

	}

	public int getCurrentTime() {
		return currentTime;
	}

	@Override
	public void play() {
		if (currentTime < scenes.size()) {
			System.out.println(scenes.get(currentTime));
			currentTime += 1;
		} else {
			rewind();
		}

	}

	public void rewind() {
		currentTime = 0;
	}

}