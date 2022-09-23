package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum AccessPackageRequestType implements ValuedEnum {
    NotSpecified("notSpecified"),
    UserAdd("userAdd"),
    UserUpdate("userUpdate"),
    UserRemove("userRemove"),
    AdminAdd("adminAdd"),
    AdminUpdate("adminUpdate"),
    AdminRemove("adminRemove"),
    SystemAdd("systemAdd"),
    SystemUpdate("systemUpdate"),
    SystemRemove("systemRemove"),
    OnBehalfAdd("onBehalfAdd"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessPackageRequestType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccessPackageRequestType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSpecified": return NotSpecified;
            case "userAdd": return UserAdd;
            case "userUpdate": return UserUpdate;
            case "userRemove": return UserRemove;
            case "adminAdd": return AdminAdd;
            case "adminUpdate": return AdminUpdate;
            case "adminRemove": return AdminRemove;
            case "systemAdd": return SystemAdd;
            case "systemUpdate": return SystemUpdate;
            case "systemRemove": return SystemRemove;
            case "onBehalfAdd": return OnBehalfAdd;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
