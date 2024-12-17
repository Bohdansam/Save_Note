@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.savenote.presentation.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.savenote.ui.theme.SaveNoteTheme
import com.example.savenote.util.Dimension.SmallPadding
import com.example.savenote.R


@Composable
fun TopAppBarHome(
    modifier: Modifier = Modifier,
    onSortClick: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(SmallPadding),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            painter = painterResource(id = R.drawable.ic_sort),
            contentDescription = null,
            modifier = modifier
                .size(25.dp)
                .clickable(onClick = { /*TODO*/ }),
        )

        // Title
        Text(
            text = "Safe Note",
            style = MaterialTheme.typography.headlineSmall,
            modifier = modifier
                .padding(start = 102.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TopAppBarHomePrev() {
    MaterialTheme() {
        TopAppBarHome(
            modifier = Modifier,
            onSortClick = { /*TODO*/ }
        )
    }
}