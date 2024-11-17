package com.example.p6.ui.view


import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.navigation.NavHostController
import com.example.p6.model.Mahasiswa


@Composable
fun TampilMahasiswaView(
    mhs: Mahasiswa,
    navController: NavHostController
) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {

        androidx.compose.material3.Button(
            onClick = { navController.popBackStack() }
        ) {
            Text("Back")
        }

        TampilData(
            judul = "Nama",
            isinya = mhs.nama
        )
        TampilData(
            judul = "Nim",
            isinya = mhs.nim
        )
        TampilData(
            judul = "Jenis Kelamin",
            isinya = mhs.gender
        )
        TampilData(
            judul = "Alamat",
            isinya = mhs.alamat
        )
        TampilData(
            judul = "Email",
            isinya = mhs.email
        )
        TampilData(
            judul = "NoHp",
            isinya = mhs.noHp
        )
    }
}


@Composable
fun Button(onClick: Any, content: @Composable () -> Unit) {

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
