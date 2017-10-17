package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public UUID getStudentID() {
		return StudentID;
	}
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	public double getGrade() {
		return Grade;
	}
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment() {
		
	}
	
	public Enrollment(UUID StudentID, UUID SectionID ) {
		
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		EnrollmentID = UUID.randomUUID();
	}
	public void setGrade(double Grade) {
		this.Grade = Grade;
	}
}
