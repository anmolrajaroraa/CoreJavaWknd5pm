package com.bmpl.Phoenix.Basic;

public class Array2DDemo {

	public static void main(String[] args) {
		
		// 0 -> available seats
		// 1 -> booked seats
		// 2 -> available but reserved for women
		
		int busSeats[][] = new int[10][];
		
		busSeats[0] = new int[4];
		busSeats[1] = new int[4];
		busSeats[2] = new int[4];
		busSeats[3] = new int[4];
		busSeats[4] = new int[4];
		busSeats[5] = new int[4];
		busSeats[6] = new int[4];
		busSeats[7] = new int[4];
		busSeats[8] = new int[4];
		
		busSeats[9] = new int[5];
		
//		for(int row[] : busSeats) {
//			for(int seat : row) {
//				System.out.print(seat);
//			}
//			System.out.println();
//		}
		
		busSeats[2][2] = 2;
		busSeats[2][3] = 2;
		busSeats[3][2] = 2;
		busSeats[3][3] = 2;
		
		busSeats[9][0] = 1;
		busSeats[9][1] = 1;
		busSeats[9][2] = 1;
		busSeats[9][3] = 1;
		busSeats[9][4] = 1;
		
		for(int i = 0; i < busSeats.length; i++) {
			for(int j=0; j < busSeats[i].length; j++) {
				if(j == 2 && i != 9) {
					System.out.print(" ");
				}
				System.out.print(busSeats[i][j]);
			}
			System.out.println();
		}

	}

}
