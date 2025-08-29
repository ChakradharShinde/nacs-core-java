package com.nacs.oops.abstraction.main;

import com.nacs.oops.abstraction.Person;
import com.nacs.oops.abstraction.impl.Doctor;
import com.nacs.oops.abstraction.impl.Teacher;

public class MainTeacherDoctorPerson {
	public static void main(String[] args) {
		Person jagdaleMam = new Teacher();
		jagdaleMam.defineMe();
		
		Person barale = new Doctor();
		barale.defineMe();
	}
}
