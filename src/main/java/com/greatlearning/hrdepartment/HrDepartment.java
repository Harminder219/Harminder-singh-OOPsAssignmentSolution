package com.greatlearning.hrdepartment;

import com.greatlearning.superdepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {

	private String departmentName() {

		return "Hr Department";

	}

	private String getTodaysWork() {

		return "Fill today’s worksheet and mark your attendance";

	}

	private String getWorkDeadline() {

		return "Complete by EOD";

	}

	private String doActivity() {

		return "team Lunch";

	}

	public void displayinfo() {

		System.out.println("\nWelcome to " + departmentName());

		System.out.println(doActivity());

		System.out.println(getTodaysWork());

		System.out.println(getWorkDeadline());

		System.out.println(super.isTodayAHoliday());

	}

}
