package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ComplianceStatus implements ValuedEnum {
    Unknown("unknown"),
    NotApplicable("notApplicable"),
    Compliant("compliant"),
    Remediated("remediated"),
    NonCompliant("nonCompliant"),
    Error("error"),
    Conflict("conflict"),
    NotAssigned("notAssigned");
    public final String value;
    ComplianceStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ComplianceStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "notApplicable": return NotApplicable;
            case "compliant": return Compliant;
            case "remediated": return Remediated;
            case "nonCompliant": return NonCompliant;
            case "error": return Error;
            case "conflict": return Conflict;
            case "notAssigned": return NotAssigned;
            default: return null;
        }
    }
}
