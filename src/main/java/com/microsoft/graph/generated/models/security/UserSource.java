package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserSource extends DataSource implements Parsable {
    /**
     * Instantiates a new UserSource and sets the default values.
     */
    public UserSource() {
        super();
        this.setOdataType("#microsoft.graph.security.userSource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserSource
     */
    @jakarta.annotation.Nonnull
    public static UserSource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSource();
    }
    /**
     * Gets the email property value. Email address of the user's mailbox.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.backingStore.get("email");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("includedSources", (n) -> { this.setIncludedSources(n.getEnumSetValue(SourceType::forValue)); });
        deserializerMap.put("siteWebUrl", (n) -> { this.setSiteWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includedSources property value. Specifies which sources are included in this group. Possible values are: mailbox, site.
     * @return a EnumSet<SourceType>
     */
    @jakarta.annotation.Nullable
    public EnumSet<SourceType> getIncludedSources() {
        return this.backingStore.get("includedSources");
    }
    /**
     * Gets the siteWebUrl property value. The URL of the user's OneDrive for Business site. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSiteWebUrl() {
        return this.backingStore.get("siteWebUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("email", this.getEmail());
        writer.writeEnumSetValue("includedSources", this.getIncludedSources());
        writer.writeStringValue("siteWebUrl", this.getSiteWebUrl());
    }
    /**
     * Sets the email property value. Email address of the user's mailbox.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("email", value);
    }
    /**
     * Sets the includedSources property value. Specifies which sources are included in this group. Possible values are: mailbox, site.
     * @param value Value to set for the includedSources property.
     */
    public void setIncludedSources(@jakarta.annotation.Nullable final EnumSet<SourceType> value) {
        this.backingStore.set("includedSources", value);
    }
    /**
     * Sets the siteWebUrl property value. The URL of the user's OneDrive for Business site. Read-only.
     * @param value Value to set for the siteWebUrl property.
     */
    public void setSiteWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("siteWebUrl", value);
    }
}
