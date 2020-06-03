package com.bmpl.Phoenix.Basic;

public class Array3D {

	public static void main(String[] args) {
		
//		int doubleDeckerBus[][][] = { { {0,0,0,0}, {2,2,2,2}, {0,0,0,0}, {}, {}, {}, {}, {}, {}, {} },
//									{ {0,0,0,0}, {}, {}, {}, {}, {}, {}, {0,0,0,0}} };

		int doubleDeckerBus[][][] = new int[2][][];
		doubleDeckerBus[0] = new int[10][];
		doubleDeckerBus[1] = new int[8][];
//		doubleDeckerBus[2] = new int[5][];
		
		doubleDeckerBus[0][0] = new int[4];
		doubleDeckerBus[0][1] = new int[4];
		doubleDeckerBus[0][2] = new int[4];
		doubleDeckerBus[0][3] = new int[4];
		doubleDeckerBus[0][4] = new int[4];
		doubleDeckerBus[0][5] = new int[4];
		doubleDeckerBus[0][6] = new int[4];
		doubleDeckerBus[0][7] = new int[4];
		doubleDeckerBus[0][8] = new int[4];
		doubleDeckerBus[0][9] = new int[5];
		
		doubleDeckerBus[1][0] = new int[4];
		doubleDeckerBus[1][1] = new int[4];
		doubleDeckerBus[1][2] = new int[4];
		doubleDeckerBus[1][3] = new int[4];
		doubleDeckerBus[1][4] = new int[4];
		doubleDeckerBus[1][5] = new int[4];
		doubleDeckerBus[1][6] = new int[4];
		doubleDeckerBus[1][7] = new int[4];
		
		doubleDeckerBus[0][1][0] = 2;
		doubleDeckerBus[0][1][1] = 2;
		doubleDeckerBus[0][1][2] = 2;
		doubleDeckerBus[0][1][3] = 2;
		
		doubleDeckerBus[1][1][0] = 2;
		doubleDeckerBus[1][1][1] = 2;
		doubleDeckerBus[1][1][2] = 2;
		doubleDeckerBus[1][1][3] = 2;
		
		doubleDeckerBus[0][9][0] = 1;
		doubleDeckerBus[0][9][1] = 1;
		doubleDeckerBus[0][9][2] = 1;
		doubleDeckerBus[0][9][3] = 1;
		doubleDeckerBus[0][9][4] = 1;
		
		doubleDeckerBus[1][7][0] = 1;
		doubleDeckerBus[1][7][1] = 1;
		doubleDeckerBus[1][7][2] = 1;
		doubleDeckerBus[1][7][3] = 1;
		
//		doubleDeckerBus[floor][row][seat_no]
		
//		for(int floor[][] : doubleDeckerBus) {
//			
//			for( int row[] : floor) {
//				
//				System.out.print(" [ ");
//				for( int seat : row ) {
//					System.out.print(seat);
//				}
//				System.out.print(" ] ");
//				
//				System.out.println();
//				 
//			}
//			
//			System.out.println();
//			System.out.println();
//			
//		}
		
		System.out.println("Bus 1");
		
		for(int i = 0; i < doubleDeckerBus.length; i++) {
//			
			for(int j = 0; j < doubleDeckerBus[i].length; j++) {
				
				System.out.print(" [ ");
				for(int k = 0; k < doubleDeckerBus[i][j].length; k++) {
					if(k == 2 && j != 9) {
						System.out.print(" ");
					}
					System.out.print(doubleDeckerBus[i][j][k]);
				}
				System.out.print(" ] ");
				System.out.println();
				
			}
			System.out.println();
			System.out.println();
			
		}
		
		System.out.println("******************************************");
		
		System.out.println("Bus 2");
		
//		int Bus2[][][] = doubleDeckerBus;
		
		int Bus2[][][] = doubleDeckerBus.clone();
		
		Bus2[0][9] = new int[2];
		
		Bus2[0][0][0] = 2;
		Bus2[0][0][1] = 2;
		Bus2[0][0][2] = 2;
		Bus2[0][0][3] = 2;
		
		for(int i = 0; i < Bus2.length; i++) {
//			
			for(int j = 0; j < Bus2[i].length; j++) {
				
				System.out.print(" [ ");
				for(int k = 0; k < Bus2[i][j].length; k++) {
					if(k == 2 && j != 9) {
						System.out.print(" ");
					}
					System.out.print(Bus2[i][j][k]);
					if(k == 1 && j == 9) {
						System.out.print("   ");
					}
				}
				System.out.print(" ] ");
				System.out.println();
				
			}
			System.out.println();
			System.out.println();
			
		}
		
		System.out.println("******************************************");
		
		System.out.println("Bus 1");
		
		for(int i = 0; i < doubleDeckerBus.length; i++) {
//			
			for(int j = 0; j < doubleDeckerBus[i].length; j++) {
				
				System.out.print(" [ ");
				for(int k = 0; k < doubleDeckerBus[i][j].length; k++) {
					if(k == 2 && j != 9) {
						System.out.print(" ");
					}
					System.out.print(doubleDeckerBus[i][j][k]);
				}
				System.out.print(" ] ");
				System.out.println();
				
			}
			System.out.println();
			System.out.println();
			
		}
		
		int first[] = {1,2,3,4,5};
		
//		int second[] = first;
		
		int second[] = first.clone();
		
		second[0] = 100;
		
		for(int element : first) {
			System.out.println(element);
		}
		
		for(int element : second) {
			System.out.println(element);
		}
		
	}

}
