package utility;

/**
 * <p>Title:SpellChecker </p>
 * <p>Description: 基于构造函数的依赖注入</p>
 * <p>Company: test</p>
 * @author 何杰
 * @date 下午2:59:36
 */
public class SpellChecker {
	
	public SpellChecker() {
		System.out.println("Inside SpellChecker constructor.");
	}
	
	public void checkSpelling() {
		System.out.println("Inside checkSpelling.");
	}

}
