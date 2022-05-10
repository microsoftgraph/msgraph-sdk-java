package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum DeviceManagementReportFileFormat implements ValuedEnum {
    /** Comma-separated values */
    Csv("csv"),
    /** Portable Document Format */
    Pdf("pdf");
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
            default: return null;
        }
    }
}
