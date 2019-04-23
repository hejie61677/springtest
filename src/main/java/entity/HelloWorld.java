package entity;

/**
 * <p>Title:HelloWorld </p>
 * <p>Description: 基于setting方式的依赖注入</p>
 * <p>Company: test</p>
 * @author 何杰
 * @date 上午9:39:39
 */
public class HelloWorld {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void hello() {
		System.out.println("hello," + name);
	}
}
