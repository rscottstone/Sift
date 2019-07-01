package com.siftscience.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Booking {
    @Expose @SerializedName("$booking_type") private String bookingType;
    @Expose @SerializedName("$title") private String title;
    @Expose @SerializedName("$start_time") private Long startTime;
    @Expose @SerializedName("$end_time") private Long endTime;
    @Expose @SerializedName("$price") private Long price;
    @Expose @SerializedName("$currency_code") private String currencyCode;
    @Expose @SerializedName("$quantity") private Long quantity;
    @Expose @SerializedName("$guests") private List<Guest> guests;
    @Expose @SerializedName("$segments") private List<Segment> segments;
    @Expose @SerializedName("$room_type") private String roomType;
    @Expose @SerializedName("$event_id") private String eventId;
    @Expose @SerializedName("$venue_id") private String venueId;
    @Expose @SerializedName("$location") private String location;
    @Expose @SerializedName("$category") private String category;

    public String getBookingType() {
        return bookingType;
    }

    public Booking setBookingType(String bookingType) {
        this.bookingType = bookingType;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Booking setTitle(String title) {
        this.title = title;
        return this;
    }

    public Long getStartTime() {
        return startTime;
    }

    public Booking setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    public Long getEndTime() {
        return endTime;
    }

    public Booking setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public Booking setPrice(Long price) {
        this.price = price;
        return this;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public Booking setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public Long getQuantity() {
        return quantity;
    }

    public Booking setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public Booking setGuests(List<Guest> guests) {
        this.guests = guests;
        return this;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public Booking setSegments(List<Segment> segments) {
        this.segments = segments;
        return this;
    }

    public String getRoomType() {
        return roomType;
    }

    public Booking setRoomType(String roomType) {
        this.roomType = roomType;
        return this;
    }

    public String getEventId() {
        return eventId;
    }

    public Booking setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    public String getVenueId() {
        return venueId;
    }

    public Booking setVenueId(String venueId) {
        this.venueId = venueId;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Booking setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Booking setCategory(String category) {
        this.category = category;
        return this;
    }
}
