/*
 
 Draw the markings of a typical English ruler. For each inch, we place a tick with a numeric label. 
 We denote the length of the tick designating a whole inch as the major tick length. 
 Between the marks for whole inches, the ruler contains a series of minor ticks, placed at intervals of 1/2 inch, 1/4 inch, and so on.
 As the size of the interval decreases by half, the tick length decreases by one. 

---- 0 				----- 0 			--- 0
- 					- 					-
-- 					-- 					--
- 					- 					-
--- 				--- 				--- 1
- 					-	 				-	
-- 					-- 					--
- 					- 					-
---- 1 				---- 				--- 2
- 					- 					-
-- 					-- 					--
- 					- 					-
--- 				--- 				--- 3
- 					-
-- 					--
- 					-
---- 2 				----- 1

(a) a 2-inch ruler with major tick length 4.
(b) a 1-inch ruler with major tick length 5. 
(c) a 3-inch ruler with major tick length 3.
 
 */
import java.util.Scanner;

public class Ruler_Code {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int total_length = scn.nextInt();
		int tick_length = scn.nextInt();

		loop(total_length, tick_length);

	}

	public static void Rul_Repeat(int tick_length) {
		if (tick_length == 0) {
			return;
		}
		Rul_Repeat(tick_length - 1);

		PrintMinor_tick(tick_length);

		Rul_Repeat(tick_length - 1);

	}

	public static void PrintMinor_tick(int tick_length) {

		for (int i = 1; i <= tick_length; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public static void PrintMajor_tick(int tick_length, int val) {

		for (int i = 1; i <= tick_length; i++) {
			System.out.print("-");
		}
		System.out.print(val+"\n");
		
	}

	public static void loop(int total_length, int tick_length) {

		PrintMajor_tick(tick_length, 0);
		for (int i = 1; i <= total_length; i++) {

			Rul_Repeat(tick_length - 1);
			PrintMajor_tick(tick_length, i);
		}

	}

}
