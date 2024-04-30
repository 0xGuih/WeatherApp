package com.example.weatherapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weatherapp.ui.theme.WeatherAppTheme

@Composable
fun MainPage(modifier: Modifier = Modifier) {

    val ciudad = remember { mutableStateOf<String>("CABA")}
    val temperatura = remember { mutableStateOf<Int>(14)}
    val descripcion = remember { mutableStateOf<String>("Nublado")}
    val st = remember { mutableStateOf<Int>(13)}

    Column (
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = ciudad.value,
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = "T: ${temperatura.value}",
                    style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = descripcion.value,
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "ST: ${st.value}",
            style = MaterialTheme.typography.bodyMedium
        )

        Button(
            onClick = {
                ciudad.value = ""
                temperatura.value = 0
                descripcion.value = ""
                st.value = 0
            }
        ) {
            Text(text = "Borrar todo")
        }

        Button(
            onClick = {
                ciudad.value = "CABA"
                temperatura.value = 10
                descripcion.value = "Despejado"
                st.value = 15
            }
        ) {
            Text(text = "CABA")
        }

        Button(
            onClick = {
                ciudad.value = "Cordoba"
                temperatura.value = 20
                descripcion.value = "Nublado"
                st.value = 22
            }
        ) {
            Text(text = "Cordoba")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    WeatherAppTheme {
        MainPage()
    }
}