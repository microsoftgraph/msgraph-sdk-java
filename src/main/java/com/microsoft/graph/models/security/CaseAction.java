package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum CaseAction implements ValuedEnum {
    ContentExport("contentExport"),
    ApplyTags("applyTags"),
    ConvertToPdf("convertToPdf"),
    Index("index"),
    EstimateStatistics("estimateStatistics"),
    AddToReviewSet("addToReviewSet"),
    HoldUpdate("holdUpdate"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CaseAction(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CaseAction forValue(@javax.annotation.Nonnull final String searchValue) {
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
            default: return null;
        }
    }
}
