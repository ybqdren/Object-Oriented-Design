package com.example.sharingapp;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class ContactList {
    private ArrayList<Contact> contacts;
    private String FILENAME = "contacts.sav";


    public ContactList() {
        contacts = new ArrayList<Contact>();
    }

    /**
     * Get all user's name
     * @return
     */
    public ArrayList<String> getAllUsernames(){
        ArrayList<String> username_list = new ArrayList<>();

        for(Contact contact:contacts){
            String user_temp = contact.getUsername();
            if( user_temp != null){
                username_list.add(user_temp);
            }
        }

        return username_list;
    }




    /* Action contact list */

    public boolean isUsernameAvailable(String username){
        if(username != null){
            for(Contact contact : contacts){
                if(username.equals(contact.getUsername())){ return false;}
            }
        }

        return true;
    }

    public void saveContacts(Context context){
        try {
            FileOutputStream fos = context.openFileOutput(FILENAME, 0);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Gson gson = new Gson();
            gson.toJson(contacts, osw);
            osw.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadContacts(Context context){
        try {
            FileInputStream fis = context.openFileInput(FILENAME);
            InputStreamReader isr = new InputStreamReader(fis);
            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<Contact>>() {}.getType();
            contacts = gson.fromJson(isr, listType); // temporary
            fis.close();
        } catch (FileNotFoundException e) {
            contacts = new ArrayList<Contact>();
        } catch (IOException e) {
            contacts = new ArrayList<Contact>();
        }
    }

    /**
     * Get contact by username
     * @param username
     * @return
     */
    public Contact getContactByUsername(String username){
            for(Contact contact:contacts){
                if(username.equals(contact.getUsername())){
                    return contact;
                }
            }
            return null;
    }

    /**
     * Determine if a contact exists
     * @param contact
     * @return
     */
    public boolean hasContact(Contact contact){
        if(contact != null) {
            if(contacts.contains(contact)) return true;
        }

        return false;
    }

    /**
     * Get the index based on the contact
     * @param contact
     * @return
     */
    public int getIndex(Contact contact){
        if(contact != null){
            return contacts.indexOf(contact);
        }
        return -1;
    }

    /**
     * Get the number of contact lists
     * @return
     */
    public int getSize(){
        return contacts.size();
    }

    /**
     * Get contacts based on the index
     */
    public Contact getContact(int index){
        return contacts.get(index+1);
    }

    public void deleteContact(Contact contact){
        contacts.remove(contact);
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }


    /* Getter and Setter method*/

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }
}
