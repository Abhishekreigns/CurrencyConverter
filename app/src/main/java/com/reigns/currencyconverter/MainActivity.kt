package com.reigns.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val currencies= resources.getStringArray(R.array.currencies)
        var convbut=findViewById<Button>(R.id.button)
        val spinner1 = findViewById<Spinner>(R.id.spinner1)
        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        var amt=findViewById<EditText>(R.id.Number)
        var value=findViewById<TextView>(R.id.Value)
        val textview=findViewById<TextView>(R.id.textView4)
        var tot=0.0
        convbut.setOnClickListener{
            value.visibility=View.VISIBLE
            textview.visibility=View.VISIBLE
            if(spinner1.getSelectedItem().toString() == "USD" && spinner2.getSelectedItem().toString() == "Rupees")
                {
                    tot = amt.text.toString().toDouble()*76.1
                    value.setText(tot.toString()+"INR")
                }
                else if(spinner1.getSelectedItem().toString() == "USD" && spinner2.getSelectedItem().toString() == "SL Rupees")
                {
                    tot = amt.text.toString().toDouble()* 297.65
                    value.setText(tot.toString()+" SL rupees")
                }
               else if(spinner2.getSelectedItem().toString() == "USD" && spinner1.getSelectedItem().toString() == "SL Rupees")
               {
                tot = amt.text.toString().toDouble()* 0.0034
                   value.setText(tot.toString()+" USD")
               }
               else if(spinner2.getSelectedItem().toString() == "USD" && spinner1.getSelectedItem().toString() == "Rupees")
               {
                tot = amt.text.toString().toDouble()*0.013
                   value.setText(tot.toString() +" USD")
               }
               else if(spinner1.getSelectedItem().toString() == "SL Rupees" && spinner2.getSelectedItem().toString() == "Rupees")
               {
                tot = amt.text.toString().toDouble()*0.26
                   value.setText(tot.toString() +" INR")
               }
               else if(spinner2.getSelectedItem().toString() == "SL Rupees" && spinner1.getSelectedItem().toString() == "Rupees")
               {
                tot = amt.text.toString().toDouble()*3.92
                   value.setText(tot.toString() +"SL Rupees")
               }

        }
    }
}

