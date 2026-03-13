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
		
		System.out.println("Student 1");
		Student student1 = configurableApplicationContext.getBean("student1", Student.class);
        System.out.println(student1);
        Project[] projects1 = student1.getProjects();

        for (Project p : projects1) {
            System.out.println(p);
        }
        
        System.out.println("Student 2");
        Student student2 = configurableApplicationContext.getBean("student2", Student.class);
        System.out.println(student2);
        Project[] projects2 = student2.getProjects();

        for (Project p : projects2) {
            System.out.println(p);
        }
        
        System.out.println("Student 3");
        Student student3 = configurableApplicationContext.getBean("student3", Student.class);
        System.out.println(student3);
        Project[] projects3 = student3.getProjects();

        for (Project p : projects3) {
            System.out.println(p);
        }
		
		
		configurableApplicationContext.close();
	}

}
