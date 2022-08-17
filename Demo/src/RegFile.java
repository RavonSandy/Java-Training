import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class RegFile {

	private static String method(String filePath)
	{

		StringBuilder builder = new StringBuilder();
		try (BufferedReader buffer = new BufferedReader(
				new FileReader(filePath))) {

			String str;
			while ((str = buffer.readLine()) != null) {

				builder.append(str).append("\n");
			}
			
		}

		catch (IOException e) {

			e.printStackTrace();
		}
		return builder.toString();
	}

	public static void main(String[] args)
	{

		// Custom input file path stored in string type
		String filePath = "C:\\Users\\santhoshg\\Documents\\MAVERIC\\Java\\Sandy.txt";


		System.out.println(method(filePath));
	}
}
