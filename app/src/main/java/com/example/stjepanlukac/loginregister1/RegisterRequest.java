package com.example.stjepanlukac.loginregister1;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Stjepan Lukac on 4.4.2016..
 */
public class RegisterRequest extends StringRequest {    //stavlja upit na server te vraća response u obliku stringa

    private static final String REGISTER_REQUEST_URL = "http://stjepanlukac.comli.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String username, int age, String password, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();

        //stavljanje podataka u params
        params.put("name", name);
        params.put("username", username);
        params.put("password", password);
        params.put("age", age + "");    //"" - pretvoren iz integera u string
    }

    //dohvaćanje podataka
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
