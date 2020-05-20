package com.example.apptimnhatro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindRoomActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    List<String> listGroup;
    HashMap<String,List<String>> listRoom;
    MainAdapter mainAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_room);

        expandableListView=findViewById(R.id.elv_findroom);
        listGroup=new ArrayList<>();
        listRoom=new HashMap<>();
        mainAdapter=new MainAdapter(this,listGroup,listRoom);
        expandableListView.setAdapter(mainAdapter);
        initListData();

        final Button button = (Button) findViewById(R.id.btn_Deny);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonClicked(v);
            }
        });
    }
    public void buttonClicked (View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

    }
    private void initListData() {
        listGroup.add(getString(R.string.GroupRooom));
        listGroup.add(getString(R.string.GroupRooomSex));
        listGroup.add(getString(R.string.GroupArea));

        String array[];
        List<String> listGRoom=new ArrayList<>();
        array=getResources().getStringArray(R.array.GroupRoom);
        for (String room:array){
            listGRoom.add(room);
        }

        List<String> listRoomSex=new ArrayList<>();
        array=getResources().getStringArray(R.array.GroupRoomSex);
        for (String room:array){
            listRoomSex.add(room);
        }

        List<String> listRoomArea=new ArrayList<>();
        array=getResources().getStringArray(R.array.GroupArea);
        for (String room:array){
            listRoomArea.add(room);
        }

        listRoom.put(listGroup.get(0),listGRoom);
        listRoom.put(listGroup.get(1),listRoomSex);
        listRoom.put(listGroup.get(2),listRoomArea);
        mainAdapter.notifyDataSetChanged();
    }
}
