package execution;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.JavaConfigurationFile;
import entity.Project;
import entity.Student;

public class JavaApp {
	public static void execution() {
		ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(JavaConfigurationFile.class);
//		Student student1 = configurableApplicationContext.getBean("student1",Student.class);
//		System.out.println(student1);
//		Student student2 = configurableApplicationContext.getBean("student2",Student.class);
//		System.out.println(student2);
		
		
		Project project1 = configurableApplicationContext.getBean("project1",Project.class);
		Project project2 = configurableApplicationContext.getBean("project2",Project.class);
		Project project3 = configurableApplicationContext.getBean("project3",Project.class);
//		System.out.println(project);
		Student student1 = configurableApplicationContext.getBean("student1",Student.class);
		System.out.println(student1);
		Project[] projects = student1.getProjects();
		for(Project p : projects) {
			System.out.println(p);
		}
		
		
		configurableApplicationContext.close();
	}

}
