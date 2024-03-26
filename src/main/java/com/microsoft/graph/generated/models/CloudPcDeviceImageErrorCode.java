package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcDeviceImageErrorCode implements ValuedEnum {
    InternalServerError("internalServerError"),
    SourceImageNotFound("sourceImageNotFound"),
    OsVersionNotSupported("osVersionNotSupported"),
    SourceImageInvalid("sourceImageInvalid"),
    SourceImageNotGeneralized("sourceImageNotGeneralized"),
    UnknownFutureValue("unknownFutureValue"),
    VmAlreadyAzureAdjoined("vmAlreadyAzureAdjoined"),
    PaidSourceImageNotSupport("paidSourceImageNotSupport"),
    SourceImageNotSupportCustomizeVMName("sourceImageNotSupportCustomizeVMName"),
    SourceImageSizeExceedsLimitation("sourceImageSizeExceedsLimitation");
    public final String value;
    CloudPcDeviceImageErrorCode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcDeviceImageErrorCode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "internalServerError": return InternalServerError;
            case "sourceImageNotFound": return SourceImageNotFound;
            case "osVersionNotSupported": return OsVersionNotSupported;
            case "sourceImageInvalid": return SourceImageInvalid;
            case "sourceImageNotGeneralized": return SourceImageNotGeneralized;
            case "unknownFutureValue": return UnknownFutureValue;
            case "vmAlreadyAzureAdjoined": return VmAlreadyAzureAdjoined;
            case "paidSourceImageNotSupport": return PaidSourceImageNotSupport;
            case "sourceImageNotSupportCustomizeVMName": return SourceImageNotSupportCustomizeVMName;
            case "sourceImageSizeExceedsLimitation": return SourceImageSizeExceedsLimitation;
            default: return null;
        }
    }
}
