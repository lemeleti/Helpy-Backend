package ch.zhaw.pm3.helpy.model.user;

import ch.zhaw.pm3.helpy.model.category.Category;
import ch.zhaw.pm3.helpy.model.Job;
import ch.zhaw.pm3.helpy.model.category.Tag;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Helper extends User {
    @ElementCollection(fetch = FetchType.EAGER)
    private List<Integer> ratings;
    @OneToMany
    @JsonBackReference
    private List<Job> completedJobs;
    @ManyToMany
    private List<Category> categories;
    @ManyToMany
    private List<Tag> tags;

    public Helper() {
        //needed for JPA
    }

    public Helper(UserBuilder userBuilder) {
        super(userBuilder);
    }

    public List<Integer> getRatings() {
        return ratings;
    }

    public void setRatings(List<Integer> ratings) {
        this.ratings = ratings;
    }

    public List<Job> getCompletedJobs() {
        return completedJobs;
    }

    public void setCompletedJobs(List<Job> completedJobs) {
        this.completedJobs = completedJobs;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

}