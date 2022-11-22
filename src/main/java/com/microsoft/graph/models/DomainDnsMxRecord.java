package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DomainDnsMxRecord extends DomainDnsRecord implements Parsable {
    /** Value used when configuring the answer/destination/value of the MX record at the DNS host. */
    private String _mailExchange;
    /** Value used when configuring the Preference/Priority property of the MX record at the DNS host. */
    private Integer _preference;
    /**
     * Instantiates a new DomainDnsMxRecord and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DomainDnsMxRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DomainDnsMxRecord
     */
    @javax.annotation.Nonnull
    public static DomainDnsMxRecord createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DomainDnsMxRecord();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("mailExchange", (n) -> { this.setMailExchange(n.getStringValue()); });
        deserializerMap.put("preference", (n) -> { this.setPreference(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mailExchange property value. Value used when configuring the answer/destination/value of the MX record at the DNS host.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMailExchange() {
        return this._mailExchange;
    }
    /**
     * Gets the preference property value. Value used when configuring the Preference/Priority property of the MX record at the DNS host.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPreference() {
        return this._preference;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("mailExchange", this.getMailExchange());
        writer.writeIntegerValue("preference", this.getPreference());
    }
    /**
     * Sets the mailExchange property value. Value used when configuring the answer/destination/value of the MX record at the DNS host.
     * @param value Value to set for the mailExchange property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMailExchange(@javax.annotation.Nullable final String value) {
        this._mailExchange = value;
    }
    /**
     * Sets the preference property value. Value used when configuring the Preference/Priority property of the MX record at the DNS host.
     * @param value Value to set for the preference property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreference(@javax.annotation.Nullable final Integer value) {
        this._preference = value;
    }
}
