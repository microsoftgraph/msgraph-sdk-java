package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TeamsAsyncOperationType implements ValuedEnum {
    Invalid("invalid"),
    CloneTeam("cloneTeam"),
    ArchiveTeam("archiveTeam"),
    UnarchiveTeam("unarchiveTeam"),
    CreateTeam("createTeam"),
    UnknownFutureValue("unknownFutureValue"),
    TeamifyGroup("teamifyGroup"),
    CreateChannel("createChannel");
    public final String value;
    TeamsAsyncOperationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TeamsAsyncOperationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "invalid": return Invalid;
            case "cloneTeam": return CloneTeam;
            case "archiveTeam": return ArchiveTeam;
            case "unarchiveTeam": return UnarchiveTeam;
            case "createTeam": return CreateTeam;
            case "unknownFutureValue": return UnknownFutureValue;
            case "teamifyGroup": return TeamifyGroup;
            case "createChannel": return CreateChannel;
            default: return null;
        }
    }
}
