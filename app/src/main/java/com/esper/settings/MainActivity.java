package com.esper.settings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import android.os.Process;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        launchEsperSettings();

//        Intent intent = new Intent(Intent.ACTION_MAIN);
//        intent.setComponent(new ComponentName("io.shoonya.shoonyadpc", "com.shoonyaos.shoonyasettings.activities.MainActivity"));
//        intent.addCategory(Intent.CATEGORY_LAUNCHER);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(intent);
//
//            Intent intent = new Intent();
//            intent. intent.setComponent("io.shoonya.shoonyadpc", "com.shoonyaos.shoonyasettings.activities.MainActivity");
//            intent.flags= Intent.FLAG_ACTIVITY_NEW_TASK;
//            startActivity(intent);
    }

    public void launchEsperSettings() {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        intent.setComponent(new ComponentName("io.shoonya.shoonyadpc", "com.shoonyaos.shoonyasettings.activities.MainActivity"));
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
//        if(intent !=null){
//            startActivity(intent);
//            finish();
//        }else{
//            Toast.makeText(this, "Kill the app to restart again", Toast.LENGTH_SHORT).show();
//        }
    }
    public void onDestroy() {
        super.onDestroy();
        Process.killProcess(Process.myPid());
    }
}