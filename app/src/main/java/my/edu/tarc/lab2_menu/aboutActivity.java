package my.edu.tarc.lab2_menu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class aboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void visitTARUC(View v){
        String uri="http://www.tarc.edu.my";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uri));
        startActivity(intent);

    }

    public void showMain(View v){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        startActivity(intent);
    }

    public void showDial(View v){
        Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:" + "012345678"));
        startActivity(intent);
    }

    public void showSendTo(View v){
        Intent intent = new Intent(Intent.ACTION_SENDTO);

        intent.setData(Uri.parse("mailto:" + "seekt@acd.tarc.edu.my"));
        if(intent.resolveActivity(getPackageManager())!= null){
            startActivity(intent);
        }else
            Toast.makeText(this,"No app to handle intent",Toast.LENGTH_SHORT).show();
    }
}
