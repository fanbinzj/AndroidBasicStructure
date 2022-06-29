package com.binfan.basicStructure.examples.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class HelloComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewMessageBox()
        }
    }
}

@Composable
fun MessageBox(name: String) {
    Text(text = "Hello $name!")
}

@Preview
@Composable
fun PreviewMessageBox() {
    MessageBox(name = "Compose 33")
}

