package springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("config/ApplicationContext.xml");
//		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
//		helloWorld.hello();
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("config/ApplicationContext.xml");
//		TextEditor textEditor = (TextEditor)context.getBean("textEditor");
//		textEditor.spellCheck();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config/ApplicationContext.xml");
		Student student = (Student)context.getBean("student");
		student.getName();
		student.getAge();
		student.printThrowException();

	}

}
