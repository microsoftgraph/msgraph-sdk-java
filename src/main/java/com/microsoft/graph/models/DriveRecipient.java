package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DriveRecipient implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The alias of the domain object, for cases where an email address is unavailable (e.g. security groups). */
    private String _alias;
    /** The email address for the recipient, if the recipient has an associated email address. */
    private String _email;
    /** The unique identifier for the recipient in the directory. */
    private String _objectId;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new driveRecipient and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DriveRecipient() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a driveRecipient
     */
    @javax.annotation.Nonnull
    public static DriveRecipient createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriveRecipient();
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
     * Gets the alias property value. The alias of the domain object, for cases where an email address is unavailable (e.g. security groups).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlias() {
        return this._alias;
    }
    /**
     * Gets the email property value. The email address for the recipient, if the recipient has an associated email address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this._email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("alias", (n) -> { this.setAlias(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("objectId", (n) -> { this.setObjectId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the objectId property value. The unique identifier for the recipient in the directory.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getObjectId() {
        return this._objectId;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alias", this.getAlias());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("objectId", this.getObjectId());
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
        this._additionalData = value;
    }
    /**
     * Sets the alias property value. The alias of the domain object, for cases where an email address is unavailable (e.g. security groups).
     * @param value Value to set for the alias property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlias(@javax.annotation.Nullable final String value) {
        this._alias = value;
    }
    /**
     * Sets the email property value. The email address for the recipient, if the recipient has an associated email address.
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this._email = value;
    }
    /**
     * Sets the objectId property value. The unique identifier for the recipient in the directory.
     * @param value Value to set for the objectId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setObjectId(@javax.annotation.Nullable final String value) {
        this._objectId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
