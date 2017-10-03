package com.example.im.abesit;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class FeedListAdapter extends RecyclerView.Adapter<FeedListAdapter.ViewHolder> {

    private List<StackOverflowXmlParser.Entry> entries;
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView textView;

        public ViewHolder(View view) {
            super(view);
            textView=(TextView) view.findViewById(R.id.text);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse(entries.get(getLayoutPosition()).link));
            context.startActivity(intent);

        }
    }

    public FeedListAdapter(List<StackOverflowXmlParser.Entry> entries, Context context) {
        this.entries=entries;
        this.context=context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_feed, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        StackOverflowXmlParser.Entry entry=entries.get(position);
        holder.textView.setText(entry.title);

    }

    @Override
    public int getItemCount() {
        return entries!=null? entries.size() : 0;
    }
}
