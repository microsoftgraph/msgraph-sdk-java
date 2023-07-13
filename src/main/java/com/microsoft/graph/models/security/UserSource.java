package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserSource extends DataSource implements Parsable {
    /**
     * Email address of the user's mailbox.
     */
    private String email;
    /**
     * Specifies which sources are included in this group. Possible values are: mailbox, site.
     */
    private SourceType includedSources;
    /**
     * The URL of the user's OneDrive for Business site. Read-only.
     */
    private String siteWebUrl;
    /**
     * Instantiates a new userSource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserSource() {
        super();
        this.setOdataType("#microsoft.graph.security.userSource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userSource
     */
    @javax.annotation.Nonnull
    public static UserSource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSource();
    }
    /**
     * Gets the email property value. Email address of the user's mailbox.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("includedSources", (n) -> { this.setIncludedSources(n.getEnumValue(SourceType.class)); });
        deserializerMap.put("siteWebUrl", (n) -> { this.setSiteWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includedSources property value. Specifies which sources are included in this group. Possible values are: mailbox, site.
     * @return a sourceType
     */
    @javax.annotation.Nullable
    public SourceType getIncludedSources() {
        return this.includedSources;
    }
    /**
     * Gets the siteWebUrl property value. The URL of the user's OneDrive for Business site. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSiteWebUrl() {
        return this.siteWebUrl;
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
        writer.writeStringValue("email", this.getEmail());
        writer.writeEnumValue("includedSources", this.getIncludedSources());
        writer.writeStringValue("siteWebUrl", this.getSiteWebUrl());
    }
    /**
     * Sets the email property value. Email address of the user's mailbox.
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the includedSources property value. Specifies which sources are included in this group. Possible values are: mailbox, site.
     * @param value Value to set for the includedSources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludedSources(@javax.annotation.Nullable final SourceType value) {
        this.includedSources = value;
    }
    /**
     * Sets the siteWebUrl property value. The URL of the user's OneDrive for Business site. Read-only.
     * @param value Value to set for the siteWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiteWebUrl(@javax.annotation.Nullable final String value) {
        this.siteWebUrl = value;
    }
}
