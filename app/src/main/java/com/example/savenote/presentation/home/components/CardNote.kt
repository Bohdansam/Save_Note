package com.example.savenote.presentation.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.savenote.ui.theme.SaveNoteTheme
import com.example.savenote.util.Dimension.CardContentPadding
import com.example.savenote.util.DummyNoteModel
import com.example.savenote.R
import com.example.savenote.util.Dimension.CardHeight

@Composable
fun CardNote(
    modifier: Modifier = Modifier,
    noteData: DummyNoteModel,
    onNoteClick: (DummyNoteModel) -> Unit,
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(CardHeight),
        shape = MaterialTheme.shapes.large,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        onClick = { onNoteClick(noteData) }
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(start = CardContentPadding, end = CardContentPadding, top = 8.dp, bottom = 6.dp),
        ) {
            Image(
                painter = painterResource(id = noteData.thumbnail),
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .size(52.dp)
                    .clip(
                        shape = MaterialTheme.shapes.large
                    ),
                contentDescription = null,
            )
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .padding(start = 9.dp)
            ) {
                Text(
                    text = noteData.title,
                    style = MaterialTheme.typography.headlineMedium,
                    color = MaterialTheme.colorScheme.primary,
                )
                Text(
                    text = noteData.description,
                    style = MaterialTheme.typography.headlineSmall,
                    color = MaterialTheme.colorScheme.primary,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CardNotePrev() {
    SaveNoteTheme {
        CardNote(
            noteData = DummyNoteModel(
                title = "Title",
                description = "Description",
                thumbnail = R.drawable.image_thumbnaiil
            ),
            onNoteClick = { /*TODO*/ }
        )
    }
}