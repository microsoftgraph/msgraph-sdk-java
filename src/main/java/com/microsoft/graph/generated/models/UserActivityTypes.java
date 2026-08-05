package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserActivityTypes implements ValuedEnum {
    None("none"),
    UploadText("uploadText"),
    UploadFile("uploadFile"),
    DownloadText("downloadText"),
    DownloadFile("downloadFile"),
    UnknownFutureValue("unknownFutureValue"),
    CopyToClipboard("copyToClipboard"),
    PasteFromClipboard("pasteFromClipboard"),
    Print("print"),
    AccessDebugTools("accessDebugTools");
    public final String value;
    UserActivityTypes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserActivityTypes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "uploadText": return UploadText;
            case "uploadFile": return UploadFile;
            case "downloadText": return DownloadText;
            case "downloadFile": return DownloadFile;
            case "unknownFutureValue": return UnknownFutureValue;
            case "copyToClipboard": return CopyToClipboard;
            case "pasteFromClipboard": return PasteFromClipboard;
            case "print": return Print;
            case "accessDebugTools": return AccessDebugTools;
            default: return null;
        }
    }
}
