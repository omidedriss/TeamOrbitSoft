package com.orbitsoft.teamorbitsoft.Nikkhu;
import android.net.Uri;

public class model {
    public static final int sender_layout=1;
    public static final int recevier_layout=2;
    public static final int sender_pic=3;

    public int  senderOrRecevier;
    public String message;
    public Uri uri;
    public model(int senderOrRecevier, String message) {
        this.senderOrRecevier = senderOrRecevier;
        this.message = message;
    }

    public model(int senderOrRecevier, Uri uri) {
        this.senderOrRecevier = senderOrRecevier;
        this.uri = uri;
    }

    public Uri getUri() {
        return uri;
    }

    public int getSenderOrRecevier() {
        return senderOrRecevier;
    }

    public String getMessage() {
        return message;
    }
}

