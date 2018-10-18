package br.com.gbiteapps.estudoskotlin.activity

import android.content.Context
import android.support.v7.app.AppCompatActivity

//A palavra reservada 'open' possibilita a classe poder ser herdada
open class BaseActivity: AppCompatActivity() {

    //Propriedade para acessar o contexto de qualquer lugar
    protected val context: Context get() = this

}