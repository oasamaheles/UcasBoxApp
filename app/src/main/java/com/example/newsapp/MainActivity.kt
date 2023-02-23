package com.example.newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleColumn()
        }
    }
}


@Composable
fun SimpleColumn() {
    Modifier
        .padding(5.dp)
        .background(Color.Black)
    Column(
        modifier = Modifier
            .fillMaxWidth(1f)
            .fillMaxHeight(1f)
            .background(Color.Black)
            .border(5.dp, Color.Black)

    ) {

        Row(
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth(1f)
                .height(150.dp)
                .padding(all = 5.dp)
        ) {
            TextBox("TextView")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(Dp(2f))
                .height(400.dp)
                .border(2.dp, Color.Black)

        ) {
            Column(
                modifier = Modifier
                    .width(300.dp)
                    .fillMaxHeight(1f)
                    .background(Color.Blue)
                    .border(2.dp, Color.Black)


            ) {
                TextBox("TextView")

            }

            Column(
                modifier = Modifier
                    .width(300.dp)
                    .fillMaxHeight(1f)

            ) {
                Row(
                    modifier = Modifier
                        .background(Color.Green)
                        .fillMaxWidth(1f)
                        .height(300.dp)
                        .border(3.dp, Color.Black)


                ) {
                    TextBox("TextView")

                }
                Row(
                    modifier = Modifier
                        .background(Color.Yellow)
                        .fillMaxWidth(1f)
                        .height(200.dp)
                        .border(3.dp, Color.Black)

                ) {
                    TextBox("TextView")

                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(Dp(2f))
                .fillMaxHeight(1f)
                .border(1.dp, Color.Black)


        ) {
            Column(
                modifier = Modifier
                    .width(100.dp)
                    .fillMaxWidth(1f)
                    .fillMaxHeight(1f)
                    .background(Color.Magenta)
                    .border(2.dp, Color.Black)


            ) {
                TextBox("TextView")

            }

            Column(
                modifier = Modifier
                    .width(300.dp)
                    .fillMaxHeight(1f)
                    .background(Color.White)
                    .border(2.dp, Color.Black)

            ) {
                TextBox("TextView")

            }


        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SimpleColumn()
}
@Composable
fun TextBox(text: String){
    Text(
        text = text,
        modifier=Modifier.padding(Dp(10f)),
//        modifier=Modifier.padding(start = 10.dp, top = 10.dp),
        style = TextStyle(
            color = Color.Gray,
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.W900,
            fontStyle = FontStyle.Companion.Normal,
//            letterSpacing = 0.3.em,
//            background = Color.LightGray,
//            textDecoration = TextDecoration.Underline
        )
    )
}

