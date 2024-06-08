package com.example.travel.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.travel.R
import com.example.travel.data.`object`.PlaceObject
import com.example.travel.ui.component.RatingCustom
import com.example.travel.ui.layout.DefaultLayout

@Composable
fun HomeScreen(navController: NavController) {
    val place: PlaceObject = viewModel()
    DefaultLayout(
        navController = navController,
        contentSpacing = 30.dp
    ) {
        Column(
            modifier = Modifier
                .shadow(
                    elevation = 16.dp,
                    spotColor = Color.Black,
                    ambientColor = Color.Black,
                    shape = RoundedCornerShape(
                        bottomEnd = 16.dp, bottomStart = 16.dp
                    )
                )
                .fillMaxWidth()
                .background(
                    color = MaterialTheme.colorScheme.primary,
                    shape = RoundedCornerShape(bottomEnd = 24.dp, bottomStart = 24.dp)
                )
                .padding(start = 20.dp, top = 20.dp, end = 20.dp, bottom = 20.dp)
        ) {
//            Avatar
            Row {
                Spacer(modifier = Modifier.weight(1f))
                AsyncImage(
                    model = "https://htmediagroup.vn/wp-content/uploads/2022/04/Anh-CV-chuyen-nghiep-min-1.jpg",
                    contentDescription = "",
                    modifier = Modifier
                        .size(36.dp)
                        .background(
                            MaterialTheme.colorScheme.primaryContainer.copy(0.4f),
                            RoundedCornerShape(99.dp)
                        )
                        .clip(RoundedCornerShape(99.dp)),
                    contentScale = ContentScale.FillBounds
                )
            }
//            End avatar
//            Title
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Khám phá",
                    style = MaterialTheme.typography.displayLarge,
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }
//            End title
//            Start category
            Spacer(modifier = Modifier.height(12.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .height(60.dp)
                        .background(
                            color = MaterialTheme.colorScheme.surface,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .padding(horizontal = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ion_bed_outline),
                        contentDescription = ""
                    )
                    Text(text = "Khách sạn", style = MaterialTheme.typography.headlineLarge)
                }
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .height(60.dp)
                        .background(
                            color = MaterialTheme.colorScheme.surface,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .padding(horizontal = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ion_ticket_outline),
                        contentDescription = ""
                    )
                    Text(
                        text = "Hoạt động\ngiải trí", style = MaterialTheme.typography.headlineLarge
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .height(60.dp)
                        .background(
                            color = MaterialTheme.colorScheme.surface,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .padding(horizontal = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ion_restaurant_outline),
                        contentDescription = ""
                    )
                    Text(text = "Nhà hàng", style = MaterialTheme.typography.headlineLarge)
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(60.dp)
                )
            }
//            End category
        }
//            Đã xem gần đây
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(text = "Đã xem gần đây", style = MaterialTheme.typography.titleLarge)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                repeat(12) {
                    Column(
                        modifier = Modifier
                            .width(180.dp),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        AsyncImage(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(120.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(
                                    MaterialTheme.colorScheme.primary.copy(0.3f),
                                    RoundedCornerShape(8.dp)
                                ),
                            model = "",
                            contentDescription = ""
                        )
                        Text(
                            text = "Chùa thiên mụ",
                            style = MaterialTheme.typography.titleSmall
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            RatingCustom(
                                value = 2
                            )
                            Text(
                                text = "3.842",
                                style = MaterialTheme.typography.headlineMedium
                            )
                        }
                        Text(
                            text = "Địa điểm lịch sử",
                            style = MaterialTheme.typography.headlineMedium,
                            color = MaterialTheme.colorScheme.outline
                        )
                        Text(
                            text = "Huế, Việt Nam",
                            style = MaterialTheme.typography.headlineMedium,
                            color = MaterialTheme.colorScheme.outline
                        )
                    }
                }
            }
        }
//
//        Khám phá thêm tại
        Column(
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth()
                .background(
                    MaterialTheme.colorScheme.secondary,
                    RoundedCornerShape(12.dp)
                )
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Khám phá thêm tại\nHuế",
                style = MaterialTheme.typography.displayLarge,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSecondary
            )
            OutlinedButton(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = MaterialTheme.colorScheme.onSecondary
                ),
                border = BorderStroke(
                    width = 2.dp,
                    color = MaterialTheme.colorScheme.onSecondary
                )
            ) {
                Text(
                    text = "Tiếp tục khám phá",
                    style = MaterialTheme.typography.titleSmall
                )
            }
        }
