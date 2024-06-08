package com.example.travel.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.travel.R
import com.example.travel.ui.component.RatingCustom
import com.example.travel.ui.layout.DefaultLayout
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

@Composable
fun InfoPlaceScreen(navController: NavController) {
    DefaultLayout(
        navController = navController,
        contentSpacing = 20.dp,
        topAppBar = true
    ) {
//        Carousel
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
                .background(MaterialTheme.colorScheme.primary.copy(0.3f)),
            contentAlignment = Alignment.BottomEnd
        ) {
            Carousel(images = images)
        }
//        End carousel
//
        Column(
            modifier = Modifier
                .padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
//            Title
            Text(
                text = "Chùa thiên mụ",
                style = MaterialTheme.typography.displayMedium
            )
//            End title
//            Review
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                RatingCustom(
                    value = 4,
                    size = 1.5f
                )
                Text(
                    text = "1.563 Đánh giá",
                    style = MaterialTheme.typography.headlineLarge
                )
                Spacer(modifier = Modifier.weight(1f))
                Row(
                    modifier = Modifier
                        .background(
                            MaterialTheme.colorScheme.secondaryContainer.copy(0.3f),
                            RoundedCornerShape(8.dp)
                        )
                        .padding(
                            vertical = 2.dp,
                            horizontal = 6.dp
                        ),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(2.dp)
                ) {
                    Icon(
                        tint = MaterialTheme.colorScheme.secondary,
                        imageVector = Icons.Rounded.Star, contentDescription = ""
                    )
                    Text(
                        text = "4.2",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.outline
                    )
                }
            }
//            End review
        }
//
//        Action button
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            OutlinedButton(
                modifier = Modifier
                    .weight(1f),
                shape = RoundedCornerShape(20.dp),
                contentPadding = PaddingValues(vertical = 16.dp),
                border = BorderStroke(
                    width = 2.dp,
                    color = MaterialTheme.colorScheme.primary
                ),
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    tint = MaterialTheme.colorScheme.primary,
                    painter = painterResource(id = R.drawable.icon_outlined_bookmark),
                    contentDescription = ""
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Đặt lịch",
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.primary
                )
            }
            Button(
                modifier = Modifier
                    .weight(1f),
                shape = RoundedCornerShape(20.dp),
                contentPadding = PaddingValues(vertical = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                ),
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_bold_send),
                    contentDescription = ""
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Địa chỉ",
                    style = MaterialTheme.typography.titleLarge,
                )
            }
        }
//
//        Giờ làm việc
        Row(
            modifier = Modifier
                .clickable { }
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .weight(1f),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = "Đang đóng cửa",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.error
                )
                Text(
                    text = "07:30 - 17:00",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.outline
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Rounded.KeyboardArrowRight,
                    contentDescription = "",
                    modifier = Modifier.size(32.dp),
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }
        }
//
//        Nhà hàng lân cận
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "Nhà hàng lân cận",
                style = MaterialTheme.typography.titleMedium
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                repeat(12) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(
                                    MaterialTheme.colorScheme.primary.copy(0.3f),
                                    RoundedCornerShape(4.dp)
                                )
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(vertical = 4.dp),
                            verticalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "Ama Restaurant",
                                style = MaterialTheme.typography.bodyMedium
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                RatingCustom(
                                    value = 4
                                )
                                Text(
                                    text = "20",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.outline
                                )
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "20 km - Nhà hàng",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.outline
                            )
                        }
                    }
                }
            }
        }
//
//        Khách sạn lận cận
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "Khách sạn lận cận",
                style = MaterialTheme.typography.titleMedium
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                repeat(12) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(80.dp)
                                .background(
                                    MaterialTheme.colorScheme.primary.copy(0.3f),
                                    RoundedCornerShape(4.dp)
                                )
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(vertical = 4.dp),
                            verticalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "Ama Restaurant",
                                style = MaterialTheme.typography.bodyMedium
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                RatingCustom(
                                    value = 4
                                )
                                Text(
                                    text = "20",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.outline
                                )
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "20 km - Nhà hàng",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.outline
                            )
                        }
                    }
                }
            }
        }
//
//        Liên hệ trực tiếp
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            Text(
                text = "Liên hệ trực tiếp",
                style = MaterialTheme.typography.labelLarge
            )
            Text(
                text = "Truy cập trang web",
                style = MaterialTheme.typography.labelLarge,
                textDecoration = TextDecoration.Underline
            )
        }
//
//        Đánh giá
        Tabs()
//
        Spacer(modifier = Modifier.height(20.dp))
    }
}

val images = listOf(
    "https://statics.vinpearl.com/ch%C3%B9a%20thi%C3%AAn%20m%E1%BB%A5%201_1690188137.jpg",
    "https://ik.imagekit.io/tvlk/blog/2023/06/chua-thien-mu-1.jpg?tr=dpr-2,w-675",
    "https://statics.vinpearl.com/Chua-Thien-Mu-Hue-2_1690873361.jpg",
    "https://file.baothuathienhue.vn/data2/image/news/2021/20211104/origin/5091635992794.jpeg",
)

