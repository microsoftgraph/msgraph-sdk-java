package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccountSidAction extends AutomatedAction implements Parsable {
    /**
     * Instantiates a new {@link AccountSidAction} and sets the default values.
     */
    public AccountSidAction() {
        super();
        this.setOdataType("#microsoft.graph.security.accountSidAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccountSidAction}
     */
    @jakarta.annotation.Nonnull
    public static AccountSidAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountSidAction();
    }
    /**
     * Gets the accountSidColumn property value. Name of the hunting-query result column that contains the SID of the targeted account.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccountSidColumn() {
        return this.backingStore.get("accountSidColumn");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountSidColumn", (n) -> { this.setAccountSidColumn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accountSidColumn", this.getAccountSidColumn());
    }
    /**
     * Sets the accountSidColumn property value. Name of the hunting-query result column that contains the SID of the targeted account.
     * @param value Value to set for the accountSidColumn property.
     */
    public void setAccountSidColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accountSidColumn", value);
    }
}
