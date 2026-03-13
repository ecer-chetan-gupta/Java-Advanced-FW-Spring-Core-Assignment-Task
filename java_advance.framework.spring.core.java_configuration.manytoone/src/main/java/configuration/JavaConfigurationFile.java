package configuration;

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
    public Student student1() {
        return new Student(1, "Raja", "raja@gmail.com", 9876543210L, project1());
    }

    @Bean
    public Student student2() {
        return new Student(2, "Aman", "aman@gmail.com", 9876543211L, project1());
    }

    @Bean
    public Student student3() {
        return new Student(3, "Rahul", "rahul@gmail.com", 9876543212L, project1());
    }
}