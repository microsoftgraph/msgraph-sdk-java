package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UsageRights implements ValuedEnum {
    Unknown("unknown"),
    DocEdit("docEdit"),
    Edit("edit"),
    Comment("comment"),
    Export("export"),
    Forward("forward"),
    Owner("owner"),
    Print("print"),
    Reply("reply"),
    ReplyAll("replyAll"),
    View("view"),
    Extract("extract"),
    ViewRightsData("viewRightsData"),
    EditRightsData("editRightsData"),
    ObjModel("objModel"),
    AccessDenied("accessDenied"),
    UserDefinedProtectionTypeNotSupportedException("userDefinedProtectionTypeNotSupportedException"),
    EncryptedProtectionTypeNotSupportedException("encryptedProtectionTypeNotSupportedException"),
    PurviewClaimsChallengeNotSupportedException("purviewClaimsChallengeNotSupportedException"),
    Exception("exception"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UsageRights(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UsageRights forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "docEdit": return DocEdit;
            case "edit": return Edit;
            case "comment": return Comment;
            case "export": return Export;
            case "forward": return Forward;
            case "owner": return Owner;
            case "print": return Print;
            case "reply": return Reply;
            case "replyAll": return ReplyAll;
            case "view": return View;
            case "extract": return Extract;
            case "viewRightsData": return ViewRightsData;
            case "editRightsData": return EditRightsData;
            case "objModel": return ObjModel;
            case "accessDenied": return AccessDenied;
            case "userDefinedProtectionTypeNotSupportedException": return UserDefinedProtectionTypeNotSupportedException;
            case "encryptedProtectionTypeNotSupportedException": return EncryptedProtectionTypeNotSupportedException;
            case "purviewClaimsChallengeNotSupportedException": return PurviewClaimsChallengeNotSupportedException;
            case "exception": return Exception;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
