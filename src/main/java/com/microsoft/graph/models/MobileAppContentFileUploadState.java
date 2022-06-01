package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Casts the previous resource to managedMobileLobApp. */
public enum MobileAppContentFileUploadState implements ValuedEnum {
    Success("success"),
    TransientError("transientError"),
    Error("error"),
    Unknown("unknown"),
    AzureStorageUriRequestSuccess("azureStorageUriRequestSuccess"),
    AzureStorageUriRequestPending("azureStorageUriRequestPending"),
    AzureStorageUriRequestFailed("azureStorageUriRequestFailed"),
    AzureStorageUriRequestTimedOut("azureStorageUriRequestTimedOut"),
    AzureStorageUriRenewalSuccess("azureStorageUriRenewalSuccess"),
    AzureStorageUriRenewalPending("azureStorageUriRenewalPending"),
    AzureStorageUriRenewalFailed("azureStorageUriRenewalFailed"),
    AzureStorageUriRenewalTimedOut("azureStorageUriRenewalTimedOut"),
    CommitFileSuccess("commitFileSuccess"),
    CommitFilePending("commitFilePending"),
    CommitFileFailed("commitFileFailed"),
    CommitFileTimedOut("commitFileTimedOut");
    public final String value;
    MobileAppContentFileUploadState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MobileAppContentFileUploadState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "transientError": return TransientError;
            case "error": return Error;
            case "unknown": return Unknown;
            case "azureStorageUriRequestSuccess": return AzureStorageUriRequestSuccess;
            case "azureStorageUriRequestPending": return AzureStorageUriRequestPending;
            case "azureStorageUriRequestFailed": return AzureStorageUriRequestFailed;
            case "azureStorageUriRequestTimedOut": return AzureStorageUriRequestTimedOut;
            case "azureStorageUriRenewalSuccess": return AzureStorageUriRenewalSuccess;
            case "azureStorageUriRenewalPending": return AzureStorageUriRenewalPending;
            case "azureStorageUriRenewalFailed": return AzureStorageUriRenewalFailed;
            case "azureStorageUriRenewalTimedOut": return AzureStorageUriRenewalTimedOut;
            case "commitFileSuccess": return CommitFileSuccess;
            case "commitFilePending": return CommitFilePending;
            case "commitFileFailed": return CommitFileFailed;
            case "commitFileTimedOut": return CommitFileTimedOut;
            default: return null;
        }
    }
}
