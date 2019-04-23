package utility;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * <p>Title:Logging </p>
 * <p>Description: AOP test</p>
 * <p>Company: test</p>
 * @author 何杰
 * @date 上午9:13:30
 */
@Aspect
public class Logging {
	
	@Pointcut("execution(* entity.*.*(..))")
	private void selectAll() {}
	
	@Before("selectAll()")
	public void beforeAdvice() {
		System.out.println("Going to setup student profile.");
	}
	
	@After("selectAll()")
	public void afterAdvice() {
		System.out.println("Student profile has been setup.");
	}
	
	@AfterReturning(pointcut="selectAll()", returning="returnVal")
	public void afterReturningAdvice(Object returnVal) {
		System.out.println("returning:" + returnVal.toString());
	}
	
	@AfterThrowing(pointcut="selectAll()", throwing="ex")
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an exception: " + ex.toString());
	}
}
