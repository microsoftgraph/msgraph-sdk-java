package com.microsoft.graph.drive.items.item.permissions.item.grant;

import com.microsoft.graph.models.DriveRecipient;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the grant method. */
public class GrantPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The recipients property */
    private java.util.List<DriveRecipient> _recipients;
    /** The roles property */
    private java.util.List<String> _roles;
    /**
     * Instantiates a new grantPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GrantPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a grantPostRequestBody
     */
    @javax.annotation.Nonnull
    public static GrantPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GrantPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GrantPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(2);
        deserializerMap.put("recipients", (n) -> { currentObject.setRecipients(n.getCollectionOfObjectValues(DriveRecipient::createFromDiscriminatorValue)); });
        deserializerMap.put("roles", (n) -> { currentObject.setRoles(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the recipients property value. The recipients property
     * @return a driveRecipient
     */
    @javax.annotation.Nullable
    public java.util.List<DriveRecipient> getRecipients() {
        return this._recipients;
    }
    /**
     * Gets the roles property value. The roles property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoles() {
        return this._roles;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("recipients", this.getRecipients());
        writer.writeCollectionOfPrimitiveValues("roles", this.getRoles());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the recipients property value. The recipients property
     * @param value Value to set for the recipients property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipients(@javax.annotation.Nullable final java.util.List<DriveRecipient> value) {
        this._recipients = value;
    }
    /**
     * Sets the roles property value. The roles property
     * @param value Value to set for the roles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoles(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roles = value;
    }
}
