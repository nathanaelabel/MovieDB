package com.uc.moviedb.model;

import com.google.gson.Gson;

import java.util.List;

public class Credits {

    private int id;
    private List<Cast> cast;
    private List<Crew> crew;

    public static Credits objectFromData(String str) {

        return new Gson().fromJson(str, Credits.class);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    public List<Crew> getCrew() {
        return crew;
    }

    public void setCrew(List<Crew> crew) {
        this.crew = crew;
    }

    public static class Cast {
        private boolean adult;
        private int gender;
        private int id;
        private String known_for_department;
        private String name;
        private String original_name;
        private double popularity;
        private String profile_path;
        private int cast_id;
        private String character;
        private String credit_id;
        private int order;

        public static Cast objectFromData(String str) {

            return new Gson().fromJson(str, Cast.class);
        }

        public boolean isAdult() {
            return adult;
        }

        public void setAdult(boolean adult) {
            this.adult = adult;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getKnown_for_department() {
            return known_for_department;
        }

        public void setKnown_for_department(String known_for_department) {
            this.known_for_department = known_for_department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOriginal_name() {
            return original_name;
        }

        public void setOriginal_name(String original_name) {
            this.original_name = original_name;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public String getProfile_path() {
            return profile_path;
        }

        public void setProfile_path(String profile_path) {
            this.profile_path = profile_path;
        }

        public int getCast_id() {
            return cast_id;
        }

        public void setCast_id(int cast_id) {
            this.cast_id = cast_id;
        }

        public String getCharacter() {
            return character;
        }

        public void setCharacter(String character) {
            this.character = character;
        }

        public String getCredit_id() {
            return credit_id;
        }

        public void setCredit_id(String credit_id) {
            this.credit_id = credit_id;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }
    }

    public static class Crew {
        private boolean adult;
        private int gender;
        private int id;
        private String known_for_department;
        private String name;
        private String original_name;
        private double popularity;
        private Object profile_path;
        private String credit_id;
        private String department;
        private String job;

        public static Crew objectFromData(String str) {

            return new Gson().fromJson(str, Crew.class);
        }

        public boolean isAdult() {
            return adult;
        }

        public void setAdult(boolean adult) {
            this.adult = adult;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getKnown_for_department() {
            return known_for_department;
        }

        public void setKnown_for_department(String known_for_department) {
            this.known_for_department = known_for_department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOriginal_name() {
            return original_name;
        }

        public void setOriginal_name(String original_name) {
            this.original_name = original_name;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public Object getProfile_path() {
            return profile_path;
        }

        public void setProfile_path(Object profile_path) {
            this.profile_path = profile_path;
        }

        public String getCredit_id() {
            return credit_id;
        }

        public void setCredit_id(String credit_id) {
            this.credit_id = credit_id;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }
    }
}

