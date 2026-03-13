package execution;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import configuration.JavaConfigurationFile;
import entity.Project;
import entity.Student;


public class JavaApp {
	public static void execution() {
		ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(JavaConfigurationFile.class);
		Student student = configurableApplicationContext.getBean(Student.class);
		System.out.println(student);
		Project project = student.getProject();
		System.out.println(project);
		
		configurableApplicationContext.close();
	}

}
