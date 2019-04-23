package utility;

/**
 * <p>Title:TextEditor </p>
 * <p>Description: 基于构造函数的依赖注入</p>
 * <p>Company: test</p>
 * @author 何杰
 * @date 下午2:57:44
 */
public class TextEditor {
	
	private SpellChecker spellChecker;
	
//	public TextEditor(SpellChecker spellChecker) {
//		System.out.println("Inside TextEditor constructor.");
//		this.spellChecker = spellChecker;
//	}
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker.");
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
