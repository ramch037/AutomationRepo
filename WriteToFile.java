import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("write.txt", true);
		PrintWriter writer = new PrintWriter(file);
		writer.println("dingari");
		writer.println("fcku ");
		writer.close();

	}

}
