package com.example.p6.ui.view

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import com.example.p6.model.Mahasiswa

@Composable
fun TampilMahasiswaView(
    mhs: Mahasiswa,
    navController: NavHostController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Konten Data Mahasiswa
        TampilData(
            judul = "Nama", isinya = mhs.nama
        )
        TampilData(
            judul = "Nim", isinya = mhs.nim
        )
        TampilData(
            judul = "Jenis Kelamin", isinya = mhs.gender
        )
        TampilData(
            judul = "Alamat", isinya = mhs.alamat
        )
        TampilData(
            judul = "Email", isinya = mhs.email
        )
        TampilData(
            judul = "NoHp", isinya = mhs.noHp
        )

        Spacer(modifier = Modifier.weight(1f))


        Button(
            onClick = { navController.popBackStack() },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            Text("Back")
        }
    }
}

@Composable
fun TampilData(
    judul: String,
    isinya: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(judul, modifier = Modifier.weight(1f))
        Text(":", modifier = Modifier.weight(0.1f))
        Text(isinya, modifier = Modifier.weight(2f))
    }
}
