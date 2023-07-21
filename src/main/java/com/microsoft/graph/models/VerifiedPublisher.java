package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VerifiedPublisher implements AdditionalDataHolder, Parsable {
    /**
     * The timestamp when the verified publisher was first added or most recently updated.
     */
    private OffsetDateTime addedDateTime;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The verified publisher name from the app publisher's Partner Center account.
     */
    private String displayName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The ID of the verified publisher from the app publisher's Partner Center account.
     */
    private String verifiedPublisherId;
    /**
     * Instantiates a new verifiedPublisher and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VerifiedPublisher() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a verifiedPublisher
     */
    @javax.annotation.Nonnull
    public static VerifiedPublisher createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifiedPublisher();
    }
    /**
     * Gets the addedDateTime property value. The timestamp when the verified publisher was first added or most recently updated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAddedDateTime() {
        return this.addedDateTime;
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
     * Gets the displayName property value. The verified publisher name from the app publisher's Partner Center account.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("addedDateTime", (n) -> { this.setAddedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("verifiedPublisherId", (n) -> { this.setVerifiedPublisherId(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the verifiedPublisherId property value. The ID of the verified publisher from the app publisher's Partner Center account.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVerifiedPublisherId() {
        return this.verifiedPublisherId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("addedDateTime", this.getAddedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("verifiedPublisherId", this.getVerifiedPublisherId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the addedDateTime property value. The timestamp when the verified publisher was first added or most recently updated.
     * @param value Value to set for the addedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.addedDateTime = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the displayName property value. The verified publisher name from the app publisher's Partner Center account.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the verifiedPublisherId property value. The ID of the verified publisher from the app publisher's Partner Center account.
     * @param value Value to set for the verifiedPublisherId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVerifiedPublisherId(@javax.annotation.Nullable final String value) {
        this.verifiedPublisherId = value;
    }
}
