package com.marshall.Capstone.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="products")
public class Products {
	
	
	@Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
 
	 @Column(name = "title")
    private String title;
 
	@Column(name = "price")
    private String price;
 
	@Column(name = "quantity")
    private String quantity;
 
	@Column(name = "description", columnDefinition = "TEXT")
	private String description;
	
	@Column(name = "thumbnail")
	private String thumbnail;
	
	@Column(name = "images")
	private String[] images;
	
	@Column(name = "categories")
	private String categories;
	
    public Products() {
    	super();
    }
 
    public Products(String title, String price, String quantity, String description, String thumbnail, String[] images, String categories) {
		super();
		this.title = title;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		this.thumbnail = thumbnail;
		this.images = images;
		this.categories = categories;
		
	}


	//Getters and setters
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getThumbnail() {
			return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
			this.thumbnail = thumbnail;
	}
	
	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}
	
	public String getCategories() {
		return categories;
	}

	public void setCategory(String categories) {
		this.categories = categories;
	}
	
	


	
}
