package ua.unit.avaj;

import ua.unit.avaj.aircrafts.Flyable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Simulator {

	private static WeatherTower tower;
	private static ArrayList<Flyable> aircrafts = new ArrayList<>();

	public Simulator() {}

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("ERROR: Provide a file path as a single argument");
			System.exit(1);
		}

		try {
			BufferedReader reader = new BufferedReader(new FileReader(args[0]));
			String ln = reader.readLine();

				System.out.println("Line: " + ln);	//

			if (ln != null) {
				tower = new WeatherTower();


			}

		} catch (FileNotFoundException e) {
			System.out.println("ERROR: I can't find such file, darling :(");
		} catch (IOException e) {
			System.out.println("ERROR: File reading failed");
		} finally {
			System.out.println("<placeholder for finally in main>");
		}
	}

}