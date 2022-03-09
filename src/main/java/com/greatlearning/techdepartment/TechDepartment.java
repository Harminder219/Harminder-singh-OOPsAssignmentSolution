package com.greatlearning.techdepartment;

import com.greatlearning.superdepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment {

	private String departmentName() {

		return "Tech Department";

	}

	private String getTodaysWork() {

		return "Complete coding of module 1";

	}

	private String getWorkDeadline() {

		return "Complete by EOD";

	}

	private String getTechStackInformation() {

		return "Core Java";

	}

	public void displayinfo() {

		System.out.println("\nWelcome to " + departmentName());

		System.out.println(getTodaysWork());

		System.out.println(getWorkDeadline());

		System.out.println(getTechStackInformation());

		System.out.println(super.isTodayAHoliday());

	}

}
