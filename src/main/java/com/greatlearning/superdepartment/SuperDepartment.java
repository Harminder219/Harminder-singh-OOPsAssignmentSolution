package com.greatlearning.superdepartment;

public class SuperDepartment {

	private String departmentName() {

		return "Super Department";

	}

	private String getTodaysWork() {

		return "No Work as of now";

	}

	private String getWorkDeadline() {

		return "Nil";

	}

	public String isTodayAHoliday() {

		return "Today is not a holiday";

	}

	public void displayinfo() {

		System.out.println("\nWelcome to " + departmentName());

		System.out.println(getTodaysWork());

		System.out.println(getWorkDeadline());

		System.out.println(isTodayAHoliday());

	}

}
