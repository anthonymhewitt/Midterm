package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import pkgException.PersonException;

public class Student_Test {
	static ArrayList<Course> Courses = new ArrayList<Course>();
	static ArrayList<Semester> Semesters = new ArrayList<Semester>();
	static ArrayList<Section> Sections = new ArrayList<Section>();
	static ArrayList<Student> Students = new ArrayList<Student>();

	@BeforeClass
	public static void setup() throws PersonException {
		Course Physics = new Course(UUID.randomUUID(), "Physics", 4, com.cisc181.eNums.eMajor.PHYSICS);
		Course Chemistry = new Course(UUID.randomUUID(), "Chemistry", 4, com.cisc181.eNums.eMajor.CHEM);
		Course Math = new Course(UUID.randomUUID(), "Chemistry", 4, com.cisc181.eNums.eMajor.BUSINESS);
		Courses.add(Physics);
		Courses.add(Chemistry);
		Courses.add(Math);
		Semester Fall = new Semester(UUID.randomUUID(), new Date(2017, 8, 20), new Date(2017, 12, 16));
		Semester Spring = new Semester(UUID.randomUUID(), new Date(2018, 2, 2), new Date(2018, 5, 10));

		Semesters.add(Fall);
		Semesters.add(Spring);
		Section PhysicsSpring = new Section(Courses.get(0).getCourseID(), Semesters.get(0).getSemesterID(),
				UUID.randomUUID(), 100);
		Section PhysicsFall = new Section(Courses.get(0).getCourseID(), Semesters.get(1).getSemesterID(),
				UUID.randomUUID(), 100);
		Section ChemstrySpring = new Section(Courses.get(1).getCourseID(), Semesters.get(0).getSemesterID(),
				UUID.randomUUID(), 101);
		Section ChemstryFall = new Section(Courses.get(1).getCourseID(), Semesters.get(1).getSemesterID(),
				UUID.randomUUID(), 101);
		Section MathSpring = new Section(Courses.get(2).getCourseID(), Semesters.get(0).getSemesterID(),
				UUID.randomUUID(), 102);
		Section MathFall = new Section(Courses.get(2).getCourseID(), Semesters.get(1).getSemesterID(),
				UUID.randomUUID(), 102);

		Sections.add(PhysicsFall);
		Sections.add(PhysicsSpring);
		Sections.add(ChemstryFall);
		Sections.add(ChemstrySpring);
		Sections.add(MathFall);
		Sections.add(MathSpring);
		Student Student1 = new Student("FirstName", "MiddleName", "LastName", new Date(1996, 1, 1),
				com.cisc181.eNums.eMajor.CHEM, "123 Larry Lane", "1234567890", "student@school.edu");
		Student Student2 = new Student("FirstName", "MiddleName", "LastName", new Date(1996, 1, 1),
				com.cisc181.eNums.eMajor.CHEM, "123 Larry Lane", "1234567890", "student@school.edu");
		Student Student3 = new Student("FirstName", "MiddleName", "LastName", new Date(1996, 1, 1),
				com.cisc181.eNums.eMajor.CHEM, "123 Larry Lane", "1234567890", "student@school.edu");
		Student Student4 = new Student("FirstName", "MiddleName", "LastName", new Date(1996, 1, 1),
				com.cisc181.eNums.eMajor.CHEM, "123 Larry Lane", "1234567890", "student@school.edu");
		Student Student5 = new Student("FirstName", "MiddleName", "LastName", new Date(1996, 1, 1),
				com.cisc181.eNums.eMajor.CHEM, "123 Larry Lane", "1234567890", "student@school.edu");
		Student Student6 = new Student("FirstName", "MiddleName", "LastName", new Date(1996, 1, 1),
				com.cisc181.eNums.eMajor.CHEM, "123 Larry Lane", "1234567890", "student@school.edu");
		Student Student7 = new Student("FirstName", "MiddleName", "LastName", new Date(1996, 1, 1),
				com.cisc181.eNums.eMajor.CHEM, "123 Larry Lane", "1234567890", "student@school.edu");
		Student Student8 = new Student("FirstName", "MiddleName", "LastName", new Date(1996, 1, 1),
				com.cisc181.eNums.eMajor.CHEM, "123 Larry Lane", "1234567890", "student@school.edu");
		Student Student9 = new Student("FirstName", "MiddleName", "LastName", new Date(1996, 1, 1),
				com.cisc181.eNums.eMajor.CHEM, "123 Larry Lane", "1234567890", "student@school.edu");
		Student Student10 = new Student("FirstName", "MiddleName", "LastName", new Date(1996, 1, 1),
				com.cisc181.eNums.eMajor.CHEM, "123 Larry Lane", "1234567890", "student@school.edu");

		Students.add(Student1);
		Students.add(Student2);
		Students.add(Student3);
		Students.add(Student4);
		Students.add(Student5);
		Students.add(Student6);
		Students.add(Student7);
		Students.add(Student8);
		Students.add(Student9);
		Students.add(Student10);

	}

