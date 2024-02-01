package com.project.Market.domain;

public class Category {
    private int categortId;
    private String category;
    private boolean active;

    public int getCategortId() {
        return categortId;
    }

    public void setCategortId(int categortId) {
        this.categortId = categortId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
