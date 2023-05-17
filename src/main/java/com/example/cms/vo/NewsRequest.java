package com.example.cms.vo;

import com.example.cms.models.Category;
import com.example.cms.models.Tag;

import java.util.Set;

public class NewsRequest {
    String title;

    String content;

    Set<Category> categories;

    Set<Tag> tags;
}
