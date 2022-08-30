package com.microsoft.graph.me.getmailtips;

import com.microsoft.graph.models.MailTipsType;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the getMailTips method. */
public class GetMailTipsPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The EmailAddresses property */
    private java.util.List<String> _emailAddresses;
    /** The MailTipsOptions property */
    private MailTipsType _mailTipsOptions;
    /**
     * Instantiates a new getMailTipsPostRequestBody and sets the default values.
     * @return a void
     */
    public GetMailTipsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getMailTipsPostRequestBody
     */
    @javax.annotation.Nonnull
    public static GetMailTipsPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetMailTipsPostRequestBody();
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
     * Gets the emailAddresses property value. The EmailAddresses property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEmailAddresses() {
        return this._emailAddresses;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GetMailTipsPostRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("emailAddresses", (n) -> { currentObject.setEmailAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("mailTipsOptions", (n) -> { currentObject.setMailTipsOptions(n.getEnumValue(MailTipsType.class)); });
        }};
    }
    /**
     * Gets the mailTipsOptions property value. The MailTipsOptions property
     * @return a mailTipsType
     */
    @javax.annotation.Nullable
    public MailTipsType getMailTipsOptions() {
        return this._mailTipsOptions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("emailAddresses", this.getEmailAddresses());
        writer.writeEnumValue("mailTipsOptions", this.getMailTipsOptions());
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
     * Sets the emailAddresses property value. The EmailAddresses property
     * @param value Value to set for the EmailAddresses property.
     * @return a void
     */
    public void setEmailAddresses(@javax.annotation.Nullable final java.util.List<String> value) {
        this._emailAddresses = value;
    }
    /**
     * Sets the mailTipsOptions property value. The MailTipsOptions property
     * @param value Value to set for the MailTipsOptions property.
     * @return a void
     */
    public void setMailTipsOptions(@javax.annotation.Nullable final MailTipsType value) {
        this._mailTipsOptions = value;
    }
}
