package com.orbitsoft.teamorbitsoft.example.Model;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class GetItemServer {

    @SerializedName("page")
    public int page;
    @SerializedName("per_page")
    public int per_page;
    @SerializedName("total")
    public int total;
    @SerializedName("data")
    public ArrayList<data> data = new ArrayList<>();




}