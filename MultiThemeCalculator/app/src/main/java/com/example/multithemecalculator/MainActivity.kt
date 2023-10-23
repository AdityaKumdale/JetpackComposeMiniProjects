package com.example.multithemecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.example.multithemecalculator.ui.theme.MultiThemeCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultiThemeCalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primary
                ) {
                    val calulatorButtons = remember{
                        mutableStateListOf(
                            CalculatorButton("AC",CalculatorButtonType.Reset)
                            CalculatorButton("AC",CalculatorButtonType.Reset)
                            CalculatorButton("AC",CalculatorButtonType.Reset)
                            CalculatorButton("v",CalculatorButtonType.Action)

                            CalculatorButton("7",CalculatorButtonType.Normal)
                            CalculatorButton("8",CalculatorButtonType.Normal)
                            CalculatorButton("9",CalculatorButtonType.Normal)

                            CalculatorButton("x",CalculatorButtonType.Action)

                            CalculatorButton("4",CalculatorButtonType.Normal)
                            CalculatorButton("5",CalculatorButtonType.Normal)
                            CalculatorButton("6",CalculatorButtonType.Normal)

                            CalculatorButton("-",CalculatorButtonType.Action)

                            CalculatorButton("1",CalculatorButtonType.Normal)
                            CalculatorButton("2",CalculatorButtonType.Normal)
                            CalculatorButton("3",CalculatorButtonType.Normal)

                            CalculatorButton("+",CalculatorButtonType.Action)

                            CalculatorButton(icon = Icons.Outlined.Refresh, type = CalculatorButtonType.Normal)
                            CalculatorButton("0",CalculatorButtonType.Normal)
                            CalculatorButton(".",CalculatorButtonType.Normal)

                        CalculatorButton("=",CalculatorButtonType.Action)
                        )
                    }
//                        Box(
//                            modifier = Modifier
//                                .fillMaxSize()
//                                .clip(RoundedCornerShape(topStart = 6.dp, topEnd = 6.dp))
//                                .background(MaterialTheme.colorScheme.secondary),
//                            contentAlignment = Alignment.BottomCenter
//                        ){
//                            LazyVerticalGrid(columns = GridCells.Fixed(4)){
//                                items(calulatorButtons){
//                                    Box(modifier = Modifier
//                                        .clip(RoundedCornerShape(4.dp))
//                                        .background(MaterialTheme.colorScheme.primary),
//                                        contentAlignment = Alignment.Center
//                                    ){
//                                        if (it.text != null){
//                                            Text(it.text)
//                                        }else{
//                                            Icon(imageVector = it.icon!!,contentDescription = null)
//                                        }
//                                    }
//                                }
//                            }
//                        }
                }
            }
        }
    }
}

data class CalculatorButton(
     val text:String? = null,
     val type:CalculatorButtonType,
     val icon: ImageVector? =null,
)

enum class CalculatorButtonType{
    Normal,Action,Reset
}

