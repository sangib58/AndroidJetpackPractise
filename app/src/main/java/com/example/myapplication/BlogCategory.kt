package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun BlogDetail(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(8.dp)

    ) {
        Image(
            painter = painterResource(id = R.drawable.jc_logo),
            contentDescription = "Logo",
            modifier = Modifier.size(48.dp).padding(8.dp)
        )
        Column {
            Text(
                text = "Programming",
                style =  MaterialTheme.typography.bodyLarge
            )
            Text(
                text = "Learn Different Languages",
                style = MaterialTheme.typography.bodySmall,
                fontWeight = FontWeight.Thin
            )
        }
    }
}