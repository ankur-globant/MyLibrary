package com.example.image_preview

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MyImageComponent(
    imageRes: Int,
    modifier: Modifier = Modifier,
    contentDescription: String? = null
) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = contentDescription,
        modifier = modifier
            .size(100.dp) // Ensure this is imported
            .clip(RoundedCornerShape(8.dp)), // Optional: Add shape
        contentScale = ContentScale.Crop // Adjust scaling
    )
}
@Preview(showBackground = true)
@Composable
fun PreviewMyImageComponent() {
    MyImageComponent(imageRes = R.drawable.globant) // Replace with a valid image resource
}


@Composable
fun MySampleText(data:String){
    Text(data)
}
