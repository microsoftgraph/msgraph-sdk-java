package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum MailDestinationRoutingReason implements ValuedEnum {
    None("none"),
    MailFlowRule("mailFlowRule"),
    SafeSender("safeSender"),
    BlockedSender("blockedSender"),
    AdvancedSpamFiltering("advancedSpamFiltering"),
    DomainAllowList("domainAllowList"),
    DomainBlockList("domainBlockList"),
    NotInAddressBook("notInAddressBook"),
    FirstTimeSender("firstTimeSender"),
    AutoPurgeToInbox("autoPurgeToInbox"),
    AutoPurgeToJunk("autoPurgeToJunk"),
    AutoPurgeToDeleted("autoPurgeToDeleted"),
    Outbound("outbound"),
    NotJunk("notJunk"),
    Junk("junk"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MailDestinationRoutingReason(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MailDestinationRoutingReason forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "mailFlowRule": return MailFlowRule;
            case "safeSender": return SafeSender;
            case "blockedSender": return BlockedSender;
            case "advancedSpamFiltering": return AdvancedSpamFiltering;
            case "domainAllowList": return DomainAllowList;
            case "domainBlockList": return DomainBlockList;
            case "notInAddressBook": return NotInAddressBook;
            case "firstTimeSender": return FirstTimeSender;
            case "autoPurgeToInbox": return AutoPurgeToInbox;
            case "autoPurgeToJunk": return AutoPurgeToJunk;
            case "autoPurgeToDeleted": return AutoPurgeToDeleted;
            case "outbound": return Outbound;
            case "notJunk": return NotJunk;
            case "junk": return Junk;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
