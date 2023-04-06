package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewNotificationRecipientItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Determines the recipient of the notification email. */
    private AccessReviewNotificationRecipientScope notificationRecipientScope;
    /** Indicates the type of access review email to be sent. Supported template type is CompletedAdditionalRecipients, which sends review completion notifications to the recipients. */
    private String notificationTemplateType;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new accessReviewNotificationRecipientItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessReviewNotificationRecipientItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewNotificationRecipientItem
     */
    @javax.annotation.Nonnull
    public static AccessReviewNotificationRecipientItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewNotificationRecipientItem();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("notificationRecipientScope", (n) -> { this.setNotificationRecipientScope(n.getObjectValue(AccessReviewNotificationRecipientScope::createFromDiscriminatorValue)); });
        deserializerMap.put("notificationTemplateType", (n) -> { this.setNotificationTemplateType(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notificationRecipientScope property value. Determines the recipient of the notification email.
     * @return a accessReviewNotificationRecipientScope
     */
    @javax.annotation.Nullable
    public AccessReviewNotificationRecipientScope getNotificationRecipientScope() {
        return this.notificationRecipientScope;
    }
    /**
     * Gets the notificationTemplateType property value. Indicates the type of access review email to be sent. Supported template type is CompletedAdditionalRecipients, which sends review completion notifications to the recipients.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationTemplateType() {
        return this.notificationTemplateType;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("notificationRecipientScope", this.getNotificationRecipientScope());
        writer.writeStringValue("notificationTemplateType", this.getNotificationTemplateType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the notificationRecipientScope property value. Determines the recipient of the notification email.
     * @param value Value to set for the notificationRecipientScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationRecipientScope(@javax.annotation.Nullable final AccessReviewNotificationRecipientScope value) {
        this.notificationRecipientScope = value;
    }
    /**
     * Sets the notificationTemplateType property value. Indicates the type of access review email to be sent. Supported template type is CompletedAdditionalRecipients, which sends review completion notifications to the recipients.
     * @param value Value to set for the notificationTemplateType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationTemplateType(@javax.annotation.Nullable final String value) {
        this.notificationTemplateType = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
