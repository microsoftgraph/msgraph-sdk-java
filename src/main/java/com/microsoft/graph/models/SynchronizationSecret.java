package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SynchronizationSecret implements ValuedEnum {
    None("None"),
    UserName("UserName"),
    Password("Password"),
    SecretToken("SecretToken"),
    AppKey("AppKey"),
    BaseAddress("BaseAddress"),
    ClientIdentifier("ClientIdentifier"),
    ClientSecret("ClientSecret"),
    SingleSignOnType("SingleSignOnType"),
    Sandbox("Sandbox"),
    Url("Url"),
    Domain("Domain"),
    ConsumerKey("ConsumerKey"),
    ConsumerSecret("ConsumerSecret"),
    TokenKey("TokenKey"),
    TokenExpiration("TokenExpiration"),
    Oauth2AccessToken("Oauth2AccessToken"),
    Oauth2AccessTokenCreationTime("Oauth2AccessTokenCreationTime"),
    Oauth2RefreshToken("Oauth2RefreshToken"),
    SyncAll("SyncAll"),
    InstanceName("InstanceName"),
    Oauth2ClientId("Oauth2ClientId"),
    Oauth2ClientSecret("Oauth2ClientSecret"),
    CompanyId("CompanyId"),
    UpdateKeyOnSoftDelete("UpdateKeyOnSoftDelete"),
    SynchronizationSchedule("SynchronizationSchedule"),
    SystemOfRecord("SystemOfRecord"),
    SandboxName("SandboxName"),
    EnforceDomain("EnforceDomain"),
    SyncNotificationSettings("SyncNotificationSettings"),
    SkipOutOfScopeDeletions("SkipOutOfScopeDeletions"),
    Oauth2AuthorizationCode("Oauth2AuthorizationCode"),
    Oauth2RedirectUri("Oauth2RedirectUri"),
    ApplicationTemplateIdentifier("ApplicationTemplateIdentifier"),
    Oauth2TokenExchangeUri("Oauth2TokenExchangeUri"),
    Oauth2AuthorizationUri("Oauth2AuthorizationUri"),
    AuthenticationType("AuthenticationType"),
    Server("Server"),
    PerformInboundEntitlementGrants("PerformInboundEntitlementGrants"),
    HardDeletesEnabled("HardDeletesEnabled"),
    SyncAgentCompatibilityKey("SyncAgentCompatibilityKey"),
    SyncAgentADContainer("SyncAgentADContainer"),
    ValidateDomain("ValidateDomain"),
    TestReferences("TestReferences"),
    ConnectionString("ConnectionString");
    public final String value;
    SynchronizationSecret(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SynchronizationSecret forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "None": return None;
            case "UserName": return UserName;
            case "Password": return Password;
            case "SecretToken": return SecretToken;
            case "AppKey": return AppKey;
            case "BaseAddress": return BaseAddress;
            case "ClientIdentifier": return ClientIdentifier;
            case "ClientSecret": return ClientSecret;
            case "SingleSignOnType": return SingleSignOnType;
            case "Sandbox": return Sandbox;
            case "Url": return Url;
            case "Domain": return Domain;
            case "ConsumerKey": return ConsumerKey;
            case "ConsumerSecret": return ConsumerSecret;
            case "TokenKey": return TokenKey;
            case "TokenExpiration": return TokenExpiration;
            case "Oauth2AccessToken": return Oauth2AccessToken;
            case "Oauth2AccessTokenCreationTime": return Oauth2AccessTokenCreationTime;
            case "Oauth2RefreshToken": return Oauth2RefreshToken;
            case "SyncAll": return SyncAll;
            case "InstanceName": return InstanceName;
            case "Oauth2ClientId": return Oauth2ClientId;
            case "Oauth2ClientSecret": return Oauth2ClientSecret;
            case "CompanyId": return CompanyId;
            case "UpdateKeyOnSoftDelete": return UpdateKeyOnSoftDelete;
            case "SynchronizationSchedule": return SynchronizationSchedule;
            case "SystemOfRecord": return SystemOfRecord;
            case "SandboxName": return SandboxName;
            case "EnforceDomain": return EnforceDomain;
            case "SyncNotificationSettings": return SyncNotificationSettings;
            case "SkipOutOfScopeDeletions": return SkipOutOfScopeDeletions;
            case "Oauth2AuthorizationCode": return Oauth2AuthorizationCode;
            case "Oauth2RedirectUri": return Oauth2RedirectUri;
            case "ApplicationTemplateIdentifier": return ApplicationTemplateIdentifier;
            case "Oauth2TokenExchangeUri": return Oauth2TokenExchangeUri;
            case "Oauth2AuthorizationUri": return Oauth2AuthorizationUri;
            case "AuthenticationType": return AuthenticationType;
            case "Server": return Server;
            case "PerformInboundEntitlementGrants": return PerformInboundEntitlementGrants;
            case "HardDeletesEnabled": return HardDeletesEnabled;
            case "SyncAgentCompatibilityKey": return SyncAgentCompatibilityKey;
            case "SyncAgentADContainer": return SyncAgentADContainer;
            case "ValidateDomain": return ValidateDomain;
            case "TestReferences": return TestReferences;
            case "ConnectionString": return ConnectionString;
            default: return null;
        }
    }
}
