package com.nacs.logicalprograms;

public class PatternPrinting {
	int row;
	
	public PatternPrinting() {
		
	}
	
	public PatternPrinting(int row) {
		this.row=row;
	}
	
	public int getRow() {
		return row;
	}
	
	public void setRow(int row) {
		this.row=row;
	}
	
	public void printSquare() {
		for(int row=1;row<=this.row;row++) {
			for(int col=1;col<=this.row;col++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
			
	}
	
	public void printHollowSquare() {
		for(int row=1;row<=this.row;row++) {
			for(int col=1;col<=this.row;col++) {
				if(row==1 || row==this.row || col==1 || col == this.row)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
			
	}
	
	
	
	public void printSquareWithAlphabetsAndDigits() {
		char ch='A';
		int number=0;
		for(int row=1;row<=this.row;row++) {
			for(int col=1;col<=this.row;col++) {
				if(row%2==0)
					if(col%2!=0)
						if(number<=9)
							System.out.print(" "+(number++)+" ");
						else {
							System.out.print(" "+0+" ");
							number=1;
						}
					else
						if(ch<='Z')
							System.out.print(" "+(ch++)+ " ");
						else {
							System.out.print(" " + 'A' + " ");
							ch='B';
						}
				else
					if(col%2!=0) {
						if(ch<='Z')
							System.out.print(" "+(ch++)+ " ");
						else {
							System.out.print(" " + 'A' + " ");
							ch='B';
						}
					}else {
						if(number<=9)
							System.out.print(" "+(number++)+" ");
						else {
							System.out.print(" "+0+" ");
							number=1;
						}
					}
						
			}
			System.out.println();
		}
	}
	
	
	public void printRightAngleTriangle() {
		for(int row=1;row<=this.row;row++) {
			for(int col=1;col<=row;col++)
				System.out.print("* ");
			System.out.println();
		}
	}
	
	public void printReverseRightAngleTriangle() {
		for(int row=1;row<=this.row;row++) {
			for(int space=row;space<this.row;space++)
				System.out.print("  ");
			for(int col=1;col<=row;col++)
				System.out.print("* ");
			System.out.println();
		}
	}
	
	public void printTriangle() {
		for(int row=1;row<=this.row;row++) {
			for(int space=row;space<this.row;space++)
				System.out.print("  ");
			for(int col=1;col<=row;col++)
				System.out.print("*   ");
			System.out.println();
		}
	}
	
	public void printUpSideDownTrianlge() {
		char ch='a';
		int number=0;
		for(int row=1;row<=this.row;row++) {
			for(int space=1;space<row;space++)
				System.out.print("  ");
			for(int col=row;col<=this.row;col++)
				if(row%2==0)
					if(col%2!=0)
						if(number<=9)
							System.out.print((number++)+"   ");
						else {
							System.out.print(0+"  ");
							number=1;
						}
					else
						if(ch<='z')
							System.out.print((ch++)+"   ");
						else {
							System.out.print(0+"   ");
							ch='b';
						}
				else
					if(col%2==0)
						if(ch<='z')
							System.out.print((ch++)+"   ");
						else {
							System.out.print(0+"   ");
							ch='b';
						}
					else
						if(number<=9)
							System.out.print((number++)+"   ");
						else {
							System.out.print(0+"  ");
							number=1;
						}
			System.out.println();
		}
	}
	
	
	
	
	
	
}
