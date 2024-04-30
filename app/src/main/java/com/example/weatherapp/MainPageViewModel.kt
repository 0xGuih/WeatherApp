package com.example.weatherapp

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel

class MainPageViewModel : ViewModel() {
    val ciudad = mutableStateOf<String>("CABA")
    val temperatura = mutableStateOf<Int>(14)
    val descripcion = mutableStateOf<String>("Nublado")
    val st = mutableStateOf<Int>(13)

    fun borrarTodo(){
        ciudad.value = ""
        temperatura.value = 0
        descripcion.value = ""
        st.value = 0
    }

    fun mostrarCaba(){
        ciudad.value = "CABA"
        temperatura.value = 10
        descripcion.value = "Despejado"
        st.value = 15
    }

    fun mostrarCordoba(){
        ciudad.value = "Cordoba"
        temperatura.value = 20
        descripcion.value = "Nublado"
        st.value = 22
    }
}