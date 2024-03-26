package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for the file format of a report.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementReportFileFormat implements ValuedEnum {
    /** CSV Format. */
    Csv("csv"),
    /** PDF Format (Deprecate later). */
    Pdf("pdf"),
    /** JSON Format. */
    Json("json"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceManagementReportFileFormat(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementReportFileFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "csv": return Csv;
            case "pdf": return Pdf;
            case "json": return Json;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
