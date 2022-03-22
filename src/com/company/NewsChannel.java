package com.company;

public class NewsChannel implements Channel {
    private String news;

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }

    @Override
    public Object getNews() {
        return null;
    }

    private void setNews(String news) {
    }
}