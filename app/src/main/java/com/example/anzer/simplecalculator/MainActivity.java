package com.example.anzer.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n0,
            nDot, nPlus, nMinus, nTimes, nDivide, nEqual, clear;
    TextView result;
    double previousNum = 0;
    boolean finish = false;
    boolean ready = false;
    static final int plus = R.id.buttonPlus;
    static final int minus = R.id.buttonMinus;
    static final int times = R.id.buttonTimes;
    static final int divide = R.id.buttonDivide;
    int nextOperation = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Match all buttons.
        n1      = findViewById(R.id.button1);
        n2      = findViewById(R.id.button2);
        n3      = findViewById(R.id.button3);
        n4      = findViewById(R.id.button4);
        n5      = findViewById(R.id.button5);
        n6      = findViewById(R.id.button6);
        n7      = findViewById(R.id.button7);
        n8      = findViewById(R.id.button8);
        n9      = findViewById(R.id.button9);
        n0      = findViewById(R.id.button0);
        nDot    = findViewById(R.id.buttonDot);
        nPlus   = findViewById(R.id.buttonPlus);
        nMinus  = findViewById(R.id.buttonMinus);
        nTimes  = findViewById(R.id.buttonTimes);
        nDivide = findViewById(R.id.buttonDivide);
        nEqual  = findViewById(R.id.buttonEqual);

        //Set onClickListener for all buttons.
        n1.setOnClickListener(this);
        n2.setOnClickListener(this);
        n3.setOnClickListener(this);
        n4.setOnClickListener(this);
        n5.setOnClickListener(this);
        n6.setOnClickListener(this);
        n7.setOnClickListener(this);
        n8.setOnClickListener(this);
        n9.setOnClickListener(this);
        n0.setOnClickListener(this);
        nDot.setOnClickListener(this);
        nPlus.setOnClickListener(this);
        nMinus.setOnClickListener(this);
        nTimes.setOnClickListener(this);
        nDivide.setOnClickListener(this);
        nEqual.setOnClickListener(this);

        //Set the clear button.
        result = findViewById(R.id.textView);
        clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("0");
                previousNum = 0;
                nextOperation = 0;
                finish = false;
            }
        });
    }

    /**
     * A function that calculates the result.
     * @param firstNum the first number
     * @param secondNum the second number
     * @param operation the operation to perform
     * @return the result
     */
    public static double getResult(final double firstNum,
                                   final double secondNum, final int operation) {
        switch (operation) {
            case plus: {
                return firstNum + secondNum;
            }
            case minus: {
                return firstNum - secondNum;
            }
            case times: {
                return firstNum * secondNum;
            }
            case divide: {
                return firstNum / secondNum;
            }
            default: {
                return secondNum;
            }
        }
    }

    @Override
    public void onClick(View view) {
        result = findViewById(R.id.textView);
        String previous = (String) result.getText();
        String digitWarning = "Too many digits!";
        String overflowWarning = "Number out of range";
        switch (view.getId()) {
            case R.id.button1: {
                if (previous.equals("0") || finish) {
                    result.setText("1");
                    finish = false;
                } else if (previous.length() < 32) {
                    result.setText(previous+"1");
                    finish = false;
                } else {
                    Toast.makeText(MainActivity.this,
                            digitWarning, Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.button2: {
                if (previous.equals("0") || finish) {
                    result.setText("2");
                    finish = false;
                } else if (previous.length() < 32) {
                    result.setText(previous+"2");
                    finish = false;
                } else {
                    Toast.makeText(MainActivity.this,
                            digitWarning, Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.button3: {
                if (previous.equals("0") || finish) {
                    result.setText("3");
                    finish = false;
                } else if (previous.length() < 32) {
                    result.setText(previous+"3");
                    finish = false;
                } else {
                    Toast.makeText(MainActivity.this,
                            digitWarning, Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.button4: {
                if (previous.equals("0") || finish) {
                    result.setText("4");
                    finish = false;
                } else if (previous.length() < 32) {
                    result.setText(previous+"4");
                    finish = false;
                } else {
                    Toast.makeText(MainActivity.this,
                            digitWarning, Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.button5: {
                if (previous.equals("0") || finish) {
                    result.setText("5");
                    finish = false;
                } else if (previous.length() < 32) {
                    result.setText(previous+"5");
                    finish = false;
                } else {
                    Toast.makeText(MainActivity.this,
                            digitWarning, Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.button6: {
                if (previous.equals("0") || finish) {
                    result.setText("6");
                    finish = false;
                } else if (previous.length() < 32) {
                    result.setText(previous+"6");
                    finish = false;
                } else {
                    Toast.makeText(MainActivity.this,
                            digitWarning, Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.button7: {
                if (previous.equals("0") || finish) {
                    result.setText("7");
                    finish = false;
                } else if (previous.length() < 32) {
                    result.setText(previous+"7");
                    finish = false;
                } else {
                    Toast.makeText(MainActivity.this,
                            digitWarning, Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.button8: {
                if (previous.equals("0") || finish) {
                    result.setText("8");
                    finish = false;
                } else if (previous.length() < 32) {
                    result.setText(previous+"8");
                    finish = false;
                } else {
                    Toast.makeText(MainActivity.this,
                            digitWarning, Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.button9: {
                if (previous.equals("0") || finish) {
                    result.setText("9");
                    finish = false;
                } else if (previous.length() < 32) {
                    result.setText(previous+"9");
                    finish = false;
                } else {
                    Toast.makeText(MainActivity.this,
                            digitWarning, Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.button0: {
                if (previous.equals("0") || finish) {
                    result.setText("0");
                    finish = false;
                } else if (previous.length() < 32) {
                    result.setText(previous+"0");
                    finish = false;
                } else {
                    Toast.makeText(MainActivity.this,
                            digitWarning, Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.buttonDot: {
                if (finish) {
                    result.setText("0.");
                    finish = false;
                } else if (!previous.contains(".") && previous.length() < 31) {
                    result.setText(previous+".");
                } else {
                    Toast.makeText(MainActivity.this,
                            digitWarning, Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.buttonPlus: {
                finish = true;
                double secondNum = Double.parseDouble(previous);
                previousNum = getResult(previousNum, secondNum, nextOperation);
                nextOperation = view.getId();
                result.setText(String.valueOf(previousNum));
                break;
            }
            case R.id.buttonMinus: {
                finish = true;
                double secondNum = Double.parseDouble(previous);
                previousNum = getResult(previousNum, secondNum, nextOperation);
                nextOperation = view.getId();
                result.setText(String.valueOf(previousNum));
                break;
            }
            case R.id.buttonTimes: {
                finish = true;
                double secondNum = Double.parseDouble(previous);
                previousNum = getResult(previousNum, secondNum, nextOperation);
                nextOperation = view.getId();
                result.setText(String.valueOf(previousNum));
                break;
            }
            case R.id.buttonDivide: {
                finish = true;
                double secondNum = Double.parseDouble(previous);
                previousNum = getResult(previousNum, secondNum, nextOperation);
                nextOperation = view.getId();
                result.setText(String.valueOf(previousNum));
                break;
            }
            case R.id.buttonEqual: {
                finish = true;
                double secondNum = Double.parseDouble(previous);
                previousNum = getResult(previousNum, secondNum, nextOperation);
                nextOperation = 0;
                result.setText(String.valueOf(previousNum));
                break;
            }
        }
    }
}
