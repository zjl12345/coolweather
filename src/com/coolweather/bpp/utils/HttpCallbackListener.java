package com.coolweather.bpp.utils;

public interface HttpCallbackListener {
	void onFinish(String response);
	void onError(Exception e);
}
