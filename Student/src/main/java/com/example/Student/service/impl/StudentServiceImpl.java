package com.example.Student.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Student.service.StudentService;
import com.example.Student.entity.Student;
import com.example.Student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	   

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
	
		return studentRepository.findAll();
	}
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
}
	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return  studentRepository.save(student);
	}
	@Override
	public void deleteStudentById(int id) {
		studentRepository.deleteById(id);
	}
	}
