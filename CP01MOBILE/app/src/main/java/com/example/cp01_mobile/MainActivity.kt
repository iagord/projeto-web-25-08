// CP01 - Mobile
// Hebert CubaLins RM97356
// Henrique Ribeiro Abduch RM96967
// Iago Rosa Dias RM97221
// Vinicius Cruzeiro Barbosa RM97210

package com.example.cp01_mobile

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cp01_mobile.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val calculo = binding.calculo
        var invertoperation = 1

        binding.um.setOnClickListener {
            calculo.text = "${calculo.text}1"
        }

        binding.dois.setOnClickListener {
            calculo.text = "${calculo.text}2"
        }

        binding.tres.setOnClickListener {
            calculo.text = "${calculo.text}3"
        }

        binding.quatro.setOnClickListener {
            calculo.text = "${calculo.text}4"
        }

        binding.cinco.setOnClickListener {
            calculo.text = "${calculo.text}5"
        }

        binding.seis.setOnClickListener {
            calculo.text = "${calculo.text}6"
        }

        binding.sete.setOnClickListener {
            calculo.text = "${calculo.text}7"
        }

        binding.oito.setOnClickListener {
            calculo.text = "${calculo.text}8"
        }

        binding.nove.setOnClickListener {
            calculo.text = "${calculo.text}9"
        }

        binding.inverteroperacao.setOnClickListener {
            if (invertoperation == 1) {
                calculo.text = "-${calculo.text}"
            }
            invertoperation = invertoperation + 1

        }

        binding.porcentagem.setOnClickListener {
            calculo.text = "${calculo.text}%"
        }

        binding.divisao.setOnClickListener {
            calculo.text = "${calculo.text}/"
        }

        binding.multiplicacao.setOnClickListener {
            calculo.text = "${calculo.text}*"
        }

        binding.subtracao.setOnClickListener {
            calculo.text = "${calculo.text}-"
        }

        binding.soma.setOnClickListener {
            calculo.text = "${calculo.text}+"
        }

        binding.ponto.setOnClickListener {
            calculo.text = "${calculo.text}."
        }

        binding.zero.setOnClickListener {
            calculo.text = "${calculo.text}0"
        }

        binding.apagar.setOnClickListener {
            calculo.text = calculo.text.dropLast(1)
        }

        binding.ce.setOnClickListener {
            calculo.text = ""
            binding.resultado.text = ""
            invertoperation = 1
        }

        binding.igual.setOnClickListener {
            val resultadoCalculado = Expression(calculo.text.toString()).calculate()


            if (resultadoCalculado.isNaN()) {
                binding.resultado.text = "Expressão Inválida"
            } else {

                binding.resultado.text = resultadoCalculado.toString()
            }
        }
    }
}