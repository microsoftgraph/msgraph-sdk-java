package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserActivityType implements ValuedEnum {
    UploadText("uploadText"),
    UploadFile("uploadFile"),
    DownloadText("downloadText"),
    DownloadFile("downloadFile"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserActivityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserActivityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "uploadText": return UploadText;
            case "uploadFile": return UploadFile;
            case "downloadText": return DownloadText;
            case "downloadFile": return DownloadFile;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
