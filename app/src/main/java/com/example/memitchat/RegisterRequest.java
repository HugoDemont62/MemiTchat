package com.example.memitchat;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    private final Map<String,String> params;


    public RegisterRequest(MainActivity mainActivity, String user_email, String user_name, String password,Response.Listener<String> listener) {

        super(Method.POST, "", listener, null);
        params = new HashMap<String, String>();
        params.put("useremail", user_email);
        params.put("username", user_name);
        params.put("password", password);

    }
    @Override
    public Map<String, String> getParams(){
        return params;
    }
}
