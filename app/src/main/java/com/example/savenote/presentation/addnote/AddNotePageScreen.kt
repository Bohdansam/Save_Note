package com.example.savenote.presentation.addnote

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.savenote.presentation.addnote.components.NoteWrite
import com.example.savenote.presentation.addnote.components.TopAppBarAddNote
import com.example.savenote.ui.theme.SaveNoteTheme

@Composable
fun AddNotePageScreen(
    modifier: Modifier = Modifier,
    onNavigateBack : () -> Unit,
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBarAddNote(
                onNavigateBack = onNavigateBack
            )
        }
    ) {
        NoteWrite(
            modifier = modifier.padding(it)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AddNotePagePrev() {
    SaveNoteTheme {
        AddNotePageScreen(
            modifier = Modifier,
            onNavigateBack = { /*TODO*/ }
        )
    }
}