package com.greatlearning.main;

import com.greatlearning.admindepartment.AdminDepartment;

import com.greatlearning.hrdepartment.HrDepartment;

import com.greatlearning.techdepartment.TechDepartment;

public class Main {

	public static void main(String[] args) {

		AdminDepartment Admin = new AdminDepartment();

		HrDepartment Hr = new HrDepartment();

		TechDepartment Technical = new TechDepartment();

		Admin.displayinfo();

		Hr.displayinfo();

		Technical.displayinfo();

	}

}
