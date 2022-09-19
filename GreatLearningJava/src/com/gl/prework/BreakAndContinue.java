package com.gl.prework;

public class BreakAndContinue {

	public void forLoop(int x) {
		for (int i = 0; i <= x; i++) {

			if (i == 3) {
				System.out.println("continue loop");
				continue;
			}
			if (i == 4) {
				System.out.println("break loop");
				break;
			}
			System.out.println("value of i: " + i);
		}
	}

	public void caseLoop(int f) {
		for (int i = 0; i <= 5; i++) {
			switch (i) {
			case 3: {
				System.out.println("continue loop");
				continue;
			}
			case 4: {
				System.out.println("break loop");
				break;
			}
			}

			System.out.println("value of i: " + i);
		}
	}

	public static void main(String[] args) {

		BreakAndContinue obj = new BreakAndContinue();
		obj.forLoop(5);
		System.out.println("----------------------------");
		obj.caseLoop(5);
		System.out.println("----------------------------");
		
	}

}
