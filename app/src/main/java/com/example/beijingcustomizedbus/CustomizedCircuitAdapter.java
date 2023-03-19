package com.example.beijingcustomizedbus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;


//c创建一个自定义的适配器，将泛型指定为Fruit
public class  CustomizedCircuitAdapter extends ArrayAdapter< CustomizedCircuit> {
    private int resourceId;
    //FruitAdapter重写了构造函数
    public CustomizedCircuitAdapter(Context context, int textViewResourceId,
                        List<CustomizedCircuit> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }


    //重写getview函数
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        CustomizedCircuit customizedCircuit=getItem(position);//获取当前项目的Fruit实例
        View view= LayoutInflater.from(getContext()).inflate(resourceId,
                parent,false);//加载布局

//        ImageView fruitImage =(ImageView) view.findViewById(R.id.fruit_image);
        TextView Name=(TextView)view.findViewById(R.id.circuit_name);

//        fruitImage.setImageResource(fruit.getImageId());
        Name.setText(customizedCircuit.getName());

        return view;
    }
}
