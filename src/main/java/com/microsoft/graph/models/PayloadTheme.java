package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PayloadTheme implements ValuedEnum {
    Unknown("unknown"),
    Other("other"),
    AccountActivation("accountActivation"),
    AccountVerification("accountVerification"),
    Billing("billing"),
    CleanUpMail("cleanUpMail"),
    Controversial("controversial"),
    DocumentReceived("documentReceived"),
    Expense("expense"),
    Fax("fax"),
    FinanceReport("financeReport"),
    IncomingMessages("incomingMessages"),
    Invoice("invoice"),
    ItemReceived("itemReceived"),
    LoginAlert("loginAlert"),
    MailReceived("mailReceived"),
    Password("password"),
    Payment("payment"),
    Payroll("payroll"),
    PersonalizedOffer("personalizedOffer"),
    Quarantine("quarantine"),
    RemoteWork("remoteWork"),
    ReviewMessage("reviewMessage"),
    SecurityUpdate("securityUpdate"),
    ServiceSuspended("serviceSuspended"),
    SignatureRequired("signatureRequired"),
    UpgradeMailboxStorage("upgradeMailboxStorage"),
    VerifyMailbox("verifyMailbox"),
    Voicemail("voicemail"),
    Advertisement("advertisement"),
    EmployeeEngagement("employeeEngagement"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PayloadTheme(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PayloadTheme forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "other": return Other;
            case "accountActivation": return AccountActivation;
            case "accountVerification": return AccountVerification;
            case "billing": return Billing;
            case "cleanUpMail": return CleanUpMail;
            case "controversial": return Controversial;
            case "documentReceived": return DocumentReceived;
            case "expense": return Expense;
            case "fax": return Fax;
            case "financeReport": return FinanceReport;
            case "incomingMessages": return IncomingMessages;
            case "invoice": return Invoice;
            case "itemReceived": return ItemReceived;
            case "loginAlert": return LoginAlert;
            case "mailReceived": return MailReceived;
            case "password": return Password;
            case "payment": return Payment;
            case "payroll": return Payroll;
            case "personalizedOffer": return PersonalizedOffer;
            case "quarantine": return Quarantine;
            case "remoteWork": return RemoteWork;
            case "reviewMessage": return ReviewMessage;
            case "securityUpdate": return SecurityUpdate;
            case "serviceSuspended": return ServiceSuspended;
            case "signatureRequired": return SignatureRequired;
            case "upgradeMailboxStorage": return UpgradeMailboxStorage;
            case "verifyMailbox": return VerifyMailbox;
            case "voicemail": return Voicemail;
            case "advertisement": return Advertisement;
            case "employeeEngagement": return EmployeeEngagement;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
