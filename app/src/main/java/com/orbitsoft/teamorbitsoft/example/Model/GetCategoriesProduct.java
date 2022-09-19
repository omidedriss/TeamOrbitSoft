package com.orbitsoft.teamorbitsoft.example.Model;


import com.google.gson.annotations.SerializedName;

public class GetCategoriesProduct {

    @SerializedName("productCategoryId")
    public int productCategoryId;
    @SerializedName("title")
    public String title;
    @SerializedName("parentId")
    public int parentId;
    @SerializedName("hasChild")
    public int hasChild;
    @SerializedName("imageUrl")
    public String imageUrl;



}