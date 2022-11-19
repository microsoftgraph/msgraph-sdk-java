package com.microsoft.graph.groups.item.threads.item.posts.item.forward;

import com.microsoft.graph.models.Recipient;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the forward method. */
public class ForwardPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The Comment property */
    private String _comment;
    /** The ToRecipients property */
    private java.util.List<Recipient> _toRecipients;
    /**
     * Instantiates a new forwardPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ForwardPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a forwardPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ForwardPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ForwardPostRequestBody();
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
     * Gets the comment property value. The Comment property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComment() {
        return this._comment;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ForwardPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(2);
        deserializerMap.put("comment", (n) -> { currentObject.setComment(n.getStringValue()); });
        deserializerMap.put("toRecipients", (n) -> { currentObject.setToRecipients(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the toRecipients property value. The ToRecipients property
     * @return a recipient
     */
    @javax.annotation.Nullable
    public java.util.List<Recipient> getToRecipients() {
        return this._toRecipients;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("comment", this.getComment());
        writer.writeCollectionOfObjectValues("toRecipients", this.getToRecipients());
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
     * Sets the comment property value. The Comment property
     * @param value Value to set for the Comment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComment(@javax.annotation.Nullable final String value) {
        this._comment = value;
    }
    /**
     * Sets the toRecipients property value. The ToRecipients property
     * @param value Value to set for the ToRecipients property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setToRecipients(@javax.annotation.Nullable final java.util.List<Recipient> value) {
        this._toRecipients = value;
    }
}
