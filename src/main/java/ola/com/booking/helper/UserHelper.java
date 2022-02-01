package ola.com.booking.helper;

import ola.com.booking.model.User;

public class UserHelper {   //Utility

	static int count = 1;
	static int currentUserId;
	
	public static int getIncrement() {
		return count++;
	}

	public static int getCurrentUserId() {
		return currentUserId;
	}

	public static void setCurrentUserId(int currentUserId) {
		UserHelper.currentUserId = currentUserId;
	}

	

}
