package fileDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

class Test {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String[] choice;
		Boolean flag = true;
		String s = "";

		while (flag) {
			System.out.print("?- ");
			choice = sc.nextLine().split(" ");

			switch (choice[0]) {
			case "ext": // exit
				flag = false;
				break;

			case "crt": // create a file
				s = choice[1];
				try {
					System.out.println("CREATING " + s + ".saq");
					Thread.sleep(2000);
					FileWriter fw = new FileWriter("D:\\FileJava\\" + s + ".saq");
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write("NOTHING");
					System.out.println("FILE CREATED SUCCESSFULLY");
					bw.close();

				} catch (Exception e) {
				}
				break;

			case "flush":
				s = choice[1];
				try {
					FileWriter fw = new FileWriter("D:\\FileJava\\" + s + ".saq");
					BufferedWriter bw = new BufferedWriter(fw);

					bw.write("");
					bw.close();

				} catch (Exception e) {
				}

				break;

			case "apnd":
				s = choice[1];
				try {
					FileWriter fw = new FileWriter("D:\\FileJava\\" + s + ".saq", true);
					BufferedWriter bw = new BufferedWriter(fw);

					System.out.print("Txt ?- ");
					String txt = sc.nextLine();

					bw.append(" " + txt);
					bw.close();

				} catch (Exception e) {
				}

				break;

			case "opn": // open file
				try {
					s = choice[1];
					if (s.isBlank()) {
						System.out.println("NO FILE TO SHOW");
						break;
					}

					System.out.println("OPENING " + s + ".saq");
					Thread.sleep(2000);
					FileReader fr = new FileReader("D:\\FileJava\\" + s + ".saq");
					BufferedReader br = new BufferedReader(fr);
					String str;
					while ((str = br.readLine()) != null) {
						System.out.print(str + "\n");
					}
					br.close();
				} catch (Exception e) {
				}
				break;

			case "lst":
				try {
					String dir = "D:\\FileJava\\";
					File fileOb = new File(dir);

					if (fileOb.list() == null)
						break;

					for (String listStr : fileOb.list()) {
						System.out.println(listStr);
					}

				} catch (Exception e) {
				}
				break;

			case "del":
				try {
					String dir = "D:\\FileJava\\";
					File fileOb = new File(dir + choice[1] + ".saq");
					fileOb.delete();

				} catch (Exception e) {
				}
				break;

			default:
				System.out.println("INVALID CHOICE");
			}
		}
		sc.close();
	}
}
