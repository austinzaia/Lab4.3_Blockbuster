import java.util.Scanner;

public class DVD extends Movie {

	public DVD() {

	}

	@Override
	public void play() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Select the scene you would like to watch: ");
		for (String scene : scenes) {
			System.out.println(scene);

		}

		int sceneSelect = scanner.nextInt();
		System.out.println(scenes.get(sceneSelect));

		scanner.close();
	}
}
