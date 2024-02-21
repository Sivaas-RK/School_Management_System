package com.school.sba.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.school.sba.util.ResponseStructure;

public interface ISubjectService {

	ResponseEntity<ResponseStructure<AcademicProgramResponse>> addSubject(int programId, SubjectRequest subjectRequest);

//	ResponseEntity<ResponseStructure<AcademicProgramResponse>> updateSubject(int programId,
//			SubjectRequest subjectRequest);
	
	ResponseEntity<ResponseStructure<List<SubjectResponse>>> findAllSubjects();

}