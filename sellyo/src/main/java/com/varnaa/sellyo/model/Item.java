package com.varnaa.sellyo.model;

import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * @author swethavarnaa
 */
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @NotNull
    @NotBlank
    private String itemName;
    private String description;

    @NotNull
    @Positive
    @Min(value = 1)
    private int originalPrice;

    @NotNull
    @Positive
    @Min(value = 1)
    private int sellingPrice;

    @NotNull
    @NotBlank
    @Size(min = 3)
    private String condition;
    private boolean status;
    private String onlineLink;
    @Lob
    private String image;
    @NotNull
    private String userId;

    public Item(String id, String itemName, String description, int originalPrice, int sellingPrice, String condition, boolean status, String onlineLink, String userId) {
        this.id = id;
        this.itemName = itemName;
        this.description = description;
        this.originalPrice = originalPrice;
        this.sellingPrice = sellingPrice;
        this.condition = condition;
        this.status = status;
        this.onlineLink = onlineLink;
        this.userId = userId;
    }

    public Item() {}

    public Item(String id, String itemName, String description, int originalPrice, int sellingPrice, String condition, boolean status, String onlineLink) {
        this.id = id;
        this.itemName = itemName;
        this.description = description;
        this.originalPrice = originalPrice;
        this.sellingPrice = sellingPrice;
        this.condition = condition;
        this.status = status;
        this.onlineLink = onlineLink;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(int originalPrice) {
        this.originalPrice = originalPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getOnlineLink() {
        return onlineLink;
    }

    public void setOnlineLink(String onlineLink) {
        this.onlineLink = onlineLink;
    }

    public String getUserId() {
        return userId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
