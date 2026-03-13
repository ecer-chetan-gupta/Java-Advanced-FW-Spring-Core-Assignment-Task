package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.Project;
import entity.Student;

@Configuration
public class JavaConfigurationFile {

	@Bean
	public Project project1() {
		return new Project(1, "ChatBot", "AI based", null);
	}

	@Bean
	public Project project2() {
		return new Project(2, "VideoApp", "Web application", null);
	}

	@Bean
	public Project project3() {
		return new Project(3, "Summary Generator", "AI based", null);
	}

	@Bean
	public Student student1() {
		return new Student(1, "Raja", "raja@gmail.com", 9876543210L, new Project[] { project1(), project2() });
	}

	@Bean
	public Student student2() {
		return new Student(2, "Aman", "aman@gmail.com", 9876543211L, new Project[] { project1(), project3() });
	}

	@Bean
	public Student student3() {
		return new Student(3, "Rahul", "rahul@gmail.com", 9876543212L, new Project[] { project2(), project3() });
	}
}