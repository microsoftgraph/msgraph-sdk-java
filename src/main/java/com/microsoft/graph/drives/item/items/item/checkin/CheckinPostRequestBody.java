package com.microsoft.graph.drives.item.items.item.checkin;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CheckinPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The checkInAs property */
    private String checkInAs;
    /** The comment property */
    private String comment;
    /**
     * Instantiates a new checkinPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CheckinPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a checkinPostRequestBody
     */
    @javax.annotation.Nonnull
    public static CheckinPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CheckinPostRequestBody();
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
     * Gets the checkInAs property value. The checkInAs property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCheckInAs() {
        return this.checkInAs;
    }
    /**
     * Gets the comment property value. The comment property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComment() {
        return this.comment;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("checkInAs", (n) -> { this.setCheckInAs(n.getStringValue()); });
        deserializerMap.put("comment", (n) -> { this.setComment(n.getStringValue()); });
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
        writer.writeStringValue("checkInAs", this.getCheckInAs());
        writer.writeStringValue("comment", this.getComment());
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
     * Sets the checkInAs property value. The checkInAs property
     * @param value Value to set for the checkInAs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCheckInAs(@javax.annotation.Nullable final String value) {
        this.checkInAs = value;
    }
    /**
     * Sets the comment property value. The comment property
     * @param value Value to set for the comment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComment(@javax.annotation.Nullable final String value) {
        this.comment = value;
    }
}