@OptIn(ExperimentalFoundationApi::class, ExperimentalPagerApi::class)
@Composable
fun Carousel(images: List<String>) {
    val pagerState = rememberPagerState()

    HorizontalPager(
        state = pagerState,
        count = images.size,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) { page ->
        Image(
            painter = rememberAsyncImagePainter(images[page]), contentDescription = "",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
    }
}

@Composable
fun Tabs() {
    var tabSelected by remember {
        mutableIntStateOf(0)
    }
    Column(
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .fillMaxWidth()
    ) {
//        Tab row
        Row(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
                .padding(horizontal = 4.dp),
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
//            Tab row 1
            Column(
                modifier = Modifier
                    .clickable { tabSelected = 0 }
                    .height(36.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .weight(1f),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Đánh giá",
                        style = if (tabSelected == 0) MaterialTheme.typography.titleSmall
                        else MaterialTheme.typography.bodySmall
                    )
                }
                Box(
                    modifier = Modifier
                        .width(68.dp)
                        .height(3.dp)
                        .background(
                            if (tabSelected == 0) MaterialTheme.colorScheme.onSurface
                            else Color.Transparent
                        )
                )
            }
//
//            Tab row 2
            Column(
                modifier = Modifier
                    .clickable { tabSelected = 1 }
                    .height(36.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .weight(1f),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "H&Đ",
                        style = if (tabSelected == 1) MaterialTheme.typography.titleSmall
                        else MaterialTheme.typography.bodySmall
                    )
                }
                Box(
                    modifier = Modifier
                        .width(40.dp)
                        .height(3.dp)
                        .background(
                            if (tabSelected == 1) MaterialTheme.colorScheme.onSurface
                            else Color.Transparent
                        )
                )
            }
//
        }
//
//        Tab content 1
        if (tabSelected == 0) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
//                OutlinedTextField
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth(),
                    value = "",
                    onValueChange = {},
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_outlined_search),
                            contentDescription = ""
                        )
                    },
                    textStyle = MaterialTheme.typography.bodyMedium,
                    shape = RoundedCornerShape(99.dp),
                    label = {
                        Text(
                            text = "Tìm kiếm đánh giá",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    },
                    colors = OutlinedTextFieldDefaults.colors(

                    ),
                )
//
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(2.dp)
                        .background(
                            MaterialTheme.colorScheme.outline.copy(0.6f)
                        )
                )
//                Thống kê đánh giá
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RatingCustom(
                        value = 4,
                        size = 1.5f,
                        modifier = Modifier
                            .width(140.dp)
                    )
                    Text(text = "3.842 đã đánh giá", style = MaterialTheme.typography.bodySmall)
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    repeat(5) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                modifier = Modifier
                                    .width(140.dp),
                                text = "Xuất sắc",
                                style = MaterialTheme.typography.bodyMedium
                            )
                            LinearProgressIndicator(
                                progress = 0.6f,
                                modifier = Modifier
                                    .weight(1f)
                                    .height(12.dp)
                                    .clip(RoundedCornerShape(99.dp))
                            )
                        }
                    }
                }
//
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(2.dp)
                        .background(
                            MaterialTheme.colorScheme.outline.copy(0.6f)
                        )
                )
//                Danh sách đánh giá
                repeat(5){
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(52.dp)
                                    .background(
                                        MaterialTheme.colorScheme.primary.copy(0.3f),
                                        RoundedCornerShape(99.dp)
                                    )
                            )
                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(vertical = 4.dp),
                                verticalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Text(
                                    text = "Trần Quốc Bảo",
                                    style = MaterialTheme.typography.titleMedium
                                )
                                Text(
                                    text = "Đà Nẵng, Việt Nam",
                                    style = MaterialTheme.typography.bodySmall
                                )
                            }
                        }
                        RatingCustom(
                            value = 3,
                            size = 1.5f
                        )
                        Text(
                            style = MaterialTheme.typography.bodyMedium,
                            text = "thg 5 năm 2024   Cặp đôi\n" +
                                    "Không gian thực sự rất yên tĩnh, trong lành và có phần tĩnh  mịch. Nhiều cây xanh được chăm sóc cẩn thận. Vào đây lượng tý cho...Xem thêm"
                        )
                        Box(modifier = Modifier
                            .size(300.dp)
                            .background(MaterialTheme.colorScheme.primary.copy(0.3f),
                                RoundedCornerShape(8.dp)
                            ))
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(2.dp)
                            .background(
                                MaterialTheme.colorScheme.outline.copy(0.6f)
                            )
                    )
                }
//
            }
        }
    }
}