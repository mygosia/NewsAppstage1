package com.example.android.newsappstage1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

    public class NewsAdapter extends ArrayAdapter<News> {

//         Constructs a new NewsAdapter
        public NewsAdapter(Context context, List<News> news) {
            super(context, 0, news);
        }

//         Returns a list item view that displays news at the given position
//         in the list
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if there is an existing list item view (called convertView) that we can reuse,
            // otherwise, if convertView is null, then inflate a new list item layout.
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.news_item, parent, false);
            }

            // Find the news at the given position in the list of news
            News actualNews = getItem(position);

            //Find the TextView with ID item Title
            TextView titleTextView = listItemView.findViewById(R.id.title_view);
            //Get the title string from News object
            String titleString = actualNews.getNewsTitle();
            //Didplay the titleString in titleTextView
            titleTextView.setText(titleString);

            TextView dateTextView = listItemView.findViewById(R.id.date_view);
            String dateString = actualNews.getNewsDate();
            dateTextView.setText(dateString);

            TextView sectionTextView = listItemView.findViewById(R.id.section_view);
            String sectionString = actualNews.getNewsSection();
            sectionTextView.setText(sectionString);

            // Return the list item view that is now showing the appropriate data
            return listItemView;
        }
}
