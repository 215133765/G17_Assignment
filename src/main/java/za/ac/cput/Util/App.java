package za.ac.cput.Util;

import org.apache.coyote.Request;
import org.apache.coyote.Response;
import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;

import java.io.IOException;
import com.google.gson.Gson;
import http3.*;
import org.springframework.web.bind.annotation.RequestBody;
import za.ac.cput.Entity.User;
import za.ac.cput.Factory.UserFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class App extends JFrame implements ActionListener {
    public static final MediaType JSON
            = MediaType.get("application/json; Charset=utf-8");

    private static OkHttpClient client = new OkHttpClient();

    private JLabel lblId,lblFName, lblLName;
    private JTextField txtId, txtFName, txtLName;
    private JButton btnSave, btnClear;

    public App(){
        super("Add new User");
        lblId = new JLabel("User Id: ");
        lblFName = new JLabel("First name: ");
        lblLName = new JLabel("Last name: ");
        txtId.setEnabled(false);
        txtFName = new JTextField(30);
        txtLName = new JTextField(30);
        btnClear = new JButton("Save");
        btnClear = new JButton("Clear");
    }

    public void setGui(){
        this.setLayout(new GridLayout(4, 2));
        this.add(lblId);
        this.add(txtId);
        this.add(lblFName);
        this.add(txtLName);
        this.add(lblId);
        this.add(txtLName);
        this.add(btnSave);
        this.add(btnClear);
        btnSave.addActionListener(this);
        btnClear.addActionListener(this);
        this.pack();;
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnSave){
            save(txtFName.getText());
            save(txtLName.getText());
        } else if(e.getSource() == btnClear){
            System.exit(0);
        }
    }

    public void save(String fName, String lName){
        try{
            final String URL = "http://localhost:8080/user/create";
            User user = UserFactory.createUser(fName,lName);
            Gson g = new Gson();
            String jsonString = g.toJson(user);
            String u = post(URL,jsonString);
            if (u != null) {
                JOptionPane.showMessageDialog(null, "Saved");
            }else{
                    JOptionPane.showMessageDialog(null,"Not save");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String post(final String url, String json)throws  Exception{
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request().Builder()
                .url(url)
                .post(body);
        try (Response response = client.newCall(request).execute()){
            return response.body().string();
        }
    }

    public static void main(String[] args){
        new App().setGui();
    }
//private  static  OkHttClient client = new OkHttpClient();
//
//private static String run(String URL) throws IOException{
//    Request request = new Request.Builder()
//            .url(URL)
//            .build();
//    try (Response response = client.newCall(request).execute()){
//        return response.body().String();
//    }
//}
//
//public static void getAll(){
//    try{
//        final String URL = "http://localhost:8080/user/getall";
//        String responseBody = run(URL);
//        JSONArray user = new JSONArray(responseBody);
//
//        for (int i=0; i<user.length();i++){
//            JSONObject user = user
//        }
//    }
//}
    }
