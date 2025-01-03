package com.example.savenote

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.savenote.presentation.addnote.AddNotePageScreen
import com.example.savenote.presentation.addnote.AddNotePageScreen
import com.example.savenote.presentation.home.HomePageScreen
import com.example.savenote.ui.theme.SaveNoteTheme
import com.example.savenote.util.DummyNoteModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SaveNoteTheme {

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun HomePagePreview() {
    SaveNoteTheme {
        HomePageScreen(
            modifier = Modifier.fillMaxSize(),
            notes = listOf(
                DummyNoteModel(
                    title = "Title",
                    description = "Description",
                    thumbnail = R.drawable.image_thumbnaiil
                ),
                DummyNoteModel(
                    title = "Title",
                    description = "Description",
                    thumbnail = R.drawable.image_thumbnaiil
                ),
                DummyNoteModel(
                    title = "Title",
                    description = "Description",
                    thumbnail = R.drawable.image_thumbnaiil
                ),
            ),
            onNoteClick = { }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AddNotePreview() {
    SaveNoteTheme {
        AddNotePageScreen(
            onNavigateBack = { }
        )
    }
}