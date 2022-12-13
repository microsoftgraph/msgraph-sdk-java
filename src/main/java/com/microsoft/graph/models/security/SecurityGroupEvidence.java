package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SecurityGroupEvidence extends AlertEvidence implements Parsable {
    /** The displayName property */
    private String _displayName;
    /** The securityGroupId property */
    private String _securityGroupId;
    /**
     * Instantiates a new SecurityGroupEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SecurityGroupEvidence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SecurityGroupEvidence
     */
    @javax.annotation.Nonnull
    public static SecurityGroupEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityGroupEvidence();
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("securityGroupId", (n) -> { this.setSecurityGroupId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the securityGroupId property value. The securityGroupId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSecurityGroupId() {
        return this._securityGroupId;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("securityGroupId", this.getSecurityGroupId());
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the securityGroupId property value. The securityGroupId property
     * @param value Value to set for the securityGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityGroupId(@javax.annotation.Nullable final String value) {
        this._securityGroupId = value;
    }
}
