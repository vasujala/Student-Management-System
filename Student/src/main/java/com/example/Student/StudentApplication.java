package com.example.Student;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.Student.repository.StudentRepository;

import com.example.Student.repository.StudentRepository;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}
	 @Autowired
	   private StudentRepository studentRepository;
		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			
		//Student student1 =new Student("vasu","jala","vasu@gmail.com");
		//	studentRepository.save(student1);
			
//			Student student2 =new Student("manohor","surepally","manu@gmail.com");	
//			studentRepository.save(student2);
//			
//			Student student3 =new Student("venu","jala","venu@gmail.com");
//			studentRepository.save(student3);
			
			//Student student4 =new Student("ramu","dandi","ramu@gmail.com");
		  // studentRepository.save(student4);
			
			//Student student5 =new Student("siva","krishna","siva@gmail.com");
			 //  studentRepository.save(student5);
			
			//Student student5 =new Student("srinu","komaram","srinu@gmail.com");
			// studentRepository.save(student5);
		}
		}



