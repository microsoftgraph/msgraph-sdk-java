package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MailboxProtectionRule extends ProtectionRuleBase implements Parsable {
    /**
     * Instantiates a new {@link MailboxProtectionRule} and sets the default values.
     */
    public MailboxProtectionRule() {
        super();
        this.setOdataType("#microsoft.graph.mailboxProtectionRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MailboxProtectionRule}
     */
    @jakarta.annotation.Nonnull
    public static MailboxProtectionRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailboxProtectionRule();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("mailboxExpression", (n) -> { this.setMailboxExpression(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mailboxExpression property value. Contains a mailbox expression. For examples, see mailboxExpression examples.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMailboxExpression() {
        return this.backingStore.get("mailboxExpression");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("mailboxExpression", this.getMailboxExpression());
    }
    /**
     * Sets the mailboxExpression property value. Contains a mailbox expression. For examples, see mailboxExpression examples.
     * @param value Value to set for the mailboxExpression property.
     */
    public void setMailboxExpression(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mailboxExpression", value);
    }
}
