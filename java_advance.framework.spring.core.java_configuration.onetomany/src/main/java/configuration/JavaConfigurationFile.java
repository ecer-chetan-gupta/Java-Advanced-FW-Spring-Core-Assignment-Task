package configuration;

import java.awt.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.Project;
import entity.Student;

@Configuration
public class JavaConfigurationFile {
	
	@Bean
	public Project project1() {
		return new Project(1, "ChatBot", "AI based");
	}
	@Bean
	public Project project2() {
		return new Project(2, "VideoApp", "Web application");
	}
	@Bean
	public Project project3() {
		return new Project(3, "summary generator", "AI based");
	}
	
	@Bean
	public Student student1() {
		Project[] projects = new Project[3];
		projects[0] = project1();
		projects[1] = project2();
		projects[2] = project3();
		
		return new Student(1, "Raja", "raja@gmail.com", 9876543210L, projects);
	}
}
