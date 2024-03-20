package com.example.sauravgautamassignment3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sauravgautamassignment3.ui.theme.SauravGautamAssignment3Theme
import kotlinx.coroutines.launch

class EnterExitAnimActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SauravGautamAssignment3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    EnterExitAnimation_()
                }
            }
        }
    }
}

@Preview
@Composable
fun EnterExitAnimation_() {
    val coroutineScope = rememberCoroutineScope()
    val transitionX = remember { Animatable(-350f) }
    val transitionY = remember { Animatable(0f) }
    val isHidden = remember { mutableStateOf(true) }

    Column(modifier = Modifier.padding(all = 10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Box(
            modifier = Modifier
                .size(250.dp)
        )
        {
            Image(
                painter = painterResource(R.drawable.fruits),
                contentDescription = "Image Animation",
                modifier = Modifier.offset(x = transitionX.value.dp, y = transitionY.value.dp)
            )
        }
        Button(onClick = {
            coroutineScope.launch {
                if (isHidden.value)
                {
                    isHidden.value = !isHidden.value
                    transitionX.animateTo(targetValue = if (transitionX.value == -350f) 50f
                    else -350f, animationSpec = tween(durationMillis = 1000, easing = FastOutSlowInEasing))
                }
                else
                {
                    transitionY.animateTo(targetValue = if (transitionY.value == 0f) -800f
                    else 0f, animationSpec = tween(durationMillis = 1000, easing = FastOutSlowInEasing))

                    transitionX.animateTo(targetValue = if (transitionX.value == -350f) 50f
                    else -300f, animationSpec = tween(durationMillis = 1000, easing = FastOutSlowInEasing))

                    transitionY.animateTo(targetValue = if (transitionY.value == 0f) -800f
                    else 0f, animationSpec = tween(durationMillis = 1000, easing = FastOutSlowInEasing))

                    isHidden.value = !isHidden.value
                }
            }
        },
            Modifier.padding(10.dp)) {
            if (isHidden.value) {
                Text("Press For Enter Animation")
            }
            else {
                Text("Press For Exit Animation")
            }
        }
    }
}

@Preview
@Composable
fun EnterExitAnimationPreview() {
    SauravGautamAssignment3Theme {
        EnterExitAnimation_()
    }
}