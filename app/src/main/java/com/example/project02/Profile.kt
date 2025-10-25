package com.example.project02

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun Profile(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.saya),
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(140.dp)
                .clip(CircleShape)
                .border(3.dp, Color.Gray, CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(20.dp))

        // 🌐 Deretan Logo Media Sosial
        Row(
            horizontalArrangement = Arrangement.spacedBy(24.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val icons = listOf(
                R.drawable.facebook,
                R.drawable.google,
                R.drawable.tele,
                R.drawable.linkedin
            )
            icons.forEach { icon ->
                Box(
                    modifier = Modifier
                        .size(45.dp)
                        .clip(CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = icon),
                        contentDescription = null,
                        modifier = Modifier.size(35.dp)
                    )
                }
            }
        }
        Column(
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // 🧍 Nama dan Deskripsi
            Text(
                text = stringResource(id = R.string.nama),
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = stringResource(id = R.string.email),
                fontSize = 15.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Saya Seorang UI/UX Designer",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(25.dp))

            // Card 1
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White // 🤍 card putih
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp, vertical = 5.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        val gambar = painterResource(id = R.drawable.perisai)
                        Image(
                            painter = gambar,
                            contentDescription = null,
                            modifier = Modifier
                                .size(60.dp)
                                .padding(all = 5.dp)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(
                            text = stringResource(id = R.string.keamanan),
                            fontSize = 25.sp,
                            fontFamily = FontFamily.Cursive, // 🖋️ font italic
                            color = Color.Black
                        )
                    }

                    val iconDropdown = painterResource(id = R.drawable.dropdown)
                    Image(
                        painter = iconDropdown,
                        contentDescription = "Dropdown Icon",
                        modifier = Modifier
                            .size(30.dp)
                            .padding(end = 8.dp)
                    )
                }
            }
