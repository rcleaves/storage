package com.google.firebase.quickstart.firebasestorage;

import android.net.Uri;

public class ImageData {
    public String contractAddress;
    public String url;
    public String votes;
    public String label;

    public static String CONTRACT_ADDRESS = "0x0132423534423";

    public ImageData() { }

    public ImageData(String url) {
        this.url = url;
        this.contractAddress = CONTRACT_ADDRESS;
    }

}
