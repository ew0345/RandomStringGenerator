import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class StringGen {
	final static String version = "4.2.2";

	static String[] randomLetter = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	static String[] randomNumber = {"0","1","2","3","4","5","6","7","8","9"};
	static String[] randomSymbol = {"`","~","!","@","#","$","%","^","&","*","(",")","-","_","=","+","[","{","]","}",";",":","\'","\"",",","<",".",">","/","?","\\","|"};

	public static void main(String[] args) {
		if (args.length == 4) {
			generateStrings(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		} else if (args.length > 0 && args[0].contains("--info") || args.length > 0 && args[0].contains("/?")) {
			displayInfo();
		} else {
			getUserInput();
		}
	}

	private static void generateStrings(String writeToFile, int stringAmount, int stringLength, int stringType) {

		int rand, selection = 0;

		switch (writeToFile.toLowerCase()) {
			case "true":case "yes":case "y":case "1":
				try {
					File stringFile = new File(System.getProperty("user.home")+"/Desktop/RandomStrings.txt");
					if (!stringFile.exists()) stringFile.createNewFile();

					BufferedWriter bw = new BufferedWriter(new FileWriter(stringFile.getAbsolutePath()));

					for (int i = 0; i < stringAmount; i++) {
						System.out.print("String #"+(i+1)+": ");
						bw.write("String #"+(i+1)+": ");

						for (int i1 = 0; i1 < stringLength; i1++) {
							switch(stringType) {
								case 1: //letters only
									selection = 1;
									break;
								case 2: //numbers only
									selection = 2;
									break;
								case 3: //symbols only
									selection = 3;
									break;
								case 4: //letters & numbers
									selection = (int) Math.floor((Math.random() * 2) + 1);
									break;
								case 5: //letters & symbols
									selection = (int) Math.floor((Math.random() * 2) + 1);
									if (selection == 2) selection = 3;
									break;
								case 6: //numbers & symbols
									selection = (int) Math.floor((Math.random() * 2) + 1);
									if (selection == 1) {
										selection = 2;
									} else if (selection == 2) {
										selection = 3;
									}
									break;
								case 7: //All
									selection = (int) Math.floor((Math.random() * 3) + 1);
									break;
								default: //error for invalid type
									System.out.println("Invalid string generation type. Valid types are: 1 (Letters Only),"
															+" 2 (Numbers Only), 3 (Symbols Only), 4 (Letters and Numbers), "
															+"5 (Letters and Symbols), 6 (Numbers and Symbols), 6 (All).");
									System.exit(0);
									break;
							}

							switch (selection) {
								case 1:
									rand = (int) Math.floor((Math.random() * randomLetter.length));
									System.out.print(randomLetter[rand]);
									bw.write(randomLetter[rand]);
									break;
								case 2:
									rand = (int) Math.floor((Math.random() * randomNumber.length));
									System.out.print(randomNumber[rand]);
									bw.write(randomNumber[rand]);
									break;
								case 3:
									rand = (int) Math.floor((Math.random() * randomSymbol.length));
									System.out.print(randomSymbol[rand]);
									bw.write(randomSymbol[rand]);
									break;
								default: 
									System.out.println("Selection error.\nPlease report issue on https://github.com/ew0345/RandomStringGenerator/issues with the title: \'Selection Error: selection was "+selection+"\'.");
									bw.close();
									if (stringFile.exists()) stringFile.delete();
									System.exit(0);
									break;
							}
						}
						System.out.print("\n");
						bw.newLine();
					}
					bw.close();
					System.out.println("Strings written to: \""+stringFile.getAbsolutePath()+"\".");
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case "false":case "no":case "n":case "0":
				for (int i = 0; i < stringAmount; i++) {
					System.out.print("String #"+(i+1)+": ");

					for (int i1 = 0; i1 < stringLength; i1++) {
						switch (stringType) {
							case 1: //letters only
								selection = 1;
								break;
							case 2: //numbers only
								selection = 2;
								break;
							case 3: //symbols only
								selection = 3;
								break;
							case 4: //letters & numbers
								selection = (int) Math.floor((Math.random() * 2) + 1);
								break;
							case 5: //letters & symbols
								selection = (int) Math.floor((Math.random() * 2) + 1);
								if (selection == 2) selection = 3;
								break;
							case 6: //numbers & symbols
								selection = (int) Math.floor((Math.random() * 2) + 1);
								if (selection == 1) {
									selection = 2;
								} else if (selection == 2) {
									selection = 3;
								}
								break;
							case 7: //All
								selection = (int) Math.floor((Math.random() * 3) + 1);
								break;
							default: //error for invalid type
								System.out.println("Invalid string generation type. Valid types are: 1 (Letters Only),"
														+" 2 (Numbers Only), 3 (Symbols Only), 4 (Letters and Numbers), "
														+"5 (Letters and Symbols), 6 (Numbers and Symbols), 6 (All).");
								System.exit(0);
								break;
						}
						
						switch (selection) {
							case 1:
								rand = (int) Math.floor((Math.random() * randomLetter.length));
								System.out.print(randomLetter[rand]);
								break;
							case 2:
								rand = (int) Math.floor((Math.random() * randomNumber.length));
								System.out.print(randomNumber[rand]);
								break;
							case 3:
								rand = (int) Math.floor((Math.random() * randomSymbol.length));
								System.out.print(randomSymbol[rand]);
								break;
							default: 
								System.out.println("Selection error.\nPlease report issue on https://github.com/ew0345/RandomStringGenerator/issues with the title: \'Selection Error: selection was "+selection+"\'.");
								System.exit(0);
								break;
						}
					}
					System.out.println("\n");
				}
				break;
			default: break;
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

			System.out.println("Letters (1), Numbers (2), Symbols (3), Letters & Numbers (4), Letters & Symbols (5), Numbers & Symbols (6), All (7)");
			System.out.print("String Type: ");
			int stringType = in.nextInt();

			System.out.println("\n");

			generateStrings(writeToFile, stringAmount, stringLength, stringType);
		} catch (Exception e) {
			System.out.println("D:");
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
