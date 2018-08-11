package com.example.android.project3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int score=0;
RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void submit(View view){
       EditText editText= (EditText) findViewById(R.id.name) ;
       String value= editText.getText().toString();
       EditText edit= (EditText) findViewById(R.id.pie) ;
       String pieq =edit.getText().toString();
       int piea =Integer.parseInt(pieq);

        RadioButton q1=findViewById(R.id.rb2q1);
        boolean isq1 =q1.isChecked();

       RadioButton q2= (RadioButton) findViewById(R.id.rb4q2);
       boolean isq2 = q2.isChecked();
       RadioButton q3= (RadioButton) findViewById(R.id.rb2q3);
       boolean isq3 = q3.isChecked();
       RadioButton q4= (RadioButton) findViewById(R.id.rb3q4);
       boolean isq4 = q4.isChecked();
       RadioButton q5= (RadioButton) findViewById(R.id.rb3q5);
       boolean isq5 = q5.isChecked();
       CheckBox icecream = (CheckBox) findViewById(R.id.icecream) ;
       boolean hasicecream = icecream.isChecked();
       CheckBox dount= (CheckBox) findViewById(R.id.donut);
       boolean hasdount= dount.isChecked();
       CheckBox cake = (CheckBox) findViewById(R.id.cake) ;
       boolean hascake = cake.isChecked();
       CheckBox mango= (CheckBox) findViewById(R.id.mango);
       boolean hasmango= mango.isChecked();
   int marks=calculateMarks(isq1,isq2,isq3,isq4,isq5,hasicecream,hasdount,hascake,hasmango);
       if (piea== 2018){
           marks = marks+5;
       }else
           marks=marks;

   if(marks>=20) {
    Toast.makeText(this, value + " Your Total Marks Are = " + marks + "\n you done well ", Toast.LENGTH_SHORT).show();

           score=0;}else {
           Toast.makeText(this, value + " Your Total Marks Are = " + marks + " \nTry to work hard ", Toast.LENGTH_SHORT).show();
           score=0; }

   }
   private int calculateMarks(boolean addq1, boolean addq2,boolean addq3,boolean addq4,boolean addq5,boolean addice,boolean adddonut,boolean addcake,boolean addmango){
      if(addq1==true){
          score+=5;
      }
       if(addq2==true){
           score+=5;
       }if(addq3==true){
           score+=5;
       }if(addq4==true){
           score+=5;
       }if(addq5==true){
           score+=5;
       }
       if(addice==true &&adddonut==true && addcake==false && addmango==false){
           score+=5;
       }
       return score;

   }
public void clear(View v){
        score =0;
        RadioGroup radioGroup=(RadioGroup)findViewById(R.id.radio1) ;
        radioGroup.clearCheck();
    RadioGroup radioGroup1=(RadioGroup)findViewById(R.id.radio2) ;
    radioGroup1.clearCheck();
    RadioGroup radioGroup3=(RadioGroup)findViewById(R.id.radio3) ;
    radioGroup3.clearCheck();
    RadioGroup radioGroup4=(RadioGroup)findViewById(R.id.radio4) ;
    radioGroup4.clearCheck();
    RadioGroup radioGroup5=(RadioGroup)findViewById(R.id.radio5) ;
    radioGroup5.clearCheck();
    CheckBox icecream = (CheckBox) findViewById(R.id.icecream) ;
    icecream.setChecked(false);
    CheckBox dount= (CheckBox) findViewById(R.id.donut);
     dount.setChecked(false);
    CheckBox cake = (CheckBox) findViewById(R.id.cake) ;
  cake.setChecked(false);
    CheckBox mango= (CheckBox) findViewById(R.id.mango);
mango.setChecked(false);
    EditText editText= (EditText) findViewById(R.id.name) ;
    editText.setText("");
    EditText edit= (EditText) findViewById(R.id.pie) ;
    edit.setText("");
    }
    }




