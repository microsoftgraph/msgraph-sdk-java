package com.microsoft.graph.me.changepassword;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the changePassword method. */
public class ChangePasswordPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The currentPassword property */
    private String _currentPassword;
    /** The newPassword property */
    private String _newPassword;
    /**
     * Instantiates a new changePasswordPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChangePasswordPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a changePasswordPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ChangePasswordPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChangePasswordPostRequestBody();
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
     * Gets the currentPassword property value. The currentPassword property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCurrentPassword() {
        return this._currentPassword;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ChangePasswordPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(2);
        deserializerMap.put("currentPassword", (n) -> { currentObject.setCurrentPassword(n.getStringValue()); });
        deserializerMap.put("newPassword", (n) -> { currentObject.setNewPassword(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the newPassword property value. The newPassword property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNewPassword() {
        return this._newPassword;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("currentPassword", this.getCurrentPassword());
        writer.writeStringValue("newPassword", this.getNewPassword());
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
     * Sets the currentPassword property value. The currentPassword property
     * @param value Value to set for the currentPassword property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrentPassword(@javax.annotation.Nullable final String value) {
        this._currentPassword = value;
    }
    /**
     * Sets the newPassword property value. The newPassword property
     * @param value Value to set for the newPassword property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNewPassword(@javax.annotation.Nullable final String value) {
        this._newPassword = value;
    }
}
