package com.test.dto;

public class UserDto {
    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }
    public void setUser_id(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "MemberVO [user_id=" + id + ", user_pw=" + name + ", user_email=" + email + "]";
    }
}
