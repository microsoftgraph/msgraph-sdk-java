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
    /** A short explanation of the policies that are enforced by authenticationContextClassReference. This value should be used to provide secondary text to describe the authentication context class reference when building user-facing admin experiences. For example, a selection UX. */
    private String _description;
    /** The display name is the friendly name of the authenticationContextClassReference object. This value should be used to identify the authentication context class reference when building user-facing admin experiences. For example, a selection UX. */
    private String _displayName;
    /** Indicates whether the authenticationContextClassReference has been published by the security admin and is ready for use by apps. When it is set to false, it should not be shown in authentication context selection UX, or used to protect app resources. It will be shown and available for Conditional Access policy authoring. The default value is false.  Supports $filter (eq). */
    private Boolean _isAvailable;
    /**
     * Instantiates a new authenticationContextClassReference and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationContextClassReference() {
        super();
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
     * Gets the description property value. A short explanation of the policies that are enforced by authenticationContextClassReference. This value should be used to provide secondary text to describe the authentication context class reference when building user-facing admin experiences. For example, a selection UX.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name is the friendly name of the authenticationContextClassReference object. This value should be used to identify the authentication context class reference when building user-facing admin experiences. For example, a selection UX.
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
     * Gets the isAvailable property value. Indicates whether the authenticationContextClassReference has been published by the security admin and is ready for use by apps. When it is set to false, it should not be shown in authentication context selection UX, or used to protect app resources. It will be shown and available for Conditional Access policy authoring. The default value is false.  Supports $filter (eq).
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isAvailable", this.getIsAvailable());
    }
    /**
     * Sets the description property value. A short explanation of the policies that are enforced by authenticationContextClassReference. This value should be used to provide secondary text to describe the authentication context class reference when building user-facing admin experiences. For example, a selection UX.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name is the friendly name of the authenticationContextClassReference object. This value should be used to identify the authentication context class reference when building user-facing admin experiences. For example, a selection UX.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isAvailable property value. Indicates whether the authenticationContextClassReference has been published by the security admin and is ready for use by apps. When it is set to false, it should not be shown in authentication context selection UX, or used to protect app resources. It will be shown and available for Conditional Access policy authoring. The default value is false.  Supports $filter (eq).
     * @param value Value to set for the isAvailable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAvailable(@javax.annotation.Nullable final Boolean value) {
        this._isAvailable = value;
    }
}
