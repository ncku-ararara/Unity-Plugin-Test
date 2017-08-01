using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class testPlugin : MonoBehaviour {

	// Use this for initialization
	void Start () {
		
  		
  		
	}
	
	// Update is called once per frame
	void Update () {
		Text showText;
		showText = GameObject.Find("Canvas/Text").GetComponent<Text>();
		showText.text = "ggg";

		AndroidJavaClass jc = new AndroidJavaClass("com.unity3d.player.UnityPlayer");
  		AndroidJavaObject jo = jc.GetStatic<AndroidJavaObject>("currentActivity");
  		if(jo != null){
  			showText.text = "Find activity";
  		}
  		else{
  			showText.text = "null";
  		}
  		//string message = "this is my title";
  		//string body = "this is my content";
  		//jo.Call("ShareText", message, body);
  		int a = jo.Call<int>("ReturnIntTest");
  		showText.text = a + "";

	}
}
