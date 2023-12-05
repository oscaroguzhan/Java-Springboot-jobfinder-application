package com.codeguruozzy.jobfinder.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
// we need to tell spring that is document of collection on mongodb
@Document(collection ="JobFinder")
public class Job {
    private String profile;
    private String desc;
    private int exp;

    public Job() {
    }

    private String techs[];

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    @Override
    public String toString() {
        return "Job{" +
                "profile='" + profile + '\'' +
                ", description='" + desc + '\'' +
                ", exp=" + exp +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }

}


