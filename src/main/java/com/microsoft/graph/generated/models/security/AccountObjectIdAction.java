package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccountObjectIdAction extends AutomatedAction implements Parsable {
    /**
     * Instantiates a new {@link AccountObjectIdAction} and sets the default values.
     */
    public AccountObjectIdAction() {
        super();
        this.setOdataType("#microsoft.graph.security.accountObjectIdAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccountObjectIdAction}
     */
    @jakarta.annotation.Nonnull
    public static AccountObjectIdAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccountObjectIdAction();
    }
    /**
     * Gets the accountObjectIdColumn property value. Name of the hunting-query result column that contains the Microsoft Entra object ID of the targeted account.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccountObjectIdColumn() {
        return this.backingStore.get("accountObjectIdColumn");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountObjectIdColumn", (n) -> { this.setAccountObjectIdColumn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accountObjectIdColumn", this.getAccountObjectIdColumn());
    }
    /**
     * Sets the accountObjectIdColumn property value. Name of the hunting-query result column that contains the Microsoft Entra object ID of the targeted account.
     * @param value Value to set for the accountObjectIdColumn property.
     */
    public void setAccountObjectIdColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accountObjectIdColumn", value);
    }
}
