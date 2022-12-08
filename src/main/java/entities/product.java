package entities;

import java.awt.Image;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class product {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name; 
	private double price;
	private String img;
	
	@Lob
	@Column(name = "imagedata", length = 1000)
	private byte[] imagedata;
	
	public long getId() {
		
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public product(Long invalid, String name, double price, String img) {
		super();
		this.id = invalid;
		this.name = name;
		this.price = price;
		this.img = img;
	}
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
