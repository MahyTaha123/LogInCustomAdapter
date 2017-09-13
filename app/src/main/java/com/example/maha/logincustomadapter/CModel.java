package com.example.maha.logincustomadapter;

/**
 * Created by Maha on 13/09/2017.
 */

public class CModel {

    String note,body;

    public CModel(String note, String body) {
        this.note = note;
        this.body = body;
    }

    public String getNote() {
        return note;
    }

    public String getBody() {
        return body;
    }




    public void setNote(String note) {
        this.note = note;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
