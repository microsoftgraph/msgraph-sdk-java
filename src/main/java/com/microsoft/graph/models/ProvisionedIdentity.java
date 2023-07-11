package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProvisionedIdentity extends Identity implements Parsable {
    /**
     * Details of the identity.
     */
    private DetailsInfo details;
    /**
     * Type of identity that has been provisioned, such as 'user' or 'group'.
     */
    private String identityType;
    /**
     * Instantiates a new provisionedIdentity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProvisionedIdentity() {
        super();
        this.setOdataType("#microsoft.graph.provisionedIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a provisionedIdentity
     */
    @javax.annotation.Nonnull
    public static ProvisionedIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProvisionedIdentity();
    }
    /**
     * Gets the details property value. Details of the identity.
     * @return a detailsInfo
     */
    @javax.annotation.Nullable
    public DetailsInfo getDetails() {
        return this.details;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("details", (n) -> { this.setDetails(n.getObjectValue(DetailsInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("identityType", (n) -> { this.setIdentityType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityType property value. Type of identity that has been provisioned, such as 'user' or 'group'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityType() {
        return this.identityType;
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
        writer.writeObjectValue("details", this.getDetails());
        writer.writeStringValue("identityType", this.getIdentityType());
    }
    /**
     * Sets the details property value. Details of the identity.
     * @param value Value to set for the details property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetails(@javax.annotation.Nullable final DetailsInfo value) {
        this.details = value;
    }
    /**
     * Sets the identityType property value. Type of identity that has been provisioned, such as 'user' or 'group'.
     * @param value Value to set for the identityType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityType(@javax.annotation.Nullable final String value) {
        this.identityType = value;
    }
}