//
//            Khách sạn giá rẻ gần bạn
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.Top
            ) {
                Text(
                    text = "Khách sạn giá rẻ gần\nbạn",
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "Xem thêm",
                    color = MaterialTheme.colorScheme.secondary,
                    style = MaterialTheme.typography.titleSmall
                )
            }
            Text(
                text = "Đặt phòng tại những khách sạn này",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.outline
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                repeat(12) {
                    Column(
                        modifier = Modifier
                            .width(180.dp),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        AsyncImage(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(120.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(
                                    MaterialTheme.colorScheme.primary.copy(0.3f),
                                    RoundedCornerShape(8.dp)
                                ),
                            model = "",
                            contentDescription = ""
                        )
                        Text(
                            text = "Chùa thiên mụ",
                            style = MaterialTheme.typography.titleSmall
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            RatingCustom(
                                value = 2
                            )
                            Text(
                                text = "3.842",
                                style = MaterialTheme.typography.headlineMedium
                            )
                        }
                        Text(
                            text = "Địa điểm lịch sử",
                            style = MaterialTheme.typography.headlineMedium,
                            color = MaterialTheme.colorScheme.outline
                        )
                        Text(
                            text = "Huế, Việt Nam",
                            style = MaterialTheme.typography.headlineMedium,
                            color = MaterialTheme.colorScheme.outline
                        )
                    }
                }
            }
        }
//
//            Nhà hàng lân cận
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.Top
            ) {
                Text(
                    text = "Nhà hàng lân cận",
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "Xem thêm",
                    color = MaterialTheme.colorScheme.secondary,
                    style = MaterialTheme.typography.titleSmall
                )
            }
            Text(
                text = "Những địa hiểm ăn uống cho chuyến\nđi của bạn",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.outline
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                repeat(12) {
                    Column(
                        modifier = Modifier
                            .width(180.dp),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        AsyncImage(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(120.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(
                                    MaterialTheme.colorScheme.primary.copy(0.3f),
                                    RoundedCornerShape(8.dp)
                                ),
                            model = "",
                            contentDescription = ""
                        )
                        Text(
                            text = "Chùa thiên mụ",
                            style = MaterialTheme.typography.titleSmall
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            RatingCustom(
                                value = 2
                            )
                            Text(
                                text = "3.842",
                                style = MaterialTheme.typography.headlineMedium
                            )
                        }
                        Text(
                            text = "Địa điểm lịch sử",
                            style = MaterialTheme.typography.headlineMedium,
                            color = MaterialTheme.colorScheme.outline
                        )
                        Text(
                            text = "Huế, Việt Nam",
                            style = MaterialTheme.typography.headlineMedium,
                            color = MaterialTheme.colorScheme.outline
                        )
                    }
                }
            }
        }
//
//        Các địa điểm nên đến trong mùa hè
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .paint(
                    painter = painterResource(id = R.drawable.vinh_ha_long),
                    contentScale = ContentScale.FillBounds,
                    alpha = 0.6f
                )
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = "Các địa điểm nên đến trong mùa hè",
                style = MaterialTheme.typography.displayLarge,
                color = MaterialTheme.colorScheme.surface
            )
            Text(
                text = "Từ Vịnh Hạ Long đến Nha Trang",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.surface
            )
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.surface,
                    contentColor = MaterialTheme.colorScheme.onSurface
                )
            ) {
                Text(text = "Đọc thêm", style = MaterialTheme.typography.titleMedium)
            }
        }
//
//  Điểm đến hàng đầu cho kì nghỉ tiếp theo của bạn
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.Top
            ) {
                Text(
                    text = "Điểm đến hàng đầu cho\nkì nghỉ tiếp theo của bạn",
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "Xem thêm",
                    color = MaterialTheme.colorScheme.secondary,
                    style = MaterialTheme.typography.titleSmall
                )
            }
            Text(
                text = "Đây là địa điểm thu hút nhiều khách du lịch",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.outline
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                repeat(12) {
                    Column(
                        modifier = Modifier
                            .width(200.dp)
                            .height(120.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .paint(
                                painter = painterResource(id = R.drawable.vinh_ha_long),
                                contentScale = ContentScale.FillBounds,
                                alpha = 0.8f
                            )
                            .padding(12.dp),
                        verticalArrangement = Arrangement.Bottom,
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = "Vịnh Hạ Long",
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.surface
                        )
                    }
                }
            }
        }
//
        Spacer(modifier = Modifier.height(4.dp))
    }
}