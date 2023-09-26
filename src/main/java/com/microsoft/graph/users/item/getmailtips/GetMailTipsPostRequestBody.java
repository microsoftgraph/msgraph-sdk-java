package com.microsoft.graph.users.item.getmailtips;

import com.microsoft.graph.models.MailTipsType;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetMailTipsPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The EmailAddresses property
     */
    private java.util.List<String> emailAddresses;
    /**
     * The MailTipsOptions property
     */
    private EnumSet<MailTipsType> mailTipsOptions;
    /**
     * Instantiates a new GetMailTipsPostRequestBody and sets the default values.
     */
    public GetMailTipsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GetMailTipsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static GetMailTipsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetMailTipsPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the EmailAddresses property value. The EmailAddresses property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEmailAddresses() {
        return this.emailAddresses;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("EmailAddresses", (n) -> { this.setEmailAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("MailTipsOptions", (n) -> { this.setMailTipsOptions(n.getEnumSetValue(MailTipsType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the MailTipsOptions property value. The MailTipsOptions property
     * @return a EnumSet<MailTipsType>
     */
    @jakarta.annotation.Nullable
    public EnumSet<MailTipsType> getMailTipsOptions() {
        return this.mailTipsOptions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("EmailAddresses", this.getEmailAddresses());
        writer.writeEnumSetValue("MailTipsOptions", this.getMailTipsOptions());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the EmailAddresses property value. The EmailAddresses property
     * @param value Value to set for the EmailAddresses property.
     */
    public void setEmailAddresses(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.emailAddresses = value;
    }
    /**
     * Sets the MailTipsOptions property value. The MailTipsOptions property
     * @param value Value to set for the MailTipsOptions property.
     */
    public void setMailTipsOptions(@jakarta.annotation.Nullable final EnumSet<MailTipsType> value) {
        this.mailTipsOptions = value;
    }
}
