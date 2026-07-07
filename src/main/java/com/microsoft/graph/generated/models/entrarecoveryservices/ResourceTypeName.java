package com.microsoft.graph.models.entrarecoveryservices;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ResourceTypeName implements ValuedEnum {
    /** Represents the user entity */
    User("user"),
    /** Represents the group entity */
    Group("group"),
    /** Represents the conditional access policy entity */
    ConditionalAccessPolicy("conditionalAccessPolicy"),
    /** Represents the named location policy entity */
    NamedLocationPolicy("namedLocationPolicy"),
    /** Represents the authentication method policy entity */
    AuthenticationMethodPolicy("authenticationMethodPolicy"),
    /** Represents the authorization policy entity */
    AuthorizationPolicy("authorizationPolicy"),
    /** Represents the authentication strength policy entity */
    AuthenticationStrengthPolicy("authenticationStrengthPolicy"),
    /** Represents the application entity */
    Application("application"),
    /** Represents the service principal entity */
    ServicePrincipal("servicePrincipal"),
    /** This will help in making this enum evolable and adding more values in the future. */
    UnknownFutureValue("unknownFutureValue"),
    /** Represents the oAuth2PermissionGrant entity. */
    OAuth2PermissionGrant("oAuth2PermissionGrant"),
    /** Represents the appRoleAssignment entity. */
    AppRoleAssignment("appRoleAssignment"),
    /** Represents the organization entity. */
    Organization("organization");
    public final String value;
    ResourceTypeName(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ResourceTypeName forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "group": return Group;
            case "conditionalAccessPolicy": return ConditionalAccessPolicy;
            case "namedLocationPolicy": return NamedLocationPolicy;
            case "authenticationMethodPolicy": return AuthenticationMethodPolicy;
            case "authorizationPolicy": return AuthorizationPolicy;
            case "authenticationStrengthPolicy": return AuthenticationStrengthPolicy;
            case "application": return Application;
            case "servicePrincipal": return ServicePrincipal;
            case "unknownFutureValue": return UnknownFutureValue;
            case "oAuth2PermissionGrant": return OAuth2PermissionGrant;
            case "appRoleAssignment": return AppRoleAssignment;
            case "organization": return Organization;
            default: return null;
        }
    }
}
