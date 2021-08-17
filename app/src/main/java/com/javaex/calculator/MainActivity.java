package com.javaex.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
//필드

    private EditText value;

    private Button seven;
    private Button eight;
    private Button nine;
    private Button divide;

    private Button four;
    private Button five;
    private Button six;
    private Button multiply;

    private Button one;
    private Button two;
    private Button three;
    private Button minus;

    private Button zero;
    private Button plus;

    private Button clear;
    private Button result;




    String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value = (EditText) findViewById(R.id.value);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("javaStudy",""+view.getId());

                switch (view.getId()){
                    case R.id.seven:
                        Log.d("javaStudy","seven클릭");
                        str += "7";
                        value.setText(str);
                        break;

                    case R.id.eight:
                        Log.d("javaStudy","eight클릭");
                        str += "8";
                        value.setText(str);
                        break;

                    case R.id.nine:
                        Log.d("javaStudy","nine클릭");
                        str += "9";
                        value.setText(str);
                        break;

                    case R.id.divide:
                        Log.d("javaStudy","divide클릭");
                        str += "/";
                        value.setText(str);
                        break;

                    case R.id.four:
                        Log.d("javaStudy","four클릭");
                        str += "4";
                        value.setText(str);
                        break;

                    case R.id.five:
                        Log.d("javaStudy","five클릭");
                        str += "5";
                        value.setText(str);
                        break;

                    case R.id.six:
                        Log.d("javaStudy","six클릭");
                        str += "6";
                        value.setText(str);
                        break;

                    case R.id.multiply:
                        Log.d("javaStudy","multiply클릭");
                        str += "*";
                        value.setText(str);
                        break;

                    case R.id.one:
                        Log.d("javaStudy","one클릭");
                        str += "1";
                        value.setText(str);
                        break;

                    case R.id.two:
                        Log.d("javaStudy","two클릭");
                        str += "2";
                        value.setText(str);
                        break;

                    case R.id.three:
                        Log.d("javaStudy","three클릭");
                        str += "3";
                        value.setText(str);
                        break;

                    case R.id.minus:
                        Log.d("javaStudy","minus클릭");
                        str += "-";
                        value.setText(str);
                        break;

                    case R.id.zero:
                        Log.d("javaStudy","zero클릭");
                        str += "0";
                        value.setText(str);
                        break;

                    case R.id.plus:
                        Log.d("javaStudy","plus클릭");
                        str += "+";
                        value.setText(str);
                        break;

                    case R.id.clear:
                        Log.d("javaStudy","clear클릭");
                        str = "";
                        value.setText(str);
                        break;

                    case R.id.result:
                        Log.d("javaStudy","result클릭");

                        //초기값 설정
                        int dap = 0;
                        //연산자 기준으로 split 해서 배열로 받는다
                        if(str.contains("+")){

                            String[] array = str.split("\\+");
                            dap = Integer.parseInt(array[0]) + Integer.parseInt(array[1]);

                        }else if(str.contains("-")){
                            String[] array = str.split("-");
                            dap = Integer.parseInt(array[0]) - Integer.parseInt(array[1]);

                        }else if(str.contains("*")){
                            String[] array = str.split("\\*");
                            dap = Integer.parseInt(array[0]) * Integer.parseInt(array[1]);

                        }else if(str.contains("/")){
                            String[] array = str.split("/");
                            dap = Integer.parseInt(array[0]) / Integer.parseInt(array[1]);

                        }

                        str += "=" + dap;
                        value.setText(str);
                        break;

                }
            }
        };

        seven = (Button) findViewById(R.id.seven);
        seven.setOnClickListener(listener);

        eight = (Button) findViewById(R.id.eight);
        eight.setOnClickListener(listener);

        nine = (Button) findViewById(R.id.nine);
        nine.setOnClickListener(listener);

        divide = (Button) findViewById(R.id.divide);
        divide.setOnClickListener(listener);

        four = (Button) findViewById(R.id.four);
        four.setOnClickListener(listener);

        five = (Button) findViewById(R.id.five);
        five.setOnClickListener(listener);

        six = (Button) findViewById(R.id.six);
        six.setOnClickListener(listener);

        multiply = (Button) findViewById(R.id.multiply);
        multiply.setOnClickListener(listener);

        one = (Button) findViewById(R.id.one);
        one.setOnClickListener(listener);

        two = (Button) findViewById(R.id.two);
        two.setOnClickListener(listener);

        three = (Button) findViewById(R.id.three);
        three.setOnClickListener(listener);

        minus = (Button) findViewById(R.id.minus);
        minus.setOnClickListener(listener);

        zero = (Button) findViewById(R.id.zero);
        zero.setOnClickListener(listener);

        plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener(listener);

        clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(listener);

        result = (Button) findViewById(R.id.result);
        result.setOnClickListener(listener);
    }
}