package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DomainDnsMxRecord extends DomainDnsRecord implements Parsable {
    /**
     * Instantiates a new DomainDnsMxRecord and sets the default values.
     */
    public DomainDnsMxRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DomainDnsMxRecord
     */
    @jakarta.annotation.Nonnull
    public static DomainDnsMxRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DomainDnsMxRecord();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("mailExchange", (n) -> { this.setMailExchange(n.getStringValue()); });
        deserializerMap.put("preference", (n) -> { this.setPreference(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mailExchange property value. Value used when configuring the answer/destination/value of the MX record at the DNS host.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMailExchange() {
        return this.backingStore.get("mailExchange");
    }
    /**
     * Gets the preference property value. Value used when configuring the Preference/Priority property of the MX record at the DNS host.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPreference() {
        return this.backingStore.get("preference");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("mailExchange", this.getMailExchange());
        writer.writeIntegerValue("preference", this.getPreference());
    }
    /**
     * Sets the mailExchange property value. Value used when configuring the answer/destination/value of the MX record at the DNS host.
     * @param value Value to set for the mailExchange property.
     */
    public void setMailExchange(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mailExchange", value);
    }
    /**
     * Sets the preference property value. Value used when configuring the Preference/Priority property of the MX record at the DNS host.
     * @param value Value to set for the preference property.
     */
    public void setPreference(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("preference", value);
    }
}
