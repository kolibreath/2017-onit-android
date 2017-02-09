package com.example.kolibreath.onit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kolibreath on 2017/2/1.
 */

public class OnitMainActivity extends AppCompatActivity {


    private List<Userinfo> userinfolist = new ArrayList<>();
    private void initWiget(){
        ImageButton gototheUserCenter = (ImageButton) findViewById(R.id.userCenter);
        FloatingActionButton firstFAB = (FloatingActionButton) findViewById(R.id.firstFAB);

        final FloatingActionButton secondFAB = (FloatingActionButton) findViewById(R.id.secondFAB);
        final FloatingActionButton thirdFAb = (FloatingActionButton) findViewById(R.id.thirdFAB);
        final TextView assign_onit = (TextView) findViewById(R.id.assign_onit);
        final TextView search_for_bff  = (TextView) findViewById(R.id.search_potential_bff);

        gototheUserCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OnitMainActivity.this,UserMainActivity.class);
                startActivity(intent);
            }
        });

        firstFAB.setOnClickListener(new View.OnClickListener() {
            int clickState = 1;
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.firstFAB:
                    if(clickState==1){
                        secondFAB.setVisibility(View.VISIBLE);
                        thirdFAb.setVisibility(View.VISIBLE);
                        assign_onit.setVisibility(View.VISIBLE);
                        search_for_bff.setVisibility(View.VISIBLE);
                        clickState = 0;
                        break;
                    }
                    if(clickState==0){
                        secondFAB.setVisibility(View.GONE);
                        thirdFAb.setVisibility(View.GONE);
                        assign_onit.setVisibility(View.GONE);
                        search_for_bff.setVisibility(View.GONE);
                        clickState=1;
                        break;
                    }
                        break;

                }
            }
        });
        secondFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OnitMainActivity.this,CreateNewDongtai.class);
                startActivity(intent);
            }
        });
        thirdFAb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OnitMainActivity.this,SearchforBBFActivity.class);
                startActivity(intent);
            }
        });
    }
    private void initUserDongtaiData(){
        Userinfo userinfo1 = new Userinfo("石泽远",R.mipmap.ic_launcher,"2017/2.4","test","2","3","2017/2.13",1);
        userinfolist.add(userinfo1);
        Userinfo userinfo2 = new Userinfo("石泽远",R.mipmap.ic_launcher,"2017/2.4","test","2","3","2017/2.13",1);
        userinfolist.add(userinfo2);
        Userinfo userinfo3 = new Userinfo("石泽远",R.mipmap.ic_launcher,"2017/2.4","test","2","3","2017/2.13",3);
        userinfolist.add(userinfo3);
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onitdongtai);
        ListView listView = (ListView) findViewById(R.id.uesrDongTaiList);
        listView.setVerticalScrollBarEnabled(false);

        initUserDongtaiData();
        initWiget();

        UserInfoAdapter adapter = new UserInfoAdapter(OnitMainActivity.this,R.layout.onitdongtai_item,userinfolist
               ,userinfolist);
        listView.setAdapter(adapter);
    }
}
