package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.Project;
import entity.Student;

@Configuration
public class JavaConfigurationFile {
	
//	@Bean
//	public Student student1() {
//		return new Student(1, "Raja", "raja@gmail.com", 9876543210L);
//	}
//	
//	@Bean
//	public Student student2() {
//		Student student = new Student();
//		student.setId(1);
//		student.setName("Rani");
//		student.setMailid("rani@gmail.com");
//		student.setContactNumber(8855452125L);
//		return student;
//	}
	
	@Bean
	public Project project() {
		return new Project(1, "ChatBot", "AI based");
	}
	
	@Bean
	public Student student1() {
		return new Student(1, "Raja", "raja@gmail.com", 9876543210L,project());
	}
}
