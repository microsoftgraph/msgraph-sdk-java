package com.microsoft.graph.models.callrecords;

import com.microsoft.graph.models.callrecords.ClientUserAgent;
import com.microsoft.graph.models.callrecords.ServiceUserAgent;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserAgent implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Identifies the version of application software used by this endpoint. */
    private String _applicationVersion;
    /** User-agent header value reported by this endpoint. */
    private String _headerValue;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new userAgent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserAgent() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.callRecords.userAgent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userAgent
     */
    @javax.annotation.Nonnull
    public static UserAgent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.callRecords.clientUserAgent": return new ClientUserAgent();
                case "#microsoft.graph.callRecords.serviceUserAgent": return new ServiceUserAgent();
            }
        }
        return new UserAgent();
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
     * Gets the applicationVersion property value. Identifies the version of application software used by this endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationVersion() {
        return this._applicationVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserAgent currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("applicationVersion", (n) -> { currentObject.setApplicationVersion(n.getStringValue()); });
        deserializerMap.put("headerValue", (n) -> { currentObject.setHeaderValue(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the headerValue property value. User-agent header value reported by this endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHeaderValue() {
        return this._headerValue;
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
        writer.writeStringValue("applicationVersion", this.getApplicationVersion());
        writer.writeStringValue("headerValue", this.getHeaderValue());
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
     * Sets the applicationVersion property value. Identifies the version of application software used by this endpoint.
     * @param value Value to set for the applicationVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationVersion(@javax.annotation.Nullable final String value) {
        this._applicationVersion = value;
    }
    /**
     * Sets the headerValue property value. User-agent header value reported by this endpoint.
     * @param value Value to set for the headerValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHeaderValue(@javax.annotation.Nullable final String value) {
        this._headerValue = value;
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
