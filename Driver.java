
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream in, in2;
		FileOutputStream out;
		try {
			in = new FileInputStream("input.txt");
			in2 = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");

			PrintWriter pw = new PrintWriter(out);
			Scanner input = new Scanner(in);
			Scanner input2 = new Scanner(in2);

			int x = 0;

			while (input.hasNext()) {
				String dummy = input.next();//to make the scanner move because hasNext doesn't move
				x++;
			}

			int numOfNames = x / 2;

			String[] names = new String[numOfNames];

			for (int i = 0; i < names.length; i++) {
				names[i] = input2.next() + " " + input2.next();
			}

			Arrays.sort(names);

			for (int i = 0; i < names.length; i++) {
				pw.println(names[i]);
			}

			pw.close();
			input.close();
			input2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
