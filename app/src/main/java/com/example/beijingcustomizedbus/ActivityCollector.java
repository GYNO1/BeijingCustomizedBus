package com.example.beijingcustomizedbus;
//构建类，构建方法，主程序可以直接调用
import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {
    public static List<Activity> activities=new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static  void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static  void finshAll(){
        for (Activity activity:activities){
            if (!activity.isFinishing()){
                activity.finish();

            }

        }
    }
}
