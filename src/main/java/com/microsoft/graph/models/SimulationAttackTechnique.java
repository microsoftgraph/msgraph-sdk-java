package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SimulationAttackTechnique implements ValuedEnum {
    Unknown("unknown"),
    CredentialHarvesting("credentialHarvesting"),
    AttachmentMalware("attachmentMalware"),
    DriveByUrl("driveByUrl"),
    LinkInAttachment("linkInAttachment"),
    LinkToMalwareFile("linkToMalwareFile"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SimulationAttackTechnique(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SimulationAttackTechnique forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "credentialHarvesting": return CredentialHarvesting;
            case "attachmentMalware": return AttachmentMalware;
            case "driveByUrl": return DriveByUrl;
            case "linkInAttachment": return LinkInAttachment;
            case "linkToMalwareFile": return LinkToMalwareFile;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
