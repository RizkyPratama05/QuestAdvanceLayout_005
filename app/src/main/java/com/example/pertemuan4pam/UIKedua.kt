package com.example.pertemuan4pam

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ModifierInfo
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.unpackFloat1

@Composable
fun ActivitasKedua(modifier: Modifier) {
    Column(modifier = Modifier
        .background(color = colorResource(id = R.color.navy))
        .padding(top = 10.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        val gambar = painterResource(id = R.drawable.fotoku3)
        Image(
            painter = gambar,
            contentDescription = null,
            modifier = Modifier
                .size(size = 200.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center){
            Image(
                painter = painterResource(id = R.drawable.linkedin),
                contentDescription = null,
                modifier = Modifier
                    .size(45.dp)
                    .padding(4.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.facebook),
                contentDescription = null,
                modifier = Modifier
                    .size(size = 50.dp)
                    .padding(all = 4.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.instagram),
                contentDescription = null,
                modifier = Modifier
                    .size(size = 45.dp)
                    .padding(all = 4.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.umy),
                contentDescription = null,
                modifier = Modifier
                    .size(size = 45.dp)
                    .padding(all = 4.dp)
            )
        }

        Spacer(modifier = Modifier.height(height = 5.dp))

        Text(
            text = stringResource(id = R.string.namaku),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Text(
            text = stringResource(id = R.string.ig),
            fontSize = 20.sp,
            color = Color.Gray,
            fontFamily = FontFamily.Default
        )
        Spacer(modifier = Modifier.height(height = 20.dp))

        Text(
            text = stringResource(id = R.string.job),
            fontSize = 20.sp,
            color = Color.White,
            fontFamily = FontFamily.Serif
        )


