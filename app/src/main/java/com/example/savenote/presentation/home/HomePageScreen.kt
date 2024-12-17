package com.example.savenote.presentation.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.savenote.R
import com.example.savenote.presentation.home.components.BotAppBarHome
import com.example.savenote.presentation.home.components.NoteList
import com.example.savenote.presentation.home.components.TopAppBarHome
import com.example.savenote.ui.theme.SaveNoteTheme
import com.example.savenote.util.DummyNoteModel

@Composable
fun HomePageScreen(
    modifier: Modifier = Modifier,
    notes: List<DummyNoteModel>,
    onNoteClick: (DummyNoteModel) -> Unit,
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBarHome(
                onSortClick = { /*TODO*/ }
            )
        },
        bottomBar = {
            BotAppBarHome(
                onItemClick = { /*TODO*/ }
            )
        }
    ){
        NoteList(
            modifier = modifier.padding(it),
            notes = notes,
            onNoteClick = onNoteClick,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HomePageScreenPrev() {
    SaveNoteTheme {
        HomePageScreen(
            modifier = TODO(),
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
            onNoteClick = { TODO() }
        )
    }
}