	@Test
	public void test() {
		ArrayList<Enrollment> Enrollment = new ArrayList<Enrollment>();
		for (Student student : Students) {
			for (Section Sections : Sections) {
				Enrollment Enrollments = new Enrollment(student.getStudentID(), Sections.getSectionID());
				Enrollment.add(Enrollments);
			}
		}
		// Adding 60 grades to the 60 enrollments
		Enrollment.get(0).setGrade(3.9);
		Enrollment.get(1).setGrade(3.0);
		Enrollment.get(2).setGrade(3.1);
		Enrollment.get(3).setGrade(3.2);
		Enrollment.get(4).setGrade(3.3);
		Enrollment.get(5).setGrade(3.4);
		Enrollment.get(6).setGrade(3.5);
		Enrollment.get(7).setGrade(3.6);
		Enrollment.get(8).setGrade(3.7);
		Enrollment.get(9).setGrade(3.8);
		Enrollment.get(10).setGrade(3.9);
		Enrollment.get(11).setGrade(3.0);
		Enrollment.get(12).setGrade(3.1);
		Enrollment.get(13).setGrade(3.2);
		Enrollment.get(14).setGrade(3.3);
		Enrollment.get(15).setGrade(3.4);
		Enrollment.get(16).setGrade(3.5);
		Enrollment.get(17).setGrade(3.6);
		Enrollment.get(18).setGrade(3.7);
		Enrollment.get(19).setGrade(3.8);
		Enrollment.get(20).setGrade(3.9);
		Enrollment.get(21).setGrade(3.0);
		Enrollment.get(22).setGrade(3.1);
		Enrollment.get(23).setGrade(3.2);
		Enrollment.get(24).setGrade(3.3);
		Enrollment.get(25).setGrade(3.4);
		Enrollment.get(26).setGrade(3.5);
		Enrollment.get(27).setGrade(3.6);
		Enrollment.get(28).setGrade(3.7);
		Enrollment.get(29).setGrade(3.8);
		Enrollment.get(30).setGrade(3.9);
		Enrollment.get(31).setGrade(3.0);
		Enrollment.get(32).setGrade(3.1);
		Enrollment.get(33).setGrade(3.2);
		Enrollment.get(34).setGrade(3.3);
		Enrollment.get(35).setGrade(3.4);
		Enrollment.get(36).setGrade(3.5);
		Enrollment.get(37).setGrade(3.6);
		Enrollment.get(38).setGrade(3.7);
		Enrollment.get(39).setGrade(3.8);
		Enrollment.get(40).setGrade(3.9);
		Enrollment.get(41).setGrade(3.0);
		Enrollment.get(42).setGrade(3.1);
		Enrollment.get(43).setGrade(3.2);
		Enrollment.get(44).setGrade(3.3);
		Enrollment.get(45).setGrade(3.4);
		Enrollment.get(46).setGrade(3.5);
		Enrollment.get(47).setGrade(3.6);
		Enrollment.get(48).setGrade(3.7);
		Enrollment.get(49).setGrade(3.8);
		Enrollment.get(50).setGrade(3.9);
		Enrollment.get(51).setGrade(3.0);
		Enrollment.get(52).setGrade(3.1);
		Enrollment.get(53).setGrade(3.2);
		Enrollment.get(54).setGrade(3.3);
		Enrollment.get(55).setGrade(3.4);
		Enrollment.get(56).setGrade(3.5);
		Enrollment.get(57).setGrade(3.6);
		Enrollment.get(58).setGrade(3.7);
		Enrollment.get(59).setGrade(3.8);

		double student1Sum = 0;
		double student2Sum = 0;
		double student3Sum = 0;
		double student4Sum = 0;
		double student5Sum = 0;
		double student6Sum = 0;
		double student7Sum = 0;
		double student8Sum = 0;
		double student9Sum = 0;
		double student10Sum = 0;

		for (Enrollment e : Enrollment) {
			if (e.getStudentID() == Students.get(0).getStudentID()) {
				student1Sum += e.getGrade();
			} else if (e.getStudentID() == Students.get(1).getStudentID()) {
				student2Sum += e.getGrade();
			} else if (e.getStudentID() == Students.get(2).getStudentID())
				student3Sum += e.getGrade();
			else if (e.getStudentID() == Students.get(3).getStudentID())
				student4Sum += e.getGrade();
			else if (e.getStudentID() == Students.get(4).getStudentID())
				student5Sum += e.getGrade();
			else if (e.getStudentID() == Students.get(5).getStudentID())
				student6Sum += e.getGrade();
			else if (e.getStudentID() == Students.get(6).getStudentID())
				student7Sum += e.getGrade();
			else if (e.getStudentID() == Students.get(7).getStudentID())
				student8Sum += e.getGrade();
			else if (e.getStudentID() == Students.get(8).getStudentID())
				student9Sum += e.getGrade();
			else if (e.getStudentID() == Students.get(9).getStudentID())
				student10Sum += e.getGrade();
		}
		// Average for student 1
		assertTrue((double) (Math.round((student1Sum / 6) * 100)) / 100 == 3.32);
		// Average for student 2
		assertTrue((double) (Math.round((student2Sum / 6) * 100)) / 100 == 3.58);
		// Average for student 3
		assertTrue((double) (Math.round((student3Sum / 6) * 100)) / 100 == 3.35);
		// Average for student 4
		assertTrue((double) (Math.round((student4Sum / 6) * 100)) / 100 == 3.45);
		// Average for student 5
		assertTrue((double) (Math.round((student5Sum / 6) * 100)) / 100 == 3.55);
		// Average for student 6
		assertTrue((double) (Math.round((student6Sum / 6) * 100)) / 100 == 3.32);
		// Average for student 7
		assertTrue((double) (Math.round((student7Sum / 6) * 100)) / 100 == 3.58);
		// Average for student 8
		assertTrue((double) (Math.round((student8Sum / 6) * 100)) / 100 == 3.35);
		// Average for student 9
		assertTrue((double) (Math.round((student9Sum / 6) * 100)) / 100 == 3.45);
		// Average for student 10
		assertTrue((double) (Math.round((student10Sum / 6) * 100)) / 100 == 3.55);

		double PhysicsFallSum = 0;
		double PhysicsSpringSum = 0;
		double ChemistryFallSum = 0;
		double ChemistrySpringSum = 0;
		double MathFallSum = 0;
		double MathSpringSum = 0;

		for (Enrollment e : Enrollment) {
			if (e.getSectionID() == Sections.get(0).getSectionID())
				PhysicsFallSum += e.getGrade();
			if (e.getSectionID() == Sections.get(1).getSectionID())
				PhysicsSpringSum += e.getGrade();
			if (e.getSectionID() == Sections.get(2).getSectionID())
				ChemistryFallSum += e.getGrade();
			if (e.getSectionID() == Sections.get(3).getSectionID())
				ChemistrySpringSum += e.getGrade();
			if (e.getSectionID() == Sections.get(4).getSectionID())
				MathFallSum += e.getGrade();
			if (e.getSectionID() == Sections.get(5).getSectionID())
				MathSpringSum += e.getGrade();
		}
		//Average for PhysicsFall
		assertTrue((double)(Math.round((PhysicsFallSum/10)*100))/100==3.5);
		//Average for PhysicsSpring
		assertTrue((double)(Math.round((PhysicsSpringSum/10)*100))/100==3.4);
		//Average for ChemisttrysFall
		assertTrue((double)(Math.round((ChemistryFallSum/10)*100))/100==3.5);
		//Average for ChemistrySpring
		assertTrue((double)(Math.round((ChemistrySpringSum/10)*100))/100==3.4);
		//Average for MathFall
		assertTrue((double)(Math.round((MathFallSum/10)*100))/100==3.5);
		//Average for MathSpring
		assertTrue((double)(Math.round((MathSpringSum/10)*100))/100==3.4);
	}
}