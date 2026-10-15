package com.faiz.questuserinput_0065

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ParentDataModifier
import androidx.compose.ui.unit.dp

@Composable
fun FormDataDiri(modifier: Modifier) {
    // Variabel" untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf(value = "") }
    var textAlamat by remember { mutableStateOf(value = "") }
    var textJK by remember { mutableStateOf(value = "") }
    val gender: List<String> = ListOf("Laki - Laki", "Perempuan")


    //
    var nama by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var jenis by remember { mutableStateOf(value = "") }

    Column(modifier = Modifier.padding(top = 50.dp)),
        verticalArrangement= Arrangement.Top,
        horizontalAligment = Aligment.CenterHorizontally) {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),
            label = { Text(text = "Nama Lengkap") },
            onValueChange = {
                textNama = it
            }
        )
    }
}