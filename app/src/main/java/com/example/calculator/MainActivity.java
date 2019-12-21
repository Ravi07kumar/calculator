package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_add,btn_mul,btn_sub,btn_div,btn_clr,btn_dec,btn_calc;
    EditText et;
    Double value1,value2;

    boolean madd,msub,mmul,mdiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0=(Button)findViewById(R.id.btn_0);
        btn_1=(Button)findViewById(R.id.btn_1);
        btn_2=(Button)findViewById(R.id.btn_2);
        btn_3=(Button)findViewById(R.id.btn_3);
        btn_4=(Button)findViewById(R.id.btn_4);
        btn_5=(Button)findViewById(R.id.btn_5);
        btn_6=(Button)findViewById(R.id.btn_6);
        btn_7=(Button)findViewById(R.id.btn_7);
        btn_8=(Button)findViewById(R.id.btn_8);
        btn_9=(Button)findViewById(R.id.btn_9);
        btn_add=(Button)findViewById(R.id.btn_add);
        btn_sub=(Button)findViewById(R.id.btn_sub);
        btn_mul=(Button)findViewById(R.id.btn_mul);
        btn_div=(Button)findViewById(R.id.btn_div);
        btn_clr=(Button)findViewById(R.id.btn_clr);
        btn_calc=(Button)findViewById(R.id.btn_calc);
        btn_dec=(Button)findViewById(R.id.btn_dec);
        et=(EditText) findViewById(R.id.et);

               btn_0.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       et.setText(et.getText()+"0");
                   }
               });
               btn_1.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       et.setText(et.getText()+"1");
                   }
               });
               btn_2.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       et.setText(et.getText()+"2");
                   }
               });
             btn_3.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       et.setText(et.getText()+"3");
                   }
               });
               btn_4.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       et.setText(et.getText()+"4");
                   }
               });
               btn_5.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       et.setText(et.getText()+"5");
                   }
               });
               btn_6.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       et.setText(et.getText()+"6");
                   }
               });
               btn_7.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       et.setText(et.getText()+"7");
                   }
               });
                btn_8.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       et.setText(et.getText()+"8");
                   }
               });
               btn_9.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       et.setText(et.getText()+"9");
                   }
               });
               btn_add.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       if(et==null){
                           et.setText("");
                       }else
                      value1= Double.parseDouble(et.getText()+ "");
                       madd=true;
                       et.setText(null);
                   }
               });
                btn_sub.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       value1= Double.parseDouble( et.getText()+ "");
                       msub=true;
                       et.setText(null);
                   }
               });
               btn_div.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       value1=Double.parseDouble(et.getText()+ "");
                       mdiv=true;
                       et.setText(null);
                   }
               });
               btn_mul.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       value1=Double.parseDouble(et.getText()+" ");
                       mmul=true;
                       et.setText(null);
                   }
               });
                btn_dec.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       et.setText(et.getText()+".");
                   }
               });
                btn_clr.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        et.setText("");
                    }
                });
                btn_calc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        value2=Double.parseDouble(et.getText()+"");
                        if(madd==true){
                            et.setText(value1+value2+"");
                            madd=false;
                        }
                        if(msub==true){
                            et.setText(value1 - value2+"");
                            msub=false;
                        }
                        if(mmul==true){
                            et.setText(value1 *value2+"");
                            mmul=false;
                        }
                        if(mdiv==true){
                            if(et.getText().toString().trim().equals("0")){
                                Toast.makeText(MainActivity.this, "Enter corect input", Toast.LENGTH_SHORT).show();
                            }
                            else{
                                et.setText(value1 / value2+"");
                                mdiv=false;
                            }

                        }

                    }
                });

    }
}
