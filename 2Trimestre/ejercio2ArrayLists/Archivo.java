package ejercio2ArrayLists;

public class Archivo {
	private String name;
	private String content;
	private int size = content.length();

	public Archivo(String name, String content) {
		this.name = name;
		this.content = content;
		this.size = content.length();
	}

	public int getSize() {
		return content.length();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		this.size = content.length();
	}
	
	

}