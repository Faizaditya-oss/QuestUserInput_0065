package com.faiz.questuserinput_0065

import android.R
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ParentDataModifier

@Composable
fun FormDataDiri(modifier: Modifier){
    // Variabel" untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf(value = "") }
    var textAlamat by remember { mutableStateOf(value = "") }
    var textJK by remember { mutableStateOf(value = "") }
    val gender:List<String> = ListOf("Laki - Laki", "Perempuan")
}