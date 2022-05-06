package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewNotificationRecipientItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Determines the recipient of the notification email.  */
    private AccessReviewNotificationRecipientScope _notificationRecipientScope;
    /** Indicates the type of access review email to be sent. Supported template type is CompletedAdditionalRecipients which sends review completion notifications to the recipients.  */
    private String _notificationTemplateType;
    /**
     * Instantiates a new accessReviewNotificationRecipientItem and sets the default values.
     * @return a void
     */
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
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessReviewNotificationRecipientItem currentObject = this;
        return new HashMap<>(2) {{
            this.put("notificationRecipientScope", (n) -> { currentObject.setNotificationRecipientScope(n.getObjectValue(AccessReviewNotificationRecipientScope::createFromDiscriminatorValue)); });
            this.put("notificationTemplateType", (n) -> { currentObject.setNotificationTemplateType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the notificationRecipientScope property value. Determines the recipient of the notification email.
     * @return a accessReviewNotificationRecipientScope
     */
    @javax.annotation.Nullable
    public AccessReviewNotificationRecipientScope getNotificationRecipientScope() {
        return this._notificationRecipientScope;
    }
    /**
     * Gets the notificationTemplateType property value. Indicates the type of access review email to be sent. Supported template type is CompletedAdditionalRecipients which sends review completion notifications to the recipients.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationTemplateType() {
        return this._notificationTemplateType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("notificationRecipientScope", this.getNotificationRecipientScope());
        writer.writeStringValue("notificationTemplateType", this.getNotificationTemplateType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the notificationRecipientScope property value. Determines the recipient of the notification email.
     * @param value Value to set for the notificationRecipientScope property.
     * @return a void
     */
    public void setNotificationRecipientScope(@javax.annotation.Nullable final AccessReviewNotificationRecipientScope value) {
        this._notificationRecipientScope = value;
    }
    /**
     * Sets the notificationTemplateType property value. Indicates the type of access review email to be sent. Supported template type is CompletedAdditionalRecipients which sends review completion notifications to the recipients.
     * @param value Value to set for the notificationTemplateType property.
     * @return a void
     */
    public void setNotificationTemplateType(@javax.annotation.Nullable final String value) {
        this._notificationTemplateType = value;
    }
}
