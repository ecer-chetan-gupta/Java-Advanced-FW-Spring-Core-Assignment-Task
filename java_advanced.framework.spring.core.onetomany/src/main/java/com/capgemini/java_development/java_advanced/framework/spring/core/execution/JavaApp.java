package com.capgemini.java_development.java_advanced.framework.spring.core.execution;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.java_development.java_advanced.framework.spring.core.entity.Project;
import com.capgemini.java_development.java_advanced.framework.spring.core.entity.Student;

public class JavaApp {
	public static void execution() {
		String xmlConfigurationFile = "applicationContext.xml";
		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext(xmlConfigurationFile);
		Student student = configurableApplicationContext.getBean("student", Student.class);
		System.out.println(student);
		Project[] projects = student.getProjects();
		for(Project project:projects) {
			System.out.println(project);
		}
		
		configurableApplicationContext.close();
	}
}
