import java.util.*;

public class Temp_example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			temp.add(scan.nextInt());
		}
		for (int j = 0; j < n; j++) {
			temp.set(j, temp.get(j) * 0);
		}
	}
}