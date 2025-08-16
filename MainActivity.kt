package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    GreetingText(
//                        message = "Happy Birthday Sam!",
//                        from = "From Emma",
//                        modifier = Modifier.padding(8.dp)
//                    )
//                }
            }
        }
    }
}
// ชื่อฟังก์ชันตัวแรกต้องเป็นพิมพ์ใหญ่
@Composable //จะประกาศ jetpack compose ต้องประกาศแบบนี้ @Composable
fun Greeting(messege: String, from : String, modifier: Modifier = Modifier) { //Modifier ไว้ปรับแต่งหน้าจอ UI
//    Column(
//        verticalArrangement = Arrangement.Center, //จัดหน้าจอในแนวตั้ง พวกขยับตำแหน่ง
//        modifier = Modifier //ปรับขนาดให้้เต็มจอ
//            .padding(16.dp) //ระยะห่าง
//
//    ) { //ซ้อนหรือเรียงกันในแนวตั้ง ถ้าจะเอาแนวนอนให้ใช้ row
//        Text( //text view
//            text = messege,
//            fontSize = 100.sp,
//            lineHeight = 116.sp,
//            textAlign = TextAlign.Center,//ปรับตำแหน่งข้อความ
//            modifier = modifier
//        )
//        Text(
//            text = from,
//            fontSize = 36.sp,
//            textAlign = TextAlign.End,
//            modifier = Modifier
//                .padding(16.dp)
//                .align(alignment = Alignment.End) //ต้องใส่ ไม่งั้น textAlign จะขยับแค่ในกล่องตัวเอง
//        )
//    }
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .padding(16.dp)
    ) {
        Text(
            text = messege,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Composable
fun GreetingImage(messege: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
//            alpha = 0.5F
        )
        Greeting(
            messege = messege,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }

}

@Preview(showBackground = true) //จอข้างที่ขึ้นไม่เกี่ยวกับรัน anotation?
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Surface (
            modifier = Modifier.background(color = MaterialTheme.colorScheme.background)
        ){  }
        GreetingImage(
            messege = "Happy Birthday Sam!",
            from = "From Emma"
        )
    }
}