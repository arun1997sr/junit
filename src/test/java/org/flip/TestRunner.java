package org.flip;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@Suite.SuiteClasses({Junitflip.class,Amazon.class})
public class TestRunner {
	public static void main(String[] args) {
		
		Result run = JUnitCore.runClasses(Junitflip.class,Amazon.class);
		int failureCount = run.getFailureCount();
		System.out.println("failureCount is"+failureCount);
		int ignoreCount = run.getIgnoreCount();
		System.out.println("ignoreCount is"+ignoreCount);
		List<Failure> failures = run.getFailures();
		for (Failure failure : failures) {
			System.out.println("failure is"+failure);
			
		}
		int runCount = run.getRunCount();
		System.out.println("runCount is"+runCount);
	}

}
