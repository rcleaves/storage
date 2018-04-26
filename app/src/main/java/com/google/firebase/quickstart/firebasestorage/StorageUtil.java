package com.google.firebase.quickstart.firebasestorage;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class StorageUtil {
    private DatabaseReference mDb;
    private static StorageUtil instance;

    //static block initialization for exception handling
    static{
        try{
            instance = new StorageUtil();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    protected static StorageUtil getInstance() {
       return instance;
    }

    public StorageUtil() {
       // firestore
       this.mDb = FirebaseDatabase.getInstance().getReference();
    }

    public void writeNewImageData(String url) {
        ImageData id = new ImageData(url);
        mDb.child("images").child(url);
    }
}
