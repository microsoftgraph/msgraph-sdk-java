package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExchangeProtectionPolicy extends ProtectionPolicyBase implements Parsable {
    /**
     * Instantiates a new {@link ExchangeProtectionPolicy} and sets the default values.
     */
    public ExchangeProtectionPolicy() {
        super();
        this.setOdataType("#microsoft.graph.exchangeProtectionPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExchangeProtectionPolicy}
     */
    @jakarta.annotation.Nonnull
    public static ExchangeProtectionPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExchangeProtectionPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("mailboxInclusionRules", (n) -> { this.setMailboxInclusionRules(n.getCollectionOfObjectValues(MailboxProtectionRule::createFromDiscriminatorValue)); });
        deserializerMap.put("mailboxProtectionUnits", (n) -> { this.setMailboxProtectionUnits(n.getCollectionOfObjectValues(MailboxProtectionUnit::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the mailboxInclusionRules property value. The rules associated with the Exchange protection policy.
     * @return a {@link java.util.List<MailboxProtectionRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MailboxProtectionRule> getMailboxInclusionRules() {
        return this.backingStore.get("mailboxInclusionRules");
    }
    /**
     * Gets the mailboxProtectionUnits property value. The protection units (mailboxes) that are  protected under the Exchange protection policy.
     * @return a {@link java.util.List<MailboxProtectionUnit>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MailboxProtectionUnit> getMailboxProtectionUnits() {
        return this.backingStore.get("mailboxProtectionUnits");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("mailboxInclusionRules", this.getMailboxInclusionRules());
        writer.writeCollectionOfObjectValues("mailboxProtectionUnits", this.getMailboxProtectionUnits());
    }
    /**
     * Sets the mailboxInclusionRules property value. The rules associated with the Exchange protection policy.
     * @param value Value to set for the mailboxInclusionRules property.
     */
    public void setMailboxInclusionRules(@jakarta.annotation.Nullable final java.util.List<MailboxProtectionRule> value) {
        this.backingStore.set("mailboxInclusionRules", value);
    }
    /**
     * Sets the mailboxProtectionUnits property value. The protection units (mailboxes) that are  protected under the Exchange protection policy.
     * @param value Value to set for the mailboxProtectionUnits property.
     */
    public void setMailboxProtectionUnits(@jakarta.annotation.Nullable final java.util.List<MailboxProtectionUnit> value) {
        this.backingStore.set("mailboxProtectionUnits", value);
    }
}
