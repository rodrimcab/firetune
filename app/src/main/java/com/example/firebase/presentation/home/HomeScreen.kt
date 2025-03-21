package com.example.firebase.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firebase.presentation.model.Artist
import com.example.firebase.ui.theme.Black
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

@Preview(showBackground = true)
@Composable
fun HomeScreen(/*db: FirebaseFirestore*/) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Black)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Popular Artist",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        )

        val artists = emptyList<Artist>()

        LazyRow {
            items(artists) {

            }
        }
    }
}

@Composable
fun ArtistItem(artist: Artist) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            Modifier
                .size(70.dp)
                .background(Color.Red)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = artist.name)
    }
}

/*
 fun createArtist(db: FirebaseFirestore) {
    val random= (1..1000).random()
    val artist = Artist("Artista $random", random)
    db.collection("artists")
        .add(artist)
        .addOnSuccessListener {  }
        .addOnFailureListener {  }
        .addOnCompleteListener {  }
}
*/