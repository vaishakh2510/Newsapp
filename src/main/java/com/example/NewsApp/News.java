package com.example.NewsApp;

public class News {
    private int id;
    public int getId() {
		return id;
	}
    public News() {
        
    }
	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String category;
    private String description;
    private String imageUrl; // Add image URL field

    public News(int id, String category, String description, String imageUrl) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    // Getters and setters for imageUrl
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

   
}
