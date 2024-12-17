package com.example.savenote.presentation.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.savenote.R
import com.example.savenote.ui.theme.SaveNoteTheme
import com.example.savenote.util.Dimension.CardListSpace
import com.example.savenote.util.Dimension.SmallPadding
import com.example.savenote.util.DummyNoteModel
import kotlin.collections.get

@Composable
fun NoteList(
    modifier: Modifier = Modifier,
    notes: List<DummyNoteModel>,
    onNoteClick: (DummyNoteModel) -> Unit
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(SmallPadding),
        verticalArrangement = Arrangement.spacedBy(CardListSpace),
    ) {
        items(count = notes.count()) {
            CardNote(
                noteData = notes[it],
                onNoteClick = onNoteClick
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun NoteListPrev() {
    SaveNoteTheme {
        NoteList(
            modifier = Modifier,
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
            onNoteClick = {}
        )
    }
}