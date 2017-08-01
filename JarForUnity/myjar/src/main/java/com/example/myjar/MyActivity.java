package com.example.myjar;

import android.content.Intent;
import android.os.Bundle;

import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;

/**
 * Created by jerrywiston on 2017/7/31.
 */

public class MyActivity extends UnityPlayerActivity{
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void ShareText(String message, String body) {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, message);
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, body);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }

    public void testEmpty(){
        UnityPlayer.UnitySendMessage ("G", "M", "P");
    }

    public int ReturnIntTest(){
        return 333;
    }

}
