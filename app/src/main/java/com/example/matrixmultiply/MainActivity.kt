package com.example.matrixmultiply

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.matrixmultiply.ui.theme.MatrixMultiplyTheme
import androidx.compose.material3.Button
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MatrixMultiplyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.LightGray

                ) {
                    var s11 by remember{mutableStateOf(0)};
                    var s12 by remember{mutableStateOf(0)};
                    var s13 by remember{mutableStateOf(0)};
                    var s21 by remember{mutableStateOf(0)};
                    var s22 by remember{mutableStateOf(0)};
                    var s23 by remember{mutableStateOf(0)};
                    var s31 by remember{mutableStateOf(0)};
                    var s32 by remember{mutableStateOf(0)};
                    var s33 by remember{mutableStateOf(0)};
                    var t11 by remember{mutableStateOf(0)};
                    var t12 by remember{mutableStateOf(0)};
                    var t13 by remember{mutableStateOf(0)};
                    var t21 by remember{mutableStateOf(0)};
                    var t22 by remember{mutableStateOf(0)};
                    var t23 by remember{mutableStateOf(0)};
                    var t31 by remember{mutableStateOf(0)};
                    var t32 by remember{mutableStateOf(0)};
                    var t33 by remember{mutableStateOf(0)};

                    var p11 by remember{mutableStateOf(0)};
                    var p12 by remember{mutableStateOf(0)};
                    var p13 by remember{mutableStateOf(0)};
                    var p21 by remember{mutableStateOf(0)};
                    var p22 by remember{mutableStateOf(0)};
                    var p23 by remember{mutableStateOf(0)};
                    var p31 by remember{mutableStateOf(0)};
                    var p32 by remember{mutableStateOf(0)};
                    var p33 by remember{mutableStateOf(0)};



                    Column(modifier=Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {

                        Text(
                            "Matrix Multiplier",
                            modifier = Modifier.padding(10.dp),
                            fontSize = 20.sp,
                            color = Color.Black
                        )
                        // MATRIX S
                        Column(
                            modifier = Modifier.height(150.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                            Row(modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .height(50.dp)) {
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Red)
                                        .border(1.dp, Color.Black)
                                        .clickable { s11 = (s11 + 1) % 10 }) {
                                    Text(
                                        text = s11.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Red)
                                        .border(1.dp, Color.Black)
                                        .clickable { s12 = (s12 + 1) % 10 }) {
                                    Text(
                                        text = s12.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )

                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Red)
                                        .border(1.dp, Color.Black)
                                        .clickable { s13 = (s13 + 1) % 10 }) {
                                    Text(
                                        text = s13.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }

                            }

                            Row(modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .height(50.dp)) {
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Red)
                                        .border(1.dp, Color.Black)
                                        .clickable { s21 = (s21 + 1) % 10 }) {
                                    Text(
                                        text = s21.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Red)
                                        .border(1.dp, Color.Black)
                                        .clickable { s22 = (s22 + 1) % 10 }) {
                                    Text(
                                        text = s22.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )

                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Red)
                                        .border(1.dp, Color.Black)
                                        .clickable { s23 = (s23 + 1) % 10 }) {
                                    Text(
                                        text = s23.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }

                            }
                            Row(modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .height(50.dp)) {
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Red)
                                        .border(1.dp, Color.Black)
                                        .clickable { s31 = (s31 + 1) % 10 }) {
                                    Text(
                                        text = s31.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Red)
                                        .border(1.dp, Color.Black)
                                        .clickable { s32 = (s32 + 1) % 10 }) {
                                    Text(
                                        text = s32.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )

                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Red)
                                        .border(1.dp, Color.Black)
                                        .clickable { s33 = (s33 + 1) % 10 }) {
                                    Text(
                                        text = s33.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }

                            }
                        }
                        Spacer(modifier = Modifier.height(15.dp))
                        Text("x", fontSize = 30.sp)
                        Spacer(modifier = Modifier.height(15.dp))
                        // MATRIX T

                        Column(
                            modifier = Modifier.height(150.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                            Row(modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .height(50.dp)) {
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Blue)
                                        .border(1.dp, Color.Black)
                                        .clickable { t11 = (t11 + 1) % 10 }) {
                                    Text(
                                        text = t11.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Blue)
                                        .border(1.dp, Color.Black)
                                        .clickable { t12 = (t12 + 1) % 10 }) {
                                    Text(
                                        text = t12.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )

                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Blue)
                                        .border(1.dp, Color.Black)
                                        .clickable { t13 = (t13 + 1) % 10 }) {
                                    Text(
                                        text = t13.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }

                            }

                            Row(modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .height(50.dp)) {
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Blue)
                                        .border(1.dp, Color.Black)
                                        .clickable { t21 = (t21 + 1) % 10 }) {
                                    Text(
                                        text = t21.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Blue)
                                        .border(1.dp, Color.Black)
                                        .clickable { t22 = (t22 + 1) % 10 }) {
                                    Text(
                                        text = t22.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )

                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Blue)
                                        .border(1.dp, Color.Black)
                                        .clickable { t23 = (t23 + 1) % 10 }) {
                                    Text(
                                        text = t23.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }

                            }
                            Row(modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .height(50.dp)) {
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Blue)
                                        .border(1.dp, Color.Black)
                                        .clickable { t31 = (t31 + 1) % 10 }) {
                                    Text(
                                        text = t31.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Blue)
                                        .border(1.dp, Color.Black)
                                        .clickable { t32 = (t32 + 1) % 10 }) {
                                    Text(
                                        text = t32.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )

                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Blue)
                                        .border(1.dp, Color.Black)
                                        .clickable { t33 = (t33 + 1) % 10 }) {
                                    Text(
                                        text = t33.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }

                            }
                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Text("=", fontSize = 30.sp)
                        Spacer(modifier = Modifier.height(30.dp))
                        // MATRIX P
                        Column(
                            modifier = Modifier.height(150.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {


                            Row(modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .height(50.dp)) {
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Black)
                                        .border(1.dp, Color.Yellow)
                                ) {
                                    Text(
                                        text = p11.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Black)
                                        .border(1.dp, Color.Yellow)
                                ) {
                                    Text(
                                        text = p12.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )

                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Black)
                                        .border(1.dp, Color.Yellow)
                                ) {
                                    Text(
                                        text = p13.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )

                                }


                            }

                            Row(modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .height(50.dp)) {
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Black)
                                        .border(1.dp, Color.Yellow)
                                ) {
                                    Text(
                                        text = p21.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Black)
                                        .border(1.dp, Color.Yellow)
                                ) {
                                    Text(
                                        text = p22.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )

                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Black)
                                        .border(1.dp, Color.Yellow)
                                ) {
                                    Text(
                                        text = p23.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )

                                }

                            }
                            Row(modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .height(50.dp)) {
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Black)
                                        .border(1.dp, Color.Yellow)
                                ) {
                                    Text(
                                        text = p31.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Black)
                                        .border(1.dp, Color.Yellow)
                                ) {
                                    Text(
                                        text = p32.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )

                                }
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .background(Color.Black)
                                        .border(1.dp, Color.Yellow)
                                ) {
                                    Text(
                                        text = p33.toString(),
                                        modifier = Modifier.align(Alignment.Center),
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )

                                }


                            }
                        }
                        Spacer(modifier = Modifier.height(30.dp))

                        Button(onClick= {
                            p11 = (s11 * t11 + s12 * t21 + s13 * t31) % 10
                            p12 = (s11 * t12 + s12 * t22 + s13 * t32) % 10
                            p13 = (s11 * t13 + s12 * t23 + s13 * t33) % 10
                            p21 = (s21 * t11 + s22 * t21 + s23 * t31) % 10
                            p22 = (s21 * t12 + s22 * t22 + s23 * t32) % 10
                            p23 = (s21 * t13 + s22 * t23 + s23 * t33) % 10
                            p31 = (s31 * t11 + s32 * t21 + s33 * t31) % 10
                            p32 = (s31 * t12 + s32 * t22 + s33 * t32) % 10
                            p33 = (s31 * t13 + s32 * t23 + s33 * t33) % 10
                        } ){
                            Text(stringResource(R.string.Multiply))
                        }

                    }



                }
            }
        }


    }
}

