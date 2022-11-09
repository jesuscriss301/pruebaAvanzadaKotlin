package com.example.pruebaavanzadakotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pruebaavanzadakotlin.ui.theme.PruebaAvanzadaKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(androidx.core.R.layout.notification_action)
        var x =10

        println( "la variable x=${x} es par:  ${funtionSuper(x, {x%2==0})}")
        println("\"la variable x=${x} es primo:  ${!funtionSuper(x,::primo)}")
        println("\"la variable x=${x} es Guay:  ${funtionSuper(x,::numeroGuay)}")

    }
    fun funtionSuper(x:Int,y:(Int)->Boolean):Boolean{
        return y(x)
    }
    fun primo(x:Int):Boolean{
        var rta:Boolean=false
        for (i in 2..x/3){
            rta=x%i==0
            //println("numero:${x} indice:${i}")
            if (rta==true)return rta
        }
        return rta
    }
    fun numeroGuay(x:Int):Boolean{
        
        var i=1
        var j=1
        while(i<x){
            println("indice i : ${i}, indice j: ${j} , x=${x}")
            //if(x == i){ return true}
            i+=(j+1)
            j++

       }
        println("indice i : ${i}, indice j: ${j} , x=${x}")
        return x==i
    }
}
