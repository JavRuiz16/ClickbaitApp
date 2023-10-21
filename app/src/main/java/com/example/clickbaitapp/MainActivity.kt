package com.example.clickbaitapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clickbaitapp.data.DataSource
import com.example.clickbaitapp.model.Cards
import com.example.clickbaitapp.ui.theme.ClickbaitAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClickbaitAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    ClickbaitApp()
                }
            }
        }
    }
}

@Composable
fun ClickbaitApp() {
    LazyColumn {
        items(DataSource.cards) {
            ClickbaitappItem(cards= it)
            modifier = Modifier.padding(8.dp)
        }
    }
}

@Composable
fun ClickbaitappItem(cards: Int) {

}

@Composable
fun clickbaitItem(
    cards: Cards,
    modifier: Modifier = Modifier
) {
    Card() {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Image(
                modifier = Modifier
                    .size(64.dp)
                    .padding(8.dp),
                painter = painterResource(cards.imageResourceId),
                contentDescription = null
            )

            Column() {
                Text(
                    text = stringResource(cards.name),
                    modifier = Modifier.padding(top = 8.dp)
                )

            }
        }
    }
}

@Composable
fun ClickbaitAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {

}

@Preview
@Composable
fun ClickbaitAppPreview() {
    ClickbaitAppTheme (darkTheme = true) {
        ClickbaitApp()
    }
}