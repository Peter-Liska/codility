package practice;

import java.util.ArrayList;
import java.util.HashSet;

public class Tetris {

	public boolean solution(int[][] problem) {

		// basic check
		int sum = 0;
		for (int row = 0; row < problem.length; row++) {
			for (int col = 0; col < problem[0].length; col++) {
				sum += problem[row][col];
			}
		}
		if (sum == 0) return true;
		if (sum % 4 != 0) return false;

		// initialization
		int numberOfShapes = sum / 4;
		this.fillAllShapes();
		HashSet<Integer> used = new HashSet<>();

		// Try to solve problem.
		return this.findShape(problem, numberOfShapes, used);
	}

	private boolean findShape(int[][] problem, int numberOfShapes, HashSet<Integer> used) {

		if (numberOfShapes == 0) return true;

		for (int row = 0; row < problem.length; row++) {
			for (int col = 0; col < problem[0].length; col++) {

				if (problem[row][col] == 1) {
					for (Shape actual : this.shapes) {
						if (!used.contains(actual.shapeNumber)) {
							int r1 = row + actual.r1;
							int c1 = col + actual.c1;
							if (this.check(r1, c1) && problem[r1][c1] == 1) {
								int r2 = row + actual.r2;
								int c2 = col + actual.c2;
								if (this.check(r2, c2) && problem[r2][c2] == 1) {
									int r3 = row + actual.r3;
									int c3 = col + actual.c3;
									if (this.check(r3, c3) && problem[r3][c3] == 1) {
										problem[row][col] = 0;
										problem[r1][c1] = 0;
										problem[r2][c2] = 0;
										problem[r3][c3] = 0;
										used.add(actual.shapeNumber);
										if (this.findShape(problem, numberOfShapes - 1, used)) {
											return true;
										}
										problem[row][col] = 1;
										problem[r1][c1] = 1;
										problem[r2][c2] = 1;
										problem[r3][c3] = 1;
										used.remove(actual.shapeNumber);
									}
								}
							}
						}
					}
				}

			}
		}

		return false;
	}

	private boolean check(int row, int col) {
		if (row < 0) return false;
		if (row > 5) return false;
		if (col < 0) return false;
		if (col > 5) return false;
		return true;
	}

	private ArrayList<Shape> shapes = new ArrayList<>();

	private class Shape {
		int shapeNumber;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int r1 = 0;
		int r2 = 0;
		int r3 = 0;

		Shape(int shapeNumber) {
			this.shapeNumber = shapeNumber;
		}
	}

	private void fillAllShapes() {
		// I = 0
		Shape i = new Shape(0);
		i.r1 = 1;
		i.r2 = 2;
		i.r3 = 3;
		this.shapes.add(i);
		Shape i1 = new Shape(0);
		i1.c1 = 1;
		i1.c2 = 2;
		i1.c3 = 3;
		this.shapes.add(i1);

		// J = 1
		// TODO add all J rotations

		// L = 2
		// TODO add all L rotations

		// O = 3
		Shape o = new Shape(3);
		o.r1 = 1;
		o.c2 = 1;
		o.r3 = 1;
		o.c3 = 1;
		this.shapes.add(o);

		// S = 4
		Shape s = new Shape(4);
		s.c1 = 1;
		s.r2 = -1;
		s.c2 = 1;
		s.r3 = -1;
		s.c3 = 2;
		this.shapes.add(s);
		// TODO add missing S rotations

		// T = 5
		Shape t = new Shape(5);
		t.c1 = 1;
		t.c2 = 2;
		t.r3 = -1;
		t.c3 = 1;
		this.shapes.add(t);

		Shape t1 = new Shape(5);
		t1.r1 = 1;
		t1.r2 = 2;
		t1.r3 = 1;
		t1.c3 = 1;
		this.shapes.add(t1);

		Shape t2 = new Shape(5);
		t2.c1 = 1;
		t2.c2 = 2;
		t2.r3 = 1;
		t2.c3 = 1;
		this.shapes.add(t2);

		Shape t3 = new Shape(5);
		t3.c1 = 1;
		t3.c2 = 1;
		t3.r2 = -1;
		t3.c3 = 1;
		t3.r3 = 1;
		this.shapes.add(t3);

		// Z = 6
		// TODO add all Z rotations
	}

}
