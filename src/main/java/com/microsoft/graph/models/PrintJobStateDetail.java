package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the admin singleton. */
public enum PrintJobStateDetail implements ValuedEnum {
    UploadPending("uploadPending"),
    Transforming("transforming"),
    CompletedSuccessfully("completedSuccessfully"),
    CompletedWithWarnings("completedWithWarnings"),
    CompletedWithErrors("completedWithErrors"),
    ReleaseWait("releaseWait"),
    Interpreting("interpreting"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrintJobStateDetail(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PrintJobStateDetail forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "uploadPending": return UploadPending;
            case "transforming": return Transforming;
            case "completedSuccessfully": return CompletedSuccessfully;
            case "completedWithWarnings": return CompletedWithWarnings;
            case "completedWithErrors": return CompletedWithErrors;
            case "releaseWait": return ReleaseWait;
            case "interpreting": return Interpreting;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
