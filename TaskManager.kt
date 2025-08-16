package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun TaskManager(
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
//            .padding(16.dp)
            )
    {
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed),
            contentDescription = null,
          modifier = Modifier
//              .wrapContentSize() //ยังเบิ้มอยู่เลยยยยยยยยยย
                .size(200.dp)
        )
        // article1
        Text(
            text = stringResource(R.string.Task_title),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        // article2
        Text(
            text = stringResource(R.string.Article),
            fontSize = 16.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TaskManagerPreview() {
    MyApplicationTheme {
        Surface {
            TaskManager()
        }
    }
}