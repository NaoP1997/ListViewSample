package com.websarva.wings.android.listviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListViewSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_sample);
    }

    private class ListItemClickListener implements AdapterView.OnItemClickListener {
        @Override

    }
}
