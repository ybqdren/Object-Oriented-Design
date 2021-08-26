package com.example.sharingapp;

import java.util.UUID;

public class Contact {
    private String username;
    private String email;
    private String id;

    /**
     * Contact's Constructor
     * @param username
     * @param email
     * @param id
     */
    public Contact(String username, String email, String id) {
        this.username = username;
        this.email = email;

        if(id == null){
            setId();
        }else{
            updateId(id);
        }

    }


    /**
     * Update id
     * @param id
     */
    public void updateId(String id){
        this.id = id;
    }

    /* Getter and Setter Method */

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }
}
