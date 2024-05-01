package DSA_Easy;

import java.util.ArrayList;

public class SeatCounting {

	public static void main(String[] args) {
		 int[] seat = { 1, 2, 4, 5, 6, 7, 8, 10, 12, 13, 14, 15, 16, 20,21 };

	        int start = seat[0];
	        int end = seat[0];

	        for (int i = 1; i < seat.length; i++) {
	            if (seat[i] == end + 1) {
	                end = seat[i];
	            } else {
	                if (end - start >= 2) {
	                    System.out.println(start + " - " + end);
	                } else {
	                    for (int j = start; j <= end; j++) {
	                        System.out.println(j);
	                    }
	                }
	                start = seat[i];
	                end = seat[i];
	            }
	        }

	        // Print the last sequence
	        if (end - start >= 2) {
	            System.out.println(start + " - " + end);
	        } else {
	            for (int j = start; j <= end; j++) {
	                System.out.println(j);
	            }
	        }
	}

}
//int count = 0;
//int start = 0;
//int end = 0;
//for (int i = 1; i < seats.length; i++) {
//int seat = seats[i - 1];
//if (seat + 1 == seats[i]) {
//	count++;
//	if (i == seats.length - 1 && count >= 2) {
//		start = seats[i - count];
//		end = seats[i];
//		System.out.print("seats: " + start + " - " + end + "\n");
//	}
//} else {				
//	if (count >= 2) {
//		start = seats[i - 1 - count];
//		end = seats[i - 1];
//		System.out.print("seats: " + start + " - " + end + "\n");
//	}
//
//	if (end != seats[i - 1]) {
//		System.out.println("seat: " + seats[i - 1]);
//	}
//	count = 0;
//	start = 0;
//	end = 0;
//}