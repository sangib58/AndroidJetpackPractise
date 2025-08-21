package com.example.myapplication

import android.R.attr.content
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(heightDp = 500)
@Composable
fun BlogDetailPreview() {
//    Column(modifier = Modifier.verticalScroll(state = rememberScrollState())) {
//        getItemList().map { item ->
//                BlogDetail(
//                    img = item.img,
//                    title = item.title,
//                    desc = item.desc
//                )
//        }
//    }

    LazyColumn(content={
        items(getItemList()) { item ->
            BlogDetail(img = item.img, title = item.title,
                desc = item.desc
            )
        }
    })
}
@Composable
fun BlogDetail(img: Int, title: String, desc: String) {
    Card(
        modifier = Modifier.padding(10.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)

        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(weight = 0.2f)
            )
            ItemDetail(modifier = Modifier.weight(weight = 0.8f), title = title, desc = desc)
        }
    }
}

@Composable
fun ItemDetail(modifier: Modifier, title: String, desc: String) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = desc,
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Thin
        )
    }
}

data class Item(val img: Int, val title: String, val desc: String)

fun getItemList(): MutableList<Item> {
    val items = mutableListOf<Item>()

    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 1", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 2", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 3", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 4", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 5", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 6", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 7", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 8", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 9", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 10", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 11", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 12", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 13", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 14", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 15", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 16", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 17", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 18", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 19", "Jetpack Compose Tutorial"))
    items.add(Item(R.drawable.jc_logo, "Jetpack Compose 20", "Jetpack Compose Tutorial"))

    return items
}































