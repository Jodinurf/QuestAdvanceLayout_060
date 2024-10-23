package com.example.full_layout

import android.widget.Space
import androidx.annotation.Nullable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity(
    modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier.fillMaxSize()) {
        SectionHeader()
        Spacer( modifier = Modifier.padding(8.dp))
        Text(text = "Kepada Yth.", modifier = Modifier.padding(start = 8.dp))
        Text("Jodi", modifier = Modifier.padding(start = 8.dp))
        Spacer(modifier = Modifier.padding(8.dp))

        MainSection(judulParam = "Nama", isiParam = "Jodi")
        MainSection(judulParam = "NIM", isiParam = "20220140060")
        MainSection(judulParam = "Kelas", isiParam = "Agama Islam Kemuhammadiyahan")

    }
}

@Composable
fun SectionHeader(){
    Box(modifier = Modifier.fillMaxWidth()
        .background(color = Color.DarkGray)){
        Row (modifier = Modifier.padding(15.dp)){
            Box(contentAlignment = Alignment.BottomEnd){
                Image(painter = painterResource(R.drawable.logoumy),
                    contentDescription = "",
                    Modifier.size(100.dp)
                )

                Icon(Icons.Filled.Check,
                    contentDescription = "",
                    Modifier.padding(end = 10.dp).size(25.dp),
                    tint = Color.Red
                )
            }
            Column (Modifier.padding(15.dp)){
                Text(text = "Teknologi Informasi",
                    color = Color.White)

                Spacer(Modifier.padding((3.dp)))

                Text(text = "Universitas Gambar Matahari",
                    color = Color.White)
            }
        }

    }
}

@Composable
fun MainSection(judulParam:String, isiParam:String){
    Column (){
        Row (
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly

            ) {
            Text(judulParam, modifier = Modifier.weight(0.8f))
            Text(":", modifier = Modifier.weight(0.2f))
            Text(isiParam, modifier = Modifier.weight(2f))
        }
    }
}