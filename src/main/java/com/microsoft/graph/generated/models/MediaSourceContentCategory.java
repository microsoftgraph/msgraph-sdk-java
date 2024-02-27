package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MediaSourceContentCategory implements ValuedEnum {
    Meeting("meeting"),
    LiveStream("liveStream"),
    Presentation("presentation"),
    ScreenRecording("screenRecording"),
    Story("story"),
    Profile("profile"),
    Chat("chat"),
    Note("note"),
    Comment("comment"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MediaSourceContentCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MediaSourceContentCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "meeting": return Meeting;
            case "liveStream": return LiveStream;
            case "presentation": return Presentation;
            case "screenRecording": return ScreenRecording;
            case "story": return Story;
            case "profile": return Profile;
            case "chat": return Chat;
            case "note": return Note;
            case "comment": return Comment;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
