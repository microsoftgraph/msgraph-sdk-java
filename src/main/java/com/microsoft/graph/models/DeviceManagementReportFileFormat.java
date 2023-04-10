package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Possible values for the file format of a report */
public enum DeviceManagementReportFileFormat implements ValuedEnum {
    /** CSV Format */
    Csv("csv"),
    /** PDF Format */
    Pdf("pdf"),
    /** JSON Format */
    Json("json"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceManagementReportFileFormat(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementReportFileFormat forValue(@javax.annotation.Nonnull final String searchValue) {
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
