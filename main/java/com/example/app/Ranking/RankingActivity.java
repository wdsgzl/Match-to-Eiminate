package com.example.app.Ranking;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.app.DataBase.DataBaseHelper;
import com.example.app.R;

import java.util.LinkedList;
import java.util.List;
/* 排行榜的活动 */
public class RankingActivity extends AppCompatActivity {
    private List<Ranking> mData = null;
    private RankingAdapter mAdapter = null;
    private ListView lv;
    private DataBaseHelper myDBHelper;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rank);
        lv = findViewById(R.id.list_view);
        myDBHelper = new DataBaseHelper(this,"ranking",null,1);
        db = myDBHelper.getWritableDatabase();
        Cursor cursor = db.query("users", null, null, null, null, null, "time");
        mData = new LinkedList<>();
        mData.add(new Ranking("名次","游戏名","耗时","日期"));
        int i = 1;
        if (cursor.moveToFirst()) {
            do {
                String id = String.valueOf(i++);
                String name = cursor.getString(cursor.getColumnIndex("name"));
                String time = cursor.getString(2);
                String date = cursor.getString(3);
                mData.add(new Ranking(id,name,time,date));
            } while (cursor.moveToNext());
        }
        cursor.close();
        mAdapter = new RankingAdapter((LinkedList<Ranking>) mData, this);
        lv.setAdapter(mAdapter);
    }
}
