package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CaseAction implements ValuedEnum {
    ContentExport("contentExport"),
    ApplyTags("applyTags"),
    ConvertToPdf("convertToPdf"),
    Index("index"),
    EstimateStatistics("estimateStatistics"),
    AddToReviewSet("addToReviewSet"),
    HoldUpdate("holdUpdate"),
    UnknownFutureValue("unknownFutureValue"),
    PurgeData("purgeData"),
    ExportReport("exportReport"),
    ExportResult("exportResult");
    public final String value;
    CaseAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CaseAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "contentExport": return ContentExport;
            case "applyTags": return ApplyTags;
            case "convertToPdf": return ConvertToPdf;
            case "index": return Index;
            case "estimateStatistics": return EstimateStatistics;
            case "addToReviewSet": return AddToReviewSet;
            case "holdUpdate": return HoldUpdate;
            case "unknownFutureValue": return UnknownFutureValue;
            case "purgeData": return PurgeData;
            case "exportReport": return ExportReport;
            case "exportResult": return ExportResult;
            default: return null;
        }
    }
}
