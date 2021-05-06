import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class StringGen {
	final static String version = "4.1.1";

	static String[] randomCharacter = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9","`","~","!","@","#","$","%","^","&","*","(",")","-","_","=","+","[","{","]","}",";",":","\'","\"",",","<",".",">","/","?","\\","|"};

	public static void main(String[] args) {
		if (args.length > 0 && args[0].contains("--info")) {
			displayInfo();
		} else if (args.length == 4) {
			generateStrings(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		} else if (args.length == 0) {
			getUserInput();
		} else {
			System.out.println("Please use --info argument for information on how to use this.");
		}
	}

	private static void generateStrings(String writeToFile, int stringAmount, int stringLength, int stringType) {
		try {
			int randomNum = 0;

			switch (writeToFile.toLowerCase()) {
				case "y":case "yes":case "1": case "true":
					if (stringType != 1 && stringType != 2 && stringType != 3 && stringType !=4 && stringType != 5 && stringType != 6) {
						System.out.println("Defaulted to mode: All");
						stringType = 6;
					}

					File stringFile = new File(System.getProperty("user.home")+"/Desktop/RandomStrings.txt");
					if (!stringFile.exists()) stringFile.createNewFile();

					BufferedWriter bw = new BufferedWriter(new FileWriter(stringFile.getAbsolutePath()));

					for (int i = 0; i < stringAmount; i++ ) {
						bw.write("String "+(i+1)+": ");
						System.out.print("String "+(i+1)+": ");

						for (int i1 = 0; i1 < stringLength; i1++) {
							switch (stringType) {
								case 1:
									randomNum = (int) Math.floor((Math.random() * 47));
									System.out.print(""+randomCharacter[randomNum]);
									bw.write(""+randomCharacter[randomNum]);
									break;
								case 2:
									randomNum = (int) Math.floor((Math.random() * 10)) + 52;
									System.out.print(""+randomCharacter[randomNum]);
									bw.write(""+randomCharacter[randomNum]);
									break;
								case 3:
									randomNum = (int) Math.floor((Math.random() * 32)) + 62;
									System.out.print(""+randomCharacter[randomNum]);
									bw.write(""+randomCharacter[randomNum]);
									break;
								case 4:
									randomNum = (int) Math.floor((Math.random() * 57));
									System.out.print(""+randomCharacter[randomNum]);
									bw.write(""+randomCharacter[randomNum]);
									break;
								case 5:
									randomNum = (int) Math.floor((Math.random() * 42)) + 52;
									System.out.print(""+randomCharacter[randomNum]);
									bw.write(""+randomCharacter[randomNum]);
									break;
								case 6:
									randomNum = (int) Math.floor((Math.random() * 94));
									System.out.print(""+randomCharacter[randomNum]);
									bw.write(""+randomCharacter[randomNum]);
									break;
								default: break;
							}
						}
						System.out.println("\n");
						bw.newLine();
					}
					bw.close();
					System.out.println("Written String(s) to File: "+stringFile);
					break;
				case "false":case "no":case "n":case "0":
					if (stringType != 1 && stringType != 2 && stringType != 3 && stringType !=4 && stringType != 5 && stringType != 6) {
						System.out.println("Defaulted to mode: All");
						stringType = 6;
					}

					for (int i = 0; i < stringAmount; i++ ) {
						System.out.print("String "+(i+1)+": ");

						for (int i1 = 0; i1 < stringLength; i1++) {
							switch (stringType) {
								case 1:
									randomNum = (int) Math.floor((Math.random() * 47));
									System.out.print(""+randomCharacter[randomNum]);
									break;
								case 2:
									randomNum = (int) Math.floor((Math.random() * 10)) + 52;
									System.out.print(""+randomCharacter[randomNum]);
									break;
								case 3:
									randomNum = (int) Math.floor((Math.random() * 32)) + 62;
									System.out.print(""+randomCharacter[randomNum]);
									break;
								case 4:
									randomNum = (int) Math.floor((Math.random() * 57));
									System.out.print(""+randomCharacter[randomNum]);
									break;
								case 5:
									randomNum = (int) Math.floor((Math.random() * 42)) + 52;
									System.out.print(""+randomCharacter[randomNum]);
									break;
								case 6:
									randomNum = (int) Math.floor((Math.random() * 94));
									System.out.print(""+randomCharacter[randomNum]);
									break;
								default: break;
							}
						}
						System.out.println("\n");
					}
					break;
				default: break;
			}
		} catch (IOException e) {
			System.out.println(":(");
			e.printStackTrace();
		}
	}

	private static void getUserInput() {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("\nWrite Strings to file: ");
			String writeToFile = in.nextLine();

			System.out.print("Amount of Strings to Generate: ");
			int stringAmount = in.nextInt();

			System.out.print("String Length: ");
			int stringLength = in.nextInt();

			System.out.print("Letters (1), Numbers (2), Symbols (3), Letters & Numbers (4), Numbers & Symbols(5), All (6): ");
			int stringType = in.nextInt();

			System.out.println("\n");

			generateStrings(writeToFile, stringAmount, stringLength, stringType);
		} catch (Exception e) {
			System.out.println(":(");
			e.printStackTrace();
		}
	}

	private static void displayInfo() {
		System.out.println("--Random String Generator--\n"
			+"      Author: Ew0345\n"
			+"      Version: "+version+"\n"
			+"\n"
			+"How to use: StringGen [<Write To File [yes|y|true|1]|[no|n|false|0]> <Number of strings to generate> <Length of strings> <String type (1-6)>]\n"
			+"--Random String Generator--");
	}
}