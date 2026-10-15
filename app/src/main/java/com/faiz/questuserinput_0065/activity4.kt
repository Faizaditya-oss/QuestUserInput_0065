
package com.faiz.questuserinput_0065

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FormDataDiri(modifier: Modifier = Modifier) {

    // Menyimpan nilai masukan dari pengguna
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }

    // Menyimpan data setelah tombol Submit ditekan
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenis by remember { mutableStateOf("") }
    var sudahSubmit by remember { mutableStateOf(false) }

    val gender = listOf("Laki-laki", "Perempuan")

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(
                top = 50.dp,
                start = 24.dp,
                end = 24.dp,
                bottom = 24.dp
            ),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Formulir Data Diri",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Input nama lengkap
        OutlinedTextField(
            value = textNama,
            onValueChange = {
                textNama = it
                sudahSubmit = false
            },
            modifier = Modifier.width(250.dp),
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            label = {
                Text("Nama Lengkap Anda")
            }
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Pilihan jenis kelamin
        Text(
            text = "Jenis Kelamin",
            modifier = Modifier
                .width(250.dp)
                .padding(bottom = 4.dp)
        )

        Row(
            modifier = Modifier.width(250.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            gender.forEach { item ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            textJK = item
                            sudahSubmit = false
                        }
                ) {
                    RadioButton(
                        selected = textJK == item,
                        onClick = {
                            textJK = item
                            sudahSubmit = false
                        }
                    )

                    Text(
                        text = item,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Input alamat
        OutlinedTextField(
            value = textAlamat,
            onValueChange = {
                textAlamat = it
                sudahSubmit = false
            },
            modifier = Modifier.width(250.dp),
            singleLine = true,
            label = {
                Text("Alamat")
            }
        )

        Spacer(modifier = Modifier.height(20.dp))

        HorizontalDivider(
            modifier = Modifier
                .width(250.dp)
                .padding(vertical = 8.dp),
            thickness = 1.dp,
            color = Color.DarkGray
        )

        // Tombol Submit
        Button(
            onClick = {
                nama = textNama
                alamat = textAlamat
                jenis = textJK
                sudahSubmit = true
            },
            modifier = Modifier
                .width(250.dp),
            enabled = textNama.isNotBlank() &&
                    textAlamat.isNotBlank() &&
                    textJK.isNotBlank()
        ) {
            Text("Submit")
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Menampilkan hasil input setelah Submit
        if (sudahSubmit) {
            HorizontalDivider(
                modifier = Modifier
                    .width(250.dp)
                    .padding(vertical = 8.dp),
                thickness = 1.dp
            )

            Text(
                text = "Hasil Data Diri",
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Nama: $nama",
                modifier = Modifier.width(250.dp)
            )

            Text(
                text = "Jenis Kelamin: $jenis",
                modifier = Modifier.width(250.dp)
            )

            Text(
                text = "Alamat: $alamat",
                modifier = Modifier.width(250.dp)
            )
        }
    }
}
