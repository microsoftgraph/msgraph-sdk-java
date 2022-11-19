package com.microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum Label implements ValuedEnum {
    Title("title"),
    Url("url"),
    CreatedBy("createdBy"),
    LastModifiedBy("lastModifiedBy"),
    Authors("authors"),
    CreatedDateTime("createdDateTime"),
    LastModifiedDateTime("lastModifiedDateTime"),
    FileName("fileName"),
    FileExtension("fileExtension"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Label(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Label forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "title": return Title;
            case "url": return Url;
            case "createdBy": return CreatedBy;
            case "lastModifiedBy": return LastModifiedBy;
            case "authors": return Authors;
            case "createdDateTime": return CreatedDateTime;
            case "lastModifiedDateTime": return LastModifiedDateTime;
            case "fileName": return FileName;
            case "fileExtension": return FileExtension;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
