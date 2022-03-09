package com.grcreutzberg.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Inicializa variáveis
    private String operador = "";
    private double num1 = 0;
    private double num2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView resultado = findViewById(R.id.result);
        Button btn_1 = findViewById(R.id.btn_1);
        Button btn_2 = findViewById(R.id.btn_2);
        Button btn_3 = findViewById(R.id.btn_3);
        Button btn_4 = findViewById(R.id.btn_4);
        Button btn_5 = findViewById(R.id.btn_5);
        Button btn_6 = findViewById(R.id.btn_6);
        Button btn_7 = findViewById(R.id.btn_7);
        Button btn_8 = findViewById(R.id.btn_8);
        Button btn_9 = findViewById(R.id.btn_9);
        Button btn_0 = findViewById(R.id.btn_0);
        Button btn_virgula = findViewById(R.id.btn_virgula);
        Button opcao_limpa = findViewById(R.id.btn_limpa);
        Button opcao_inverte = findViewById(R.id.btn_inverte);
        Button operador_soma = findViewById(R.id.btn_mais);
        Button operador_subtracao = findViewById(R.id.btn_menos);
        Button operador_multiplicacao = findViewById(R.id.btn_vezes);
        Button operador_divisao = findViewById(R.id.btn_dividido);
        Button operador_igual = findViewById(R.id.btn_igual);

        //Resultado inicia zerado
        resultado.setText("0");

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultado.getText().equals("0") || operador.equals("=")) {
                    resultado.setText("");//Limpa o resultado para não ficar zero a esquerda.
                    if (operador.equals("=")) {
                        operador = "";
                    }
                }
                resultado.setText(resultado.getText() + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultado.getText().equals("0") || operador.equals("=")) {
                    resultado.setText("");//Limpa o resultado para não ficar zero a esquerda.
                    if (operador.equals("=")) {
                        operador = "";
                    }
                }
                resultado.setText(resultado.getText() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultado.getText().equals("0") || operador.equals("=")) {
                    resultado.setText("");//Limpa o resultado para não ficar zero a esquerda.
                    if (operador.equals("=")) {
                        operador = "";
                    }
                }
                resultado.setText(resultado.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultado.getText().equals("0") || operador.equals("=")) {
                    resultado.setText("");//Limpa o resultado para não ficar zero a esquerda.
                    if (operador.equals("=")) {
                        operador = "";
                    }
                }
                resultado.setText(resultado.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultado.getText().equals("0") || operador.equals("=")) {
                    resultado.setText("");//Limpa o resultado para não ficar zero a esquerda.
                    if (operador.equals("=")) {
                        operador = "";
                    }
                }
                resultado.setText(resultado.getText() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultado.getText().equals("0") || operador.equals("=")) {
                    resultado.setText("");//Limpa o resultado para não ficar zero a esquerda.
                    if (operador.equals("=")) {
                        operador = "";
                    }
                }
                resultado.setText(resultado.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultado.getText().equals("0") || operador.equals("=")) {
                    resultado.setText("");//Limpa o resultado para não ficar zero a esquerda.
                    if (operador.equals("=")) {
                        operador = "";
                    }
                }
                resultado.setText(resultado.getText() + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultado.getText().equals("0") || operador.equals("=")) {
                    resultado.setText("");//Limpa o resultado para não ficar zero a esquerda.
                    if (operador.equals("=")) {
                        operador = "";
                    }
                }
                resultado.setText(resultado.getText() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultado.getText().equals("0") || operador.equals("=")) {
                    resultado.setText("");//Limpa o resultado para não ficar zero a esquerda.
                    if (operador.equals("=")) {
                        operador = "";
                    }
                }
                resultado.setText(resultado.getText() + "9");
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultado.getText().equals("0") || operador.equals("=")) {
                    resultado.setText("");//Limpa o resultado para não ficar zero a esquerda.
                    if (operador.equals("=")) {
                        operador = "";
                    }
                }
                resultado.setText(resultado.getText() + "0");
            }
        });

        btn_virgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resultado.getText() + ".");
            }
        });

        opcao_limpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Muda cor para identificar operação
                operador_soma.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_subtracao.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_multiplicacao.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_divisao.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_igual.setBackgroundColor(getResources().getColor(R.color.operador));
                resultado.setText("0");
                operador = "";
            }
        });

        opcao_inverte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Inverte resultado para valor negativo/positivo
                double novoValor = Double.parseDouble((String) resultado.getText()) * -1;
                resultado.setText(Double.toString(novoValor));
            }
        });

        operador_soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Muda cor para identificar operação
                operador_soma.setBackgroundColor(getResources().getColor(R.color.operador_click));
                operador_subtracao.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_multiplicacao.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_divisao.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_igual.setBackgroundColor(getResources().getColor(R.color.operador));
                operador = "+";
                num1 = Double.parseDouble((String) resultado.getText());
                resultado.setText("0");
            }
        });

        operador_subtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Muda cor para identificar operação
                operador_soma.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_subtracao.setBackgroundColor(getResources().getColor(R.color.operador_click));
                operador_multiplicacao.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_divisao.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_igual.setBackgroundColor(getResources().getColor(R.color.operador));
                operador = "-";
                num1 = Double.parseDouble((String) resultado.getText());
                resultado.setText("0");
            }
        });

        operador_multiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Muda cor para identificar operação
                operador_soma.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_subtracao.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_multiplicacao.setBackgroundColor(getResources().getColor(R.color.operador_click));
                operador_divisao.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_igual.setBackgroundColor(getResources().getColor(R.color.operador));
                operador = "X";
                num1 = Double.parseDouble((String) resultado.getText());
                resultado.setText("0");
            }
        });

        operador_divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Muda cor para identificar operação
                operador_soma.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_subtracao.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_multiplicacao.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_divisao.setBackgroundColor(getResources().getColor(R.color.operador_click));
                operador_igual.setBackgroundColor(getResources().getColor(R.color.operador));
                operador = "/";
                num1 = Double.parseDouble((String) resultado.getText());
                resultado.setText("0");
            }
        });

        operador_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Muda cor para identificar operação
                operador_soma.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_subtracao.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_multiplicacao.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_divisao.setBackgroundColor(getResources().getColor(R.color.operador));
                operador_igual.setBackgroundColor(getResources().getColor(R.color.operador_click));
                if (operador.length() > 0) {
                    num2 = Double.parseDouble((String) resultado.getText());
                    double resultadoOperacao = 0;
                    //Verifica o operador utilizado e aplica o calculo conforme a entrada
                    switch (operador) {
                        case "+":
                            resultadoOperacao = num1 + num2;
                            break;
                        case "-":
                            resultadoOperacao = num1 - num2;
                            break;
                        case "X":
                            resultadoOperacao = num1 * num2;
                            break;
                        case "/":
                            if (num2 > 0) { //Validação para não permitor dividir por zero
                                resultadoOperacao = num1 / num2;
                            } else {
                                //Não é possível dividir por zero
                            }
                            break;
                    }
                    //Apresenta resultado em tela
                    resultado.setText(Double.toString(resultadoOperacao));
                    operador = "=";
                }
            }
        });
    }
}