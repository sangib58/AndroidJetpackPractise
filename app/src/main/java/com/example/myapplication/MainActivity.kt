package com.example.myapplication

import android.media.Image
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Green200
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }

    @Preview(
        showBackground = true,
        showSystemUi = false,
        name = "App",
        widthDp = 300,
        heightDp = 300
    )
    @Composable
    fun PreviewLearnTopAppBar() {
        MyApplicationTheme {
            Text(text = "Hello", fontStyle = FontStyle.Italic, textAlign = TextAlign.Right)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LearnTopAppBar() {
    val context = LocalContext.current.applicationContext
    TopAppBar(
        title = { Text("WhatsApp", fontSize = 16.sp) },
        navigationIcon = {
            IconButton(onClick = {
                Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show()
            }) {
                Icon(imageVector = Icons.Filled.Call, contentDescription = "WhatsApp Logo")
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Green200,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White
        ),
        actions = {
            IconButton(onClick = {
                Toast.makeText(context, "Profile", Toast.LENGTH_SHORT).show()
            }) {
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = "Profile",
                    tint = Color.White
                )
            }
            IconButton(onClick = { Toast.makeText(context, "Search", Toast.LENGTH_SHORT).show() }) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search",
                    tint = Color.White
                )
            }
            IconButton(onClick = { Toast.makeText(context, "Menu", Toast.LENGTH_SHORT).show() }) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = "Menu",
                    tint = Color.White
                )
            }
        }
    )
}

@Composable
fun LearnState() {
    //var age=0
    var age by remember { mutableStateOf(0) }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            shape = ButtonDefaults.elevatedShape,
            colors = ButtonDefaults.buttonColors(Color.Red),
            onClick = {
                age++
                Log.v("TAG", age.toString())
            }) {
            Text("I am $age years old")
        }
    }
}

@Composable
fun LearnButton() {
    val context = LocalContext.current.applicationContext
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            shape = ButtonDefaults.elevatedShape,
            colors = ButtonDefaults.buttonColors(Color.Red),
            onClick = { Toast.makeText(context, "Button Clicked", Toast.LENGTH_LONG).show() }) {
            Text("Login")
        }
    }
}

@Composable
fun LearnImage() {
    Image(
        painter = painterResource(id = R.drawable.jc_logo),
        contentDescription = "WhatsApp Logo",
        modifier = Modifier.background(Color.Black)
    )
}

@Composable
fun LearnAlignmentArrangement() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.padding(30.dp)
    ) {
        Text("Text 1")
        Text("Text 2")
        Text("Text 3")
    }
}

@Composable
fun LearnRCB() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Learn Alignment 1")
        Text("Learn Alignment 2")
        Text("Learn Alignment 3")
    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text("Learn Alignment 1")
        Text("Learn Alignment 2")
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .height(350.dp)
                .width(350.dp)
                .background(Color.Black),
            contentAlignment = Alignment.Center
        ) {
            Text("Box Alignment", color = Color.White, fontSize = 24.sp)
        }
    }
}