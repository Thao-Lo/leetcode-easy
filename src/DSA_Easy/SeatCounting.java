package DSA_Easy;

import java.util.ArrayList;

public class SeatCounting {

	public static void main(String[] args) {
		int[] seat = { 1, 3, 5, 6, 7, 8, 10, 12, 13, 14, 15, 16, 20, 21 };
		ArrayList<Integer> num = new ArrayList<>();

		for (int i = 0; i < seat.length; i++) {
			if (num.size() == 0 || seat[i] == num.get(num.size() - 1) + 1) {
				num.add(seat[i]);

			} else {
				if (num.size() >= 3) {
					System.out.println(num.get(0) + " - " + num.get(num.size() - 1));
					num.clear();
				}
				for (int j = 0; j < num.size(); j++) {
					System.out.println(num.get(j));
				}
				num.clear();
				num.add(seat[i]);
			}

			if (i == seat.length - 1 && num.size() >= 3) {
				System.out.println(num.get(0) + " - " + num.get(num.size() - 1));
			} else if (i == seat.length - 1 && num.size() < 3) {
				for (int j = 0; j < num.size(); j++) {
					System.out.println(num.get(j));
				}
			}

		}

	}

}

//int start = seat[0];
//int end = seat[0];
//
//for (int i = 1; i < seat.length; i++) {
//    if (seat[i] == end + 1) {
//        end = seat[i];
//    } else {
//        if (end - start >= 2) {
//            System.out.println(start + " - " + end);
//        } else {
//            for (int j = start; j <= end; j++) {
//                System.out.println(j);
//            }
//        }
//        start = seat[i];
//        end = seat[i];
//    }
//}
//
//// Print the last sequence
//if (end - start >= 2) {
//    System.out.println(start + " - " + end);
//} else {
//    for (int j = start; j <= end; j++) {
//        System.out.println(j);
//    }
//}