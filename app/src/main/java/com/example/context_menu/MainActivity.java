package com.example.context_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String mang [] ={"duc","anh","hieu","cuong","minh"};
    ListView lvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         lvList = (ListView) findViewById(R.id.lvList);

        ArrayAdapter<String> adapter  = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mang);
        lvList.setAdapter(adapter);

        registerForContextMenu(lvList);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        int index = info.position;
        if(item.getItemId()==R.id.item1){
            Toast.makeText(this,"chon " + item.getTitle(),Toast.LENGTH_SHORT).show();
        } else if(item.getItemId()==R.id.item2){
            Toast.makeText(this,"chon " + item.getTitle(),Toast.LENGTH_SHORT).show();
        } else if(item.getItemId()==R.id.item3){
            Toast.makeText(this,"chon " + item.getTitle(),Toast.LENGTH_SHORT).show();
        }

        return super.onContextItemSelected(item);
    }
}
