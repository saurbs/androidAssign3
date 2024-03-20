package com.example.sauravgautamassignment3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun Buttons_(navController: NavController) {
    Column(
        modifier = Modifier.padding(all = 15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                navController.navigate("transitionAnimation")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(vertical = 8.dp)
        ) {
            Text(
                "Transition Animation",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Button(
            onClick = {
                navController.navigate("scaleAnimation")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(vertical = 8.dp)
        ) {
            Text(
                "Scale Animation",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Button(
            onClick = {
                navController.navigate("infiniteAnimation")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(vertical = 8.dp)
        ) {
            Text(
                "Infinite Animation",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Button(
            onClick = {
                navController.navigate("enterExitAnimation")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(vertical = 8.dp)
        ) {
            Text(
                "Enter Exit Animation",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
