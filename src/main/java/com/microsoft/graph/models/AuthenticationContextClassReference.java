package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class AuthenticationContextClassReference extends Entity implements Parsable {
    /** The description property */
    private String _description;
    /** The displayName property */
    private String _displayName;
    /** The isAvailable property */
    private Boolean _isAvailable;
    /**
     * Instantiates a new authenticationContextClassReference and sets the default values.
     * @return a void
     */
    public AuthenticationContextClassReference() {
        super();
        this.setOdataType("#microsoft.graph.authenticationContextClassReference");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationContextClassReference
     */
    @javax.annotation.Nonnull
    public static AuthenticationContextClassReference createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationContextClassReference();
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
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
        final AuthenticationContextClassReference currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isAvailable", (n) -> { currentObject.setIsAvailable(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isAvailable property value. The isAvailable property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAvailable() {
        return this._isAvailable;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isAvailable", this.getIsAvailable());
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isAvailable property value. The isAvailable property
     * @param value Value to set for the isAvailable property.
     * @return a void
     */
    public void setIsAvailable(@javax.annotation.Nullable final Boolean value) {
        this._isAvailable = value;
    }
}
