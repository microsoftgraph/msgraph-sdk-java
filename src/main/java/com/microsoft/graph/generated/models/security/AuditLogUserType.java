package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuditLogUserType implements ValuedEnum {
    Regular("Regular"),
    Reserved("Reserved"),
    Admin("Admin"),
    DcAdmin("DcAdmin"),
    System("System"),
    Application("Application"),
    ServicePrincipal("ServicePrincipal"),
    CustomPolicy("CustomPolicy"),
    SystemPolicy("SystemPolicy"),
    PartnerTechnician("PartnerTechnician"),
    Guest("Guest"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuditLogUserType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuditLogUserType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Regular": return Regular;
            case "Reserved": return Reserved;
            case "Admin": return Admin;
            case "DcAdmin": return DcAdmin;
            case "System": return System;
            case "Application": return Application;
            case "ServicePrincipal": return ServicePrincipal;
            case "CustomPolicy": return CustomPolicy;
            case "SystemPolicy": return SystemPolicy;
            case "PartnerTechnician": return PartnerTechnician;
            case "Guest": return Guest;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
