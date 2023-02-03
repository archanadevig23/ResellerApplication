package com.quinbay.advertiz.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvertisementRequest {
    Integer adId;
    Integer sellerId;
    Integer subCategoryId;
    Integer categoryId;
    String title;
    String description;
    Integer price;
    Integer minimumPrice;
    Date postedDate;
    Boolean purchaseStatus;
    Integer viewCount;
    String imagePath;
    Integer topQuotedAmount;
}
