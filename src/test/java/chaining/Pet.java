package chaining;

import java.util.ArrayList;

public class Pet {
    int id;
    Category category;
    String name;
    String[] photoUrls;
    String status;
    ArrayList<Tags> tags;


    public Pet(int id, Category category, String name, String[] photoUrls, String status, ArrayList<Tags>  tags) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.status = status;
        this.tags = tags;
    }



    public int getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public String getStatus() {
        return status;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhotoUrls(String[] photoUrls) {
        this.photoUrls = photoUrls;
    }

    public void setTags(ArrayList<Tags> tags) {
        this.tags = tags;
    }

    public ArrayList<Tags> getTags() {
        return tags;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pet(){

    }
}
