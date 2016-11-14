package blogz;

import java.util.Date;

public class Post {
	
	private String body;
	private String title;
	private String author;
	private final Date created;
	private Date modified;

	public Post (String body, String title, String author)
	{
		this.body = body;
		this.title = title;
		this.author = author;
		this.created = new Date();
		this.modified = new Date();
	}
	
	public void lastModified(){
		this.modified = new Date();
	}
	
	public void updateBody(String newBody){
		this.body = newBody;
		lastModified();
	}
	
	public void updateTitle(String newTitle){
		this.title = newTitle;
		lastModified();
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public String getBody(){
		return this.body;
	}
	
	public Date getDateCreated(){
		return this.created;
	}
	
	public Date getLastModified(){
		return this.modified;
	}
}
