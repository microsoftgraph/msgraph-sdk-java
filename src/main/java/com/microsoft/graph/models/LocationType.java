package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LocationType implements ValuedEnum {
    Default("default"),
    ConferenceRoom("conferenceRoom"),
    HomeAddress("homeAddress"),
    BusinessAddress("businessAddress"),
    GeoCoordinates("geoCoordinates"),
    StreetAddress("streetAddress"),
    Hotel("hotel"),
    Restaurant("restaurant"),
    LocalBusiness("localBusiness"),
    PostalAddress("postalAddress");
    public final String value;
    LocationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LocationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "conferenceRoom": return ConferenceRoom;
            case "homeAddress": return HomeAddress;
            case "businessAddress": return BusinessAddress;
            case "geoCoordinates": return GeoCoordinates;
            case "streetAddress": return StreetAddress;
            case "hotel": return Hotel;
            case "restaurant": return Restaurant;
            case "localBusiness": return LocalBusiness;
            case "postalAddress": return PostalAddress;
            default: return null;
        }
    }
}
