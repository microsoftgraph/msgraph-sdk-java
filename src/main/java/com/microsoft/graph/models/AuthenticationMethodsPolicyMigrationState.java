package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AuthenticationMethodsPolicyMigrationState implements ValuedEnum {
    PreMigration("preMigration"),
    MigrationInProgress("migrationInProgress"),
    MigrationComplete("migrationComplete"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationMethodsPolicyMigrationState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AuthenticationMethodsPolicyMigrationState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "preMigration": return PreMigration;
            case "migrationInProgress": return MigrationInProgress;
            case "migrationComplete": return MigrationComplete;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
