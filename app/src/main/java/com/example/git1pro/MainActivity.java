package com.example.git1pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView showQue;
    private Button true1 , false1;
    private ImageView next1, prev1;
     private int i=0;
    private QuesBank [] str= new QuesBank [] {
            new QuesBank(R.string.ques1,false),
            new  QuesBank(R.string.ques2,true),
            new  QuesBank(R.string.ques3,true),
           new QuesBank(R.string.ques4,true),
           new  QuesBank(R.string.ques5,false),
           new  QuesBank(R.string.ques6,true),
            new QuesBank(R.string.ques7,true)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showQue=findViewById(R.id.show);
        true1=findViewById(R.id.true1);
        false1=findViewById(R.id.false1);
        next1=findViewById(R.id.next1);
        prev1=findViewById(R.id.prev1);

        showQue.setOnClickListener(this);
        true1.setOnClickListener(this);
        false1.setOnClickListener(this);
        next1.setOnClickListener(this);
        prev1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

         switch (v.getId())
         {
             case R.id.true1 :
                 checkans(true);
                  break;

             case R.id.false1 :
                    checkans(false);
                    break;

             case  R.id.next1 :
                               i++;
                              i=i%str.length ;
                              update1(i);
                               break;

             case R.id.prev1 :
                               i--;
                               if(i<0)
                               i=str.length-1;
                               else
                               update1(i);
                               break;

         }



    }


    public void checkans(boolean ansChecked){

          if(str[i].isAns()==ansChecked)
          {
              Toast.makeText(MainActivity.this, R.string.right,Toast.LENGTH_SHORT).show();
          }else {
              Toast.makeText(MainActivity.this,R.string.Wrong,Toast.LENGTH_SHORT).show();
          }

    }

    public void update1(int i)
    {   showQue.setText(str[i].getQues());
    }

}
