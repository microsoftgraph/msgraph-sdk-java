package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EntityType implements ValuedEnum {
    Event("event"),
    Message("message"),
    DriveItem("driveItem"),
    ExternalItem("externalItem"),
    Site("site"),
    List("list"),
    ListItem("listItem"),
    Drive("drive"),
    UnknownFutureValue("unknownFutureValue"),
    ChatMessage("chatMessage"),
    Person("person"),
    Acronym("acronym"),
    Bookmark("bookmark");
    public final String value;
    EntityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EntityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "event": return Event;
            case "message": return Message;
            case "driveItem": return DriveItem;
            case "externalItem": return ExternalItem;
            case "site": return Site;
            case "list": return List;
            case "listItem": return ListItem;
            case "drive": return Drive;
            case "unknownFutureValue": return UnknownFutureValue;
            case "chatMessage": return ChatMessage;
            case "person": return Person;
            case "acronym": return Acronym;
            case "bookmark": return Bookmark;
            default: return null;
        }
    }
}
