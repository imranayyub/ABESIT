/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.example.im.abesit;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.im.abesit.StackOverflowXmlParser.Entry;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


public class NetworkActivity extends AppCompatActivity {

    private static final String URL = "http://abesit.in/category/notices/feed/";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_recycler_view);
        loadPage();
    }


    private void loadPage() {
        new DownloadXmlTask().execute(URL);
    }

    private class DownloadXmlTask extends AsyncTask<String, Void, List<Entry>> {

        @Override
        protected List<Entry> doInBackground(String... urls) {
            try {
                return loadXmlFromNetwork(urls[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(List<Entry> result) {
            RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
            mRecyclerView.setHasFixedSize(true);
            mRecyclerView.setLayoutManager(new LinearLayoutManager(NetworkActivity.this));
            FeedListAdapter feedListAdapter = new FeedListAdapter(result, NetworkActivity.this);
            mRecyclerView.setAdapter(feedListAdapter);

        }
    }

    private List<Entry> loadXmlFromNetwork(String urlString) throws XmlPullParserException, IOException {
        InputStream stream = null;
        StackOverflowXmlParser stackOverflowXmlParser = new StackOverflowXmlParser();
        List<Entry> entries = null;
        try {
            stream = downloadUrl(urlString);
            entries = stackOverflowXmlParser.parse(stream);
        } finally {
            if (stream != null) {
                stream.close();
            }
        }
        return entries;
    }


    private InputStream downloadUrl(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setReadTimeout(10000);
        conn.setConnectTimeout(15000);
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        conn.connect();
        return conn.getInputStream();
    }
}
