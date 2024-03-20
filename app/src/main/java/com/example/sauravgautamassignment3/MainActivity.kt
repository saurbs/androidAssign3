package com.example.sauravgautamassignment3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sauravgautamassignment3.ui.theme.SauravGautamAssignment3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SauravGautamAssignment3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Text(
//                        text = "Animations",
//                        modifier = Modifier.padding(24.dp),
//                        style = MaterialTheme.typography.labelMedium.copy(
//                            fontWeight = FontWeight.Bold,
//                            fontSize = 24.sp
//                        )
//                    )

                    App()
                }
            }
        }
    }
}

@Composable
fun App() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Buttons_") {
        composable("Buttons_") {
            Buttons_(navController)
        }
        composable("transitionAnimation") {
            TransitionAnimation_()
        }
        composable("scaleAnimation") {
            ScaleAnimation_()
        }
        composable("infiniteAnimation") {
            InfiniteAnimation_()
        }
        composable("enterExitAnimation") {
            EnterExitAnimation_()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SauravGautamAssignment3Theme {
        App()
    }
}
