package com.greatlearning.admindepartment;

import com.greatlearning.superdepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	private String departmentName() {

		return "Admin Department";

	}

	private String getTodaysWork() {

		return "Complete your documents Submission";

	}

	private String getWorkDeadline() {

		return "Complete by EOD";

	}

	public void displayinfo() {

		System.out.println("\nWelcome to " + departmentName());

		System.out.println(getTodaysWork());

		System.out.println(getWorkDeadline());

		System.out.println(super.isTodayAHoliday());

	}

}
