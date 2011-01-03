package com.webs.samirapplications.factorial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class Factorial extends Activity {
	
	private EditText in;
	private TextView txtanswer;
	private Button button;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        button = (Button)findViewById(R.id.button);
        txtanswer = (TextView)findViewById(R.id.txtanswer);
        in = (EditText)findViewById(R.id.text);
      	
        button.setOnClickListener(new Button.OnClickListener() {
      		public void onClick (View v){
      			try{
      				txtanswer.setText(Integer.parseInt(in.getText().toString()) +"! is "+ Integer.toString(calc(Integer.parseInt(in.getText().toString()))));
      			}
      			catch(Exception e){
      				Toast.makeText(Factorial.this, R.string.error, Toast.LENGTH_LONG).show();
      			}
      			
      		}
      		{
      			Toast.makeText(Factorial.this, R.string.short_notification_text, Toast.LENGTH_SHORT).show();
      		}
       	});
    }
	
	public int calc (int num){
		if (num > 0)
			return num * calc(num - 1);
		return 1;
	}
		
}