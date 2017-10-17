package com.cisc181.core;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import pkgException.PersonException;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void AverageSalaryTest() throws PersonException {
		ArrayList<Staff> Staff = new ArrayList<Staff>();
		Staff.add(new Staff("first name", "middle name", "last name", new Date(1985, 5, 5), "123 larry lane",
				"1234567890", "staff@school.edu", "5-7", 7, 45000, new Date(2002, 1, 4), com.cisc181.eNums.eTitle.MR));
		Staff.add(new Staff("first name", "middle name", "last name", new Date(1985, 5, 5), "123 larry lane",
				"1234567890", "staff@school.edu", "5-7", 7, 45000, new Date(2002, 1, 4), com.cisc181.eNums.eTitle.MR));
		Staff.add(new Staff("first name", "middle name", "last name", new Date(1985, 5, 5), "123 larry lane",
				"1234567890", "staff@school.edu", "5-7", 7, 45000, new Date(2002, 1, 4), com.cisc181.eNums.eTitle.MR));
		Staff.add(new Staff("first name", "middle name", "last name", new Date(1985, 5, 5), "123 larry lane",
				"1234567890", "staff@school.edu", "5-7", 7, 45000, new Date(2002, 1, 4), com.cisc181.eNums.eTitle.MR));
		Staff.add(new Staff("first name", "middle name", "last name", new Date(1985, 5, 5), "123 larry lane",
				"1234567890", "staff@school.edu", "5-7", 7, 45000, new Date(2002, 1, 4), com.cisc181.eNums.eTitle.MR));

		assertTrue((Staff.get(0).getSalary() + Staff.get(1).getSalary() + Staff.get(2).getSalary()
				+ Staff.get(3).getSalary() + Staff.get(4).getSalary()) / 5 == 45000);
	}

	@Test(expected = PersonException.class)
	public void PersonExceptionPhoneNbrTest() throws PersonException {
		Staff p = new Staff("first name", "middle name", "last name", new Date(1985, 5, 5), "123 larry lane",
				"1234567890", "staff@school.edu", "5-7", 7, 45000, new Date(2002, 1, 4), com.cisc181.eNums.eTitle.MR);
		p.setPhone("123456789");

	}

	@Test(expected = PersonException.class)
	public void PersonExceptionDOBTest() throws PersonException {
		Staff p = new Staff("first name", "middle name", "last name", new Date(1985, 5, 5), "123 larry lane",
				"1234567890", "staff@school.edu", "5-7", 7, 45000, new Date(2002, 1, 4), com.cisc181.eNums.eTitle.MR);
		p.setDOB(new Date(1800, 1, 1));

	}
}
