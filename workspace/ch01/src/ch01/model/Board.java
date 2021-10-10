package ch01.model;

public class Board {
	String title;
	String name;
	String content;
	
	public Board(String title, String name, String content) {
		super();
		this.title = title;
		this.name = name;
		this.content = content;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	}

	// 정보 출력 메소드
	@Override
	public String toString() {
		return "Board [title=" + title + ", name=" + name + ", content=" + content + "]";
	}
}
