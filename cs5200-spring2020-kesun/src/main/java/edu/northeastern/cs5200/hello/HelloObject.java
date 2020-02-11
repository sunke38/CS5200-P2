package edu.northeastern.cs5200.hello;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="hello")
public class HelloObject {
	private String message;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public HelloObject(String message) {
        this.message = message;
    }
    public HelloObject() {
    }
    
}
