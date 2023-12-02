package com.example.myproject1.models;

public class Reuse {


    String name;
    String href;
    String name_list;
    String name_create;
    String href_create;

    public Reuse(String name, String href, String name_list, String name_create, String href_create) {
        this.name = name;
        this.href = href;
        this.name_list = name_list;
        this.name_create = name_create;
        this.href_create = href_create;
    }

    public Reuse(String name, String href, String name_list, String name_create) {
        this.name = name;
        this.href = href;
        this.name_list = name_list;
        this.name_create = name_create;
    }

    public Reuse(String name, String href, String name_list) {
        this.name = name;
        this.href = href;
        this.name_list = name_list;
    }

    public Reuse(String name, String href) {
        this.name = name;
        this.href = href;
    }

    public Reuse(String name) {
        this.name = name;
    }

    public Reuse() {

    }
}
