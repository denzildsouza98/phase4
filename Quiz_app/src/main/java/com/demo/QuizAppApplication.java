package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.demo.dao.QuizDAO;
import com.demo.model.Quiz;

@SpringBootApplication
public class QuizAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizAppApplication.class, args);
	}

	@Component
	class DemoCommandLineRunner implements CommandLineRunner{
		@Autowired
		private QuizDAO dao;
		
		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			Quiz q1=new Quiz("Q1: In which process, a local variable has the same name as one of the instance variables?", "Serialization", "Variable Shadowing", "Abstraction", "Multi-threading", 2);
			Quiz q2=new Quiz("Q2: Which package contains the Random class?", "java.util package", "java.lang package", "java.awt package", "java.io package", 1);
			Quiz q3=new Quiz("Q3: Which option is false about the final keyword?", "A final method cannot be overridden in its subclasses.", "A final class cannot be extended.", "A final class cannot extend other classes.", "A final method can be inherited.", 3);
			Quiz q4=new Quiz("Q4: In which memory a String is stored, when we create a string using new operator?", "Stack", "String memory", "Heap memory", "Random storage space", 3);
			Quiz q5=new Quiz("Q5: Which of the following creates a List of 3 visible items and multiple selections abled?", "new List(false, 3)", "new List(3, true)", "new List(true, 3)", "new List(3, false)", 2);
			Quiz q6=new Quiz("Q6: In which process, a local variable has the same name as one of the instance variables?", "Serialization", "Variable Shadowing", "Abstraction", "Multi-threading", 2);
			Quiz q7=new Quiz("Q7: Method Overloading is an example of", "Static Binding", "Dynamic Binding", "Both of the above", "None of the above", 1);
			Quiz q8=new Quiz("Q8: What is Deserialization?", "Deserialization is the process of restoring state of an object from a byte stream", "Serialization is the process of restoring state of an object from an object", "Both of the above\n" + 
					"\n" + 
					"", "None of the above.", 1);
			Quiz q9=new Quiz("Q9: What of the following is the default value of an instance variable?", "null", "0", "Depends upon the type of variable"
				 , "Not assigned", 3);
			Quiz q10=new Quiz("Q10: Which method must be implemented by all threads?", "wait()\n" + 
					"\n" + 
					"", "start()", "stop()", "run()", 4);
			dao.save(q1);
			dao.save(q2);
			dao.save(q3);
			dao.save(q4);
			dao.save(q5);
			dao.save(q6);
			dao.save(q7);
			dao.save(q8);
			dao.save(q9);
			dao.save(q10);
		}
		
	}
}
