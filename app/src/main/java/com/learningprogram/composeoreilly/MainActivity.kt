package com.learningprogram.composeoreilly

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.learningprogram.composeoreilly.ui.theme.ComposeOreillyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeOreillyTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    CreatePuliCard()
                }
            }
        }
    }
}

@Composable
fun CreatePuliCard() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Card(
            modifier = Modifier
                .width(200.dp)
                .height(390.dp)
                .padding(12.dp),
            shape = RoundedCornerShape(corner = CornerSize(15.dp)),
            backgroundColor = Color.Gray,
            elevation = 4.dp,
        ) {
            Column(
                modifier = Modifier.height(300.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CreateProfileImage()
                Divider(
                    modifier = Modifier.padding(end = 12.dp),
                    color = Color.DarkGray,
                    thickness = 1.dp,
                    startIndent = 12.dp
                )
            }
        }
    }
}

@Composable
private fun CreateProfileImage(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .size(150.dp)
            .padding(8.dp),
        shape = CircleShape,
        border = BorderStroke(width = 2.dp, color = Color.Black),
        elevation = 4.dp,
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ori_profile_picture),
            contentDescription = "Profile image",
            modifier = Modifier.size(135.dp),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeOreillyTheme {
        CreatePuliCard()
    }
}