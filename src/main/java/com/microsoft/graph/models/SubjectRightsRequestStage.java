package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the privacy singleton.  */
public enum SubjectRightsRequestStage implements ValuedEnum {
    ContentRetrieval("contentRetrieval"),
    ContentReview("contentReview"),
    GenerateReport("generateReport"),
    ContentDeletion("contentDeletion"),
    CaseResolved("caseResolved"),
    ContentEstimate("contentEstimate"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SubjectRightsRequestStage(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SubjectRightsRequestStage forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "contentRetrieval": return ContentRetrieval;
            case "contentReview": return ContentReview;
            case "generateReport": return GenerateReport;
            case "contentDeletion": return ContentDeletion;
            case "caseResolved": return CaseResolved;
            case "contentEstimate": return ContentEstimate;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
