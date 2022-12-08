package com.example.calculadoracientifica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtDisplay;
    private Button btn1,btn4,btn2,btn3,btn5,btn6,btn7,btn8,btn9,btn10,
    btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,
    btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39,btn40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponent();
    }

    public void initComponent() {
        this.txtDisplay = findViewById(R.id.txtDisplay);
        /*this.btn1 = findViewById(R.id.btn1);
        this.btn2 = findViewById(R.id.btn2);
        this.btn3 = findViewById(R.id.btn3);
        this.btn4 = findViewById(R.id.btn4);
        this.btn5 = findViewById(R.id.btn5);*/
        this.btn6 = findViewById(R.id.btn6);
        this.btn7 = findViewById(R.id.btn7);
        this.btn8 = findViewById(R.id.btn8);
        this.btn9 = findViewById(R.id.btn9);
        this.btn10 = findViewById(R.id.btn10);
        this.btn11 = findViewById(R.id.btn11);
        this.btn12 = findViewById(R.id.btn12);
        this.btn13 = findViewById(R.id.btn13);
        this.btn14 = findViewById(R.id.btn14);
        this.btn15 = findViewById(R.id.btn15);
        this.btn16 = findViewById(R.id.btn16);
        this.btn17 = findViewById(R.id.btn17);
        this.btn18 = findViewById(R.id.btn18);
        this.btn19 = findViewById(R.id.btn19);
        this.btn20 = findViewById(R.id.btn20);
        this.btn21 = findViewById(R.id.btn21);
        this.btn22 = findViewById(R.id.btn22);
        this.btn23 = findViewById(R.id.btn23);
        this.btn24 = findViewById(R.id.btn24);
        this.btn25 = findViewById(R.id.btn25);
        this.btn26 = findViewById(R.id.btn26);
        this.btn27 = findViewById(R.id.btn27);
        this.btn28 = findViewById(R.id.btn28);
        this.btn29 = findViewById(R.id.btn29);
        this.btn30 = findViewById(R.id.btn30);
        this.btn31 = findViewById(R.id.btn31);
        this.btn32 = findViewById(R.id.btn32);
        this.btn33 = findViewById(R.id.btn33);
        this.btn34 = findViewById(R.id.btn34);
        this.btn35 = findViewById(R.id.btn35);
        this.btn36 = findViewById(R.id.btn36);
        this.btn37 = findViewById(R.id.btn37);
        this.btn38 = findViewById(R.id.btn38);
        this.btn39 = findViewById(R.id.btn39);
        this.btn40 = findViewById(R.id.btn40);
    }

    public void onClick(View view) {
        String display = txtDisplay.getText().toString();
        String comando = "";

        switch (view.getId()) {
            case R.id.btn31:
                comando = btn31.getText().toString(); // 1
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText(comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;

            case R.id.btn32:
                comando = btn32.getText().toString(); // 2
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText(comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;

            case R.id.btn33:
                comando = btn33.getText().toString(); // 3
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText(comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;

            case R.id.btn26:
                comando = btn26.getText().toString(); // 4
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText(comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;

            case R.id.btn27:
                comando = btn27.getText().toString(); // 5
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText(comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;

            case R.id.btn28:
                comando = btn28.getText().toString(); // 6
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText(comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;

            case R.id.btn21:
                comando = btn21.getText().toString(); // 7
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText(comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;

            case R.id.btn22:
                comando = btn22.getText().toString(); // 8
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText(comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;

            case R.id.btn23:
                comando = btn23.getText().toString(); // 9
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText(comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;

            case R.id.btn37:
                comando = btn37.getText().toString(); // 0
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText(comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;

            case R.id.btn34:
                comando = btn34.getText().toString(); // +
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText("0" + comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;

            case R.id.btn35:
                comando = btn35.getText().toString(); // -
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText("0" + comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;
            case R.id.btn29:
                comando = btn29.getText().toString(); // *
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText("0" + comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;
            case R.id.btn30:
                comando = btn30.getText().toString(); // /
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText("0" + comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;
            case R.id.btn7:
                comando = btn7.getText().toString(); // ^2
                comando = comando.substring(1);
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText("0" + comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;

            case R.id.btn8:
                comando = btn8.getText().toString(); // ^
                comando = comando.substring(1,2);
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText("0" + comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;

            case R.id.btn24:
                display = display.substring(0, display.length() - 1);
                if (display.length() > 0) {
                    txtDisplay.setText(display);
                } else if (display.length() == 0) {
                    txtDisplay.setText("0");
                }
                break;

            case R.id.btn25: //CE
                txtDisplay.setText("0");
                break;

            case R.id.btn38:
                comando = btn38.getText().toString(); // ×10^"
                comando = comando.substring(0,3);
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText("0" + comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;

            case R.id.btn40:
                resolver();
                break;

            default:
                if (display.equals("0") || display.contains("=")) {
                    txtDisplay.setText(comando);
                } else {
                    txtDisplay.setText(display + comando);
                }
                break;
        }
    }

    private void resolver() {
        String display = txtDisplay.getText().toString();
        CalcularResultado calcularResultado = new CalcularResultado();
        calcularResultado.recibirDisplay(display);
        txtDisplay.setText(" = " + calcularResultado.getResultado());
    }
}