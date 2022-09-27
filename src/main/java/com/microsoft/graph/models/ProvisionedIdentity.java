package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProvisionedIdentity extends Identity implements Parsable {
    /** Details of the identity. */
    private DetailsInfo _details;
    /** Type of identity that has been provisioned, such as 'user' or 'group'. */
    private String _identityType;
    /**
     * Instantiates a new ProvisionedIdentity and sets the default values.
     * @return a void
     */
    public ProvisionedIdentity() {
        super();
        this.setOdataType("#microsoft.graph.provisionedIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProvisionedIdentity
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
        return this._details;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ProvisionedIdentity currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("details", (n) -> { currentObject.setDetails(n.getObjectValue(DetailsInfo::createFromDiscriminatorValue)); });
            this.put("identityType", (n) -> { currentObject.setIdentityType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the identityType property value. Type of identity that has been provisioned, such as 'user' or 'group'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityType() {
        return this._identityType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setDetails(@javax.annotation.Nullable final DetailsInfo value) {
        this._details = value;
    }
    /**
     * Sets the identityType property value. Type of identity that has been provisioned, such as 'user' or 'group'.
     * @param value Value to set for the identityType property.
     * @return a void
     */
    public void setIdentityType(@javax.annotation.Nullable final String value) {
        this._identityType = value;
    }
}
