package com.example.android.newsappstage1;

public class News {

    private String mTitle;
    private String mUrl;
    private String mDate;
    private String mSection;

    public News(String newsTitle, String newsUrl, String newsDate, String newsSection) {
        mTitle = newsTitle;
        mUrl = newsUrl;
        mDate = newsDate;
        mSection = newsSection;
    }

    public String getNewsTitle() {
        return mTitle;
    }

    public String getNewsUrl() {
        return mUrl;
    }

    public String getNewsDate() {
        return mDate;
    }

    public String getNewsSection() {
        return mSection;
    }
}
