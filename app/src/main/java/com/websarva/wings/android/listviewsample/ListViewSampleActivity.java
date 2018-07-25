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
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            String item = (String) parent.getItemAtPosition(position);

            String show = "あなたが選んだ定食" ＋ item;

            Toast.makeText(ListViewSampleActivity.this, show, Toast.LENGTH_LONG).show();
        }
    }
}
