package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_android),
            contentDescription = "Android Logo",
            modifier = Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Drarat Kaewngam",
            fontSize = 24.sp,
            color = Color(0xFFFFFF33),
        )
        Text(
            text = "Android Developer Extraordinaire",
            color = Color(0xFFFFFF33),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(32.dp))

        ContactInfo()
    }
}

@Composable
fun ContactInfo() {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Filled.Phone, contentDescription = "Phone", tint = Color(0xFFFFFF33))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "+123 456 7890",
                    color = Color(0xFFFFFF33),)
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Filled.Share, contentDescription = "Social Media", tint = Color(0xFFFFFF33))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "@yourusername",
                color = Color(0xFFFFFF33),)
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Filled.Email, contentDescription = "Email", tint = Color(0xFFFFFF33))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "you@example.com",
                color = Color(0xFFFFFF33),)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    MyApplicationTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF660066) // เขียว Android
        ) {}
        BusinessCard()
    }
}
