package kh.dao;

public class MessageDTO {
	private int message_id;
	private String name;
	private String message;
	
	public MessageDTO() {
		super();
	}

	public MessageDTO(int message_id, String name, String message) {
		this.message_id = message_id;
		this.name = name;
		this.message = message;
	}

	public MessageDTO(String name, String message) {
		this.name = name;
		this.message = message;
	}

	public int getMessage_id() {
		return message_id;
	}
	
	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
