package com.example.beijingcustomizedbus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CommuterActivity extends BaseActivity{

    private List<CustomizedCircuit> fruitList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commuter_layout);////给当前活动加载一个布局

        initFruits();//初始化水果数据
        CustomizedCircuitAdapter adapter=new CustomizedCircuitAdapter(CommuterActivity.this,
                R.layout.circuit,fruitList);//创建适配器
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);//将适配器传递给list_view

        //让listview具有点击功能
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                CustomizedCircuit customizedCircuit=fruitList.get(position);
                Toast.makeText(CommuterActivity.this, customizedCircuit.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });


    }


    private void initFruits(){
        for (int i=0;i<2;i++){
            CustomizedCircuit apple =new CustomizedCircuit("Apple");
            fruitList.add(apple);

            CustomizedCircuit banana =new CustomizedCircuit("banana");
            fruitList.add(banana);

            CustomizedCircuit orange =new CustomizedCircuit("orange");
            fruitList.add(orange);

            CustomizedCircuit watermelon =new CustomizedCircuit("watermelon");
            fruitList.add(watermelon);

            CustomizedCircuit pear =new CustomizedCircuit("pear");
            fruitList.add(pear);

            CustomizedCircuit grape =new CustomizedCircuit("grape");
            fruitList.add(grape);

            CustomizedCircuit pineapple =new CustomizedCircuit("pineapple");
            fruitList.add(pineapple);

            CustomizedCircuit strawberry=new CustomizedCircuit("strawberry");
            fruitList.add(strawberry);

            CustomizedCircuit mango=new CustomizedCircuit("mango");
            fruitList.add(mango);


        }

    }

}



