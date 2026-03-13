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
		
		
		Student s1 = configurableApplicationContext.getBean("student1", Student.class);
        Student s2 = configurableApplicationContext.getBean("student2", Student.class);
        Student s3 = configurableApplicationContext.getBean("student3", Student.class);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
		
		
		configurableApplicationContext.close();
	}

}
