package com.microsoft.graph.domains.item.forcedelete;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the forceDelete method. */
public class ForceDeletePostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The disableUserAccounts property */
    private Boolean _disableUserAccounts;
    /**
     * Instantiates a new forceDeletePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ForceDeletePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a forceDeletePostRequestBody
     */
    @javax.annotation.Nonnull
    public static ForceDeletePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ForceDeletePostRequestBody();
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
     * Gets the disableUserAccounts property value. The disableUserAccounts property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableUserAccounts() {
        return this._disableUserAccounts;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ForceDeletePostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(1);
        deserializerMap.put("disableUserAccounts", (n) -> { currentObject.setDisableUserAccounts(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("disableUserAccounts", this.getDisableUserAccounts());
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
     * Sets the disableUserAccounts property value. The disableUserAccounts property
     * @param value Value to set for the disableUserAccounts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisableUserAccounts(@javax.annotation.Nullable final Boolean value) {
        this._disableUserAccounts = value;
    }
}
