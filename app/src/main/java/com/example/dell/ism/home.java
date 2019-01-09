package com.example.dell.ism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class home extends AppCompatActivity {
GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mainGrid= (GridLayout)findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);

    }
    private void setSingleEvent(GridLayout mainGrid){
        for (int i=0;i<mainGrid.getChildCount();i++)
        {
            CardView cardView=(CardView)mainGrid.getChildAt(i);
            final int finalI=i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI==0)
                    {
                        Intent intent=new Intent(home.this,md.class);
                        startActivity(intent);
                    }
                    if (finalI==1)
                    {
                        Intent intent=new Intent(home.this,adc.class);
                        startActivity(intent);
                    } if (finalI==2)
                    {
                        Intent intent=new Intent(home.this,ecell.class);
                        startActivity(intent);
                    } if (finalI==3)
                    {
                        Intent intent=new Intent(home.this,litm.class);
                        startActivity(intent);
                    } if (finalI==4)
                    {
                        Intent intent=new Intent(home.this,litc.class);
                        startActivity(intent);
                    } if (finalI==5)
                    {
                        Intent intent=new Intent(home.this,cyber.class);
                        startActivity(intent);
                    } if (finalI==6)
                    {
                        Intent intent=new Intent(home.this,foto.class);
                        startActivity(intent);
                    } if (finalI==7)
                    {
                        Intent intent=new Intent(home.this,robo.class);
                        startActivity(intent);
                    } if (finalI==8)
                    {
                        Intent intent=new Intent(home.this,ffi.class);
                        startActivity(intent);
                    } if (finalI==9)
                    {
                        Intent intent=new Intent(home.this,mi.class);
                        startActivity(intent);
                    } if (finalI==10)
                    {
                        Intent intent=new Intent(home.this,cs.class);
                        startActivity(intent);
                    }
                    if (finalI==11)
                    {
                        Intent intent=new Intent(home.this,manthan.class);
                        startActivity(intent);
                    }
                }
            })
        }
    }
}
