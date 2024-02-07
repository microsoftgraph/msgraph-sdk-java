package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ColumnTypes implements ValuedEnum {
    Note("note"),
    Text("text"),
    Choice("choice"),
    Multichoice("multichoice"),
    Number("number"),
    Currency("currency"),
    DateTime("dateTime"),
    Lookup("lookup"),
    Boolean("boolean"),
    User("user"),
    Url("url"),
    Calculated("calculated"),
    Location("location"),
    Geolocation("geolocation"),
    Term("term"),
    Multiterm("multiterm"),
    Thumbnail("thumbnail"),
    ApprovalStatus("approvalStatus"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ColumnTypes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ColumnTypes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "note": return Note;
            case "text": return Text;
            case "choice": return Choice;
            case "multichoice": return Multichoice;
            case "number": return Number;
            case "currency": return Currency;
            case "dateTime": return DateTime;
            case "lookup": return Lookup;
            case "boolean": return Boolean;
            case "user": return User;
            case "url": return Url;
            case "calculated": return Calculated;
            case "location": return Location;
            case "geolocation": return Geolocation;
            case "term": return Term;
            case "multiterm": return Multiterm;
            case "thumbnail": return Thumbnail;
            case "approvalStatus": return ApprovalStatus;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
