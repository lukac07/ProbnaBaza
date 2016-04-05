package com.example.stjepanlukac.loginregister1;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Stjepan Lukac on 4.4.2016..
 */
public class LoginRequest extends StringRequest{

    private static final String LOGIN_REQUEST_URL = "http://stjepanlukac.comli.com/Login.php";
    private Map<String, String> params;

    public LoginRequest(String username, String password, Response.Listener<String> listener){
        super(Request.Method.POST, LOGIN_REQUEST_URL, listener, null);
        params = new HashMap<>();

        //stavljanje podataka u params
        params.put("username", username);
        params.put("password", password);
    }

    //dohvaćanje podataka
    @Override
    public Map<String, String> getParams() {
        return params;
    }

}
