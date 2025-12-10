package com.example.mylistsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowText()
        }
    }
}

@Preview
@Composable
fun ShowText(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Magenta).padding(20.dp), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Hello World!", fontSize = 20.sp)
        Text("Guess who???", fontSize = 20.sp)

        var name by remember { mutableStateOf("") }
        Text(name, fontSize = 50.sp)
        OutlinedTextField(
            value = name,
            onValueChange = {name = it},
            label = { Text("Enter name here") }
        )
        ElevatedButton(onClick = {name="Nobody"}, modifier = Modifier.fillMaxWidth().padding(10.dp))
        {Text("Enter Nobody", fontSize = 20.sp, fontWeight = FontWeight.Bold)}
    }
}
